package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class ListasIntensidades {
    private Integer idListaIntensidad;
    private String codigoListaIntensidad;
    private String nombreListaIntensidad;
    private Integer ordenListaIntensidad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdListaIntensidad() {
        return idListaIntensidad;
    }

    public void setIdListaIntensidad(Integer idListaIntensidad) {
        this.idListaIntensidad = idListaIntensidad;
    }

    public String getCodigoListaIntensidad() {
        return codigoListaIntensidad;
    }

    public void setCodigoListaIntensidad(String codigoListaIntensidad) {
        this.codigoListaIntensidad = codigoListaIntensidad;
    }

    public String getNombreListaIntensidad() {
        return nombreListaIntensidad;
    }

    public void setNombreListaIntensidad(String nombreListaIntensidad) {
        this.nombreListaIntensidad = nombreListaIntensidad;
    }

    public Integer getOrdenListaIntensidad() {
        return ordenListaIntensidad;
    }

    public void setOrdenListaIntensidad(Integer ordenListaIntensidad) {
        this.ordenListaIntensidad = ordenListaIntensidad;
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
