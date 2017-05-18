package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 18/05/2017.
 */
@Entity
@Table(name = "RequerimientosAcciones", schema = "crz_th", catalog = "CREZCAMOS")
public class RequerimientosAcciones {
    private Integer idRequerimientoAccion;
    private Integer idRequerimiento;
    private Integer idAccion;
    private Integer idRequerimientoHistorico;
    private String observacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public RequerimientosAcciones() {
    }

    public RequerimientosAcciones(Integer idRequerimiento, Integer idAccion, Integer idRequerimientoHistorico, String observacion, Integer auditoriaUsuario) {
        this.idRequerimiento = idRequerimiento;
        this.idAccion = idAccion;
        this.idRequerimientoHistorico = idRequerimientoHistorico;
        this.observacion = observacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequerimientosAcciones that = (RequerimientosAcciones) o;

        if (idRequerimientoAccion != null ? !idRequerimientoAccion.equals(that.idRequerimientoAccion) : that.idRequerimientoAccion != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (idAccion != null ? !idAccion.equals(that.idAccion) : that.idAccion != null) return false;
        if (idRequerimientoHistorico != null ? !idRequerimientoHistorico.equals(that.idRequerimientoHistorico) : that.idRequerimientoHistorico != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoAccion != null ? idRequerimientoAccion.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (idAccion != null ? idAccion.hashCode() : 0);
        result = 31 * result + (idRequerimientoHistorico != null ? idRequerimientoHistorico.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
