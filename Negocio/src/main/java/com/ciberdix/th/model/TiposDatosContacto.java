package com.ciberdix.th.model;

import java.sql.Timestamp;

public class TiposDatosContacto {

    private Integer idTipoDatoContacto;
    private String codigo;
    private String tipoDatoContacto;
    private Boolean indicadorRequiereConfirmacion;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTipoDatoContacto() {
        return idTipoDatoContacto;
    }

    public void setIdTipoDatoContacto(Integer idTipoDatoContacto) {
        this.idTipoDatoContacto = idTipoDatoContacto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoDatoContacto() {
        return tipoDatoContacto;
    }

    public void setTipoDatoContacto(String tipoDatoContacto) {
        this.tipoDatoContacto = tipoDatoContacto;
    }

    public Boolean getIndicadorRequiereConfirmacion() {
        return indicadorRequiereConfirmacion;
    }

    public void setIndicadorRequiereConfirmacion(Boolean indicadorRequiereConfirmacion) {
        this.indicadorRequiereConfirmacion = indicadorRequiereConfirmacion;
    }

    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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
