package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class Materias {
    private Integer idMateria;
    private Integer idCargo;
    private String objetivo;
    private BigDecimal calificacionMinima;
    private BigDecimal ponderacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdMateria")
    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "Objetivo")
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Basic
    @Column(name = "CalificacionMinima")
    public BigDecimal getCalificacionMinima() {
        return calificacionMinima;
    }

    public void setCalificacionMinima(BigDecimal calificacionMinima) {
        this.calificacionMinima = calificacionMinima;
    }

    @Basic
    @Column(name = "Ponderacion")
    public BigDecimal getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(BigDecimal ponderacion) {
        this.ponderacion = ponderacion;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
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

        Materias materias = (Materias) o;

        if (idMateria != null ? !idMateria.equals(materias.idMateria) : materias.idMateria != null) return false;
        if (idCargo != null ? !idCargo.equals(materias.idCargo) : materias.idCargo != null) return false;
        if (objetivo != null ? !objetivo.equals(materias.objetivo) : materias.objetivo != null) return false;
        if (calificacionMinima != null ? !calificacionMinima.equals(materias.calificacionMinima) : materias.calificacionMinima != null)
            return false;
        if (ponderacion != null ? !ponderacion.equals(materias.ponderacion) : materias.ponderacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(materias.indicadorHabilitado) : materias.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(materias.auditoriaUsuario) : materias.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(materias.auditoriaFecha) : materias.auditoriaFecha != null)
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
