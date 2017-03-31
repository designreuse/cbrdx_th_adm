/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ListasTiposOcupaciones;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ListasTiposOcupacionesRefactorRepository extends CrudRepository<ListasTiposOcupaciones, Integer>{
    List<ListasTiposOcupaciones> findByIndicadorHabilitadoIsTrue();
}
