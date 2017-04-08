package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VCargos;
import com.ciberdix.th.models.refactor.VCargosB;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface VCargosRefactorRepository extends CrudRepository<VCargosB, Integer> {
    List<VCargosB> findByIndicadorHabilitadoIsTrue();
}
