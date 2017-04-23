package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposDocumentos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposDocumentosRefactorRepository extends CrudRepository<ListasTiposDocumentos, Integer>{
    List<ListasTiposDocumentos> findByIndicadorHabilitadoTrue();

    ListasTiposDocumentos findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasTiposDocumentos> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasTiposDocumentos> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);
}
