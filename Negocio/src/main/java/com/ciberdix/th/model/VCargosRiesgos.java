package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
public class VCargosRiesgos {

    private Integer idCargoRiesgo;
    private Integer idCargo;
    private String cargo;
    private Integer idRiesgo;
    private String riesgo;
    private String riesgoSubTipo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;
    private String probabilidadRiesgo;
    private Integer idProbabilidad;
    private String consecuenciasRiesgos;
    private Integer idConsecuencia;

    public Integer getIdCargoRiesgo() {
        return idCargoRiesgo;
    }

    public void setIdCargoRiesgo(Integer idCargoRiesgo) {
        this.idCargoRiesgo = idCargoRiesgo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(Integer idRiesgo) {
        this.idRiesgo = idRiesgo;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
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

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public String getProbabilidadRiesgo() {
        return probabilidadRiesgo;
    }

    public void setProbabilidadRiesgo(String probabilidadRiesgo) {
        this.probabilidadRiesgo = probabilidadRiesgo;
    }

    public Integer getIdProbabilidad() {
        return idProbabilidad;
    }

    public void setIdProbabilidad(Integer idProbabilidad) {
        this.idProbabilidad = idProbabilidad;
    }

    public String getConsecuenciasRiesgos() {
        return consecuenciasRiesgos;
    }

    public void setConsecuenciasRiesgos(String consecuenciasRiesgos) {
        this.consecuenciasRiesgos = consecuenciasRiesgos;
    }

    public Integer getIdConsecuencia() {
        return idConsecuencia;
    }

    public void setIdConsecuencia(Integer idConsecuencia) {
        this.idConsecuencia = idConsecuencia;
    }

    public String getRiesgoSubTipo() {
        return riesgoSubTipo;
    }

    public void setRiesgoSubTipo(String riesgoSubTipo) {
        this.riesgoSubTipo = riesgoSubTipo;
    }
}
