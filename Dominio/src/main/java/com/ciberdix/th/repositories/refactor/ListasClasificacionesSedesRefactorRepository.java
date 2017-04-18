package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasClasificacionesSedes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface ListasClasificacionesSedesRefactorRepository extends CrudRepository<ListasClasificacionesSedes, Integer> {
    List<ListasClasificacionesSedes> findByIndicadorHabilitadoIsTrue();
}
