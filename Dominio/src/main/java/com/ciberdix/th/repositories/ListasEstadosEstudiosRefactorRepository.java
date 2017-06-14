package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasEstadosEstudiosRefactorRepository extends CrudRepository<ListasEstadosEstudios, Integer> {
    List<ListasEstadosEstudios> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosEstudios findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosEstudios> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosEstudios> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
