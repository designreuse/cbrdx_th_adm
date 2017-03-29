package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.TercerosEstudiosNoFormales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface TercerosEstudiosNoFormalesRefactorRepository extends CrudRepository<TercerosEstudiosNoFormales, Integer> {
    List<TercerosEstudiosNoFormales> findByIdTerceroAndIndicadorHabilitadoIsTrue(Long idTercero);
}
