package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasMarcasVehiculos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
public interface ListasMarcasVehiculosRefactorRepository extends CrudRepository<ListasMarcasVehiculos, Integer> {
    List<ListasMarcasVehiculos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasMarcasVehiculos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasMarcasVehiculos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasMarcasVehiculos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
