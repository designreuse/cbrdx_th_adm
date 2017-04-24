package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VRolesWidgets;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 24/04/17.
 */
public interface VRolesWidgetsRefactorRepository extends CrudRepository<VRolesWidgets, Integer> {
    List<VRolesWidgets> findByIndicadorHabilitadoIsTrue();
    List<VRolesWidgets> findByIdRol(Integer id);
}
