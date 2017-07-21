package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VNovedadesRoles;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VNovedadesRolesRefactorRepository extends CrudRepository<VNovedadesRoles, Integer> {

    List<VNovedadesRoles> findAllByIndicadorHabilitadoIsTrue();

    List<VNovedadesRoles> findAllByIdNovedad(Integer id);

    List<VNovedadesRoles> findAllByIdRol(Integer id);

}
