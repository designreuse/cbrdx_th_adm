package com.ciberdix.th.repositories;

import com.ciberdix.th.models.InstitucionesMedicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 16/06/2017.
 */
public interface InstitucionesMedicasRefactorRepository extends CrudRepository<InstitucionesMedicas, Integer> {

    List<InstitucionesMedicas> findAllByIndicadorHabilitadoIsTrue();

}
