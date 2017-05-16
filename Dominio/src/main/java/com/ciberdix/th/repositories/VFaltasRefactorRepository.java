package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VFaltas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 6/04/17.
 */
public interface VFaltasRefactorRepository extends CrudRepository<VFaltas, Integer> {
    List<VFaltas> findByIndicadorHabilitadoIsTrue();
}
