package com.ciberdix.sp.model;

import java.sql.Timestamp;

public class PerfilMenu {
    private Integer idPerfilMenu;
    private Integer idPerfil;
    private Integer idFormulario;
    private Boolean indicadorLectura;
    private Boolean indicadorEdicion;
    private Boolean indicadorImpresion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdPerfilMenu() {
        return idPerfilMenu;
    }

    public void setIdPerfilMenu(Integer idPerfilMenu) {
        this.idPerfilMenu = idPerfilMenu;
    }

    public Integer getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Integer idPerfil) {
        this.idPerfil = idPerfil;
    }

    public Integer getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(Integer idFormulario) {
        this.idFormulario = idFormulario;
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

    public Boolean getIndicadorImpresion() {
        return indicadorImpresion;
    }

    public void setIndicadorImpresion(Boolean indicadorImpresion) {
        this.indicadorImpresion = indicadorImpresion;
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
