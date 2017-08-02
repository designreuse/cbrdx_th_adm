package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasVigencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasVigenciasRefactorRepository extends CrudRepository<ListasVigencias, Integer> {
    List<ListasVigencias> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasVigencias findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasVigencias> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasVigencias> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
