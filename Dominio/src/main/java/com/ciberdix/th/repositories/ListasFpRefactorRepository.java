package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasFp;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasFpRefactorRepository extends CrudRepository<ListasFp, Integer> {
    List<ListasFp> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasFp findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasFp> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasFp> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
