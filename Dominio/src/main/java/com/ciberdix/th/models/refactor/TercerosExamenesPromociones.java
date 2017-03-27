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
public class TercerosExamenesPromociones {
    private Integer idTerceroExamenPromocion;
    private Integer idExamenPromocion;
    private Long idTercero;
    private Integer idCargo;
    private Timestamp fechaProgramada;
    private String observacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idEstado;

    @Id
    @Column(name = "IdTerceroExamenPromocion")
    public Integer getIdTerceroExamenPromocion() {
        return idTerceroExamenPromocion;
    }

    public void setIdTerceroExamenPromocion(Integer idTerceroExamenPromocion) {
        this.idTerceroExamenPromocion = idTerceroExamenPromocion;
    }

    @Basic
    @Column(name = "IdExamenPromocion")
    public Integer getIdExamenPromocion() {
        return idExamenPromocion;
    }

    public void setIdExamenPromocion(Integer idExamenPromocion) {
        this.idExamenPromocion = idExamenPromocion;
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
    @Column(name = "FechaProgramada")
    public Timestamp getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Timestamp fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
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

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosExamenesPromociones that = (TercerosExamenesPromociones) o;

        if (idTerceroExamenPromocion != null ? !idTerceroExamenPromocion.equals(that.idTerceroExamenPromocion) : that.idTerceroExamenPromocion != null)
            return false;
        if (idExamenPromocion != null ? !idExamenPromocion.equals(that.idExamenPromocion) : that.idExamenPromocion != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (fechaProgramada != null ? !fechaProgramada.equals(that.fechaProgramada) : that.fechaProgramada != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroExamenPromocion != null ? idTerceroExamenPromocion.hashCode() : 0;
        result = 31 * result + (idExamenPromocion != null ? idExamenPromocion.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (fechaProgramada != null ? fechaProgramada.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        return result;
    }
}
