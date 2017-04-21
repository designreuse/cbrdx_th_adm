package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposServiciosVehiculos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasTiposServiciosVehiculosRefactorRepository extends CrudRepository<ListasTiposServiciosVehiculos, Integer> {
    List<ListasTiposServiciosVehiculos> findByIndicadorHabilitadoIsTrue();
}
