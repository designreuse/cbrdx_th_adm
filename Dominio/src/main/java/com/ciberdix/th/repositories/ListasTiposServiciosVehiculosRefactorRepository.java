package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposServiciosVehiculos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposServiciosVehiculosRefactorRepository extends CrudRepository<ListasTiposServiciosVehiculos, Integer> {
    List<ListasTiposServiciosVehiculos> findByIndicadorHabilitadoTrue();

    ListasTiposServiciosVehiculos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposServiciosVehiculos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposServiciosVehiculos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}