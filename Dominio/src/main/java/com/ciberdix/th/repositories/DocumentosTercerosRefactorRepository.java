package com.ciberdix.th.repositories;

import com.ciberdix.th.models.DocumentosTerceros;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface DocumentosTercerosRefactorRepository extends CrudRepository<DocumentosTerceros, Integer> {

    List<DocumentosTerceros> findAllByIndicadorHabilitadoIsTrue();

    List<DocumentosTerceros> findAllByIdClasificacionDocumento(Integer id);

    List<DocumentosTerceros> findAllByIndicadorAdjuntoIsTrueAndIndicadorHabilitadoIsTrue();

    List<DocumentosTerceros> findAllByIndicadorDescargaIsTrueAndIndicadorHabilitadoIsTrue();

}
