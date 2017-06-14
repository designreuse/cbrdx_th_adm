package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasFormasContrataciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */
public interface ListasFormasContratacionesRefactorRepository extends CrudRepository<ListasFormasContrataciones, Integer> {

    List<ListasFormasContrataciones> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasFormasContrataciones findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasFormasContrataciones> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasFormasContrataciones> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);

}
