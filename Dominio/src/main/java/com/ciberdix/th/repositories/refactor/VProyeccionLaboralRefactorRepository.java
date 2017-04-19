package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VProyeccionLaboral;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VProyeccionLaboralRefactorRepository extends CrudRepository<VProyeccionLaboral, Integer> {
    List<VProyeccionLaboral> findByIdEstructuraOrganizacional(Integer idEstructuraOrganizacional);
}
