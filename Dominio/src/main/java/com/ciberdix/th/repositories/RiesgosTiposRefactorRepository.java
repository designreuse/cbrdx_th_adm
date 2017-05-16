package com.ciberdix.th.repositories;

import com.ciberdix.th.models.RiesgosTipos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface RiesgosTiposRefactorRepository extends CrudRepository<RiesgosTipos, Integer> {
    List<RiesgosTipos> findByIndicadorHabilitadoIsTrue();
}
