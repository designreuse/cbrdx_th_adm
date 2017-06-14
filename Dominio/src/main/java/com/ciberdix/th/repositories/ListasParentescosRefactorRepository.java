package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasParentescos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasParentescosRefactorRepository extends CrudRepository<ListasParentescos, Integer> {
    List<ListasParentescos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasParentescos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasParentescos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasParentescos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
