package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposConstruccionViviendas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposConstruccionViviendasRefactorRepository extends CrudRepository<ListasTiposConstruccionViviendas, Integer> {
    List<ListasTiposConstruccionViviendas> findByIndicadorHabilitadoTrue();

    ListasTiposConstruccionViviendas findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposConstruccionViviendas> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposConstruccionViviendas> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
