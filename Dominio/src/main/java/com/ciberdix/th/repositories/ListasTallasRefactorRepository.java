package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTallas;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTallasRefactorRepository extends CrudRepository<ListasTallas, Integer> {
    List<ListasTallas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTallas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTallas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTallas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
