package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by robertochajin on 28/06/17.
 */
@Entity
@Table(name = "V_PermisosFormulariosCargos", schema = "dbo", catalog = "CREZCAMOS")
public class VPermisosFormulariosCargos {
    private Integer idPermisosFormulariosCargos;
    private String codigoMenu;
    private String codigo;
    private Boolean indicadorSeccion;
    private Boolean indicadorHabilitadoRfc;
    private Boolean indicadorHabilitadoFc;
    private Boolean indicadorEditar;
    private String rol;
    private Integer idPadre;
    private Integer idFuncionalidadControl;

    @Id
    @Column(name = "IdPermisosFormulariosCargos", nullable = true)
    public Integer getIdPermisosFormulariosCargos() {
        return idPermisosFormulariosCargos;
    }

    public void setIdPermisosFormulariosCargos(Integer idPermisosFormulariosCargos) {
        this.idPermisosFormulariosCargos = idPermisosFormulariosCargos;
    }

    @Basic
    @Column(name = "IdPadre", nullable = true)
    public Integer getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Integer idPadre) {
        this.idPadre = idPadre;
    }

    @Basic
    @Column(name = "IdFuncionalidadControl", nullable = true)
    public Integer getIdFuncionalidadControl() {
        return idFuncionalidadControl;
    }

    public void setIdFuncionalidadControl(Integer idFuncionalidadControl) {
        this.idFuncionalidadControl = idFuncionalidadControl;
    }

    @Basic
    @Column(name = "CodigoMenu", nullable = true, length = 50)
    public String getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(String codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 50)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "IndicadorSeccion", nullable = true)
    public Boolean getIndicadorSeccion() {
        return indicadorSeccion;
    }

    public void setIndicadorSeccion(Boolean indicadorSeccion) {
        this.indicadorSeccion = indicadorSeccion;
    }

    @Basic
    @Column(name = "IndicadorHabilitadoRFC", nullable = true)
    public Boolean getIndicadorHabilitadoRfc() {
        return indicadorHabilitadoRfc;
    }

    public void setIndicadorHabilitadoRfc(Boolean indicadorHabilitadoRfc) {
        this.indicadorHabilitadoRfc = indicadorHabilitadoRfc;
    }

    @Basic
    @Column(name = "IndicadorHabilitadoFC", nullable = true)
    public Boolean getIndicadorHabilitadoFc() {
        return indicadorHabilitadoFc;
    }

    public void setIndicadorHabilitadoFc(Boolean indicadorHabilitadoFc) {
        this.indicadorHabilitadoFc = indicadorHabilitadoFc;
    }

    @Basic
    @Column(name = "IndicadorEditar", nullable = true)
    public Boolean getIndicadorEditar() {
        return indicadorEditar;
    }

    public void setIndicadorEditar(Boolean indicadorEditar) {
        this.indicadorEditar = indicadorEditar;
    }

    @Basic
    @Column(name = "Rol", nullable = true, length = 64)
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VPermisosFormulariosCargos that = (VPermisosFormulariosCargos) o;

        if (codigoMenu != null ? !codigoMenu.equals(that.codigoMenu) : that.codigoMenu != null) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (indicadorSeccion != null ? !indicadorSeccion.equals(that.indicadorSeccion) : that.indicadorSeccion != null)
            return false;
        if (indicadorHabilitadoRfc != null ? !indicadorHabilitadoRfc.equals(that.indicadorHabilitadoRfc) : that.indicadorHabilitadoRfc != null)
            return false;
        if (indicadorHabilitadoFc != null ? !indicadorHabilitadoFc.equals(that.indicadorHabilitadoFc) : that.indicadorHabilitadoFc != null)
            return false;
        if (indicadorEditar != null ? !indicadorEditar.equals(that.indicadorEditar) : that.indicadorEditar != null)
            return false;
        return rol != null ? rol.equals(that.rol) : that.rol == null;
    }

    @Override
    public int hashCode() {
        int result = codigoMenu != null ? codigoMenu.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (indicadorSeccion != null ? indicadorSeccion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitadoRfc != null ? indicadorHabilitadoRfc.hashCode() : 0);
        result = 31 * result + (indicadorHabilitadoFc != null ? indicadorHabilitadoFc.hashCode() : 0);
        result = 31 * result + (indicadorEditar != null ? indicadorEditar.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        return result;
    }
}
