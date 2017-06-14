package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposConstruccionViviendas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposConstruccionViviendasRefactorRepository extends CrudRepository<ListasTiposConstruccionViviendas, Integer> {
    List<ListasTiposConstruccionViviendas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposConstruccionViviendas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposConstruccionViviendas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposConstruccionViviendas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
