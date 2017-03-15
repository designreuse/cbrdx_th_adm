package com.ciberdix.th.model;

import java.sql.Timestamp;

public class TercerosFamiliares {

    private Long idTercerosFamiliar;
    private Long idTerceros;
    private Long idFamiliar;
    private int idParentezco;
    private int idConvivencia;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosFamiliares(Long idTerceros, Long idFamiliar, int idParentezco, int idConvivencia, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idTerceros = idTerceros;
        this.idFamiliar = idFamiliar;
        this.idParentezco = idParentezco;
        this.idConvivencia = idConvivencia;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    public TercerosFamiliares() {
    }

    public Long getIdTercerosFamiliar() {
        return idTercerosFamiliar;
    }

    public void setIdTercerosFamiliar(Long idTercerosFamiliar) {
        this.idTercerosFamiliar = idTercerosFamiliar;
    }

    public Long getIdTerceros() {
        return idTerceros;
    }

    public void setIdTerceros(Long idTerceros) {
        this.idTerceros = idTerceros;
    }

    public Long getIdFamiliar() {
        return idFamiliar;
    }

    public void setIdFamiliar(Long idFamiliar) {
        this.idFamiliar = idFamiliar;
    }

    public int getIdParentezco() {
        return idParentezco;
    }

    public void setIdParentezco(int idParentezco) {
        this.idParentezco = idParentezco;
    }

    public int getIdConvivencia() {
        return idConvivencia;
    }

    public void setIdConvivencia(int idConvivencia) {
        this.idConvivencia = idConvivencia;
    }

    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
    
    
}
