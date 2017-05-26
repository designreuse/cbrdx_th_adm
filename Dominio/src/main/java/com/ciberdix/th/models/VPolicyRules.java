package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by robertochajin on 26/04/17.
 */
@Entity
@Table(name = "V_PolicyRules", schema = "dbo", catalog = "CREZCAMOS")
public class VPolicyRules {
    private Integer idRolFuncionalidad;
    private Integer idFuncionalidad;
    private Boolean indicadorInsertar;
    private Boolean indicadorHabilitado;
    private String rol;
    private Integer idMenu;
    private String menu;
    private String codigoMenu;
    private Integer idPadre;
    private String ruta;
    private Integer secuencia;

    @Basic
    @Id
    @Column(name = "IdRolFuncionalidad", nullable = false)
    public Integer getIdRolFuncionalidad() {
        return idRolFuncionalidad;
    }

    public void setIdRolFuncionalidad(Integer idRolFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
    }

    @Basic
    @Column(name = "IdFuncionalidad", nullable = true)
    public Integer getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Integer idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    @Basic
    @Column(name = "IndicadorInsertar", nullable = true)
    public Boolean getIndicadorInsertar() {
        return indicadorInsertar;
    }

    public void setIndicadorInsertar(Boolean indicadorInsertar) {
        this.indicadorInsertar = indicadorInsertar;
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
    @Column(name = "Rol", nullable = true, length = 64)
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "IdMenu", nullable = true)
    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
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
    @Column(name = "CodigoMenu", nullable = true, length = 50)
    public String getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(String codigoMenu) {
        this.codigoMenu = codigoMenu;
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
    @Column(name = "Ruta", nullable = true, length = 50)
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Basic
    @Column(name = "Secuencia", nullable = true)
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VPolicyRules that = (VPolicyRules) o;

        if (idRolFuncionalidad != null ? !idRolFuncionalidad.equals(that.idRolFuncionalidad) : that.idRolFuncionalidad != null)
            return false;
        if (idFuncionalidad != null ? !idFuncionalidad.equals(that.idFuncionalidad) : that.idFuncionalidad != null)
            return false;
        if (indicadorInsertar != null ? !indicadorInsertar.equals(that.indicadorInsertar) : that.indicadorInsertar != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (idMenu != null ? !idMenu.equals(that.idMenu) : that.idMenu != null) return false;
        if (menu != null ? !menu.equals(that.menu) : that.menu != null) return false;
        if (codigoMenu != null ? !codigoMenu.equals(that.codigoMenu) : that.codigoMenu != null) return false;
        if (idPadre != null ? !idPadre.equals(that.idPadre) : that.idPadre != null) return false;
        if (ruta != null ? !ruta.equals(that.ruta) : that.ruta != null) return false;
        if (secuencia != null ? !secuencia.equals(that.secuencia) : that.secuencia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRolFuncionalidad != null ? idRolFuncionalidad.hashCode() : 0;
        result = 31 * result + (idFuncionalidad != null ? idFuncionalidad.hashCode() : 0);
        result = 31 * result + (indicadorInsertar != null ? indicadorInsertar.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (idMenu != null ? idMenu.hashCode() : 0);
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        result = 31 * result + (codigoMenu != null ? codigoMenu.hashCode() : 0);
        result = 31 * result + (idPadre != null ? idPadre.hashCode() : 0);
        result = 31 * result + (ruta != null ? ruta.hashCode() : 0);
        result = 31 * result + (secuencia != null ? secuencia.hashCode() : 0);
        return result;
    }
}
