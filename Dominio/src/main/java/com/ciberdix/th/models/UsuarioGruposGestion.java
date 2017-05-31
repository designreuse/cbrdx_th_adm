package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "UsuarioGruposGestion", schema = "dbo", catalog = "CREZCAMOS")
public class UsuarioGruposGestion {
    private Integer idUsuarioGrupoGestion;
    private Integer idUsuario;
    private Integer idGrupoGestion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean indicadorHabilitado;

    public UsuarioGruposGestion() {
    }

    public UsuarioGruposGestion(Integer idUsuario, Integer idGrupoGestion, Integer auditoriaUsuario, Date fechaInicio, Date fechaFin, Boolean indicadorHabilitado) {
        this.idUsuario = idUsuario;
        this.idGrupoGestion = idGrupoGestion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public UsuarioGruposGestion(Integer idUsuarioGrupoGestion, Integer idUsuario, Integer idGrupoGestion, Integer auditoriaUsuario, Date fechaInicio, Date fechaFin, Boolean indicadorHabilitado) {
        this.idUsuarioGrupoGestion = idUsuarioGrupoGestion;
        this.idUsuario = idUsuario;
        this.idGrupoGestion = idGrupoGestion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdUsuarioGrupoGestion", nullable = false)
    public Integer getIdUsuarioGrupoGestion() {
        return idUsuarioGrupoGestion;
    }

    public void setIdUsuarioGrupoGestion(Integer idUsuarioGrupoGestion) {
        this.idUsuarioGrupoGestion = idUsuarioGrupoGestion;
    }

    @Basic
    @Column(name = "IdUsuario", nullable = true)
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "IdGrupoGestion", nullable = true)
    public Integer getIdGrupoGestion() {
        return idGrupoGestion;
    }

    public void setIdGrupoGestion(Integer idGrupoGestion) {
        this.idGrupoGestion = idGrupoGestion;
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

    @Basic
    @Column(name = "FechaInicio", nullable = true)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioGruposGestion that = (UsuarioGruposGestion) o;

        if (idUsuarioGrupoGestion != null ? !idUsuarioGrupoGestion.equals(that.idUsuarioGrupoGestion) : that.idUsuarioGrupoGestion != null)
            return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (idGrupoGestion != null ? !idGrupoGestion.equals(that.idGrupoGestion) : that.idGrupoGestion != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuarioGrupoGestion != null ? idUsuarioGrupoGestion.hashCode() : 0;
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (idGrupoGestion != null ? idGrupoGestion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
