package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.VLocalizaciones;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface VLocalizacionesRefactorRepository extends CrudRepository<VLocalizaciones, Integer>{  
    
    @Query("SELECT l FROM VLocalizaciones l WHERE l.idLocalizacion in "
            + "(SELECT tl.idlocalizacion FROM TercerosLocalizaciones tl WHERE tl.indicadorHabilitado=true AND tl.idTercero=?1)")
    List<VLocalizaciones> queryAllLocalizaciones(Long id);
}
