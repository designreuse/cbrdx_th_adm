package com.ciberdix.th.model;

import java.util.Date;
import java.sql.Timestamp;

public class VNovedadesAccidentes {

    private Integer idNovedadAccidente;
    private String nombreTercero;
    private String tipoDocumento;
    private Integer idTipoDocumento;
    private String numeroDocumento;
    private String cargo;
    private String estructuraOrganizacional;
    private String estructuraArea;
    private Date fechaAccidente;
    private String tipoNovedad;
    private Integer idTerceroNovedad;
    private String estadoAccidente;
    private Integer idEstadoAccidente;
    private Boolean indicadorActividades;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdNovedadAccidente() {
        return idNovedadAccidente;
    }

    public void setIdNovedadAccidente(Integer idNovedadAccidente) {
        this.idNovedadAccidente = idNovedadAccidente;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }

    public void setEstructuraOrganizacional(String estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
    }

    public String getEstructuraArea() {
        return estructuraArea;
    }

    public void setEstructuraArea(String estructuraArea) {
        this.estructuraArea = estructuraArea;
    }

    public Date getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(Date fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    public String getEstadoAccidente() {
        return estadoAccidente;
    }

    public void setEstadoAccidente(String estadoAccidente) {
        this.estadoAccidente = estadoAccidente;
    }

    public Integer getIdEstadoAccidente() {
        return idEstadoAccidente;
    }

    public void setIdEstadoAccidente(Integer idEstadoAccidente) {
        this.idEstadoAccidente = idEstadoAccidente;
    }

    public Boolean getIndicadorActividades() {
        return indicadorActividades;
    }

    public void setIndicadorActividades(Boolean indicadorActividades) {
        this.indicadorActividades = indicadorActividades;
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
