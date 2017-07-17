package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposAfectaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface ListasTiposAfectacionesRefactorRepository extends CrudRepository<ListasTiposAfectaciones, Integer> {
    List<ListasTiposAfectaciones> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposAfectaciones findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposAfectaciones> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposAfectaciones> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
