package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosDocumentosTercero;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 8/07/2017.
 */
public interface VTercerosDocumentosTerceroRefactorRepository extends CrudRepository<VTercerosDocumentosTercero, Integer> {

    List<VTercerosDocumentosTercero> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosDocumentosTercero> findAllByIdTercero(Long id);

    List<VTercerosDocumentosTercero> findAllByIdDocumentoTercero(Integer id);

    VTercerosDocumentosTercero findByIdAdjunto(Integer id);

}
