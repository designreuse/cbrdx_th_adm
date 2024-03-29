package com.ciberdix.th.model;

import java.sql.Timestamp;
import java.util.Date;

public class VProyeccionesDotacionesTerceros {

    private Integer idProyeccionDotacionTerceros;
    private String nombreProyeccion;
    private Integer idProyeccionDotacion;
    private String documento;
    private String imagen;
    private String nombreCompleto;
    private String cargo;
    private String area;
    private String tipoArea;
    private Long idTercero;
    private String estado;
    private Integer idEstado;
    private Date fechaEntrega;
    private Date fechaPosibleEntrega;
    private String comentario;
    private String comentarioAdicional;
    private String comentarioEntrega;
    private String observacion;
    private String motivoInsatisfecho;
    private Integer idMotivoSatisfecho;
    private Boolean indicadorSatisfecho;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorAdicional;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
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

    public String getComentarioEntrega() {
        return comentarioEntrega;
    }

    public void setComentarioEntrega(String comentarioEntrega) {
        this.comentarioEntrega = comentarioEntrega;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getMotivoInsatisfecho() {
        return motivoInsatisfecho;
    }

    public void setMotivoInsatisfecho(String motivoInsatisfecho) {
        this.motivoInsatisfecho = motivoInsatisfecho;
    }

    public Integer getIdMotivoSatisfecho() {
        return idMotivoSatisfecho;
    }

    public void setIdMotivoSatisfecho(Integer idMotivoSatisfecho) {
        this.idMotivoSatisfecho = idMotivoSatisfecho;
    }

    public Boolean getIndicadorSatisfecho() {
        return indicadorSatisfecho;
    }

    public void setIndicadorSatisfecho(Boolean indicadorSatisfecho) {
        this.indicadorSatisfecho = indicadorSatisfecho;
    }

    public Boolean getIndicadorAdicional() {
        return indicadorAdicional;
    }

    public void setIndicadorAdicional(Boolean indicadorAdicional) {
        this.indicadorAdicional = indicadorAdicional;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
