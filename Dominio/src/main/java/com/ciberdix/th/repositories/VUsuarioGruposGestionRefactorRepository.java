package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VUsuarioGruposGestion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VUsuarioGruposGestionRefactorRepository extends CrudRepository<VUsuarioGruposGestion, Integer> {
    List<VUsuarioGruposGestion> findByIdUsuario(Integer IdUsuario);

    List<VUsuarioGruposGestion> findByIndicadorHabilitadoIsTrueAndIdUsuario(Integer idUsuario);
}
