package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposContratos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ListasTiposContratosRefactorRepository extends CrudRepository<ListasTiposContratos, Integer> {
    List<ListasTiposContratos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposContratos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposContratos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposContratos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
