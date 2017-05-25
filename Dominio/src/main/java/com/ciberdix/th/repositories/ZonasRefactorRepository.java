package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Zonas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Danny on 18/05/2017.
 */
public interface ZonasRefactorRepository extends CrudRepository<Zonas, Integer> {

    List<Zonas> findAllByIdEstructuraOrganizacional(Integer idEstructuraOrganizacional);

}
