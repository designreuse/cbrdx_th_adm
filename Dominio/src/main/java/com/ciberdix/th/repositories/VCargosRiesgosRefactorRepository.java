package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCargosRiesgos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 7/04/17.
 */
public interface VCargosRiesgosRefactorRepository extends CrudRepository<VCargosRiesgos, Integer> {
    List<VCargosRiesgos> findByIdCargo(Integer id);
}
