package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRiesgos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 12/04/17.
 */
public interface VRiesgosRefactorRepository extends CrudRepository<VRiesgos, Integer> {
    List<VRiesgos> findByIndicadorHabilitadoIsTrue();
}
