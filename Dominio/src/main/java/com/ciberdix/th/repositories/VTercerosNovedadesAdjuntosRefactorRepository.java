package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosNovedadesAdjuntos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VTercerosNovedadesAdjuntosRefactorRepository extends CrudRepository<VTercerosNovedadesAdjuntos,  Integer> {

    List<VTercerosNovedadesAdjuntos> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosNovedadesAdjuntos> findAllByIdTerceroNovedad(Integer id);

}
