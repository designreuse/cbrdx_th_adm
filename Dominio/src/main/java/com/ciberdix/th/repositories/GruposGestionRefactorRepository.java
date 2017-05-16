package com.ciberdix.th.repositories;

import com.ciberdix.th.models.GruposGestion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GruposGestionRefactorRepository extends CrudRepository<GruposGestion, Integer> {

    @Query("select u from GruposGestion u where u.idGrupoGestion not in (select b.idGrupoGestion from UsuarioGruposGestion b where (b.indicadorHabilitado = true) and (b.idUsuario = ?1))")
    List<GruposGestion> findUserAvaliable(Integer IdUsuario);
}
