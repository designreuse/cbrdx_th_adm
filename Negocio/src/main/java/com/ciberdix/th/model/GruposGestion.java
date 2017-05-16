package com.ciberdix.th.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class GruposGestion {
    private Integer idGrupoGestion;
    private String grupoGestion;
    private String funciones;
    private String responsabilidades;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Date fechaInicio;
    private Date fechaFin;
    private String codigoGrupoGestion;

    public Integer getIdGrupoGestion() {
        return idGrupoGestion;
    }

    public void setIdGrupoGestion(Integer idGrupoGestion) {
        this.idGrupoGestion = idGrupoGestion;
    }

    public String getGrupoGestion() {
        return grupoGestion;
    }

    public void setGrupoGestion(String grupoGestion) {
        this.grupoGestion = grupoGestion;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCodigoGrupoGestion() {
        return codigoGrupoGestion;
    }

    public void setCodigoGrupoGestion(String codigoGrupoGestion) {
        this.codigoGrupoGestion = codigoGrupoGestion;
    }
}
