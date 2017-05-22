package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VConstantes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/3/2017.
 */
public interface VConstantesRefactorRepository extends CrudRepository<VConstantes, Integer> {

    VConstantes findAllByConstante(String codigo);

}
