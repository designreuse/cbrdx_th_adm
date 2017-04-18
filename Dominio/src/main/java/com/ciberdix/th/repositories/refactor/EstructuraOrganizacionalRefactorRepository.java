package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.EstructuraOrganizacional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
public interface EstructuraOrganizacionalRefactorRepository extends CrudRepository<EstructuraOrganizacional, Integer> {
    List<EstructuraOrganizacional> findByIndicadorHabilitadoIsTrue();
    List<EstructuraOrganizacional> findByIdPadre(Integer id);
}
