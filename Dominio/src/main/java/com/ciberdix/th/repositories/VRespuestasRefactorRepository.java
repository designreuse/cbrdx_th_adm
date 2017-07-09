package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRespuestas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface VRespuestasRefactorRepository extends CrudRepository<VRespuestas, Integer> {

    List<VRespuestas> findAllByIndicadorHabilitadoIsTrue();

    List<VRespuestas> findAllByIdPregunta(Integer id);

    List<VRespuestas> findAllByIdPreguntaAndIndicadorHabilitadoIsTrue(Integer id);

}
