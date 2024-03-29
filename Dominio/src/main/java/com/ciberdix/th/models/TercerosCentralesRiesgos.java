package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 15/06/2017.
 */
@Entity
@Table(name = "TercerosCentralesRiesgos", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosCentralesRiesgos {
    private Integer idTerceroCentralRiesgo;
    private Long idTercero;
    private Integer idCentralRiesgo;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorReportado;
    private Boolean indicadorAprobado;

    public TercerosCentralesRiesgos() {
    }

    public TercerosCentralesRiesgos(Long idTercero, Integer idCentralRiesgo, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorReportado, Boolean indicadorAprobado) {
        this.idTercero = idTercero;
        this.idCentralRiesgo = idCentralRiesgo;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.indicadorReportado = indicadorReportado;
        this.indicadorAprobado = indicadorAprobado;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosCentralesRiesgos(Integer idTerceroCentralRiesgo, Long idTercero, Integer idCentralRiesgo, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorReportado, Boolean indicadorAprobado) {
        this.idTerceroCentralRiesgo = idTerceroCentralRiesgo;
        this.idTercero = idTercero;
        this.idCentralRiesgo = idCentralRiesgo;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.indicadorReportado = indicadorReportado;
        this.indicadorAprobado = indicadorAprobado;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroCentralRiesgo", nullable = false)
    public Integer getIdTerceroCentralRiesgo() {
        return idTerceroCentralRiesgo;
    }

    public void setIdTerceroCentralRiesgo(Integer idTerceroCentralRiesgo) {
        this.idTerceroCentralRiesgo = idTerceroCentralRiesgo;
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
    @Column(name = "IdCentralRiesgo", nullable = true)
    public Integer getIdCentralRiesgo() {
        return idCentralRiesgo;
    }

    public void setIdCentralRiesgo(Integer idCentralRiesgo) {
        this.idCentralRiesgo = idCentralRiesgo;
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

    @Basic
    @Column(name = "IndicadorReportado", nullable = true)
    public Boolean getIndicadorReportado() {
        return indicadorReportado;
    }

    public void setIndicadorReportado(Boolean indicadorReportado) {
        this.indicadorReportado = indicadorReportado;
    }

    @Basic
    @Column(name = "IndicadorAprobado", nullable = true)
    public Boolean getIndicadorAprobado() {
        return indicadorAprobado;
    }

    public void setIndicadorAprobado(Boolean indicadorAprobado) {
        this.indicadorAprobado = indicadorAprobado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosCentralesRiesgos that = (TercerosCentralesRiesgos) o;

        if (idTerceroCentralRiesgo != null ? !idTerceroCentralRiesgo.equals(that.idTerceroCentralRiesgo) : that.idTerceroCentralRiesgo != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCentralRiesgo != null ? !idCentralRiesgo.equals(that.idCentralRiesgo) : that.idCentralRiesgo != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorReportado != null ? !indicadorReportado.equals(that.indicadorReportado) : that.indicadorReportado != null)
            return false;
        return indicadorAprobado != null ? indicadorAprobado.equals(that.indicadorAprobado) : that.indicadorAprobado == null;
    }

    @Override
    public int hashCode() {
        int result = idTerceroCentralRiesgo != null ? idTerceroCentralRiesgo.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCentralRiesgo != null ? idCentralRiesgo.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorReportado != null ? indicadorReportado.hashCode() : 0);
        result = 31 * result + (indicadorAprobado != null ? indicadorAprobado.hashCode() : 0);
        return result;
    }
}
