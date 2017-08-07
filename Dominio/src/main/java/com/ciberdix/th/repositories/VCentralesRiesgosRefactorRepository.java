package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VCentralesRiesgos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VCentralesRiesgosRefactorRepository extends CrudRepository<VCentralesRiesgos, Integer> {

    List<VCentralesRiesgos> findByIndicadorHabilitadoIsTrue();

    VCentralesRiesgos findAllByCodigo(String code);

}
