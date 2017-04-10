package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Criterios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
public interface CriteriosRefactorRepository extends CrudRepository<Criterios, Integer> {
    List<Criterios> findByIndicadorHabilitadoTrue();
}
