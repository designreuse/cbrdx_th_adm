package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposViviendas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposViviendasRefactorRepository extends CrudRepository<ListasTiposViviendas, Integer> {
    List<ListasTiposViviendas> findByIndicadorHabilitadoTrue();

    ListasTiposViviendas findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposViviendas> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposViviendas> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
