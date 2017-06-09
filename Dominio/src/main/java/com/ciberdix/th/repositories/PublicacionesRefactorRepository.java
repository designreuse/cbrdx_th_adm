package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Publicaciones;
import com.ciberdix.th.models.VPublicaciones;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Danny on 31/05/2017.
 */
public interface PublicacionesRefactorRepository extends CrudRepository<Publicaciones, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE Publicaciones p SET p.idProceso = ?2 WHERE p.idPublicacion = ?1")
    void queryUpdateIdProceso(Integer idPublicacion, Integer idProceso);

}
