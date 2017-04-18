package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.CargosCriterios;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by robertochajin on 8/04/17.
 */
public interface CargosCriteriosRefactorRepository extends CrudRepository<CargosCriterios, Integer> {
    List<CargosCriterios> findByIndicadorHabilitadoTrueAndIdCargoEquals(Integer id);
    List<CargosCriterios> findByIndicadorHabilitadoIsTrueAndIdCargo(Integer id);

    @Transactional
    @Modifying
    @Query("update CargosCriterios set indicadorHabilitado = 0 where idCargo = ?1")
    void updateChecks(Integer id);
}
