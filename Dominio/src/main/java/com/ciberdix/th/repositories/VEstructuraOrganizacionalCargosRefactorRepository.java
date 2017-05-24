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

    @Query("SELECT ve FROM VEstructuraOrganizacionalCargos ve WHERE ve.indicadorHabilitado = 1 AND ve.idEstructuraOrganizacional = ?1 AND ve.cargo LIKE CONCAT('%',?2,'%')")
    List<VEstructuraOrganizacionalCargos> queryAllByIndicadorHabilitadoIsTrueAndIdEstructuraOrganizacionalAndCargoIsLike(Integer idEstructuraOrganizacional, String query);
}
