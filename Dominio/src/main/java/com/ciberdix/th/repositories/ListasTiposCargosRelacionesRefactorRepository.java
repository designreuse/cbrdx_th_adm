package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposCargosRelaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface ListasTiposCargosRelacionesRefactorRepository extends CrudRepository<ListasTiposCargosRelaciones, Integer> {
    List<ListasTiposCargosRelaciones> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposCargosRelaciones findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposCargosRelaciones> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposCargosRelaciones> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
