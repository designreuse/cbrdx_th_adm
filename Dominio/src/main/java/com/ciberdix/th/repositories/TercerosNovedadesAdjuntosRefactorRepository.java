package com.ciberdix.th.repositories;

import com.ciberdix.th.models.TercerosNovedadesAdjuntos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TercerosNovedadesAdjuntosRefactorRepository extends CrudRepository<TercerosNovedadesAdjuntos, Integer> {

    List<TercerosNovedadesAdjuntos> findAllByIndicadorHabilitadoIsTrue();

    List<TercerosNovedadesAdjuntos> findAllByIdTerceroNovedad(Integer id);

}
