package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasFormasReclutamientos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 16/05/2017.
 */
public interface ListasFormasReclutamientosRefactorRepository extends CrudRepository <ListasFormasReclutamientos, Integer> {

    List<ListasFormasReclutamientos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasFormasReclutamientos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasFormasReclutamientos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasFormasReclutamientos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);

}
