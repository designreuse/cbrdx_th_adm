package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasEstadosJuridicos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasEstadosJuridicosRefactorRepository extends CrudRepository<ListasEstadosJuridicos, Integer>{
    List<ListasEstadosJuridicos> findByIndicadorHabilitadoTrue();

    ListasEstadosJuridicos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasEstadosJuridicos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasEstadosJuridicos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
