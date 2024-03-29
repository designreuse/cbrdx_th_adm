package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosPublicaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/06/2017.
 */
public interface TercerosPublicacionesRefactorRepository extends CrudRepository<TercerosPublicaciones, Integer> {

    List<TercerosPublicaciones> findAllByIdTerceroAndIdPublicacion(Long idTercero, Integer idPublicacion);

    List<TercerosPublicaciones> findAllByIdPublicacionAndIndicadorHabilitadoIsTrue(Integer idPublicacion);

    List<TercerosPublicaciones> findAllByIdTerceroAndIndicadorHabilitadoIsTrue(Long idTercero);

    List<TercerosPublicaciones> findAllByIdTercero(Long idTercero);

}
