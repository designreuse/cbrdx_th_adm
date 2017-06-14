package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasAreasEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasAreasEstudiosRefactorRepository extends CrudRepository<ListasAreasEstudios, Integer> {

    List<ListasAreasEstudios> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasAreasEstudios findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasAreasEstudios> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasAreasEstudios> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
