package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosFamiliares;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface TercerosFamiliaresRefactorRepository extends CrudRepository<TercerosFamiliares, Integer> {
    List<TercerosFamiliares> findByIdTerceroAndIndicadorHabilitadoIsTrue(Long idTercero);
}
