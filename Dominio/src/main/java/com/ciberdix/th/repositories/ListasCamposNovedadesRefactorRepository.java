package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasCamposNovedades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasCamposNovedadesRefactorRepository extends CrudRepository<ListasCamposNovedades, Integer> {
    List<ListasCamposNovedades> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasCamposNovedades findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasCamposNovedades> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasCamposNovedades> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
