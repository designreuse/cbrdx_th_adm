package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TercerosCargos", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosCargosEntity {
    private Integer idTerceroCargo;
    private Integer idSede;
    private Integer idArea;
    private Integer idCargo;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private Integer idTipoContrato;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idTercero;
    private CargosEntity cargo;

    @Id
    @Column(name = "IdTerceroCargo", nullable = false)
    public Integer getIdTerceroCargo() {
        return idTerceroCargo;
    }

    public void setIdTerceroCargo(Integer idTerceroCargo) {
        this.idTerceroCargo = idTerceroCargo;
    }

    @Basic
    @Column(name = "IdSede", nullable = true)
    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    @Basic
    @Column(name = "IdArea", nullable = true)
    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
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
    @Column(name = "FechaInicio", nullable = true)
    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin", nullable = true)
    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "IdTipoContrato", nullable = true)
    public Integer getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(Integer idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
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

        TercerosCargosEntity that = (TercerosCargosEntity) o;

        if (idTerceroCargo != null ? !idTerceroCargo.equals(that.idTerceroCargo) : that.idTerceroCargo != null)
            return false;
        if (idSede != null ? !idSede.equals(that.idSede) : that.idSede != null) return false;
        if (idArea != null ? !idArea.equals(that.idArea) : that.idArea != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (idTipoContrato != null ? !idTipoContrato.equals(that.idTipoContrato) : that.idTipoContrato != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroCargo != null ? idTerceroCargo.hashCode() : 0;
        result = 31 * result + (idSede != null ? idSede.hashCode() : 0);
        result = 31 * result + (idArea != null ? idArea.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (idTipoContrato != null ? idTipoContrato.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public Integer getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Integer idTercero) {
        this.idTercero = idTercero;
    }

    @ManyToOne(targetEntity = CargosEntity.class, cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    @JoinColumn(name="IdCargo", nullable=true,  insertable = false , updatable = false)
    public CargosEntity getCargo() {
        return cargo;
    }

    public void setCargo(CargosEntity cargo) {
        this.cargo = cargo;
    }
}
