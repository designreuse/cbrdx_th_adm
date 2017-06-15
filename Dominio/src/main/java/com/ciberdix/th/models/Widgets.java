package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
@Table(name = "Widgets", schema = "dbo", catalog = "CREZCAMOS")
public class Widgets {
    private Integer idWidget;
    private String widget;
    private String codigoWidget;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Widgets (){
    }

    public Widgets (String widget, String codigoWidget, String descripcion, Boolean indicadorHabilitado,
                    Integer auditoriaUsuario){
        this.widget = widget;
        this.codigoWidget = codigoWidget;
        this.descripcion = descripcion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Widgets(Integer idWidget, String widget, String descripcion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idWidget = idWidget;
        this.widget = widget;
        this.descripcion = descripcion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdWidget", nullable = false)
    public Integer getIdWidget() {
        return idWidget;
    }

    public void setIdWidget(Integer idWidget) {
        this.idWidget = idWidget;
    }

    @Basic
    @Column(name = "Widget", nullable = true, length = 50)
    public String getWidget() {
        return widget;
    }

    public void setWidget(String widget) {
        this.widget = widget;
    }

    @Basic
    @Column(name = "CodigoWidget", nullable = true, length = 50)
    public String getCodigoWidget() {
        return codigoWidget;
    }

    public void setCodigoWidget(String codigoWidget) {
        this.codigoWidget = codigoWidget;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 500)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Widgets widgets = (Widgets) o;

        if (idWidget != null ? !idWidget.equals(widgets.idWidget) : widgets.idWidget != null) return false;
        if (widget != null ? !widget.equals(widgets.widget) : widgets.widget != null) return false;
        if (codigoWidget != null ? !codigoWidget.equals(widgets.codigoWidget) : widgets.codigoWidget != null)
            return false;
        if (descripcion != null ? !descripcion.equals(widgets.descripcion) : widgets.descripcion != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(widgets.indicadorHabilitado) : widgets.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(widgets.auditoriaUsuario) : widgets.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(widgets.auditoriaFecha) : widgets.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idWidget != null ? idWidget.hashCode() : 0;
        result = 31 * result + (widget != null ? widget.hashCode() : 0);
        result = 31 * result + (codigoWidget != null ? codigoWidget.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
