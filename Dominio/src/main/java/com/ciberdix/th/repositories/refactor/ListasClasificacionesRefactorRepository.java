package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasClasificaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 22/04/2017.
 */
public interface ListasClasificacionesRefactorRepository extends CrudRepository<ListasClasificaciones, Integer> {

    List<ListasClasificaciones> findByIndicadorHabilitadoIsTrue();

    @Query("SELECT lc FROM ListasClasificaciones lc WHERE (lc.idListaClasificacion = ?1) AND " +
            "(LOWER(SUBSTRING(lc.codigo,1,3)) = ?2)")
    List<ListasClasificaciones> queryAllByIdSecCam(Integer idListaClasificacion, String codigo);

    @Query("SELECT lc FROM ListasClasificaciones lc WHERE (LOWER(SUBSTRING(lc.codigo,1,3)) = ?1)")
    List<ListasClasificaciones> queryAllBySecCam(String codigo);

}
