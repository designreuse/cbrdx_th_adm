package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 5/04/17.
 */
public class VTercerosContactos {
    private String codigoListaParentesco;
    private String nombreListaParentesco;
    private Integer idTerceroContacto;
    private Long idTercero;
    private String contacto;
    private String telefono;
    private String celular;
    private Integer idListaParentesco;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idListaParentezco;

    public String getCodigoListaParentesco() {
        return codigoListaParentesco;
    }

    public void setCodigoListaParentesco(String codigoListaParentesco) {
        this.codigoListaParentesco = codigoListaParentesco;
    }

    public String getNombreListaParentesco() {
        return nombreListaParentesco;
    }

    public void setNombreListaParentesco(String nombreListaParentesco) {
        this.nombreListaParentesco = nombreListaParentesco;
    }

    public Integer getIdTerceroContacto() {
        return idTerceroContacto;
    }

    public void setIdTerceroContacto(Integer idTerceroContacto) {
        this.idTerceroContacto = idTerceroContacto;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Integer getIdListaParentesco() {
        return idListaParentesco;
    }

    public void setIdListaParentesco(Integer idListaParentesco) {
        this.idListaParentesco = idListaParentesco;
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

    public Integer getIdListaParentezco() {
        return idListaParentezco;
    }

    public void setIdListaParentezco(Integer idListaParentezco) {
        this.idListaParentezco = idListaParentezco;
    }
}
