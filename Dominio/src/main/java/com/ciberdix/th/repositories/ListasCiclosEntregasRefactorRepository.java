package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasCiclosEntregas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface ListasCiclosEntregasRefactorRepository extends CrudRepository<ListasCiclosEntregas, Integer> {
    List<ListasCiclosEntregas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasCiclosEntregas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasCiclosEntregas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasCiclosEntregas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
