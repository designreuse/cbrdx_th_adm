package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposVehiculos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposVehiculosRefactorRepository extends CrudRepository<ListasTiposVehiculos, Integer>{
    List<ListasTiposVehiculos> findByIndicadorHabilitadoTrue();

    ListasTiposVehiculos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposVehiculos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposVehiculos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
