package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasFactoresRh;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasFactorRhRefactorRepository extends CrudRepository<ListasFactoresRh, Integer>{
    List<ListasFactoresRh> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasFactoresRh findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasFactoresRh> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasFactoresRh> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
