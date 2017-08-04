package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasProbabilidadesRiesgos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasProbabilidadesRiesgosRefactorRepository extends CrudRepository<ListasProbabilidadesRiesgos, Integer> {
    List<ListasProbabilidadesRiesgos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasProbabilidadesRiesgos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasProbabilidadesRiesgos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasProbabilidadesRiesgos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
