package com.ciberdix.th.repositories;

import com.ciberdix.th.models.MaestrosRespuestas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 10/07/2017.
 */
public interface MaestrosRespuestasRefactorRepository extends CrudRepository<MaestrosRespuestas, Integer> {

    List<MaestrosRespuestas> findAllByIndicadorHabilitadoIsTrue();

    List<MaestrosRespuestas> findAllByIdCuestionario(Integer id);

    List<MaestrosRespuestas> findAllByIdUsuario(Integer id);

    List<MaestrosRespuestas> findAllByIdPreguntaEnCurso(Integer id);

    @Query("SELECT M FROM MaestrosRespuestas M WHERE M.idMaestroRespuesta IN (SELECT T.idMaestroRespuesta FROM TercerosPublicacionesMaestroRespuestas T WHERE T.idTercerosPublicaciones = ?1)")
    List<MaestrosRespuestas> queryAllByIdTerceroPublicacion(Integer id);

}
