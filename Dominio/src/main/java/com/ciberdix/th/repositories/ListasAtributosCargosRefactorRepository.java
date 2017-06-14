package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasAtributosCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasAtributosCargosRefactorRepository extends CrudRepository<ListasAtributosCargos, Integer> {
    List<ListasAtributosCargos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasAtributosCargos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasAtributosCargos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasAtributosCargos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
