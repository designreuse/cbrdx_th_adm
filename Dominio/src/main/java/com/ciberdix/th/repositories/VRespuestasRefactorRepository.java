package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRespuestas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 11/07/2017.
 */
public interface VRespuestasRefactorRepository extends CrudRepository<VRespuestas, Integer> {

    List<VRespuestas> findAllByIdMaestroRespuesta(Integer id);

    List<VRespuestas> findAllByIdMaestroRespuestaAndIdPreguntaOpcionAndIdCuestionarioPregunta(Integer idMR, Integer idPO, Integer idCP);

}
