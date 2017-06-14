package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposElementos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface ListasTiposElementosRefactorRepository extends CrudRepository<ListasTiposElementos, Integer> {
    List<ListasTiposElementos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposElementos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposElementos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposElementos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
