package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VEstructuraOrganizacional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
public interface VEstructuraOrganizacionalRefactorRepository extends CrudRepository<VEstructuraOrganizacional, Integer> {
    List<VEstructuraOrganizacional> findByIndicadorHabilitadoIsTrue();
    List<VEstructuraOrganizacional> findByIdPadre(Integer id);

    @Query("SELECT V FROM VEstructuraOrganizacional V WHERE V.idEstructuraOrganizacional IN (SELECT E.idEstructuraOrganizacional FROM EstructuraOrganizacionalCargos E WHERE E.idCargo IN (SELECT C.idCargo FROM CargosDotaciones C WHERE C.idGrupoDotacion = ?1))")
    List<VEstructuraOrganizacional> queryAllByIdGrupoDotacion(Integer idGrupoDotacion);

    @Query("SELECT V FROM VEstructuraOrganizacional V WHERE V.idEstructuraOrganizacional IN (SELECT P.idEstructuraOrganizacional FROM ProyeccionDotacionEstructuraOrganizacional P WHERE P.idProyeccionDotacion = ?1)")
    List<VEstructuraOrganizacional> queryAllByIdProyeccionDotacion(Integer idProyeccionDotacion);

}
