package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
public class RiesgosTipos {
    private Integer idRiesgoTipo;
    private String riesgoTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRiesgoTipo() {
        return idRiesgoTipo;
    }

    public void setIdRiesgoTipo(Integer idRiesgoTipo) {
        this.idRiesgoTipo = idRiesgoTipo;
    }

    public String getRiesgoTipo() {
        return riesgoTipo;
    }

    public void setRiesgoTipo(String riesgoTipo) {
        this.riesgoTipo = riesgoTipo;
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
