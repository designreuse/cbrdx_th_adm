package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosJuridicos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasEstadosJuridicosRefactorRepository extends CrudRepository<ListasEstadosJuridicos, Integer>{
    List<ListasEstadosJuridicos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosJuridicos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosJuridicos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosJuridicos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
