package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposReferencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposReferenciasRefactorRepository extends CrudRepository<ListasTiposReferencias, Integer> {
    List<ListasTiposReferencias> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposReferencias findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposReferencias> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposReferencias> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
