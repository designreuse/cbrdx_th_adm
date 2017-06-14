package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiCs;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */
public interface ListasTicsRefactorRepository extends CrudRepository<ListasTiCs, Integer> {
    List<ListasTiCs> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiCs findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiCs> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiCs> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
