package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRefactorRepository extends CrudRepository<Usuarios, Integer> {

    Usuarios findByUsuarioSistema(String usuarioSistema);

}
