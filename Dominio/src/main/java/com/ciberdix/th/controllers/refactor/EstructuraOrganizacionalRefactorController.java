package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.EstructuraOrganizacional;
import com.ciberdix.th.models.refactor.VEstructuraOrganizacional;
import com.ciberdix.th.repositories.refactor.EstructuraOrganizacionalRefactorRepository;
import com.ciberdix.th.repositories.refactor.VEstructuraOrganizacionalRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by robertochajin on 17/04/17.
 */
@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/estructuraOrganizacional")
public class EstructuraOrganizacionalRefactorController {
    @Autowired
    private EstructuraOrganizacionalRefactorRepository estructuraOrganizacionalRefactorRepository;

    @Autowired
    private VEstructuraOrganizacionalRefactorRepository vEstructuraOrganizacionalRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VEstructuraOrganizacional> findAll() {
        return (List<VEstructuraOrganizacional>) vEstructuraOrganizacionalRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled/")
    List<VEstructuraOrganizacional> findEnabled() {
        return (List<VEstructuraOrganizacional>) vEstructuraOrganizacionalRefactorRepository.findByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarPadre/{id}")
    List<VEstructuraOrganizacional> findByIdPadre(@PathVariable Integer id) {
        return (List<VEstructuraOrganizacional>) vEstructuraOrganizacionalRefactorRepository.findByIdPadre(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VEstructuraOrganizacional findOne(@PathVariable Integer id) {
        return vEstructuraOrganizacionalRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    EstructuraOrganizacional create(@RequestBody EstructuraOrganizacional obj) {
        return estructuraOrganizacionalRefactorRepository.save(
                new EstructuraOrganizacional(obj.getCodigo(),obj.getNombre(),obj.getIdPadre(),
                        obj.getIdTipoEstructura(),obj.getIdCentroCostos(),obj.getIdTipoArea(),
                        obj.getIdCentroCostos(),obj.getIdTipoDocumento(),obj.getNumeroDocumento(),
                        obj.getIdLocalizacion(),obj.getRazonSocial(),obj.getTelefono(),
                        obj.getCelular(),obj.getCorreoElectronico(),obj.getPaginaWeb(),
                        obj.getIdLogo(),obj.getIndicadorHabilitado(),obj.getAuditoriaUsuario(),
                        obj.getIdEstructuraFisica())
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody EstructuraOrganizacional obj) {
        estructuraOrganizacionalRefactorRepository.save(obj);
    }
}
