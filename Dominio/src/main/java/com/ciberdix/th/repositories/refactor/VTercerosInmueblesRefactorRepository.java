package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VTercerosInmuebles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 4/04/17.
 */
public interface VTercerosInmueblesRefactorRepository extends CrudRepository<VTercerosInmuebles, Long> {
    List<VTercerosInmuebles> findByIdTercero(Long id);
}
