package com.ciberdix.th.model;

import java.sql.Timestamp;

public class TercerosTipos {

    private Integer idTerceroTipo;
    private String codigo;
    private String terceroTipo;
    private Boolean indicadorRequiereClasificacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTerceroTipo() {
        return terceroTipo;
    }

    public void setTerceroTipo(String terceroTipo) {
        this.terceroTipo = terceroTipo;
    }

    public Boolean getIndicadorRequiereClasificacion() {
        return indicadorRequiereClasificacion;
    }

    public void setIndicadorRequiereClasificacion(Boolean indicadorRequiereClasificacion) {
        this.indicadorRequiereClasificacion = indicadorRequiereClasificacion;
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
