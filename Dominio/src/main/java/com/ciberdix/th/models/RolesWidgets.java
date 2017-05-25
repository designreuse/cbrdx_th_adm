package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
@Table(name = "RolesWidgets", schema = "dbo", catalog = "CREZCAMOS")
public class RolesWidgets {
    private Integer idRolWidget;
    private Integer idRol;
    private Integer idWidget;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public RolesWidgets() {
    }

    public RolesWidgets(Integer idRol, Integer idWidget, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idRol = idRol;
        this.idWidget = idWidget;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public RolesWidgets(Integer idRolWidget, Integer idRol, Integer idWidget, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idRolWidget = idRolWidget;
        this.idRol = idRol;
        this.idWidget = idWidget;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRolWidget")
    public Integer getIdRolWidget() {
        return idRolWidget;
    }

    public void setIdRolWidget(Integer idRolWidget) {
        this.idRolWidget = idRolWidget;
    }

    @Basic
    @Column(name = "IdRol")
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "IdWidget")
    public Integer getIdWidget() {
        return idWidget;
    }

    public void setIdWidget(Integer idWidget) {
        this.idWidget = idWidget;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
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

        RolesWidgets that = (RolesWidgets) o;

        if (idRolWidget != null ? !idRolWidget.equals(that.idRolWidget) : that.idRolWidget != null) return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (idWidget != null ? !idWidget.equals(that.idWidget) : that.idWidget != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRolWidget != null ? idRolWidget.hashCode() : 0;
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (idWidget != null ? idWidget.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
