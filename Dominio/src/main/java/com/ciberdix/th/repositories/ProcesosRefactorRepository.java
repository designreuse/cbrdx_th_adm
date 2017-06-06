package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Procesos;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Danny on 5/06/2017.
 */
public interface ProcesosRefactorRepository extends CrudRepository<Procesos, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Procesos P SET P.indicadorHabilitado = 0, P.idEstado = ?1")
    void disableRegisters(Integer idEstado);

    List<Procesos> findByIndicadorHabilitadoTrueAndIdEstado(Integer idEstado);

    List<Procesos> findByIndicadorHabilitadoFalseAndIdEstado(Integer idEstado);
}
