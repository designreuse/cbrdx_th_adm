package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 04/08/17.
 */
@Entity
@Table(name = "ValoracionesRiesgos", schema = "dbo", catalog = "CREZCAMOS")
public class ValoracionesRiesgos {
    private Integer idValoracionRiesgo;
    private String nombreVersion;
    private Integer numeroVersion;
    private Timestamp fechaCreacion;
    private Integer idUsuario;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ValoracionesRiesgos() {
    }

    public ValoracionesRiesgos(String nombreVersion, Integer numeroVersion, Integer idUsuario, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.nombreVersion = nombreVersion;
        this.numeroVersion = numeroVersion;
        this.fechaCreacion = new Timestamp(System.currentTimeMillis());
        this.idUsuario = idUsuario;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdValoracionRiesgo", nullable = false)
    public Integer getIdValoracionRiesgo() {
        return idValoracionRiesgo;
    }

    public void setIdValoracionRiesgo(Integer idValoracionRiesgo) {
        this.idValoracionRiesgo = idValoracionRiesgo;
    }

    @Basic
    @Column(name = "NombreVersion", nullable = true, length = 200)
    public String getNombreVersion() {
        return nombreVersion;
    }

    public void setNombreVersion(String nombreVersion) {
        this.nombreVersion = nombreVersion;
    }

    @Basic
    @Column(name = "NumeroVersion", nullable = true)
    public Integer getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(Integer numeroVersion) {
        this.numeroVersion = numeroVersion;
    }

    @Basic
    @Column(name = "FechaCreacion", nullable = true)
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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

        ValoracionesRiesgos that = (ValoracionesRiesgos) o;

        if (idValoracionRiesgo != null ? !idValoracionRiesgo.equals(that.idValoracionRiesgo) : that.idValoracionRiesgo != null)
            return false;
        if (nombreVersion != null ? !nombreVersion.equals(that.nombreVersion) : that.nombreVersion != null)
            return false;
        if (numeroVersion != null ? !numeroVersion.equals(that.numeroVersion) : that.numeroVersion != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
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
        int result = idValoracionRiesgo != null ? idValoracionRiesgo.hashCode() : 0;
        result = 31 * result + (nombreVersion != null ? nombreVersion.hashCode() : 0);
        result = 31 * result + (numeroVersion != null ? numeroVersion.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
