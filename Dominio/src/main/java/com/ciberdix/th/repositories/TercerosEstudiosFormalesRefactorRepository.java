package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosEstudiosFormales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface TercerosEstudiosFormalesRefactorRepository extends CrudRepository<TercerosEstudiosFormales, Integer> {
    List<TercerosEstudiosFormales> findByIdTerceroAndIndicadorHabilitadoIsTrue(Long idTercero);
}
