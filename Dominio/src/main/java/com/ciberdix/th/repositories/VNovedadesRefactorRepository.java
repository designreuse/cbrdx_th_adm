package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VNovedades;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 17/07/2017.
 */
public interface VNovedadesRefactorRepository extends CrudRepository<VNovedades, Integer> {

    List<VNovedades> findAllByIndicadorHabilitadoIsTrue();

    List<VNovedades> findAllByIdTipoNovedad(Integer id);

    @Query("SELECT V FROM VNovedades V WHERE V.idTipoNovedad IN (SELECT L.idLista FROM ListasTiposNovedades L WHERE L.codigo IN ('INCI','ACC'))")
    List<VNovedades> queryIncidenteAccidente();

    @Query("SELECT V FROM VNovedades V WHERE V.idTipoNovedad IN (SELECT L.idLista FROM ListasTiposNovedades L WHERE L.codigo NOT IN ('INCI','ACC'))")
    List<VNovedades> queryNovedades();

}
