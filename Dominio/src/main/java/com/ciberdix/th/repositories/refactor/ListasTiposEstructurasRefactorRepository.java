package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposEstructuras;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
public interface ListasTiposEstructurasRefactorRepository extends CrudRepository<ListasTiposEstructuras, Integer> {
    List<ListasTiposEstructuras> findByIndicadorHabilitadoTrue();

    ListasTiposEstructuras findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposEstructuras> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposEstructuras> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
