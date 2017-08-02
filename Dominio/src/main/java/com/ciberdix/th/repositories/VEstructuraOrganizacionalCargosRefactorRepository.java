package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VEstructuraOrganizacionalCargos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface VEstructuraOrganizacionalCargosRefactorRepository extends CrudRepository<VEstructuraOrganizacionalCargos, Integer> {
    List<VEstructuraOrganizacionalCargos> findByIndicadorHabilitadoIsTrue();
    List<VEstructuraOrganizacionalCargos> findByIndicadorHabilitadoIsTrueAndIdEstructuraOrganizacional(Integer id);
    VEstructuraOrganizacionalCargos findAllByIndicadorHabilitadoIsTrueAndIdCargoAndIdEstructuraOrganizacional(Integer idCargo, Integer idEstructura);

    List<VEstructuraOrganizacionalCargos> findAllByIndicadorHabilitadoIsTrueAndIdCargo(Integer id);

    @Query("SELECT ve FROM VEstructuraOrganizacionalCargos ve WHERE ve.idCargo = ?1 AND ve.idEstructuraOrganizacionalCargo IN (SELECT vt.idEstructuraOrganizacionalCargo FROM VTercerosCargos vt WHERE vt.indicadorHabilitado = 1)")
    List<VEstructuraOrganizacionalCargos> queryAllByIdCargo(Integer idCargo);
}
