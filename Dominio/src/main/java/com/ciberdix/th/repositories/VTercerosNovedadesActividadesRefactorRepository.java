package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosNovedadesActividades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VTercerosNovedadesActividadesRefactorRepository extends CrudRepository<VTercerosNovedadesActividades, Integer> {

    List<VTercerosNovedadesActividades> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosNovedadesActividades> findAllByIdTerceroNovedad(Integer id);

}
