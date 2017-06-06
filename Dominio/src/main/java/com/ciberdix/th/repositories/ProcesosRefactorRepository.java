package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Procesos;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Danny on 5/06/2017.
 */
public interface ProcesosRefactorRepository extends CrudRepository<Procesos, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Procesos SET Procesos.indicadorHabilitado = 0, Procesos.idEstado = ?1")
    void disableRegisters(Integer idEstado);
}
