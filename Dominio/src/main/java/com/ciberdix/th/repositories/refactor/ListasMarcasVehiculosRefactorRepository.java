package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasMarcasVehiculos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasMarcasVehiculosRefactorRepository extends CrudRepository<ListasMarcasVehiculos, Integer> {
    List<ListasMarcasVehiculos> findByIndicadorHabilitadoIsTrue();
}
