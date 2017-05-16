package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosInmuebles;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface TercerosInmueblesRefactorRepository extends CrudRepository<TercerosInmuebles, Integer> {

    List<TercerosInmuebles> findByIdTercero(Integer id);
}
