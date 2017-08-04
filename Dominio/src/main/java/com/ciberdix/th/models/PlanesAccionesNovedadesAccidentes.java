package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "PlanesAccionesNovedadesAccidentes", schema = "dbo", catalog = "CREZCAMOS")
public class PlanesAccionesNovedadesAccidentes {
    private Integer idPlanAccionNovedadAccidente;
    private Integer idTerceroNovedad;
    private Integer idEstadoPlanAccion;
    private String actividad;
    private Long idResponsable;
    private Date fechaLimite;
    private Long idEncargado;
    private Date fechaVerificacion;
    private String observacion;
    private String respuesta;
    private Boolean indicadorVerficar;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public PlanesAccionesNovedadesAccidentes() {
    }

    public PlanesAccionesNovedadesAccidentes(Integer idTerceroNovedad, Integer idEstadoPlanAccion, String actividad, Long idResponsable, Date fechaLimite, Long idEncargado, Date fechaVerificacion, String observacion, String respuesta, Boolean indicadorVerficar, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroNovedad = idTerceroNovedad;
        this.idEstadoPlanAccion = idEstadoPlanAccion;
        this.actividad = actividad;
        this.idResponsable = idResponsable;
        this.fechaLimite = fechaLimite;
        this.idEncargado = idEncargado;
        this.fechaVerificacion = fechaVerificacion;
        this.observacion = observacion;
        this.respuesta = respuesta;
        this.indicadorVerficar = indicadorVerficar;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public PlanesAccionesNovedadesAccidentes(Integer idPlanAccionNovedadAccidente, Integer idTerceroNovedad, Integer idEstadoPlanAccion, String actividad, Long idResponsable, Date fechaLimite, Long idEncargado, Date fechaVerificacion, String observacion, String respuesta, Boolean indicadorVerficar, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idPlanAccionNovedadAccidente = idPlanAccionNovedadAccidente;
        this.idTerceroNovedad = idTerceroNovedad;
        this.idEstadoPlanAccion = idEstadoPlanAccion;
        this.actividad = actividad;
        this.idResponsable = idResponsable;
        this.fechaLimite = fechaLimite;
        this.idEncargado = idEncargado;
        this.fechaVerificacion = fechaVerificacion;
        this.observacion = observacion;
        this.respuesta = respuesta;
        this.indicadorVerficar = indicadorVerficar;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdPlanAccionNovedadAccidente", nullable = false)
    public Integer getIdPlanAccionNovedadAccidente() {
        return idPlanAccionNovedadAccidente;
    }

    public void setIdPlanAccionNovedadAccidente(Integer idPlanAccionNovedadAccidente) {
        this.idPlanAccionNovedadAccidente = idPlanAccionNovedadAccidente;
    }

    @Basic
    @Column(name = "IdTerceroNovedad", nullable = true)
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "IdEstadoPlanAccion", nullable = true)
    public Integer getIdEstadoPlanAccion() {
        return idEstadoPlanAccion;
    }

    public void setIdEstadoPlanAccion(Integer idEstadoPlanAccion) {
        this.idEstadoPlanAccion = idEstadoPlanAccion;
    }

    @Basic
    @Column(name = "Actividad", nullable = true, length = 500)
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Basic
    @Column(name = "IdResponsable", nullable = true)
    public Long getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Long idResponsable) {
        this.idResponsable = idResponsable;
    }

    @Basic
    @Column(name = "FechaLimite", nullable = true)
    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Basic
    @Column(name = "IdEncargado", nullable = true)
    public Long getIdEncargado() {
        return idEncargado;
    }

    public void setIdEncargado(Long idEncargado) {
        this.idEncargado = idEncargado;
    }

    @Basic
    @Column(name = "FechaVerificacion", nullable = true)
    public Date getFechaVerificacion() {
        return fechaVerificacion;
    }

    public void setFechaVerificacion(Date fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    @Basic
    @Column(name = "Observacion", nullable = true, length = 500)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "Respuesta", nullable = true, length = 500)
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Basic
    @Column(name = "IndicadorVerficar", nullable = true)
    public Boolean getIndicadorVerficar() {
        return indicadorVerficar;
    }

    public void setIndicadorVerficar(Boolean indicadorVerficar) {
        this.indicadorVerficar = indicadorVerficar;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlanesAccionesNovedadesAccidentes that = (PlanesAccionesNovedadesAccidentes) o;

        if (idPlanAccionNovedadAccidente != null ? !idPlanAccionNovedadAccidente.equals(that.idPlanAccionNovedadAccidente) : that.idPlanAccionNovedadAccidente != null)
            return false;
        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (idEstadoPlanAccion != null ? !idEstadoPlanAccion.equals(that.idEstadoPlanAccion) : that.idEstadoPlanAccion != null)
            return false;
        if (actividad != null ? !actividad.equals(that.actividad) : that.actividad != null) return false;
        if (idResponsable != null ? !idResponsable.equals(that.idResponsable) : that.idResponsable != null)
            return false;
        if (fechaLimite != null ? !fechaLimite.equals(that.fechaLimite) : that.fechaLimite != null) return false;
        if (idEncargado != null ? !idEncargado.equals(that.idEncargado) : that.idEncargado != null) return false;
        if (fechaVerificacion != null ? !fechaVerificacion.equals(that.fechaVerificacion) : that.fechaVerificacion != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (respuesta != null ? !respuesta.equals(that.respuesta) : that.respuesta != null) return false;
        if (indicadorVerficar != null ? !indicadorVerficar.equals(that.indicadorVerficar) : that.indicadorVerficar != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPlanAccionNovedadAccidente != null ? idPlanAccionNovedadAccidente.hashCode() : 0;
        result = 31 * result + (idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0);
        result = 31 * result + (idEstadoPlanAccion != null ? idEstadoPlanAccion.hashCode() : 0);
        result = 31 * result + (actividad != null ? actividad.hashCode() : 0);
        result = 31 * result + (idResponsable != null ? idResponsable.hashCode() : 0);
        result = 31 * result + (fechaLimite != null ? fechaLimite.hashCode() : 0);
        result = 31 * result + (idEncargado != null ? idEncargado.hashCode() : 0);
        result = 31 * result + (fechaVerificacion != null ? fechaVerificacion.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (respuesta != null ? respuesta.hashCode() : 0);
        result = 31 * result + (indicadorVerficar != null ? indicadorVerficar.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
