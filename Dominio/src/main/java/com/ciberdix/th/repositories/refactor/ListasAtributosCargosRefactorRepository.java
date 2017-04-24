package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasAtributosCargos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasAtributosCargosRefactorRepository extends CrudRepository<ListasAtributosCargos, Integer> {
    List<ListasAtributosCargos> findByIndicadorHabilitadoTrue();

    ListasAtributosCargos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasAtributosCargos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasAtributosCargos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
