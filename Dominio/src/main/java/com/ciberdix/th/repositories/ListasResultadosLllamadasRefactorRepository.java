package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasResultadosLllamadas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface ListasResultadosLllamadasRefactorRepository extends CrudRepository<ListasResultadosLllamadas, Integer> {
    List<ListasResultadosLllamadas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasResultadosLllamadas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasResultadosLllamadas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasResultadosLllamadas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
