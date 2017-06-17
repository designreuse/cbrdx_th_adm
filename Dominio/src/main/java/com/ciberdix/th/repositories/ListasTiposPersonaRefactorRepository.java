package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposPersonas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposPersonaRefactorRepository extends CrudRepository<ListasTiposPersonas, Integer> {
    List<ListasTiposPersonas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposPersonas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposPersonas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposPersonas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
