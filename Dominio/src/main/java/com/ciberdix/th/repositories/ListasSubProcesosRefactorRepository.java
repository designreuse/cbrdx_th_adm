package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasSubProcesos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 03/08/17.
 */
public interface ListasSubProcesosRefactorRepository extends CrudRepository<ListasSubProcesos, Integer> {
    List<ListasSubProcesos> findByIndicadorHabilitadoIsTrue();
}
