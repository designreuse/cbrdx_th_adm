package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosTiposDocumentosTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TercerosTiposDocumentosTercerosRefactorRepository extends CrudRepository<TercerosTiposDocumentosTerceros, Integer> {

    List<TercerosTiposDocumentosTerceros> findAllByIndicadorHabilitadoIsTrue();

    List<TercerosTiposDocumentosTerceros> findAllByIdTerceroTipo(Integer id);

}
