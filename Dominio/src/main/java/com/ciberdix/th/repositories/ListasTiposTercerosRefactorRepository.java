package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposTercerosRefactorRepository extends CrudRepository<ListasTiposTerceros, Integer> {
    List<ListasTiposTerceros> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposTerceros findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposTerceros> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposTerceros> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
