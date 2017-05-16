package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class DivisionPolitica {
    private Integer idDivisionPolitica;
    private Integer idDivisionPoliticaPadre;
    private String codigoDivisionPolitica;
    private String descripcionDivisonPolitica;
    private String indicativoDivisonPolitica;
    private String codigoPostalDivisionPolitica;
    private Integer idDivisionPoliticaTipo;
    private Integer idDivisionPoliticaArea;
    private Integer idDivisionPoliticaResguardo;
    private Integer idEstratoDivisionPolitica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idDivisionPoliticaComuna;
    private Integer idDivisionPoliticaLocalidad;
    private String gentilicio;

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }

    public Integer getIdDivisionPoliticaPadre() {
        return idDivisionPoliticaPadre;
    }

    public void setIdDivisionPoliticaPadre(Integer idDivisionPoliticaPadre) {
        this.idDivisionPoliticaPadre = idDivisionPoliticaPadre;
    }

    public String getCodigoDivisionPolitica() {
        return codigoDivisionPolitica;
    }

    public void setCodigoDivisionPolitica(String codigoDivisionPolitica) {
        this.codigoDivisionPolitica = codigoDivisionPolitica;
    }

    public String getDescripcionDivisonPolitica() {
        return descripcionDivisonPolitica;
    }

    public void setDescripcionDivisonPolitica(String descripcionDivisonPolitica) {
        this.descripcionDivisonPolitica = descripcionDivisonPolitica;
    }

    public String getIndicativoDivisonPolitica() {
        return indicativoDivisonPolitica;
    }

    public void setIndicativoDivisonPolitica(String indicativoDivisonPolitica) {
        this.indicativoDivisonPolitica = indicativoDivisonPolitica;
    }

    public String getCodigoPostalDivisionPolitica() {
        return codigoPostalDivisionPolitica;
    }

    public void setCodigoPostalDivisionPolitica(String codigoPostalDivisionPolitica) {
        this.codigoPostalDivisionPolitica = codigoPostalDivisionPolitica;
    }

    public Integer getIdDivisionPoliticaTipo() {
        return idDivisionPoliticaTipo;
    }

    public void setIdDivisionPoliticaTipo(Integer idDivisionPoliticaTipo) {
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
    }

    public Integer getIdDivisionPoliticaArea() {
        return idDivisionPoliticaArea;
    }

    public void setIdDivisionPoliticaArea(Integer idDivisionPoliticaArea) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
    }

    public Integer getIdDivisionPoliticaResguardo() {
        return idDivisionPoliticaResguardo;
    }

    public void setIdDivisionPoliticaResguardo(Integer idDivisionPoliticaResguardo) {
        this.idDivisionPoliticaResguardo = idDivisionPoliticaResguardo;
    }

    public Integer getIdEstratoDivisionPolitica() {
        return idEstratoDivisionPolitica;
    }

    public void setIdEstratoDivisionPolitica(Integer idEstratoDivisionPolitica) {
        this.idEstratoDivisionPolitica = idEstratoDivisionPolitica;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    public Integer getIdDivisionPoliticaComuna() {
        return idDivisionPoliticaComuna;
    }

    public void setIdDivisionPoliticaComuna(Integer idDivisionPoliticaComuna) {
        this.idDivisionPoliticaComuna = idDivisionPoliticaComuna;
    }

    public Integer getIdDivisionPoliticaLocalidad() {
        return idDivisionPoliticaLocalidad;
    }

    public void setIdDivisionPoliticaLocalidad(Integer idDivisionPoliticaLocalidad) {
        this.idDivisionPoliticaLocalidad = idDivisionPoliticaLocalidad;
    }
}
