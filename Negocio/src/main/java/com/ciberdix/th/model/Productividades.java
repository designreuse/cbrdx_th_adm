package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/6/2017.
 */
public class Productividades {
    private Integer idProductividad;
    private String productividad;
    private Integer minimoIq;
    private Integer maximoIq;
    private Integer minimoAptitud;
    private Integer maximoAptitud;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdProductividad() {
        return idProductividad;
    }

    public void setIdProductividad(Integer idProductividad) {
        this.idProductividad = idProductividad;
    }

    public String getProductividad() {
        return productividad;
    }

    public void setProductividad(String productividad) {
        this.productividad = productividad;
    }

    public Integer getMinimoIq() {
        return minimoIq;
    }

    public void setMinimoIq(Integer minimoIq) {
        this.minimoIq = minimoIq;
    }

    public Integer getMaximoIq() {
        return maximoIq;
    }

    public void setMaximoIq(Integer maximoIq) {
        this.maximoIq = maximoIq;
    }

    public Integer getMinimoAptitud() {
        return minimoAptitud;
    }

    public void setMinimoAptitud(Integer minimoAptitud) {
        this.minimoAptitud = minimoAptitud;
    }

    public Integer getMaximoAptitud() {
        return maximoAptitud;
    }

    public void setMaximoAptitud(Integer maximoAptitud) {
        this.maximoAptitud = maximoAptitud;
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
