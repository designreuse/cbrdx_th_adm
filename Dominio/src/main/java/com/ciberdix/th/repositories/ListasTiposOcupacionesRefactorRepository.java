/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposOcupaciones;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposOcupacionesRefactorRepository extends CrudRepository<ListasTiposOcupaciones, Integer>{
    List<ListasTiposOcupaciones> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposOcupaciones findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposOcupaciones> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposOcupaciones> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
