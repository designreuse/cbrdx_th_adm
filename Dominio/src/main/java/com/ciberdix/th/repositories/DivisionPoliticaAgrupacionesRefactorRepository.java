package com.ciberdix.th.repositories;

import com.ciberdix.th.models.DivisionPoliticaAgrupaciones;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DivisionPoliticaAgrupacionesRefactorRepository extends CrudRepository<DivisionPoliticaAgrupaciones, Integer> {

    List<DivisionPoliticaAgrupaciones> findByIdDivisionPoliticaAndIndicadorHabilitadoTrue(Integer idDivisionPolitica);
}
