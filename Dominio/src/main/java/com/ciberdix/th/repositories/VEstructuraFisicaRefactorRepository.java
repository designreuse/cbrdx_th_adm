package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VEstructuraFisica;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 18/04/17.
 */
public interface VEstructuraFisicaRefactorRepository extends CrudRepository<VEstructuraFisica, Integer> {
    List<VEstructuraFisica> findByIndicadorHabilitadoIsTrue();
}
