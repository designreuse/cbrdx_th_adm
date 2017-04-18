package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.CentrosCostos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
public interface CentrosCostosRefactorRepository extends CrudRepository<CentrosCostos, Integer> {
    List<CentrosCostos> findByIndicadorHabilitadoIsTrue();
}
