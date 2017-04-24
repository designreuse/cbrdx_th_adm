package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasMarcasVehiculos;
import com.ciberdix.th.repositories.refactor.ListasMarcasVehiculosRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 5/04/17.
 */
@CrossOrigin
@RestController
@Transactional
@RequestMapping("/api/ListasMarcasVehiculos")
public class ListasMarcasVehiculosRefactorController {
    @Autowired
    private ListasMarcasVehiculosRefactorRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasMarcasVehiculos> findAll() {
        return (List<ListasMarcasVehiculos>) repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<ListasMarcasVehiculos> findEnabled() {
        return repository.findByIndicadorHabilitadoTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/code/{queryString}/")
    ListasMarcasVehiculos findByCode(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigo(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/codeStarts/{queryString}/")
    List<ListasMarcasVehiculos> findByCodeStarts(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndCodigoStartsWith(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/name/{queryString}/")
    List<ListasMarcasVehiculos> findByName(@PathVariable String queryString) {
        return repository.findByIndicadorHabilitadoTrueAndNombreContains(queryString);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    ListasMarcasVehiculos findOne(@PathVariable Integer id) {
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    ListasMarcasVehiculos create(@RequestBody ListasMarcasVehiculos obj) {
        return repository.save(new ListasMarcasVehiculos(obj.getCodigo(), obj.getNombre(), obj.getOrden(), obj.getIndicadorHabilitado(), obj.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    ListasMarcasVehiculos update(@RequestBody ListasMarcasVehiculos obj) {
        return repository.save(obj);
    }
}
