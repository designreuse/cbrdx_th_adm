package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class TercerosCapacitaciones {
    private Integer idTerceroCapacitacion;
    private Long idTercero;
    private Integer idCargo;
    private Integer idCapacitacion;
    private Timestamp fechaInscripcion;
    private Boolean idAsiste;
    private Boolean idFinaliza;
    private BigDecimal calificacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroCapacitacion", nullable = false)
    public Integer getIdTerceroCapacitacion() {
        return idTerceroCapacitacion;
    }

    public void setIdTerceroCapacitacion(Integer idTerceroCapacitacion) {
        this.idTerceroCapacitacion = idTerceroCapacitacion;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdCapacitacion", nullable = true)
    public Integer getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(Integer idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    @Basic
    @Column(name = "FechaInscripcion", nullable = true)
    public Timestamp getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Timestamp fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Basic
    @Column(name = "IdAsiste", nullable = true)
    public Boolean getIdAsiste() {
        return idAsiste;
    }

    public void setIdAsiste(Boolean idAsiste) {
        this.idAsiste = idAsiste;
    }

    @Basic
    @Column(name = "IdFinaliza", nullable = true)
    public Boolean getIdFinaliza() {
        return idFinaliza;
    }

    public void setIdFinaliza(Boolean idFinaliza) {
        this.idFinaliza = idFinaliza;
    }

    @Basic
    @Column(name = "Calificacion", nullable = true, precision = 1)
    public BigDecimal getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigDecimal calificacion) {
        this.calificacion = calificacion;
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

        TercerosCapacitaciones that = (TercerosCapacitaciones) o;

        if (idTerceroCapacitacion != null ? !idTerceroCapacitacion.equals(that.idTerceroCapacitacion) : that.idTerceroCapacitacion != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idCapacitacion != null ? !idCapacitacion.equals(that.idCapacitacion) : that.idCapacitacion != null)
            return false;
        if (fechaInscripcion != null ? !fechaInscripcion.equals(that.fechaInscripcion) : that.fechaInscripcion != null)
            return false;
        if (idAsiste != null ? !idAsiste.equals(that.idAsiste) : that.idAsiste != null) return false;
        if (idFinaliza != null ? !idFinaliza.equals(that.idFinaliza) : that.idFinaliza != null) return false;
        if (calificacion != null ? !calificacion.equals(that.calificacion) : that.calificacion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroCapacitacion != null ? idTerceroCapacitacion.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idCapacitacion != null ? idCapacitacion.hashCode() : 0);
        result = 31 * result + (fechaInscripcion != null ? fechaInscripcion.hashCode() : 0);
        result = 31 * result + (idAsiste != null ? idAsiste.hashCode() : 0);
        result = 31 * result + (idFinaliza != null ? idFinaliza.hashCode() : 0);
        result = 31 * result + (calificacion != null ? calificacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
