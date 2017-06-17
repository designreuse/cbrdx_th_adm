package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposViviendas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposViviendasRefactorRepository extends CrudRepository<ListasTiposViviendas, Integer> {
    List<ListasTiposViviendas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposViviendas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposViviendas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposViviendas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
