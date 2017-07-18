package com.ciberdix.th.repositories;

import com.ciberdix.th.models.ListasTiposTallas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListasTiposTallasRefactorRepository extends CrudRepository<ListasTiposTallas, Integer> {
    List<ListasTiposTallas> findByIndicadorHabilitadoTrueOrderByOrden();

    ListasTiposTallas findByIndicadorHabilitadoTrueAndCodigoOrderByOrden(String codigo);

    List<ListasTiposTallas> findByIndicadorHabilitadoTrueAndCodigoStartsWithOrderByOrden(String codigo);

    List<ListasTiposTallas> findByIndicadorHabilitadoTrueAndNombreContainsOrderByOrden(String nombre);
}
