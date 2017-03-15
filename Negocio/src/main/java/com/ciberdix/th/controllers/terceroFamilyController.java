package com.ciberdix.th.controllers;

import com.ciberdix.th.config.Globales;
import com.ciberdix.th.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/terceroFamily")
public class terceroFamilyController {

    Globales globales = new Globales();
    private String serviceUrl = globales.getUrl();

    @RequestMapping(method = RequestMethod.POST)
    Tercero crearTerceroFamily(@RequestBody TerceroFamily tf) {

        RestTemplate restTemplate = new RestTemplate();

        Tercero tercero = new Tercero();
        
        tercero.setIdTipoDocumento(tf.getIdTipoDocumento());
        tercero.setPrimerNombre(tf.getPrimerNombre());
        tercero.setSegundoNombre(tf.getSegundoNombre());
        tercero.setPrimerApellido(tf.getPrimerNombre());
        tercero.setSegundoApellido(tf.getSegundoApellido());
        tercero.setFechaNacimiento(tf.getFechaNacimiento());
        tercero.setCorreoElectronico(tf.getCorreoElectronico());
        tercero.setNumeroDocumento(tf.getNumeroDocumento());
        tercero.setTelefonoFijo(tf.getTelefonoFijo());
        tercero.setTelefonoCelular(tf.getTelefonoCelular());
        tercero.setDireccion(tf.getDireccion());

        Tercero rspTercero = restTemplate.postForObject(serviceUrl + "/employees/", tercero, Tercero.class);
        
        TercerosFamiliares tercerosFamiliares = new TercerosFamiliares();
        
        tercerosFamiliares.setIdTerceros(rspTercero.getIdTercero());
        tercerosFamiliares.setIdFamiliar(tf.getIdFamiliar());
        tercerosFamiliares.setIdParentezco(tf.getIdParentezco());
        tercerosFamiliares.setIdConvivencia(tf.getIdConvivencia());
        tercerosFamiliares.setIndicadorHabilitado(true);
        tercerosFamiliares.setAuditoriaUsuario(1);
        tercerosFamiliares.setAuditoriaFecha(new Timestamp(System.currentTimeMillis()));
        
        restTemplate.postForObject(serviceUrl + "/family/", tercerosFamiliares, TercerosFamiliares.class);
//        tf.setIdTercero(rspTercero.getIdTercero());
        return rspTercero;
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void actualizarTerceroFamiliar(@RequestBody TerceroFamily tf){
        
        RestTemplate restTemplate = new RestTemplate();
        
        TerceroFamily tercero = restTemplate.getForObject(serviceUrl + "/employees/" + tf.getIdTercero(), TerceroFamily.class);
        TercerosFamiliares terceroF = restTemplate.getForObject(serviceUrl + "/family/" + tf.getIdTerceroFamiliar(), TercerosFamiliares.class);
        
        // se actualizan los datos del tercero
        tercero.setIdFamiliar(tf.getIdFamiliar());
        tercero.setIdTipoDocumento(tf.getIdTipoDocumento());
        tercero.setPrimerNombre(tf.getPrimerNombre());
        tercero.setSegundoNombre(tf.getSegundoNombre());
        tercero.setPrimerApellido(tf.getPrimerNombre());
        tercero.setSegundoApellido(tf.getSegundoApellido());
        tercero.setFechaNacimiento(tf.getFechaNacimiento());
        tercero.setCorreoElectronico(tf.getCorreoElectronico());
        tercero.setNumeroDocumento(tf.getNumeroDocumento());
        tercero.setTelefonoFijo(tf.getTelefonoFijo());
        tercero.setTelefonoCelular(tf.getTelefonoCelular());
        tercero.setDireccion(tf.getDireccion()); 
        tercero.setIndicadorHabilitado(tf.isIndicadorHabilitado());
        tercero.setAuditoriaFecha(new Timestamp(System.currentTimeMillis()));
        tercero.setAuditoriaUsuario(1);
        
        // Se actualizan los datos del familiar
        terceroF.setIdParentezco(tf.getIdParentezco());
        terceroF.setIdConvivencia(tf.getIdConvivencia());
        terceroF.setIndicadorHabilitado(tf.isIndicadorHabilitado());
        terceroF.setAuditoriaUsuario(1);
        terceroF.setAuditoriaFecha(new Timestamp(System.currentTimeMillis()));        
        
        restTemplate.put(serviceUrl + "/employees", tercero, TerceroFamily.class);
        restTemplate.put(serviceUrl + "/family", terceroF, TercerosFamiliares.class);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{IdParametro}")
    TerceroFamily verParametro(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily parametro = restTemplate.getForObject(serviceUrl + "/Vfamily/" + IdParametro, TerceroFamily.class);
        return parametro;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<TerceroFamily> getTercerosFamiliares() {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily[] parametro = restTemplate.getForObject(serviceUrl + "/Vfamily", TerceroFamily[].class);

        return Arrays.asList(parametro);
    }

    @RequestMapping(method = RequestMethod.GET, value = "employee/{IdParametro}")
    List<TerceroFamily> consultarParemetros(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily[] parametros = restTemplate.getForObject(serviceUrl + "/Vfamily/" + IdParametro, TerceroFamily[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "employee/habilitated/{IdParametro}")
    List<TerceroFamily> getEmployeeHabilitated(@PathVariable Integer IdParametro) {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily[] parametros = restTemplate.getForObject(serviceUrl + "/Vfamily/habilitated/" + IdParametro, TerceroFamily[].class);
        return Arrays.asList(parametros);
    }

    @RequestMapping(method = RequestMethod.GET, value = "habilitated")
    List<TerceroFamily> getHabilitated() {
        RestTemplate restTemplate = new RestTemplate();
        TerceroFamily[] parametros = restTemplate.getForObject(serviceUrl + "/Vfamily/habilitated", TerceroFamily[].class);
        return Arrays.asList(parametros);
    }

}
