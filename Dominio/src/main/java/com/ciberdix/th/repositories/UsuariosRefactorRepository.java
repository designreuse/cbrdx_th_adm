package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Usuarios;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuariosRefactorRepository extends CrudRepository<Usuarios, Integer> {

    @Query("SELECT U FROM Usuarios U WHERE U.usuarioSistema = ?1")
    Usuarios queryByUsuarioSistema(String usuarioSistema);

}
