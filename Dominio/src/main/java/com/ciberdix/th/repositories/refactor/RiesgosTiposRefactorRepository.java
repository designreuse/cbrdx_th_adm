package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.RiesgosTipos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface RiesgosTiposRefactorRepository extends CrudRepository<RiesgosTipos, Integer> {
    List<RiesgosTipos> findByIndicadorHabilitadoIsTrue();
}
