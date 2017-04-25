/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VTerceros;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Roberto Chajin Ortiz
 */
public interface VTercerosRefactorRepository extends CrudRepository<VTerceros, Long> {

    @Query("SELECT v FROM VTerceros v WHERE idTipoTercero in (SELECT idLista FROM ListasTiposTerceros WHERE codigo = ?1)")
    List<VTerceros> findByTypes(String type);

    @Query("SELECT v FROM VTerceros v WHERE idTipoTercero in (SELECT idLista FROM ListasTiposTerceros WHERE codigo = ?1) AND idTercero not in (SELECT idTercero FROM TercerosCargos WHERE indicadorHabilitado = 1) AND (v.primerNombre like concat('%',?2,'%') OR v.segundoNombre like concat('%',?2,'%') OR v.primerApellido like concat('%',?2,'%') OR v.segundoApellido like concat('%',?2,'%') OR v.numeroDocumento like concat('%',?2,'%') )")
    List<VTerceros> findByType(String type,String queryString);

}
