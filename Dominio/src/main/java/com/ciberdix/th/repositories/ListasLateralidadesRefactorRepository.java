package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasLateralidades;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasLateralidadesRefactorRepository extends CrudRepository<ListasLateralidades, Integer> {
    List<ListasLateralidades> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasLateralidades findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasLateralidades> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasLateralidades> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
