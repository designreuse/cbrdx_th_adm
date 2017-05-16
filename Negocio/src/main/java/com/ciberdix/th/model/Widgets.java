package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 21/04/2017.
 */
public class Widgets {
    private Integer idWidget;
    private String widget;
    private String codigoWidget;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdWidget() {
        return idWidget;
    }

    public void setIdWidget(Integer idWidget) {
        this.idWidget = idWidget;
    }

    public String getWidget() {
        return widget;
    }

    public void setWidget(String widget) {
        this.widget = widget;
    }

    public String getCodigoWidget() {
        return codigoWidget;
    }

    public void setCodigoWidget(String codigoWidget) {
        this.codigoWidget = codigoWidget;
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
