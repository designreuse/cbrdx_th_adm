package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosFamiliares;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface VTercerosFamiliaresRefactorRepository extends CrudRepository<VTercerosFamiliares, Integer> {
    List<VTercerosFamiliares> findByIdTerceroAndIndicadorHabilitadoIsTrue(Long idTercero);
}
