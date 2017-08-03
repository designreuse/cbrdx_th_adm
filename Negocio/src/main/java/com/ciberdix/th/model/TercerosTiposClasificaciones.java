package com.ciberdix.th.model;

import java.sql.Timestamp;

public class TercerosTiposClasificaciones {

    private Integer idTerceroTipoClasificacion;
    private String codigo;
    private String terceroTipoClasificacion;
    private Integer idTerceroTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroTipoClasificacion() {
        return idTerceroTipoClasificacion;
    }

    public void setIdTerceroTipoClasificacion(Integer idTerceroTipoClasificacion) {
        this.idTerceroTipoClasificacion = idTerceroTipoClasificacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTerceroTipoClasificacion() {
        return terceroTipoClasificacion;
    }

    public void setTerceroTipoClasificacion(String terceroTipoClasificacion) {
        this.terceroTipoClasificacion = terceroTipoClasificacion;
    }

    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
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
