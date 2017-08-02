package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 6/07/2017.
 */
@Entity
@Table(name = "V_RelacionesListasCampos", schema = "dbo", catalog = "CREZCAMOS")
public class VRelacionesListasCampos {
    private Integer idRelacionListaCampo;
    private String nombreRelacion;
    private Integer idRelacionLista;
    private String menu;
    private String funcionalidadControl;
    private Integer idFuncionalidadesControles;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdRelacionListaCampo", nullable = false)
    public Integer getIdRelacionListaCampo() {
        return idRelacionListaCampo;
    }

    public void setIdRelacionListaCampo(Integer idRelacionListaCampo) {
        this.idRelacionListaCampo = idRelacionListaCampo;
    }

    @Basic
    @Column(name = "NombreRelacion", nullable = true, length = 50)
    public String getNombreRelacion() {
        return nombreRelacion;
    }

    public void setNombreRelacion(String nombreRelacion) {
        this.nombreRelacion = nombreRelacion;
    }

    @Basic
    @Column(name = "IdRelacionLista", nullable = true)
    public Integer getIdRelacionLista() {
        return idRelacionLista;
    }

    public void setIdRelacionLista(Integer idRelacionLista) {
        this.idRelacionLista = idRelacionLista;
    }

    @Basic
    @Column(name = "Menu", nullable = true, length = 64)
    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Basic
    @Column(name = "FuncionalidadControl", nullable = true, length = 50)
    public String getFuncionalidadControl() {
        return funcionalidadControl;
    }

    public void setFuncionalidadControl(String funcionalidadControl) {
        this.funcionalidadControl = funcionalidadControl;
    }

    @Basic
    @Column(name = "IdFuncionalidadesControles", nullable = true)
    public Integer getIdFuncionalidadesControles() {
        return idFuncionalidadesControles;
    }

    public void setIdFuncionalidadesControles(Integer idFuncionalidadesControles) {
        this.idFuncionalidadesControles = idFuncionalidadesControles;
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
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
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

        VRelacionesListasCampos that = (VRelacionesListasCampos) o;

        if (idRelacionListaCampo != null ? !idRelacionListaCampo.equals(that.idRelacionListaCampo) : that.idRelacionListaCampo != null)
            return false;
        if (nombreRelacion != null ? !nombreRelacion.equals(that.nombreRelacion) : that.nombreRelacion != null)
            return false;
        if (idRelacionLista != null ? !idRelacionLista.equals(that.idRelacionLista) : that.idRelacionLista != null)
            return false;
        if (menu != null ? !menu.equals(that.menu) : that.menu != null) return false;
        if (funcionalidadControl != null ? !funcionalidadControl.equals(that.funcionalidadControl) : that.funcionalidadControl != null)
            return false;
        if (idFuncionalidadesControles != null ? !idFuncionalidadesControles.equals(that.idFuncionalidadesControles) : that.idFuncionalidadesControles != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        return auditoriaFecha != null ? auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha == null;
    }

    @Override
    public int hashCode() {
        int result = idRelacionListaCampo != null ? idRelacionListaCampo.hashCode() : 0;
        result = 31 * result + (nombreRelacion != null ? nombreRelacion.hashCode() : 0);
        result = 31 * result + (idRelacionLista != null ? idRelacionLista.hashCode() : 0);
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        result = 31 * result + (funcionalidadControl != null ? funcionalidadControl.hashCode() : 0);
        result = 31 * result + (idFuncionalidadesControles != null ? idFuncionalidadesControles.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
