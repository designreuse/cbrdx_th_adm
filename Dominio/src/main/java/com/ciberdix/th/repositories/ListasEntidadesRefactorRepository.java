package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEntidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasEntidadesRefactorRepository extends CrudRepository<ListasEntidades, Integer> {
    List<ListasEntidades> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEntidades findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEntidades> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEntidades> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
