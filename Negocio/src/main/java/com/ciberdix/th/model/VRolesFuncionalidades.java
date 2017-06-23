package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 24/04/17.
 */
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

    public int getIdRolFuncionalidad() {
        return idRolFuncionalidad;
    }

    public void setIdRolFuncionalidad(int idRolFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
    }

    public Integer getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Integer idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getIndicadorExportar() {
        return indicadorExportar;
    }

    public void setIndicadorExportar(Boolean indicadorExportar) {
        this.indicadorExportar = indicadorExportar;
    }

    public Boolean getIndicadorImprimir() {
        return indicadorImprimir;
    }

    public void setIndicadorImprimir(Boolean indicadorImprimir) {
        this.indicadorImprimir = indicadorImprimir;
    }

    public Boolean getIndicadorInsertar() {
        return indicadorInsertar;
    }

    public void setIndicadorInsertar(Boolean indicadorInsertar) {
        this.indicadorInsertar = indicadorInsertar;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Boolean getIndicadorMostrarEnMenu() {
        return indicadorMostrarEnMenu;
    }

    public void setIndicadorMostrarEnMenu(Boolean indicadorMostrarEnMenu) {
        this.indicadorMostrarEnMenu = indicadorMostrarEnMenu;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
