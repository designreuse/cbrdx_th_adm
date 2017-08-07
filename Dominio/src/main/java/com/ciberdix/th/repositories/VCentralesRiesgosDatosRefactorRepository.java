package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCentralesRiesgosDatos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VCentralesRiesgosDatosRefactorRepository extends CrudRepository<VCentralesRiesgosDatos, Integer> {

    List<VCentralesRiesgosDatos> findAllByIndicadorHabilitadoIsTrue();

    List<VCentralesRiesgosDatos> findAllByIdCentralRiesgoAndIdCentralRiesgo(Integer id);

}
