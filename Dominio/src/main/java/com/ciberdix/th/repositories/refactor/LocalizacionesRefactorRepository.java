package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.Localizaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface LocalizacionesRefactorRepository extends CrudRepository<Localizaciones, Integer> {

    @Query("SELECT U FROM Localizaciones U WHERE U.idLocalizacion in (SELECT idlocalizacion from TercerosLocalizaciones where idTercero = ?1 and idTerceroLocalizacion not in (Select idTerceroLocalizacion from TercerosInmuebles where idTerceroLocalizacion is not null))")
    List<Localizaciones> findByAvaliable(Long idTercero);

}
