package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposAfiliacion;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposAfiliacionRefactorRepository extends CrudRepository<ListasTiposAfiliacion, Integer>{
    List<ListasTiposAfiliacion> findByIndicadorHabilitadoTrue();

    ListasTiposAfiliacion findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposAfiliacion> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposAfiliacion> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
