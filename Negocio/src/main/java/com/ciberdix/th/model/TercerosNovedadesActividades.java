package com.ciberdix.th.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class TercerosNovedadesActividades {

    private Integer idTerceroNovedadActividad;
    private Integer idTerceroNovedad;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp fechaCreacion;
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
