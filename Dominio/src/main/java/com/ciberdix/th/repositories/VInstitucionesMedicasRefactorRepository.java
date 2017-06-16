package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VInstitucionesMedicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 16/06/2017.
 */
public interface VInstitucionesMedicasRefactorRepository extends CrudRepository<VInstitucionesMedicas, Integer> {

    List<VInstitucionesMedicas> findAllByIndicadorHabilitadoIsTrue();

}
