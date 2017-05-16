package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstratos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasEstratosRefactorRepository extends CrudRepository<ListasEstratos, Integer>{
    List<ListasEstratos> findByIndicadorHabilitadoTrue();

    ListasEstratos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasEstratos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasEstratos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
