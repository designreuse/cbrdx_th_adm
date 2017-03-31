package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class DivisionPoliticaAreas {
    private Integer idDivisionPoliticaArea;
    private String descripcionDivisionPoliticaArea;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdDivisionPoliticaArea() {
        return idDivisionPoliticaArea;
    }

    public void setIdDivisionPoliticaArea(Integer idDivisionPoliticaArea) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
    }

    public String getDescripcionDivisionPoliticaArea() {
        return descripcionDivisionPoliticaArea;
    }

    public void setDescripcionDivisionPoliticaArea(String descripcionDivisionPoliticaArea) {
        this.descripcionDivisionPoliticaArea = descripcionDivisionPoliticaArea;
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
