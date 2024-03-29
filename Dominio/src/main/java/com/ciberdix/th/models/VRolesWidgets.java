package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 24/04/17.
 */
@Entity
@Table(name = "V_RolesWidgets", schema = "dbo", catalog = "CREZCAMOS")
public class VRolesWidgets {
    private Integer idRolWidget;
    private Integer idRol;
    private String rol;
    private Integer idWidget;
    private String widget;
    private String codigoWidget;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorObligatorio;

    @Basic
    @Id
    @Column(name = "IdRolWidget", nullable = false)
    public Integer getIdRolWidget() {
        return idRolWidget;
    }

    public void setIdRolWidget(Integer idRolWidget) {
        this.idRolWidget = idRolWidget;
    }

    @Basic
    @Column(name = "IdRol", nullable = true)
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "Rol", nullable = true, length = 64)
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "IdWidget", nullable = true)
    public Integer getIdWidget() {
        return idWidget;
    }

    public void setIdWidget(Integer idWidget) {
        this.idWidget = idWidget;
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
    @Column(name = "Widget", nullable = true, length = 50)
    public String getWidget() {
        return widget;
    }

    public void setWidget(String widget) {
        this.widget = widget;
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

    @Basic
    @Column(name = "IndicadorObligatorio", nullable = true)
    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VRolesWidgets that = (VRolesWidgets) o;

        if (!idRolWidget.equals(that.idRolWidget)) return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (idWidget != null ? !idWidget.equals(that.idWidget) : that.idWidget != null) return false;
        if (widget != null ? !widget.equals(that.widget) : that.widget != null) return false;
        if (codigoWidget != null ? !codigoWidget.equals(that.codigoWidget) : that.codigoWidget != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (!auditoriaUsuario.equals(that.auditoriaUsuario)) return false;
        if (!auditoriaFecha.equals(that.auditoriaFecha)) return false;
        return indicadorObligatorio != null ? indicadorObligatorio.equals(that.indicadorObligatorio) : that.indicadorObligatorio == null;
    }

    @Override
    public int hashCode() {
        int result = idRolWidget.hashCode();
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (idWidget != null ? idWidget.hashCode() : 0);
        result = 31 * result + (widget != null ? widget.hashCode() : 0);
        result = 31 * result + (codigoWidget != null ? codigoWidget.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        return result;
    }
}
