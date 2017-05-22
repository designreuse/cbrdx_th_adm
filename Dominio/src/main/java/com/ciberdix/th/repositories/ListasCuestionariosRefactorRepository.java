package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasCuestionarios;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 19/05/2017.
 */
public interface ListasCuestionariosRefactorRepository extends CrudRepository<ListasCuestionarios, Integer>{

    List<ListasCuestionarios> findByIndicadorHabilitadoTrue();

    ListasCuestionarios findByIndicadorHabilitadoTrueAndCodigo(String codigo);

    List<ListasCuestionarios> findByIndicadorHabilitadoTrueAndCodigoStartsWith(String codigo);

    List<ListasCuestionarios> findByIndicadorHabilitadoTrueAndNombreContains(String nombre);

}
