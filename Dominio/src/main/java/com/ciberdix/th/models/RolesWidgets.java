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
    private Boolean indicadorObligatorio;

    public RolesWidgets() {
    }

    public RolesWidgets(Integer idRol, Integer idWidget, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorObligatorio) {
        this.idRol = idRol;
        this.idWidget = idWidget;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorObligatorio = indicadorObligatorio;
    }

    public RolesWidgets(Integer idRolWidget, Integer idRol, Integer idWidget, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorObligatorio) {
        this.idRolWidget = idRolWidget;
        this.idRol = idRol;
        this.idWidget = idWidget;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorObligatorio = indicadorObligatorio;
    }

    @Id
    @GeneratedValue
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
    @Column(name = "IdWidget", nullable = true)
    public Integer getIdWidget() {
        return idWidget;
    }

    public void setIdWidget(Integer idWidget) {
        this.idWidget = idWidget;
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

        RolesWidgets that = (RolesWidgets) o;

        if (!idRolWidget.equals(that.idRolWidget)) return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (idWidget != null ? !idWidget.equals(that.idWidget) : that.idWidget != null) return false;
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
        result = 31 * result + (idWidget != null ? idWidget.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        return result;
    }
}
