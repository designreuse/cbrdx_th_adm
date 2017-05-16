package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosEstudiosNoFormales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface VTercerosEstudiosNoFormalesRefactorRepository extends CrudRepository<VTercerosEstudiosNoFormales, Integer> {
    List<VTercerosEstudiosNoFormales> findByIndicadorHabilitadoIsTrueAndIdTercero(Long idTercero);
}
