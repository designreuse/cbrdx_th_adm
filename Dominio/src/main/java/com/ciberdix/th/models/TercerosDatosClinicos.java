package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/4/2017.
 */
@Entity
@Table(name = "TercerosDatosClinicos", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosDatosClinicos {
    private Integer idTerceroDatoClinico;
    private Long idTercero;
    private Integer idDiagnostico;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    public TercerosDatosClinicos() {
    }
    public TercerosDatosClinicos(Long idTercero, Integer idDiagnostico, Date fechaInicio, Date fechaFin, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTercero = idTercero;
        this.idDiagnostico = idDiagnostico;
        this.fechaInicio = fechaInicio!=null?new Date(fechaInicio.getTime()):null;
        this.fechaFin = fechaFin!=null?new Date(fechaFin.getTime()):null;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosDatosClinicos(Integer idTerceroDatoClinico, Long idTercero, Integer idDiagnostico, Date fechaInicio, Date fechaFin, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroDatoClinico = idTerceroDatoClinico;
        this.idTercero = idTercero;
        this.idDiagnostico = idDiagnostico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public void setFechaInicio(java.sql.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(java.sql.Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTerceroDatoClinico", nullable = false)
    public Integer getIdTerceroDatoClinico() {
        return idTerceroDatoClinico;
    }

    public void setIdTerceroDatoClinico(Integer idTerceroDatoClinico) {
        this.idTerceroDatoClinico = idTerceroDatoClinico;
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
    @Column(name = "IdDiagnostico", nullable = true)
    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
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

        TercerosDatosClinicos that = (TercerosDatosClinicos) o;

        if (idTerceroDatoClinico != null ? !idTerceroDatoClinico.equals(that.idTerceroDatoClinico) : that.idTerceroDatoClinico != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idDiagnostico != null ? !idDiagnostico.equals(that.idDiagnostico) : that.idDiagnostico != null)
            return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroDatoClinico != null ? idTerceroDatoClinico.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idDiagnostico != null ? idDiagnostico.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
