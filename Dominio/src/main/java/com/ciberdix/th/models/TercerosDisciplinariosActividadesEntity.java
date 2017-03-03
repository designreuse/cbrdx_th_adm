package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TercerosDisciplinariosActividades", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosDisciplinariosActividadesEntity {
    private Integer idTerceroDisciplinarioActividad;
    private Integer idTerceroDisciplinario;
    private Integer idTipo;
    private Timestamp fechaReporta;
    private String detalle;
    private Integer idEstado;
    private String decision;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroDisciplinarioActividad", nullable = false)
    public Integer getIdTerceroDisciplinarioActividad() {
        return idTerceroDisciplinarioActividad;
    }

    public void setIdTerceroDisciplinarioActividad(Integer idTerceroDisciplinarioActividad) {
        this.idTerceroDisciplinarioActividad = idTerceroDisciplinarioActividad;
    }

    @Basic
    @Column(name = "IdTerceroDisciplinario", nullable = false)
    public Integer getIdTerceroDisciplinario() {
        return idTerceroDisciplinario;
    }

    public void setIdTerceroDisciplinario(Integer idTerceroDisciplinario) {
        this.idTerceroDisciplinario = idTerceroDisciplinario;
    }

    @Basic
    @Column(name = "IdTipo", nullable = false)
    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    @Basic
    @Column(name = "FechaReporta", nullable = false)
    public Timestamp getFechaReporta() {
        return fechaReporta;
    }

    public void setFechaReporta(Timestamp fechaReporta) {
        this.fechaReporta = fechaReporta;
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
    @Column(name = "Decision", nullable = true, length = 300)
    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
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

        TercerosDisciplinariosActividadesEntity that = (TercerosDisciplinariosActividadesEntity) o;

        if (idTerceroDisciplinarioActividad != null ? !idTerceroDisciplinarioActividad.equals(that.idTerceroDisciplinarioActividad) : that.idTerceroDisciplinarioActividad != null)
            return false;
        if (idTerceroDisciplinario != null ? !idTerceroDisciplinario.equals(that.idTerceroDisciplinario) : that.idTerceroDisciplinario != null)
            return false;
        if (idTipo != null ? !idTipo.equals(that.idTipo) : that.idTipo != null) return false;
        if (fechaReporta != null ? !fechaReporta.equals(that.fechaReporta) : that.fechaReporta != null) return false;
        if (detalle != null ? !detalle.equals(that.detalle) : that.detalle != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (decision != null ? !decision.equals(that.decision) : that.decision != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroDisciplinarioActividad != null ? idTerceroDisciplinarioActividad.hashCode() : 0;
        result = 31 * result + (idTerceroDisciplinario != null ? idTerceroDisciplinario.hashCode() : 0);
        result = 31 * result + (idTipo != null ? idTipo.hashCode() : 0);
        result = 31 * result + (fechaReporta != null ? fechaReporta.hashCode() : 0);
        result = 31 * result + (detalle != null ? detalle.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (decision != null ? decision.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
