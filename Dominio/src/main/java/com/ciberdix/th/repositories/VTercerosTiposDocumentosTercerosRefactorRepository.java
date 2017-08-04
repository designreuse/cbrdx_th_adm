package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosTiposDocumentosTerceros;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VTercerosTiposDocumentosTercerosRefactorRepository extends CrudRepository<VTercerosTiposDocumentosTerceros, Integer> {

    List<VTercerosTiposDocumentosTerceros> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosTiposDocumentosTerceros> findAllByIdTerceroTipo(Integer id);

}
