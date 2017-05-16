package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasNivelesEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface ListasNivelesEstudiosRefactorRepository extends CrudRepository<ListasNivelesEstudios, Integer> {
    List<ListasNivelesEstudios> findByIndicadorHabilitadoTrue();

    ListasNivelesEstudios findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasNivelesEstudios> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasNivelesEstudios> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
