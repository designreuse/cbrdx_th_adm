package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposSolicitudes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 10/04/17.
 */
public interface ListasTiposSolicitudesRefactorRepository extends CrudRepository<ListasTiposSolicitudes, Integer> {
    List<ListasTiposSolicitudes> findByIndicadorHabilitadoTrue();

    ListasTiposSolicitudes findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposSolicitudes> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposSolicitudes> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
