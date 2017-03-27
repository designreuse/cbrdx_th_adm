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
public class Criterios {
    private Integer idCriterio;
    private String criterio;
    private String descripcion;
    private BigDecimal ponderacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer factor;

    @Id
    @Column(name = "IdCriterio")
    public Integer getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(Integer idCriterio) {
        this.idCriterio = idCriterio;
    }

    @Basic
    @Column(name = "Criterio")
    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    @Basic
    @Column(name = "Factor")
    public Integer getFactor() {
        return factor;
    }

    public void setFactor(Integer factor) {
        this.factor = factor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Criterios criterios = (Criterios) o;

        if (idCriterio != null ? !idCriterio.equals(criterios.idCriterio) : criterios.idCriterio != null) return false;
        if (criterio != null ? !criterio.equals(criterios.criterio) : criterios.criterio != null) return false;
        if (descripcion != null ? !descripcion.equals(criterios.descripcion) : criterios.descripcion != null)
            return false;
        if (ponderacion != null ? !ponderacion.equals(criterios.ponderacion) : criterios.ponderacion != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(criterios.indicadorHabilitado) : criterios.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(criterios.auditoriaUsuario) : criterios.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(criterios.auditoriaFecha) : criterios.auditoriaFecha != null)
            return false;
        if (factor != null ? !factor.equals(criterios.factor) : criterios.factor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCriterio != null ? idCriterio.hashCode() : 0;
        result = 31 * result + (criterio != null ? criterio.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (ponderacion != null ? ponderacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (factor != null ? factor.hashCode() : 0);
        return result;
    }
}
