package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Usuarios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRefactorRepository extends CrudRepository<Usuarios, Integer> {

    Usuarios findByUsuarioSistema(String usuarioSistema);

}
