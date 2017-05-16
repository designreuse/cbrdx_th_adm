package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasNivelesCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasNivelesCargosRefactorRepository extends CrudRepository<ListasNivelesCargos, Integer> {
    List<ListasNivelesCargos> findByIndicadorHabilitadoTrue();

    ListasNivelesCargos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasNivelesCargos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasNivelesCargos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
