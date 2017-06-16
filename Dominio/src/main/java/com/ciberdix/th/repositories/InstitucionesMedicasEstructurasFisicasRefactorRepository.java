package com.ciberdix.th.repositories;

import com.ciberdix.th.models.InstitucionesMedicasEstructurasFisicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 16/06/2017.
 */
public interface InstitucionesMedicasEstructurasFisicasRefactorRepository extends CrudRepository<InstitucionesMedicasEstructurasFisicas, Integer> {

    List<InstitucionesMedicasEstructurasFisicas> findAllByIndicadorHabilitadoIsTrue();

}
