package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Competencias;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 10/04/2017.
 */
public interface CompetenciasRefactorRepository extends CrudRepository<Competencias, Integer> {

    List<Competencias> findByIdGrupoCompetenciaAndIndicadorHabilitadoTrue(Integer idGrupoCompetencia);

    List<Competencias> findByIdGrupoCompetencia(Integer idGrupoCompetencia);
}