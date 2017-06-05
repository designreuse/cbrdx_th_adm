package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VPublicaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 2/06/2017.
 */
public interface VPublicacionesRefactorRepository extends CrudRepository<VPublicaciones, Integer> {

    @Query("SELECT v FROM VPublicaciones v WHERE v.idFormaReclutamiento IN (SELECT l.idLista FROM ListasFormasReclutamientos l WHERE (l.codigo = 'INT') OR (l.codigo = 'MIX'))")
    List<VPublicaciones> queryAllByIdFormaReclutamientoIntMix();

    @Query("SELECT v FROM VPublicaciones v WHERE v.idFormaReclutamiento IN (SELECT l.idLista FROM ListasFormasReclutamientos l WHERE (l.codigo = 'MIX') OR (l.codigo = 'EXT'))")
    List<VPublicaciones> queryAllByIdFormaReclutamientoExtMix();
}
