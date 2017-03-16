package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosCargosEntity;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
public interface TercerosCargoRepository extends CrudRepository<TercerosCargosEntity, Long>{
    //@Query("select u from User u where u.emailAddress = ?1")
    //@Query(value = "SELECT c.IdCargo,c.Cargo FROM CargosEntity c JOIN TercerosCargosEntity t ON (T.IdCargo = C.IdCargo) WHERE T.IdTercero = ?1 AND T.FechaInicio > ?2 AND T.FechaFin < ?2")
    TercerosCargosEntity findByIdTerceroAndFechaInicioLessThanAndFechaFinGreaterThan(Integer IdTercero, Timestamp FechaInicio, Timestamp FechaFin);

    //findByIdTerceroAndFechaInicioLessThanAndFechaFinGreaterThan

}
