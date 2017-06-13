package com.ciberdix.th.repositories;

import com.ciberdix.th.models.CentralesRiesgos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 13/06/2017.
 */
public interface CentralesRiesgosRefactorRepository extends CrudRepository<CentralesRiesgos, Integer> {

    List<CentralesRiesgos> findAllByIndicadorHabilitadoIsTrue();

}
