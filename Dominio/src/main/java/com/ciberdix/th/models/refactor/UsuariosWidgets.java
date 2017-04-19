package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
public class UsuariosWidgets {
    private Integer idUsuarioWidget;
    private Integer idUsuario;
    private Integer idWidget;
    private Boolean indicadorHabilitado;

    @Id
    @Column(name = "IdUsuarioWidget")
    public Integer getIdUsuarioWidget() {
        return idUsuarioWidget;
    }

    public void setIdUsuarioWidget(Integer idUsuarioWidget) {
        this.idUsuarioWidget = idUsuarioWidget;
    }

    @Basic
    @Column(name = "IdUsuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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