package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposExamenesMedicos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasTiposExamenesMedicosRefactorRepository extends CrudRepository<ListasTiposExamenesMedicos, Integer> {
    List<ListasTiposExamenesMedicos> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposExamenesMedicos findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposExamenesMedicos> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposExamenesMedicos> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
