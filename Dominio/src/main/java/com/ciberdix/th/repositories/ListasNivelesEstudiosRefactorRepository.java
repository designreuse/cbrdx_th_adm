package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasNivelesEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasNivelesEstudiosRefactorRepository extends CrudRepository<ListasNivelesEstudios, Integer> {
    List<ListasNivelesEstudios> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasNivelesEstudios findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasNivelesEstudios> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasNivelesEstudios> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
