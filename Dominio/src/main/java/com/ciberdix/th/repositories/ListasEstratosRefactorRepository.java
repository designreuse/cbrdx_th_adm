package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstratos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasEstratosRefactorRepository extends CrudRepository<ListasEstratos, Integer>{
    List<ListasEstratos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstratos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstratos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstratos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
