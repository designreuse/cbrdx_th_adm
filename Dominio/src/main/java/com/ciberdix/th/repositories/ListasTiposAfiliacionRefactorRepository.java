package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposAfiliacion;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposAfiliacionRefactorRepository extends CrudRepository<ListasTiposAfiliacion, Integer>{
    List<ListasTiposAfiliacion> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposAfiliacion findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposAfiliacion> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposAfiliacion> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
