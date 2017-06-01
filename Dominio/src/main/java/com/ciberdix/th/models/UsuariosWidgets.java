package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
@Table(name = "UsuariosWidgets", schema = "dbo", catalog = "CREZCAMOS")
public class UsuariosWidgets {
    private Integer idUsuarioWidget;
    private Integer idUsuario;
    private Integer idWidget;
    private Boolean indicadorHabilitado;

    public UsuariosWidgets() {
    }

    public UsuariosWidgets(Integer idUsuario, Integer idWidget, Boolean indicadorHabilitado) {
        this.idUsuario = idUsuario;
        this.idWidget = idWidget;
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public UsuariosWidgets(Integer idUsuarioWidget, Integer idUsuario, Integer idWidget, Boolean indicadorHabilitado) {
        this.idUsuarioWidget = idUsuarioWidget;
        this.idUsuario = idUsuario;
        this.idWidget = idWidget;
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdUsuarioWidget", nullable = false)
    public Integer getIdUsuarioWidget() {
        return idUsuarioWidget;
    }

    public void setIdUsuarioWidget(Integer idUsuarioWidget) {
        this.idUsuarioWidget = idUsuarioWidget;
    }

    @Basic
    @Column(name = "IdUsuario", nullable = true)
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuariosWidgets that = (UsuariosWidgets) o;

        if (idUsuarioWidget != null ? !idUsuarioWidget.equals(that.idUsuarioWidget) : that.idUsuarioWidget != null)
            return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (idWidget != null ? !idWidget.equals(that.idWidget) : that.idWidget != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuarioWidget != null ? idUsuarioWidget.hashCode() : 0;
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (idWidget != null ? idWidget.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
