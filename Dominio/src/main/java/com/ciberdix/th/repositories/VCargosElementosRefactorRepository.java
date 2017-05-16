package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCargosElementos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface VCargosElementosRefactorRepository extends CrudRepository<VCargosElementos, Integer> {
    List<VCargosElementos> findByIdCargo(Integer id);
}
