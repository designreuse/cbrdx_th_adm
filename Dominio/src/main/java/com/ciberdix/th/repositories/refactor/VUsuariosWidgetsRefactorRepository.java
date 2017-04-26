package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VUsuariosWidgets;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 26/04/17.
 */
public interface VUsuariosWidgetsRefactorRepository extends CrudRepository<VUsuariosWidgets, Integer> {
    List<VUsuariosWidgets> findByIndicadorHabilitadoIsTrueAndIdUsuario(Integer id);
}
