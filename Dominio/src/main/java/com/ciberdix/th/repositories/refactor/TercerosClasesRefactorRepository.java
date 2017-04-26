package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.TercerosClases;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 26/04/2017.
 */
public interface TercerosClasesRefactorRepository extends CrudRepository<TercerosClases, Integer> {

    List<TercerosClases> findByIndicadorHabilitadoIsTrue();

    List<TercerosClases> findByIdTercero(Long idTercero);

}
