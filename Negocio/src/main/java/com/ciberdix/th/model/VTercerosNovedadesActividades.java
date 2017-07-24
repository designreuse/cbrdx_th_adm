package com.ciberdix.th.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class VTercerosNovedadesActividades {

    private Integer idTerceroNovedadActividad;
    private String tipoNovedad;
    private Integer idTipoNovedad;
    private String novedad;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp fechaSolicitudNovedad;
    private String nombreTercero;
    private Integer idTerceroNovedad;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp fechaCreacion;
    private String estadoNovedad;
    private Integer idEstadoNovedad;
    private String actividadRealizada;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroNovedadActividad() {
        return idTerceroNovedadActividad;
    }

    public void setIdTerceroNovedadActividad(Integer idTerceroNovedadActividad) {
        this.idTerceroNovedadActividad = idTerceroNovedadActividad;
    }

    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    public Integer getIdTipoNovedad() {
        return idTipoNovedad;
    }

    public void setIdTipoNovedad(Integer idTipoNovedad) {
        this.idTipoNovedad = idTipoNovedad;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public Timestamp getFechaSolicitudNovedad() {
        return fechaSolicitudNovedad;
    }

    public void setFechaSolicitudNovedad(Timestamp fechaSolicitudNovedad) {
        this.fechaSolicitudNovedad = fechaSolicitudNovedad;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstadoNovedad() {
        return estadoNovedad;
    }

    public void setEstadoNovedad(String estadoNovedad) {
        this.estadoNovedad = estadoNovedad;
    }

    public Integer getIdEstadoNovedad() {
        return idEstadoNovedad;
    }

    public void setIdEstadoNovedad(Integer idEstadoNovedad) {
        this.idEstadoNovedad = idEstadoNovedad;
    }

    public String getActividadRealizada() {
        return actividadRealizada;
    }

    public void setActividadRealizada(String actividadRealizada) {
        this.actividadRealizada = actividadRealizada;
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
