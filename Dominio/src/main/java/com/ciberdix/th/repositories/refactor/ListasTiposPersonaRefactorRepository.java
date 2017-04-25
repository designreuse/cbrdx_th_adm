package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposPersonas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposPersonaRefactorRepository extends CrudRepository<ListasTiposPersonas, Integer> {
    List<ListasTiposPersonas> findByIndicadorHabilitadoTrue();

    ListasTiposPersonas findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposPersonas> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposPersonas> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
