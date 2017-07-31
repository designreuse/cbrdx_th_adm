package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VProyeccionDotacionEstructuraOrganizacional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VProyeccionDotacionEstructuraOrganizacionalRefactorRepository extends CrudRepository<VProyeccionDotacionEstructuraOrganizacional, Integer> {

    List<VProyeccionDotacionEstructuraOrganizacional> findAllByIndicadorHabilitadoIsTrue();

    List<VProyeccionDotacionEstructuraOrganizacional> findAllByIdProyeccionDotacion(Integer id);

    List<VProyeccionDotacionEstructuraOrganizacional> findAllByIdEstructuraOrganizacional(Integer id);

}
