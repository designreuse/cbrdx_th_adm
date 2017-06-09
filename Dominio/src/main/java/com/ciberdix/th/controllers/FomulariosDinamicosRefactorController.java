package com.ciberdix.th.controllers;

import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by robertochajin on 08/06/17.
 */
public class FomulariosDinamicosRefactorController {
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> agregarFormulario(@RequestBody String jsonString) {

        DBObject doc = (DBObject) JSON.parse(jsonString);
        mongoTemplate.insert(doc, "formularios");

        return new ResponseEntity<>(JSON.parse("{'id': '" + doc.get("_id").toString() + "'}"), HttpStatus.CREATED);
    }
}