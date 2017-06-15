package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasClasesViviendas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasClasesViviendasRefactorRepository extends CrudRepository<ListasClasesViviendas, Integer> {
    List<ListasClasesViviendas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasClasesViviendas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasClasesViviendas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasClasesViviendas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
