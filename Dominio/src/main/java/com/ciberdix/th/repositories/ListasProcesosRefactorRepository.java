package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasProcesos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 03/08/17.
 */
public interface ListasProcesosRefactorRepository extends CrudRepository<ListasProcesos, Integer> {
    List<ListasProcesos> findByIndicadorHabilitadoIsTrue();
}
