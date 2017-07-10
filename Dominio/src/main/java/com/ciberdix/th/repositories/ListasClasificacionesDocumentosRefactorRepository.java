package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasClasificacionesDocumentos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface ListasClasificacionesDocumentosRefactorRepository extends CrudRepository<ListasClasificacionesDocumentos, Integer> {
    List<ListasClasificacionesDocumentos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasClasificacionesDocumentos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasClasificacionesDocumentos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasClasificacionesDocumentos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
