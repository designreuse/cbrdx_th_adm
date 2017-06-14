package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposVehiculos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposVehiculosRefactorRepository extends CrudRepository<ListasTiposVehiculos, Integer>{
    List<ListasTiposVehiculos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposVehiculos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposVehiculos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposVehiculos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
