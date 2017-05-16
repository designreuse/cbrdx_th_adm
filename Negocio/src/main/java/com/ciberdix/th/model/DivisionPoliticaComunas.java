package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class DivisionPoliticaComunas {
    private Integer idDivisionPoliticaComuna;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdDivisionPoliticaComuna() {
        return idDivisionPoliticaComuna;
    }

    public void setIdDivisionPoliticaComuna(Integer idDivisionPoliticaComuna) {
        this.idDivisionPoliticaComuna = idDivisionPoliticaComuna;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
