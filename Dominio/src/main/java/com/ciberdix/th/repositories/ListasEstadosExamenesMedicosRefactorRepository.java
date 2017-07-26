package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasEstadosExamenesMedicos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 11/07/2017.
 */
public interface ListasEstadosExamenesMedicosRefactorRepository extends CrudRepository<ListasEstadosExamenesMedicos, Integer> {
    List<ListasEstadosExamenesMedicos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasEstadosExamenesMedicos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasEstadosExamenesMedicos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasEstadosExamenesMedicos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
