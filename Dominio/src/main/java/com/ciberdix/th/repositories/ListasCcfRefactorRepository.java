package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasCcf;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasCcfRefactorRepository extends CrudRepository<ListasCcf, Integer> {
    List<ListasCcf> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasCcf findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasCcf> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasCcf> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
