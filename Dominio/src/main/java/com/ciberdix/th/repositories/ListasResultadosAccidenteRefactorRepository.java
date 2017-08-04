package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasResultadosAccidente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasResultadosAccidenteRefactorRepository extends CrudRepository<ListasResultadosAccidente, Integer> {
    List<ListasResultadosAccidente> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasResultadosAccidente findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasResultadosAccidente> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasResultadosAccidente> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
