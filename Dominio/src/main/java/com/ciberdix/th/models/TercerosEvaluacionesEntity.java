package com.ciberdix.th.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TercerosEvaluaciones", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TercerosEvaluacionesEntity {
    private Integer idTerceroEvaluacion;
    private Long idTercero;
    private Integer idCargo;
    private Integer vigencia;
    private Timestamp fechaEvaluacion;
    private BigDecimal porcentajeCompletado;
    private BigDecimal nota;
    private String observacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroEvaluacion", nullable = false)
    public Integer getIdTerceroEvaluacion() {
        return idTerceroEvaluacion;
    }

    public void setIdTerceroEvaluacion(Integer idTerceroEvaluacion) {
        this.idTerceroEvaluacion = idTerceroEvaluacion;
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
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "Vigencia", nullable = false)
    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    @Basic
    @Column(name = "FechaEvaluacion", nullable = true)
    public Timestamp getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(Timestamp fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    @Basic
    @Column(name = "PorcentajeCompletado", nullable = false, precision = 1)
    public BigDecimal getPorcentajeCompletado() {
        return porcentajeCompletado;
    }

    public void setPorcentajeCompletado(BigDecimal porcentajeCompletado) {
        this.porcentajeCompletado = porcentajeCompletado;
    }

    @Basic
    @Column(name = "Nota", nullable = true, precision = 1)
    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    @Basic
    @Column(name = "Observacion", nullable = true, length = 200)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

        TercerosEvaluacionesEntity that = (TercerosEvaluacionesEntity) o;

        if (idTerceroEvaluacion != null ? !idTerceroEvaluacion.equals(that.idTerceroEvaluacion) : that.idTerceroEvaluacion != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (vigencia != null ? !vigencia.equals(that.vigencia) : that.vigencia != null) return false;
        if (fechaEvaluacion != null ? !fechaEvaluacion.equals(that.fechaEvaluacion) : that.fechaEvaluacion != null)
            return false;
        if (porcentajeCompletado != null ? !porcentajeCompletado.equals(that.porcentajeCompletado) : that.porcentajeCompletado != null)
            return false;
        if (nota != null ? !nota.equals(that.nota) : that.nota != null) return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroEvaluacion != null ? idTerceroEvaluacion.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (vigencia != null ? vigencia.hashCode() : 0);
        result = 31 * result + (fechaEvaluacion != null ? fechaEvaluacion.hashCode() : 0);
        result = 31 * result + (porcentajeCompletado != null ? porcentajeCompletado.hashCode() : 0);
        result = 31 * result + (nota != null ? nota.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
