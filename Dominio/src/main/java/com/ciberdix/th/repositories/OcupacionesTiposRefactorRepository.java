package com.ciberdix.th.repositories;

import com.ciberdix.th.models.OcupacionesTipos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 21/04/2017.
 */

public interface OcupacionesTiposRefactorRepository extends CrudRepository<OcupacionesTipos, Integer> {
    List<OcupacionesTipos> findByIndicadorHabilitadoIsTrue();
}
