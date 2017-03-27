package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.ListasGeneros;
import com.ciberdix.th.repositories.refactor.GenerosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/api/generos")
public class GenerosControlador {

    @Autowired
    private GenerosRepository generosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasGeneros> listarTerceros() {
        return (List<ListasGeneros>) generosRepository.findAll();
    }
}
