package com.ciberdix.th.repositories;

import com.ciberdix.th.models.CargosRelacionados;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 9/04/17.
 */
public interface CargosRelacionadosRefactorRepository extends CrudRepository<CargosRelacionados, Integer> {

    @Query("select u from CargosRelacionados u where indicadorHabilitado=1 and idCargo = ?2 and idTipoRelacion in (select idLista from ListasTiposCargosRelaciones where codigo like concat('%',?1,'%'))")
    List<CargosRelacionados> findCargos(String codigoRelacion, Integer idCargo);
}
