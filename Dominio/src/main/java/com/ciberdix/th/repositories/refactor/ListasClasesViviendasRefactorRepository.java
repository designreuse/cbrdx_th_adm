package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasClasesViviendas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasClasesViviendasRefactorRepository extends CrudRepository<ListasClasesViviendas, Integer> {
    List<ListasClasesViviendas> findByIndicadorHabilitadoTrue();

    ListasClasesViviendas findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasClasesViviendas> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasClasesViviendas> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
