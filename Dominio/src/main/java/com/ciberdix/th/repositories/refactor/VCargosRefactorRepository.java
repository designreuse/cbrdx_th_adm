package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface VCargosRefactorRepository extends CrudRepository<VCargos, Integer> {
    List<VCargos> findByIndicadorHabilitadoIsTrue();
}
