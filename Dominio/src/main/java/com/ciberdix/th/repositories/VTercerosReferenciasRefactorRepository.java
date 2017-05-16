package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosReferencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface VTercerosReferenciasRefactorRepository extends CrudRepository<VTercerosReferencias, Long> {
    List<VTercerosReferencias> findByIdTercero(Long idTercero);
}
