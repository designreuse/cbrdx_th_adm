package com.ciberdix.th.repositories;

import com.ciberdix.th.models.VTercerosTiposFuncionalidadesListas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VTercerosTiposFuncionalidadesListasRefactorRepository extends CrudRepository<VTercerosTiposFuncionalidadesListas, Integer> {

    List<VTercerosTiposFuncionalidadesListas> findAllByIndicadorHabilitadoIsTrue();

    List<VTercerosTiposFuncionalidadesListas> findAllByIdControl(Integer id);

    List<VTercerosTiposFuncionalidadesListas> findAllByIdSeccion(Integer id);

    List<VTercerosTiposFuncionalidadesListas> findAllByIdTerceroTipoFuncionalidad(Integer id);

}
