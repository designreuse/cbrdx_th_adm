package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 19/05/2017.
 */
@Entity
@Table(name = "V_RequerimientosAcciones", schema = "dbo", catalog = "CREZCAMOS")
public class VRequerimientosAcciones {
    private Integer idRequerimientoAccion;
    private Integer idRequerimiento;
    private String accion;
    private Integer idAccion;
    private Integer idRequerimientoHistorico;
    private String observacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String nombreTercero;
    private String cargo;

    @Id
    @Column(name = "IdRequerimientoAccion", nullable = false)
    public Integer getIdRequerimientoAccion() {
        return idRequerimientoAccion;
    }

    public void setIdRequerimientoAccion(Integer idRequerimientoAccion) {
        this.idRequerimientoAccion = idRequerimientoAccion;
    }

    @Basic
    @Column(name = "IdRequerimiento", nullable = true)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "Accion", nullable = true, length = 100)
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Basic
    @Column(name = "IdAccion", nullable = true)
    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    @Basic
    @Column(name = "IdRequerimientoHistorico", nullable = true)
    public Integer getIdRequerimientoHistorico() {
        return idRequerimientoHistorico;
    }

    public void setIdRequerimientoHistorico(Integer idRequerimientoHistorico) {
        this.idRequerimientoHistorico = idRequerimientoHistorico;
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
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "NombreTercero", nullable = false, length = 259)
    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    @Basic
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VRequerimientosAcciones that = (VRequerimientosAcciones) o;

        if (idRequerimientoAccion != null ? !idRequerimientoAccion.equals(that.idRequerimientoAccion) : that.idRequerimientoAccion != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (accion != null ? !accion.equals(that.accion) : that.accion != null) return false;
        if (idAccion != null ? !idAccion.equals(that.idAccion) : that.idAccion != null) return false;
        if (idRequerimientoHistorico != null ? !idRequerimientoHistorico.equals(that.idRequerimientoHistorico) : that.idRequerimientoHistorico != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (nombreTercero != null ? !nombreTercero.equals(that.nombreTercero) : that.nombreTercero != null)
            return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoAccion != null ? idRequerimientoAccion.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (idAccion != null ? idAccion.hashCode() : 0);
        result = 31 * result + (idRequerimientoHistorico != null ? idRequerimientoHistorico.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (nombreTercero != null ? nombreTercero.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        return result;
    }
}
