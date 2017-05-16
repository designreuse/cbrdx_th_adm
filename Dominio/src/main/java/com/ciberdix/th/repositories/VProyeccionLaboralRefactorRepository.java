package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProyeccionLaboral;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VProyeccionLaboralRefactorRepository extends CrudRepository<VProyeccionLaboral, Integer> {
    List<VProyeccionLaboral> findByIdEstructuraOrganizacional(Integer idEstructuraOrganizacional);
}
