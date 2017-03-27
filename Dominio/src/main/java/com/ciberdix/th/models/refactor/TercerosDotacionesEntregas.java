package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class TercerosDotacionesEntregas {
    private Integer idTerceroDotacionEntrega;
    private Long idTercero;
    private Integer idCargo;
    private Timestamp fechaEntrega;
    private String observacion;
    private Integer idEstado;
    private String motivo;
    private String detalle;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroDotacionEntrega")
    public Integer getIdTerceroDotacionEntrega() {
        return idTerceroDotacionEntrega;
    }

    public void setIdTerceroDotacionEntrega(Integer idTerceroDotacionEntrega) {
        this.idTerceroDotacionEntrega = idTerceroDotacionEntrega;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "FechaEntrega")
    public Timestamp getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Timestamp fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Basic
    @Column(name = "Observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "Motivo")
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Basic
    @Column(name = "Detalle")
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
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

        TercerosDotacionesEntregas that = (TercerosDotacionesEntregas) o;

        if (idTerceroDotacionEntrega != null ? !idTerceroDotacionEntrega.equals(that.idTerceroDotacionEntrega) : that.idTerceroDotacionEntrega != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (fechaEntrega != null ? !fechaEntrega.equals(that.fechaEntrega) : that.fechaEntrega != null) return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (motivo != null ? !motivo.equals(that.motivo) : that.motivo != null) return false;
        if (detalle != null ? !detalle.equals(that.detalle) : that.detalle != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroDotacionEntrega != null ? idTerceroDotacionEntrega.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (fechaEntrega != null ? fechaEntrega.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (motivo != null ? motivo.hashCode() : 0);
        result = 31 * result + (detalle != null ? detalle.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
