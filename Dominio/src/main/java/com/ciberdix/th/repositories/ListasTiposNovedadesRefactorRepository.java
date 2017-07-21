package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposNovedades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface ListasTiposNovedadesRefactorRepository extends CrudRepository<ListasTiposNovedades, Integer> {
    List<ListasTiposNovedades> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposNovedades findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposNovedades> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposNovedades> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
