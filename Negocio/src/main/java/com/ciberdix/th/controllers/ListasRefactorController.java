package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Roberto Chajin Ortiz
 */
@RestController
@CrossOrigin
@Transactional
@RequestMapping("/api/listas")
public class ListasRefactorController {
    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl() + "api/";

    @RequestMapping(method = RequestMethod.GET)
    List<Listas> listarGeneros() {
        RestTemplate restTemplate = new RestTemplate();
        Listas[] generos = restTemplate.getForObject(serviceUrl + "listas/", Listas[].class);
        return Arrays.asList(generos);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarRelacion/{code}")
    List<ListasItems> findList(@PathVariable String code) {
        RestTemplate restTemplate = new RestTemplate();
        RelacionesListas relacion = restTemplate.getForObject(globales.getUrl() + "/api/relacionesListas/code/" + code, RelacionesListas.class);
        Integer idLista = relacion.getIdListaHijo();
        Listas listaHija = restTemplate.getForObject(serviceUrl + "listas/buscarId/" + idLista, Listas.class);
        RelacionesListasHijos[] hijos = restTemplate.getForObject(globales.getUrl() + "/api/relacionesListasHijos/relacionesListas/" + relacion.getIdRelacionLista() + "/enabled", RelacionesListasHijos[].class);
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + listaHija.getNombreTabla() + "/enabled/", ListasItems[].class);
        List<ListasItems> resultado = new ArrayList<>();
        for (RelacionesListasHijos rlh : hijos) {
            Integer id = rlh.getIdItemHijo();
            for (ListasItems li : parameter) {
                if (li.getIdLista().equals(id)) {
                    resultado.add(li);
                    break;
                }
            }
        }
        return resultado;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarRelacionFuncional/{padre}/{idItem}/{control}")
    List<ListasItems> findFromRelationship(@PathVariable String padre, @PathVariable Integer idItem, @PathVariable String control) {
        List<ListasItems> resultado = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();
        Listas listaPadre = restTemplate.getForObject(serviceUrl + "listas/buscarTabla/" + padre, Listas.class);
        FuncionalidadesControles controlHijo = restTemplate.getForObject(serviceUrl + "funcionalidadesControles/codigo/" + control, FuncionalidadesControles.class);
        List<RelacionesListas> padres = Arrays.asList(restTemplate.getForObject(serviceUrl + "relacionesListas/findByParents/" + listaPadre.getIdLista() + "/" + idItem, RelacionesListas[].class));
        List<RelacionesListasCampos> hijos = Arrays.asList(restTemplate.getForObject(serviceUrl + "relacionesListasCampos/control/" + controlHijo.getIdFuncionalidadControl(), RelacionesListasCampos[].class));
        for (RelacionesListasCampos hijo : hijos) {
            List<RelacionesListas> test = padres.stream().filter(a -> a.getIdRelacionLista().equals(hijo.getIdRelacionLista())).collect(Collectors.toList());
            if (!test.isEmpty()) {
                return findList(test.get(0).getCodigo());
            }
        }
        return resultado;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/buscarId/{idLista}")
    Listas findOne(@PathVariable Integer idLista) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "listas/buscarId/" + idLista, Listas.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tablas/{idTable}")
    List<ListasItems> findAllById(@PathVariable Integer idTable) {
        RestTemplate restTemplate = new RestTemplate();
        Listas listas = restTemplate.getForObject(serviceUrl + "listas/buscarId/" + idTable, Listas.class);
        String nombre = listas.getNombreTabla();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + nombre + "/enabled/", ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/")
    List<ListasItems> findOne(@PathVariable String tableName) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + tableName, ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/idItem/{idItem}")
    ListasItems findOne(@PathVariable String tableName, @PathVariable Integer idItem) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + tableName + "/" + idItem, ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/enabled/")
    List<ListasItems> findEnabled(@PathVariable String tableName) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + tableName + "/enabled/", ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/code/{queryString}")
    ListasItems findByCode(@PathVariable String tableName, @PathVariable String queryString) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/" + tableName + "/code/" + queryString + "/", ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/codeStarts/{queryString}")
    List<ListasItems> findByCodeStarts(@PathVariable String tableName, @PathVariable String queryString) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + tableName + "/codeStarts/" + queryString + "/", ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/tabla/{tableName}/name/{queryString}")
    List<ListasItems> findByName(@PathVariable String tableName, @PathVariable String queryString) {
        RestTemplate restTemplate = new RestTemplate();
        ListasItems[] parameter = restTemplate.getForObject(serviceUrl + "/" + tableName + "/name/" + queryString + "/", ListasItems[].class);
        return Arrays.asList(parameter);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/tabla/{tableName}/")
    ListasItems createItem(@PathVariable String tableName, @RequestBody ListasItems listasItems) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(serviceUrl + "/" + tableName, listasItems, ListasItems.class);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/tabla/{tableName}/")
    void updateItem(@PathVariable String tableName, @RequestBody ListasItems listasItems) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "/" + tableName, listasItems);
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody Listas obj) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(serviceUrl + "listas/", obj);
    }
}