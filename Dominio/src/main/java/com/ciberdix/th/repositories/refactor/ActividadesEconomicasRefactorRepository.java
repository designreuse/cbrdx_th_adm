package com.ciberdix.th.repositories.refactor;

import com.ciberdix.th.models.refactor.ActividadesEconomicas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public interface ActividadesEconomicasRefactorRepository extends CrudRepository<ActividadesEconomicas, Integer> {
    
    List<ActividadesEconomicas> findByIdActividadPadre(Integer id);
    
    @Query("SELECT u FROM ActividadesEconomicas u "
            + "WHERE u.idActividadPadre in (SELECT idActividadEconomica FROM ActividadesEconomicas "
            + "WHERE idActividadPadre in (SELECT idActividadEconomica FROM ActividadesEconomicas "
            + "WHERE idActividadPadre=?1) AND u.idActividadTipo in (SELECT idActividadEconomicaTipo "
            + "FROM ActividadesEconomicasTipos WHERE codigoActividadTipo=4))")
    List<ActividadesEconomicas> queryAllActividadesEconomicasPorTipo(Integer id);
}
