package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Responsabilidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
public interface ResponsabilidadesRefactorRepository extends CrudRepository<Responsabilidades, Integer> {
    List<Responsabilidades> findByIndicadorHabilitadoIsTrue();
}
