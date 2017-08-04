package com.ciberdix.th.controllers;


import com.ciberdix.th.models.TercerosNovedades;
import com.ciberdix.th.models.VTercerosNovedades;
import com.ciberdix.th.repositories.TercerosNovedadesRefactorRepository;
import com.ciberdix.th.repositories.VTercerosNovedadesRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/tercerosNovedades")
public class TercerosNovedadesRefactorController {

    @Autowired
    private TercerosNovedadesRefactorRepository tercerosNovedadesRefactorRepository;

    @Autowired
    private VTercerosNovedadesRefactorRepository vTercerosNovedadesRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<VTercerosNovedades> findAll() {
        return (List<VTercerosNovedades>) vTercerosNovedadesRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/enabled")
    List<VTercerosNovedades> findEnabled() {
        return vTercerosNovedadesRefactorRepository.findAllByIndicadorHabilitadoIsTrue();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/novedad/{id}")
    List<VTercerosNovedades> findByIdNovedad(@PathVariable Integer id) {
        return vTercerosNovedadesRefactorRepository.findAllByIdNovedad(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/tercero/{id}")
    List<VTercerosNovedades> findByIdTercero(@PathVariable Long id) {
        return vTercerosNovedadesRefactorRepository.findAllByIdTercero(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/filtroFechas/{FechaInicio}/{FechaFin}")
    List<VTercerosNovedades> findByFechaReporteBetween(@PathVariable String FechaInicio, @PathVariable String FechaFin) throws ParseException {
        SimpleDateFormat fInicio = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fFin = new SimpleDateFormat("yyyy-MM-dd");
        return vTercerosNovedadesRefactorRepository.findAllByFechaReporteBetween(fInicio.parse(FechaInicio), fFin.parse(FechaFin));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    VTercerosNovedades findOne(@PathVariable Integer id) {
        return vTercerosNovedadesRefactorRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    TercerosNovedades create(@RequestBody TercerosNovedades o) {
        return tercerosNovedadesRefactorRepository.save(
                new TercerosNovedades(
                        o.getDescripcion(),o.getAuditoriaUsuario(),o.getIdTercero(),o.getIdNovedad(),
                        o.getFechaInicio(),o.getFechaFin(),o.getHoraInicio(),o.getHoraFin(),o.getFechaReintegro(),
                        o.getHoraReintegro(),o.getDias(),o.getIdDiagnostico(),o.getReemplazadoPor(),o.getValor(),
                        o.getNroCuotas(),o.getNroReferencia(),o.getIdEntidad(),o.getPeriodoInicial(),o.getPeriodoFinal(),o.getRetiro(),
                        o.getIdEps(),o.getIdFp(),o.getIdCcf(),o.getIndicadorHabilitado(),o.getCodigoValidacion(),o.getIdEstadoNovedad(),
                        o.getIdTerceroReporta(),o.getIdResultado(),o.getDescripcionResultado()
                )
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    void update(@RequestBody TercerosNovedades o) {
        tercerosNovedadesRefactorRepository.save(
                new TercerosNovedades(
                        o.getIdTerceroNovedad(),o.getDescripcion(),o.getAuditoriaUsuario(),o.getIdTercero(),o.getIdNovedad(),
                        o.getFechaInicio(),o.getFechaFin(),o.getHoraInicio(),o.getHoraFin(),o.getFechaReintegro(),
                        o.getHoraReintegro(),o.getDias(),o.getIdDiagnostico(),o.getReemplazadoPor(),o.getValor(),
                        o.getNroCuotas(),o.getNroReferencia(),o.getIdEntidad(),o.getPeriodoInicial(),o.getPeriodoFinal(),o.getRetiro(),
                        o.getIdEps(),o.getIdFp(),o.getIdCcf(),o.getIndicadorHabilitado(),o.getCodigoValidacion(),o.getIdEstadoNovedad(),
                        o.getFechaReporte(),o.getIdTerceroReporta(),o.getIdResultado(),o.getDescripcionResultado()
                )
        );
    }
    
}
