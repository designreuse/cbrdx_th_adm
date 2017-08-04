package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasConsecuenciasRiesgos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasConsecuenciasRiesgosRefactorRepository extends CrudRepository<ListasConsecuenciasRiesgos, Integer> {
    List<ListasConsecuenciasRiesgos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasConsecuenciasRiesgos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasConsecuenciasRiesgos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasConsecuenciasRiesgos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
