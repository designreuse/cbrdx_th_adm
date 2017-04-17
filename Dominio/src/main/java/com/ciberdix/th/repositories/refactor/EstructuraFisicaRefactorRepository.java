package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.EstructuraFisica;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
public interface EstructuraFisicaRefactorRepository extends CrudRepository<EstructuraFisica, Integer> {
    List<EstructuraFisica> findByIndicadorHabilitadoIsTrue();
}
