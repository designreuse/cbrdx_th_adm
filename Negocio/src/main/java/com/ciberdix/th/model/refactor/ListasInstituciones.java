package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class ListasInstituciones {
    private Integer idListaInstitucion;
    private String codigoListaInstitucion;
    private String nombreListaInstitucion;
    private Integer ordenListaInstitucion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdListaInstitucion() {
        return idListaInstitucion;
    }

    public void setIdListaInstitucion(Integer idListaInstitucion) {
        this.idListaInstitucion = idListaInstitucion;
    }

    public String getCodigoListaInstitucion() {
        return codigoListaInstitucion;
    }

    public void setCodigoListaInstitucion(String codigoListaInstitucion) {
        this.codigoListaInstitucion = codigoListaInstitucion;
    }

    public String getNombreListaInstitucion() {
        return nombreListaInstitucion;
    }

    public void setNombreListaInstitucion(String nombreListaInstitucion) {
        this.nombreListaInstitucion = nombreListaInstitucion;
    }

    public Integer getOrdenListaInstitucion() {
        return ordenListaInstitucion;
    }

    public void setOrdenListaInstitucion(Integer ordenListaInstitucion) {
        this.ordenListaInstitucion = ordenListaInstitucion;
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
