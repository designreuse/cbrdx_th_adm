package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposCentralesInformacion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasTiposCentralesInformacionRefactorRepository extends CrudRepository<ListasTiposCentralesInformacion, Integer> {
    List<ListasTiposCentralesInformacion> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposCentralesInformacion findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposCentralesInformacion> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposCentralesInformacion> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
