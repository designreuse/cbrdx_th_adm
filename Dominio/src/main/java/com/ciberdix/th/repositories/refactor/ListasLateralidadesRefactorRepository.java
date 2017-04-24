package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasLateralidades;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasLateralidadesRefactorRepository extends CrudRepository<ListasLateralidades, Integer> {
    List<ListasLateralidades> findByIndicadorHabilitadoTrue();

    ListasLateralidades findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasLateralidades> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasLateralidades> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
