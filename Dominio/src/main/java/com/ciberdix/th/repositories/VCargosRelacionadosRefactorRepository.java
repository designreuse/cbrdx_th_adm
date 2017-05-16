package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCargosRelacionados;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 4/05/2017.
 */
public interface VCargosRelacionadosRefactorRepository extends CrudRepository<VCargosRelacionados, Integer> {

    @Query("select u from VCargosRelacionados u where indicadorHabilitado=1 and idCargo = ?2 and idTipoRelacion in (select idLista from ListasTiposCargosRelaciones where codigo like concat('%',?1,'%'))")
    List<VCargosRelacionados> findCargos(String codigoRelacion, Integer idCargo);

}
