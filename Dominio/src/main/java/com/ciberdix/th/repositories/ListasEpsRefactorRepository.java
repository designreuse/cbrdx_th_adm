package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEps;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasEpsRefactorRepository extends CrudRepository<ListasEps, Integer> {
    List<ListasEps> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEps findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEps> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEps> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
