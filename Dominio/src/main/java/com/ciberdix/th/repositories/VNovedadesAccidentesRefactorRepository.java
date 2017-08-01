package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VNovedadesAccidentes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VNovedadesAccidentesRefactorRepository extends CrudRepository<VNovedadesAccidentes, Integer> {

    List<VNovedadesAccidentes> findAllByIndicadorHabilitadoIsTrue();

    List<VNovedadesAccidentes> findAllByIdTerceroNovedad(Integer id);

}
