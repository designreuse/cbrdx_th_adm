package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.CargosRelacionados;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface CargosRelacionadosRefactorRepository extends CrudRepository<CargosRelacionados, Integer> {

    @Query("select u from CargosRelacionados u where idCargo = ?2 and idTipoRelacion in (select idListaTipoCargoRelacion from ListasTiposCargosRelaciones where codigo like concat('%',?1,'%'))")
    List<CargosRelacionados> findCargos(String codigoRelacion, Integer idCargo);
}
