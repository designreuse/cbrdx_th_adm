package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposTrabajos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 30/05/2017.
 */
public interface ListasTiposTrabajosRefactorRepository extends CrudRepository<ListasTiposTrabajos, Integer>{
    List<ListasTiposTrabajos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposTrabajos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposTrabajos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposTrabajos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
