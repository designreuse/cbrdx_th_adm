package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Terceros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.ciberdix.th.repositories.refactor.TercerosRefactorRepository;

/**
 *
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/terceros")
public class TercerosRefactorController {

    @Autowired
    private TercerosRefactorRepository tercerosRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    List<Terceros> listarTerceros() {
        return (List<Terceros>) tercerosRepository.findAll();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Terceros obtenerTercero(@PathVariable Long id){
        return tercerosRepository.findOne(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    Terceros crearTercero(@RequestBody Terceros tercero){
        return tercerosRepository.save(tercero);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTercero(@RequestBody Terceros tercero){
        tercerosRepository.save(tercero);
    }
}
