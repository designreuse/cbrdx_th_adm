package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposDatos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposDatosRefactorRepository extends CrudRepository<ListasTiposDatos, Integer> {
    List<ListasTiposDatos> findByIndicadorHabilitadoTrue();

    ListasTiposDatos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposDatos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposDatos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
