package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTallas;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTallasRefactorRepository extends CrudRepository<ListasTallas, Integer> {
    List<ListasTallas> findByIndicadorHabilitadoTrue();

    ListasTallas findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTallas> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTallas> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
