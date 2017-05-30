package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class TercerosNovedadesPlanes {
    private Integer idTerceroNovedadPlan;
    private Integer idTerceroNovedad;
    private String actividad;
    private Long idResponsable;
    private Integer idDirigidoA;
    private Timestamp fechaLimite;
    private Timestamp fechaVerificacion;
    private Integer idEstado;
    private String seguimiento;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroNovedadPlan", nullable = false)
    public Integer getIdTerceroNovedadPlan() {
        return idTerceroNovedadPlan;
    }

    public void setIdTerceroNovedadPlan(Integer idTerceroNovedadPlan) {
        this.idTerceroNovedadPlan = idTerceroNovedadPlan;
    }

    @Basic
    @Column(name = "IdTerceroNovedad", nullable = false)
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "Actividad", nullable = true, length = 300)
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Basic
    @Column(name = "IdResponsable", nullable = false)
    public Long getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Long idResponsable) {
        this.idResponsable = idResponsable;
    }

    @Basic
    @Column(name = "IdDirigidoA", nullable = true)
    public Integer getIdDirigidoA() {
        return idDirigidoA;
    }

    public void setIdDirigidoA(Integer idDirigidoA) {
        this.idDirigidoA = idDirigidoA;
    }

    @Basic
    @Column(name = "FechaLimite", nullable = true)
    public Timestamp getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Timestamp fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Basic
    @Column(name = "FechaVerificacion", nullable = true)
    public Timestamp getFechaVerificacion() {
        return fechaVerificacion;
    }

    public void setFechaVerificacion(Timestamp fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    @Basic
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "Seguimiento", nullable = true, length = 300)
    public String getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(String seguimiento) {
        this.seguimiento = seguimiento;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = false)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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

        TercerosNovedadesPlanes that = (TercerosNovedadesPlanes) o;

        if (idTerceroNovedadPlan != null ? !idTerceroNovedadPlan.equals(that.idTerceroNovedadPlan) : that.idTerceroNovedadPlan != null)
            return false;
        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (actividad != null ? !actividad.equals(that.actividad) : that.actividad != null) return false;
        if (idResponsable != null ? !idResponsable.equals(that.idResponsable) : that.idResponsable != null)
            return false;
        if (idDirigidoA != null ? !idDirigidoA.equals(that.idDirigidoA) : that.idDirigidoA != null) return false;
        if (fechaLimite != null ? !fechaLimite.equals(that.fechaLimite) : that.fechaLimite != null) return false;
        if (fechaVerificacion != null ? !fechaVerificacion.equals(that.fechaVerificacion) : that.fechaVerificacion != null)
            return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (seguimiento != null ? !seguimiento.equals(that.seguimiento) : that.seguimiento != null) return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroNovedadPlan != null ? idTerceroNovedadPlan.hashCode() : 0;
        result = 31 * result + (idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0);
        result = 31 * result + (actividad != null ? actividad.hashCode() : 0);
        result = 31 * result + (idResponsable != null ? idResponsable.hashCode() : 0);
        result = 31 * result + (idDirigidoA != null ? idDirigidoA.hashCode() : 0);
        result = 31 * result + (fechaLimite != null ? fechaLimite.hashCode() : 0);
        result = 31 * result + (fechaVerificacion != null ? fechaVerificacion.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (seguimiento != null ? seguimiento.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
