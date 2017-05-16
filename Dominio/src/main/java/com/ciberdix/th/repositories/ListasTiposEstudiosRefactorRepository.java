package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposEstudios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposEstudiosRefactorRepository extends CrudRepository<ListasTiposEstudios, Integer> {
    List<ListasTiposEstudios> findByIndicadorHabilitadoTrue();

    ListasTiposEstudios findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposEstudios> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposEstudios> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
