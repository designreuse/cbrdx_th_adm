package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasAreasEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasAreasEstudiosRefactorRepository extends CrudRepository<ListasAreasEstudios, Integer> {

    List<ListasAreasEstudios> findByIndicadorHabilitadoTrue();

    ListasAreasEstudios findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasAreasEstudios> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasAreasEstudios> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
