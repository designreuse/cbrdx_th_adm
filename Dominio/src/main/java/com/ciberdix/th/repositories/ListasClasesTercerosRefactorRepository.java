package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasClasesTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 26/04/2017.
 */
public interface ListasClasesTercerosRefactorRepository extends CrudRepository<ListasClasesTerceros, Integer> {

    List<ListasClasesTerceros> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasClasesTerceros findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasClasesTerceros> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasClasesTerceros> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);

}
