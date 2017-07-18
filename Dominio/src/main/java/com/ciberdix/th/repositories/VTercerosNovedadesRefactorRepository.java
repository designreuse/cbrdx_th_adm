package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosNovedades;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VTercerosNovedadesRefactorRepository extends CrudRepository<VTercerosNovedades, Integer> {

    List<VTercerosNovedades> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosNovedades> findAllByIdNovedad(Integer id);

    List<VTercerosNovedades> findAllByIdTercero(Long id);

}
