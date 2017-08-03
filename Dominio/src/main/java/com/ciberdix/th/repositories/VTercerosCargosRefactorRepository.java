package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface VTercerosCargosRefactorRepository extends CrudRepository<VTercerosCargos, Integer> {
    List<VTercerosCargos> findByIndicadorHabilitadoIsTrue();
    List<VTercerosCargos> findByIdEstructuraOrganizacionalCargo(Integer id);
    List<VTercerosCargos> findByIndicadorHabilitadoTrueAndIdEstructuraOrganizacional(Integer id);
    List<VTercerosCargos> findAllByIdCargoAndIndicadorHabilitadoIsTrue(Integer idCargo);

    VTercerosCargos findByIdTerceroAndIndicadorHabilitadoIsTrue(Long id);
}
