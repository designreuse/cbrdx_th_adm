package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.TercerosInmuebles;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface TercerosInmueblesRefactorRepository extends CrudRepository<TercerosInmuebles, Long> {

    List<TercerosInmuebles> findByIdTercero(Long id);
}
