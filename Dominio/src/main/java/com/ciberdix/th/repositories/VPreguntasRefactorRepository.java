package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPreguntas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface VPreguntasRefactorRepository extends CrudRepository<VPreguntas, Integer> {

    List<VPreguntas> findAllByIndicadorHabilitadoIsTrue();

    List<VPreguntas> findAllByIdCuestionario(Integer id);

    List<VPreguntas> findAllByIdCuestionarioAndIndicadorHabilitadoIsTrue(Integer id);

}
