package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposDirecciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposDireccionesRefactorRepository extends CrudRepository<ListasTiposDirecciones, Integer> {
    List<ListasTiposDirecciones> findByIndicadorHabilitadoTrue();

    ListasTiposDirecciones findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposDirecciones> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposDirecciones> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
