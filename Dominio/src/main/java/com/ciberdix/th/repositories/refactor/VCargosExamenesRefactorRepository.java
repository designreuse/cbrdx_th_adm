package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VCargosExamenes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
public interface VCargosExamenesRefactorRepository extends CrudRepository<VCargosExamenes, Integer> {
    List<VCargosExamenes> findByIdCargo(Integer id);
}
