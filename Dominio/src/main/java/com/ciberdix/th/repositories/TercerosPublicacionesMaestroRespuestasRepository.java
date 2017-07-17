package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosPublicacionesMaestroRespuestas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface TercerosPublicacionesMaestroRespuestasRepository extends CrudRepository<TercerosPublicacionesMaestroRespuestas, Integer> {

    List<TercerosPublicacionesMaestroRespuestas> findByIdTercerosPublicaciones(Integer idTerceroPublicacion);
}
