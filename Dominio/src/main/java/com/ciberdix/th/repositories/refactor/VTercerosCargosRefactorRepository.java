package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VTercerosCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface VTercerosCargosRefactorRepository extends CrudRepository<VTercerosCargos, Integer> {
    List<VTercerosCargos> findByIndicadorHabilitadoIsTrue();
    List<VTercerosCargos> findByIdEstructuraOrganizacionalCargo(Integer id);
    List<VTercerosCargos> findByIdEstructuraOrganizacional(Integer id);
}
