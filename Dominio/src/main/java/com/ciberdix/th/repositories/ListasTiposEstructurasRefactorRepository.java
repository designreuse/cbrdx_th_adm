package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposEstructuras;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
public interface ListasTiposEstructurasRefactorRepository extends CrudRepository<ListasTiposEstructuras, Integer> {
    List<ListasTiposEstructuras> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposEstructuras findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposEstructuras> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposEstructuras> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
