package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VUsuarioGruposGestion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VUsuarioGruposGestionRefactorRepository extends CrudRepository<VUsuarioGruposGestion, Integer> {
    List<VUsuarioGruposGestion> findByIdUsuario(Integer IdUsuario);
}