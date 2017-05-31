package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposTrabajos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 30/05/2017.
 */
public interface ListasTiposTrabajosRefactorRepository extends CrudRepository<ListasTiposTrabajos, Integer>{
    List<ListasTiposTrabajos> findByIndicadorHabilitadoTrue();

    ListasTiposTrabajos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposTrabajos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposTrabajos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
