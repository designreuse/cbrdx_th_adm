package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasPruebasTecnicas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface ListasPruebasTecnicasRefactorRepository extends CrudRepository<ListasPruebasTecnicas, Integer> {
    List<ListasPruebasTecnicas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasPruebasTecnicas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasPruebasTecnicas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasPruebasTecnicas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
