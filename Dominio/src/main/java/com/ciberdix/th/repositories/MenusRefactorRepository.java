package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Menus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by felip on 19/04/2017.
 */
public interface MenusRefactorRepository extends CrudRepository<Menus, Integer> {

    List<Menus> findByIdPadre(Integer idPadre);

    List<Menus> findByIndicadorHabilitadoTrue();

    @Query ("SELECT m FROM Menus m WHERE m.idPadre != 0")
    List<Menus> queryAllByIdFatherNot0();

}
