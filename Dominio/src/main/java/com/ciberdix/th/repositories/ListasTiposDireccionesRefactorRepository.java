package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposDirecciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposDireccionesRefactorRepository extends CrudRepository<ListasTiposDirecciones, Integer> {
    List<ListasTiposDirecciones> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposDirecciones findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposDirecciones> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposDirecciones> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
