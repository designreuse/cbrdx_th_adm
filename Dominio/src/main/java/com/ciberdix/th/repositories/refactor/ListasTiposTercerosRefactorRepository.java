package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposTercerosRefactorRepository extends CrudRepository<ListasTiposTerceros, Integer> {
    List<ListasTiposTerceros> findByIndicadorHabilitadoTrue();

    ListasTiposTerceros findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposTerceros> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposTerceros> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
