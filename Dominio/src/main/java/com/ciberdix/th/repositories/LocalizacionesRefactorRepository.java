package com.ciberdix.th.repositories;

import com.ciberdix.th.models.Localizaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public interface LocalizacionesRefactorRepository extends CrudRepository<Localizaciones, Integer> {

    @Query("SELECT l FROM Localizaciones l WHERE l.idLocalizacion IN (" +
            "SELECT tl.idlocalizacion FROM TercerosLocalizaciones tl WHERE tl.idTercero = ?1 AND tl.idTerceroLocalizacion IN (" +
            "SELECT tr.idTerceroLocalizacion FROM TercerosResidencias tr WHERE tr.indicadorHabilitado = 1))")
    List<Localizaciones> queryByIdTercero(Long idTercero);

}
