package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposFaltas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposFaltasRefactorRepository extends CrudRepository<ListasTiposFaltas, Integer> {
    List<ListasTiposFaltas> findByIndicadorHabilitadoTrue();

    ListasTiposFaltas findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposFaltas> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposFaltas> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
