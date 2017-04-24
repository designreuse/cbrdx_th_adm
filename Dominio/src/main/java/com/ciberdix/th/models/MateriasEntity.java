package com.ciberdix.th.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Materias", schema = "crz_th", catalog = "CREZCAMOS")
public class MateriasEntity {
    private Integer idMateria;
    private Integer idCargo;
    private String objetivo;
    private BigDecimal calificacionMinima;
    private BigDecimal ponderacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdMateria", nullable = false)
    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
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
    @Column(name = "Objetivo", nullable = true, length = 200)
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Basic
    @Column(name = "CalificacionMinima", nullable = true, precision = 1)
    public BigDecimal getCalificacionMinima() {
        return calificacionMinima;
    }

    public void setCalificacionMinima(BigDecimal calificacionMinima) {
        this.calificacionMinima = calificacionMinima;
    }

    @Basic
    @Column(name = "Ponderacion", nullable = true, precision = 1)
    public BigDecimal getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(BigDecimal ponderacion) {
        this.ponderacion = ponderacion;
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

        MateriasEntity that = (MateriasEntity) o;

        if (idMateria != null ? !idMateria.equals(that.idMateria) : that.idMateria != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (objetivo != null ? !objetivo.equals(that.objetivo) : that.objetivo != null) return false;
        if (calificacionMinima != null ? !calificacionMinima.equals(that.calificacionMinima) : that.calificacionMinima != null)
            return false;
        if (ponderacion != null ? !ponderacion.equals(that.ponderacion) : that.ponderacion != null) return false;
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
        int result = idMateria != null ? idMateria.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (objetivo != null ? objetivo.hashCode() : 0);
        result = 31 * result + (calificacionMinima != null ? calificacionMinima.hashCode() : 0);
        result = 31 * result + (ponderacion != null ? ponderacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
