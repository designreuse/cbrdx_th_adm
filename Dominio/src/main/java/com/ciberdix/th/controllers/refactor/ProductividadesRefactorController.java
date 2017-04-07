package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Productividades;
import com.ciberdix.th.repositories.refactor.ProductividadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
@RequestMapping("/api/productividades")
@CrossOrigin
public class ProductividadesRefactorController {

    @Autowired
    private ProductividadesRefactorRepository ProductividadesRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Productividades> listarProductividades() {
        return (List<Productividades>) ProductividadesRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/buscarId/{id}")
    Productividades parent(@PathVariable Integer id) {
        return ProductividadesRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    Productividades crearActividadEconomica(@RequestBody Productividades productividades) {
        return ProductividadesRepository.save(new Productividades(productividades.getProductividad(), productividades.getMinimoIq(), productividades.getMaximoIq(), productividades.getMinimoAptitud(), productividades.getMaximoAptitud(), productividades.getIndicadorHabilitado(), productividades.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    void actualizarActividadEconomica(@RequestBody Productividades productividades) {
        ProductividadesRepository.save(productividades);
    }
}
