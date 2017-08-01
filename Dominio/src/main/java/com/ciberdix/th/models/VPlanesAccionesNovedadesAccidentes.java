package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "V_PlanesAccionesNovedadesAccidentes", schema = "dbo", catalog = "CREZCAMOS")
public class VPlanesAccionesNovedadesAccidentes {
    private Integer idPlanAccionNovedadAccidente;
    private Integer idNovedad;
    private String estadoPlanAccion;
    private Integer idEstadoPlanAccion;
    private String actividad;
    private String nombreResponsable;
    private Long idResponsable;
    private Date fechaLimite;
    private String nombreEncargado;
    private Long idEncargado;
    private Date fechaVerificacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdPlanAccionNovedadAccidente", nullable = false)
    public Integer getIdPlanAccionNovedadAccidente() {
        return idPlanAccionNovedadAccidente;
    }

    public void setIdPlanAccionNovedadAccidente(Integer idPlanAccionNovedadAccidente) {
        this.idPlanAccionNovedadAccidente = idPlanAccionNovedadAccidente;
    }

    @Basic
    @Column(name = "IdNovedad", nullable = true)
    public Integer getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Integer idNovedad) {
        this.idNovedad = idNovedad;
    }

    @Basic
    @Column(name = "EstadoPlanAccion", nullable = true, length = 100)
    public String getEstadoPlanAccion() {
        return estadoPlanAccion;
    }

    public void setEstadoPlanAccion(String estadoPlanAccion) {
        this.estadoPlanAccion = estadoPlanAccion;
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
    @Column(name = "NombreResponsable", nullable = false, length = 259)
    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
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
    @Column(name = "NombreEncargado", nullable = false, length = 259)
    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
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

        VPlanesAccionesNovedadesAccidentes that = (VPlanesAccionesNovedadesAccidentes) o;

        if (idPlanAccionNovedadAccidente != null ? !idPlanAccionNovedadAccidente.equals(that.idPlanAccionNovedadAccidente) : that.idPlanAccionNovedadAccidente != null)
            return false;
        if (idNovedad != null ? !idNovedad.equals(that.idNovedad) : that.idNovedad != null) return false;
        if (estadoPlanAccion != null ? !estadoPlanAccion.equals(that.estadoPlanAccion) : that.estadoPlanAccion != null)
            return false;
        if (idEstadoPlanAccion != null ? !idEstadoPlanAccion.equals(that.idEstadoPlanAccion) : that.idEstadoPlanAccion != null)
            return false;
        if (actividad != null ? !actividad.equals(that.actividad) : that.actividad != null) return false;
        if (nombreResponsable != null ? !nombreResponsable.equals(that.nombreResponsable) : that.nombreResponsable != null)
            return false;
        if (idResponsable != null ? !idResponsable.equals(that.idResponsable) : that.idResponsable != null)
            return false;
        if (fechaLimite != null ? !fechaLimite.equals(that.fechaLimite) : that.fechaLimite != null) return false;
        if (nombreEncargado != null ? !nombreEncargado.equals(that.nombreEncargado) : that.nombreEncargado != null)
            return false;
        if (idEncargado != null ? !idEncargado.equals(that.idEncargado) : that.idEncargado != null) return false;
        if (fechaVerificacion != null ? !fechaVerificacion.equals(that.fechaVerificacion) : that.fechaVerificacion != null)
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
        result = 31 * result + (idNovedad != null ? idNovedad.hashCode() : 0);
        result = 31 * result + (estadoPlanAccion != null ? estadoPlanAccion.hashCode() : 0);
        result = 31 * result + (idEstadoPlanAccion != null ? idEstadoPlanAccion.hashCode() : 0);
        result = 31 * result + (actividad != null ? actividad.hashCode() : 0);
        result = 31 * result + (nombreResponsable != null ? nombreResponsable.hashCode() : 0);
        result = 31 * result + (idResponsable != null ? idResponsable.hashCode() : 0);
        result = 31 * result + (fechaLimite != null ? fechaLimite.hashCode() : 0);
        result = 31 * result + (nombreEncargado != null ? nombreEncargado.hashCode() : 0);
        result = 31 * result + (idEncargado != null ? idEncargado.hashCode() : 0);
        result = 31 * result + (fechaVerificacion != null ? fechaVerificacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
