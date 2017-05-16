package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VRolesWidgets;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
public interface VRolesWidgetsRefactorRepository extends CrudRepository<VRolesWidgets, Integer> {
    List<VRolesWidgets> findByIndicadorHabilitadoIsTrue();
    List<VRolesWidgets> findByIdRol(Integer id);
}
