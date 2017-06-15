package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposDocumentos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposDocumentosRefactorRepository extends CrudRepository<ListasTiposDocumentos, Integer>{
    List<ListasTiposDocumentos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposDocumentos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposDocumentos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposDocumentos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
