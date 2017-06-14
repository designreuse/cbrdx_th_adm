package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposDatos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposDatosRefactorRepository extends CrudRepository<ListasTiposDatos, Integer> {
    List<ListasTiposDatos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposDatos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposDatos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposDatos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
