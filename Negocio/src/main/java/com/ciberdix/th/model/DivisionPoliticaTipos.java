package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class DivisionPoliticaTipos {
    private Integer idDivisionPoliticaTipo;
    private String descripcionTipo;
    private String codigoDivisionPoliticaTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdDivisionPoliticaTipo() {
        return idDivisionPoliticaTipo;
    }

    public void setIdDivisionPoliticaTipo(Integer idDivisionPoliticaTipo) {
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
    }

    public String getDescripcionTipo() {
        return descripcionTipo;
    }

    public void setDescripcionTipo(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
    }

    public String getCodigoDivisionPoliticaTipo() {
        return codigoDivisionPoliticaTipo;
    }

    public void setCodigoDivisionPoliticaTipo(String codigoDivisionPoliticaTipo) {
        this.codigoDivisionPoliticaTipo = codigoDivisionPoliticaTipo;
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
