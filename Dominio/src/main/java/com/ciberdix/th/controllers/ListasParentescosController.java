package com.ciberdix.th.controllers;

import com.ciberdix.th.models.ListasParentescosEntity;
import com.ciberdix.th.repositories.ListasParentescosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/relationtypes")
@CrossOrigin
public class ListasParentescosController {
    @Autowired
    private ListasParentescosRepository listasParentescosRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<ListasParentescosEntity> getLists() {
        return (List<ListasParentescosEntity>) listasParentescosRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{idLista}")
    ListasParentescosEntity findList(@PathVariable Integer idLista) {
        return listasParentescosRepository.findOne(idLista);
    }

}
