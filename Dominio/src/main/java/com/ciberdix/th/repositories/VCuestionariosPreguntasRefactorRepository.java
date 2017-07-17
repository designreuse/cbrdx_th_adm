package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCuestionariosPreguntas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 9/07/2017.
 */
public interface VCuestionariosPreguntasRefactorRepository extends CrudRepository<VCuestionariosPreguntas, Integer> {

    List<VCuestionariosPreguntas> findAllByIndicadorHabilitadoIsTrue();

    List<VCuestionariosPreguntas> findAllByIdCuestionario(Integer id);

    List<VCuestionariosPreguntas> findAllByIdCuestionarioAndIndicadorHabilitadoIsTrue(Integer id);

}
