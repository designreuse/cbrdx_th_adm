package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasConceptosBienestar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasConceptosBienestarRefactorRepository extends CrudRepository<ListasConceptosBienestar, Integer> {
    List<ListasConceptosBienestar> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasConceptosBienestar findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasConceptosBienestar> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasConceptosBienestar> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
