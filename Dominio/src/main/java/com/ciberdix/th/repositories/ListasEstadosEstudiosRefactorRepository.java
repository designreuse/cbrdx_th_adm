package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasEstadosEstudiosRefactorRepository extends CrudRepository<ListasEstadosEstudios, Integer> {
    List<ListasEstadosEstudios> findByIndicadorHabilitadoTrue();

    ListasEstadosEstudios findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasEstadosEstudios> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasEstadosEstudios> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
