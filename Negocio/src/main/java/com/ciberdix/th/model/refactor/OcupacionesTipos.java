package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Danny on 21/04/2017.
 */
public class OcupacionesTipos {
    private Integer idOcupacionTipo;
    private Integer codigoOcupacionTipo;
    private String descripcionOcupacionTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdOcupacionTipo() {
        return idOcupacionTipo;
    }

    public void setIdOcupacionTipo(Integer idOcupacionTipo) {
        this.idOcupacionTipo = idOcupacionTipo;
    }

    public Integer getCodigoOcupacionTipo() {
        return codigoOcupacionTipo;
    }

    public void setCodigoOcupacionTipo(Integer codigoOcupacionTipo) {
        this.codigoOcupacionTipo = codigoOcupacionTipo;
    }

    public String getDescripcionOcupacionTipo() {
        return descripcionOcupacionTipo;
    }

    public void setDescripcionOcupacionTipo(String descripcionOcupacionTipo) {
        this.descripcionOcupacionTipo = descripcionOcupacionTipo;
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
