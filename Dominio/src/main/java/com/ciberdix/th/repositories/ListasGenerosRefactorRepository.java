package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasGeneros;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasGenerosRefactorRepository extends CrudRepository<ListasGeneros, Integer>{
    List<ListasGeneros> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasGeneros findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasGeneros> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasGeneros> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
