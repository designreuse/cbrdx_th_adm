package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
public class RiesgosSubTipos {
    private Integer idRiesgoSubTipo;
    private Integer idRiesgoTipo;
    private String riesgoSubTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRiesgoSubTipo() {
        return idRiesgoSubTipo;
    }

    public void setIdRiesgoSubTipo(Integer idRiesgoSubTipo) {
        this.idRiesgoSubTipo = idRiesgoSubTipo;
    }

    public Integer getIdRiesgoTipo() {
        return idRiesgoTipo;
    }

    public void setIdRiesgoTipo(Integer idRiesgoTipo) {
        this.idRiesgoTipo = idRiesgoTipo;
    }

    public String getRiesgoSubTipo() {
        return riesgoSubTipo;
    }

    public void setRiesgoSubTipo(String riesgoSubTipo) {
        this.riesgoSubTipo = riesgoSubTipo;
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
