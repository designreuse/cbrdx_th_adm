package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposReferencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposReferenciasRefactorRepository extends CrudRepository<ListasTiposReferencias, Integer> {
    List<ListasTiposReferencias> findByIndicadorHabilitadoTrue();

    ListasTiposReferencias findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposReferencias> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposReferencias> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
