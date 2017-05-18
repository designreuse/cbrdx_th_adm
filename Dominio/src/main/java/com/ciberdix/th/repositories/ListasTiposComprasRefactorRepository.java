package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposCompras;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */
public interface ListasTiposComprasRefactorRepository extends CrudRepository<ListasTiposCompras, Integer> {
    List<ListasTiposCompras> findByIndicadorHabilitadoTrue();

    ListasTiposCompras findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposCompras> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposCompras> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
