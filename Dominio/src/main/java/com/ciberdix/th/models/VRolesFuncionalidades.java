package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 23/06/17.
 */
@Entity
@Table(name = "V_RolesFuncionalidades", schema = "dbo", catalog = "CREZCAMOS")
public class VRolesFuncionalidades {
    private int idRolFuncionalidad;
    private Integer idFuncionalidad;
    private Integer idMenu;
    private String menu;
    private Integer idRol;
    private String rol;
    private Boolean indicadorExportar;
    private Boolean indicadorImprimir;
    private Boolean indicadorInsertar;
    private Boolean indicadorHabilitado;
    private Boolean indicadorMostrarEnMenu;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdRolFuncionalidad", nullable = false)
    public int getIdRolFuncionalidad() {
        return idRolFuncionalidad;
    }

    public void setIdRolFuncionalidad(int idRolFuncionalidad) {
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
    @Column(name = "IndicadorExportar", nullable = true)
    public Boolean getIndicadorExportar() {
        return indicadorExportar;
    }

    public void setIndicadorExportar(Boolean indicadorExportar) {
        this.indicadorExportar = indicadorExportar;
    }

    @Basic
    @Column(name = "IndicadorImprimir", nullable = true)
    public Boolean getIndicadorImprimir() {
        return indicadorImprimir;
    }

    public void setIndicadorImprimir(Boolean indicadorImprimir) {
        this.indicadorImprimir = indicadorImprimir;
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
    @Column(name = "IndicadorMostrarEnMenu", nullable = true)
    public Boolean getIndicadorMostrarEnMenu() {
        return indicadorMostrarEnMenu;
    }

    public void setIndicadorMostrarEnMenu(Boolean indicadorMostrarEnMenu) {
        this.indicadorMostrarEnMenu = indicadorMostrarEnMenu;
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

        VRolesFuncionalidades that = (VRolesFuncionalidades) o;

        if (idRolFuncionalidad != that.idRolFuncionalidad) return false;
        if (idFuncionalidad != null ? !idFuncionalidad.equals(that.idFuncionalidad) : that.idFuncionalidad != null)
            return false;
        if (idMenu != null ? !idMenu.equals(that.idMenu) : that.idMenu != null) return false;
        if (menu != null ? !menu.equals(that.menu) : that.menu != null) return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (indicadorExportar != null ? !indicadorExportar.equals(that.indicadorExportar) : that.indicadorExportar != null)
            return false;
        if (indicadorImprimir != null ? !indicadorImprimir.equals(that.indicadorImprimir) : that.indicadorImprimir != null)
            return false;
        if (indicadorInsertar != null ? !indicadorInsertar.equals(that.indicadorInsertar) : that.indicadorInsertar != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (indicadorMostrarEnMenu != null ? !indicadorMostrarEnMenu.equals(that.indicadorMostrarEnMenu) : that.indicadorMostrarEnMenu != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRolFuncionalidad;
        result = 31 * result + (idFuncionalidad != null ? idFuncionalidad.hashCode() : 0);
        result = 31 * result + (idMenu != null ? idMenu.hashCode() : 0);
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (indicadorExportar != null ? indicadorExportar.hashCode() : 0);
        result = 31 * result + (indicadorImprimir != null ? indicadorImprimir.hashCode() : 0);
        result = 31 * result + (indicadorInsertar != null ? indicadorInsertar.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (indicadorMostrarEnMenu != null ? indicadorMostrarEnMenu.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
