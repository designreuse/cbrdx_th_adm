package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasGeneros;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasGenerosRefactorRepository extends CrudRepository<ListasGeneros, Integer>{
    List<ListasGeneros> findByIndicadorHabilitadoTrue();

    ListasGeneros findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasGeneros> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasGeneros> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
