package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class DivisionPoliticaLocalidades {
    private Integer idDivisionPoliticaLocalidad;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdDivisionPoliticaLocalidad() {
        return idDivisionPoliticaLocalidad;
    }

    public void setIdDivisionPoliticaLocalidad(Integer idDivisionPoliticaLocalidad) {
        this.idDivisionPoliticaLocalidad = idDivisionPoliticaLocalidad;
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
