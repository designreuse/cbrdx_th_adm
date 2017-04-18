package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VEstructuraOrganizacional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
public interface VEstructuraOrganizacionalRefactorRepository extends CrudRepository<VEstructuraOrganizacional, Integer> {
    List<VEstructuraOrganizacional> findByIndicadorHabilitadoIsTrue();
    List<VEstructuraOrganizacional> findByIdPadre(Integer id);
}
