package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposPreguntas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 9/07/2017.
 */
public interface ListasTiposPreguntasRefactorRepository extends CrudRepository<ListasTiposPreguntas, Integer> {
    List<ListasTiposPreguntas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposPreguntas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposPreguntas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposPreguntas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
