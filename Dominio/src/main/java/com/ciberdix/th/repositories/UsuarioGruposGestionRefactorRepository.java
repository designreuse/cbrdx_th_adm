package com.ciberdix.th.repositories;

import com.ciberdix.th.models.UsuarioGruposGestion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioGruposGestionRefactorRepository extends CrudRepository<UsuarioGruposGestion, Integer> {
    List<UsuarioGruposGestion> findByIndicadorHabilitadoIsTrueAndIdUsuario(Integer idUsuario);
}
