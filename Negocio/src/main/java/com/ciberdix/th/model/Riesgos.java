package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
public class Riesgos {
    private Integer idRiesgo;
    private Integer idSubTipoRiesgo;
    private Integer idTipoRiesgo;
    private String riesgo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(Integer idRiesgo) {
        this.idRiesgo = idRiesgo;
    }

    public Integer getIdSubTipoRiesgo() {
        return idSubTipoRiesgo;
    }

    public void setIdSubTipoRiesgo(Integer idSubTipoRiesgo) {
        this.idSubTipoRiesgo = idSubTipoRiesgo;
    }

    public Integer getIdTipoRiesgo() {
        return idTipoRiesgo;
    }

    public void setIdTipoRiesgo(Integer idTipoRiesgo) {
        this.idTipoRiesgo = idTipoRiesgo;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
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
}
