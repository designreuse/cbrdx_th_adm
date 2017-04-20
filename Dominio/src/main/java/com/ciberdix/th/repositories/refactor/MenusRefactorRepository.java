package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Menus;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 19/04/2017.
 */
public interface MenusRefactorRepository extends CrudRepository<Menus, Integer> {

    List<Menus> findByIdPadre(Integer idPadre);

    List<Menus> findByIndicadorHabilitadoTrue();
}
