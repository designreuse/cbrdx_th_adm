package com.ciberdix.sp.model;

import java.sql.Timestamp;

public class PerfilMenuElemento {
    private Integer idPerfilMenuElemento;
    private Integer idPerfilMenu;
    private Integer idFormularioElemento;
    private Boolean indicadorLectura;
    private Boolean indicadorEdicion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdPerfilMenuElemento() {
        return idPerfilMenuElemento;
    }

    public void setIdPerfilMenuElemento(Integer idPerfilMenuElemento) {
        this.idPerfilMenuElemento = idPerfilMenuElemento;
    }

    public Integer getIdPerfilMenu() {
        return idPerfilMenu;
    }

    public void setIdPerfilMenu(Integer idPerfilMenu) {
        this.idPerfilMenu = idPerfilMenu;
    }

    public Integer getIdFormularioElemento() {
        return idFormularioElemento;
    }

    public void setIdFormularioElemento(Integer idFormularioElemento) {
        this.idFormularioElemento = idFormularioElemento;
    }

    public Boolean getIndicadorLectura() {
        return indicadorLectura;
    }

    public void setIndicadorLectura(Boolean indicadorLectura) {
        this.indicadorLectura = indicadorLectura;
    }

    public Boolean getIndicadorEdicion() {
        return indicadorEdicion;
    }

    public void setIndicadorEdicion(Boolean indicadorEdicion) {
        this.indicadorEdicion = indicadorEdicion;
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
