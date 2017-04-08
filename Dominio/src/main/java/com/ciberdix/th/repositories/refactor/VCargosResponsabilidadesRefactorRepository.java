package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VCargosResponsabilidades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
public interface VCargosResponsabilidadesRefactorRepository extends CrudRepository<VCargosResponsabilidades, Integer> {
    List<VCargosResponsabilidades> findByIndicadorHabilitadoIsTrue();
}
