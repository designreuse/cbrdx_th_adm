package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasMotivosInsatisfecho;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasMotivosInsatisfechoRefactorRepository extends CrudRepository<ListasMotivosInsatisfecho, Integer> {
    List<ListasMotivosInsatisfecho> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasMotivosInsatisfecho findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasMotivosInsatisfecho> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasMotivosInsatisfecho> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
