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
public class TercerosDisciplinarios {
    private Integer idTerceroDisciplinario;
    private Long idTercero;
    private Integer idCargo;
    private Integer idFalta;
    private Timestamp fechaIncidente;
    private String detalle;
    private Integer idEstado;
    private Integer idReporta;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroDisciplinario", nullable = false)
    public Integer getIdTerceroDisciplinario() {
        return idTerceroDisciplinario;
    }

    public void setIdTerceroDisciplinario(Integer idTerceroDisciplinario) {
        this.idTerceroDisciplinario = idTerceroDisciplinario;
    }

    @Basic
    @Column(name = "IdTercero", nullable = false)
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
    @Column(name = "IdFalta", nullable = false)
    public Integer getIdFalta() {
        return idFalta;
    }

    public void setIdFalta(Integer idFalta) {
        this.idFalta = idFalta;
    }

    @Basic
    @Column(name = "FechaIncidente", nullable = false)
    public Timestamp getFechaIncidente() {
        return fechaIncidente;
    }

    public void setFechaIncidente(Timestamp fechaIncidente) {
        this.fechaIncidente = fechaIncidente;
    }

    @Basic
    @Column(name = "Detalle", nullable = true, length = 300)
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Basic
    @Column(name = "IdEstado", nullable = false)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "IdReporta", nullable = true)
    public Integer getIdReporta() {
        return idReporta;
    }

    public void setIdReporta(Integer idReporta) {
        this.idReporta = idReporta;
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

        TercerosDisciplinarios that = (TercerosDisciplinarios) o;

        if (idTerceroDisciplinario != null ? !idTerceroDisciplinario.equals(that.idTerceroDisciplinario) : that.idTerceroDisciplinario != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idFalta != null ? !idFalta.equals(that.idFalta) : that.idFalta != null) return false;
        if (fechaIncidente != null ? !fechaIncidente.equals(that.fechaIncidente) : that.fechaIncidente != null)
            return false;
        if (detalle != null ? !detalle.equals(that.detalle) : that.detalle != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (idReporta != null ? !idReporta.equals(that.idReporta) : that.idReporta != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroDisciplinario != null ? idTerceroDisciplinario.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idFalta != null ? idFalta.hashCode() : 0);
        result = 31 * result + (fechaIncidente != null ? fechaIncidente.hashCode() : 0);
        result = 31 * result + (detalle != null ? detalle.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (idReporta != null ? idReporta.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
