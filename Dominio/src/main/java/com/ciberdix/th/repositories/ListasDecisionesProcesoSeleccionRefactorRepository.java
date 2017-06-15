package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasDecisionesProcesoSeleccion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 15/06/2017.
 */
public interface ListasDecisionesProcesoSeleccionRefactorRepository extends CrudRepository<ListasDecisionesProcesoSeleccion, Integer> {

    List<ListasDecisionesProcesoSeleccion> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasDecisionesProcesoSeleccion findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasDecisionesProcesoSeleccion> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasDecisionesProcesoSeleccion> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);

}
