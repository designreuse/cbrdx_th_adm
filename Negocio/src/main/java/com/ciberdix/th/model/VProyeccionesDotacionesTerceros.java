package com.ciberdix.th.model;

import java.sql.Timestamp;
import java.util.Date;

public class VProyeccionesDotacionesTerceros {

    private Integer idProyeccionDotacionTerceros;
    private String nombreProyeccion;
    private Integer idProyeccionDotacion;
    private String documento;
    private String nombreCompleto;
    private String cargo;
    private Integer area;
    private String tipoArea;
    private Long idTercero;
    private String estado;
    private Integer idEstado;
    private Date fechaEntrega;
    private Date fechaPosibleEntrega;
    private String comentario;
    private String comentarioAdicional;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdProyeccionDotacionTerceros() {
        return idProyeccionDotacionTerceros;
    }

    public void setIdProyeccionDotacionTerceros(Integer idProyeccionDotacionTerceros) {
        this.idProyeccionDotacionTerceros = idProyeccionDotacionTerceros;
    }

    public String getNombreProyeccion() {
        return nombreProyeccion;
    }

    public void setNombreProyeccion(String nombreProyeccion) {
        this.nombreProyeccion = nombreProyeccion;
    }

    public Integer getIdProyeccionDotacion() {
        return idProyeccionDotacion;
    }

    public void setIdProyeccionDotacion(Integer idProyeccionDotacion) {
        this.idProyeccionDotacion = idProyeccionDotacion;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaPosibleEntrega() {
        return fechaPosibleEntrega;
    }

    public void setFechaPosibleEntrega(Date fechaPosibleEntrega) {
        this.fechaPosibleEntrega = fechaPosibleEntrega;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentarioAdicional() {
        return comentarioAdicional;
    }

    public void setComentarioAdicional(String comentarioAdicional) {
        this.comentarioAdicional = comentarioAdicional;
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
