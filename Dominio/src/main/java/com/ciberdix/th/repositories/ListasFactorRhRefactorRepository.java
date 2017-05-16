package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasFactoresRh;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasFactorRhRefactorRepository extends CrudRepository<ListasFactoresRh, Integer>{
    List<ListasFactoresRh> findByIndicadorHabilitadoTrue();

    ListasFactoresRh findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasFactoresRh> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasFactoresRh> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
