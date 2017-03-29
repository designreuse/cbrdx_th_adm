package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.VTerceros;
import com.ciberdix.th.repositories.refactor.VTercerosRefactorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/vterceros")
public class VTercerosRefactorController {

    @Autowired
    private VTercerosRefactorRepository vtercerosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTerceros> listarTerceros() {
        return (List<VTerceros>) vtercerosRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    VTerceros listarTercerosPorId(@PathVariable Long id) {
        return vtercerosRepository.findOne(id);
    }

}
