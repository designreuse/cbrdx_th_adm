package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposSolicitudes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface ListasTiposSolicitudesRefactorRepository extends CrudRepository<ListasTiposSolicitudes, Integer> {
    List<ListasTiposSolicitudes> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposSolicitudes findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposSolicitudes> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposSolicitudes> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
