package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 23/04/17.
 */
public class RolesFuncionalidades {
    private int idRolFuncionalidad;
    private Integer idRol;
    private Integer idFuncionalidad;
    private Boolean indicadorHabilitado;
    private Boolean indicadorExportar;
    private Boolean indicadorImprimir;
    private Boolean indicadorInsertar;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorMostrarEnMenu;

    public int getIdRolFuncionalidad() {
        return idRolFuncionalidad;
    }

    public void setIdRolFuncionalidad(int idRolFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Integer idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

    public Boolean getIndicadorMostrarEnMenu() {
        return indicadorMostrarEnMenu;
    }

    public void setIndicadorMostrarEnMenu(Boolean indicadorMostrarEnMenu) {
        this.indicadorMostrarEnMenu = indicadorMostrarEnMenu;
    }
}
