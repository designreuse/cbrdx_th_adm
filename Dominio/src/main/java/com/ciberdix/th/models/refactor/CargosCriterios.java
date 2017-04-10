package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/8/2017.
 */
@Entity
@Table(name = "CargosCriterios", schema = "crz_th", catalog = "CREZCAMOS")
public class CargosCriterios {
    private Integer idCargoCriterio;
    private Integer idCriterio;
    private Integer idCargo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String descripcion;
    private Double meta;
    private Double factor;
    private Boolean indicadorHabilitado;

    public CargosCriterios() {
    }

    public CargosCriterios(Integer idCriterio, Integer idCargo, Integer auditoriaUsuario, String descripcion, Double meta, Double factor, Boolean indicadorHabilitado) {
        this.idCriterio = idCriterio;
        this.idCargo = idCargo;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.descripcion = descripcion;
        this.meta = meta;
        this.factor = factor;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @Column(name = "IdCargoCriterio")
    public Integer getIdCargoCriterio() {
        return idCargoCriterio;
    }

    public void setIdCargoCriterio(Integer idCargoCriterio) {
        this.idCargoCriterio = idCargoCriterio;
    }

    @Basic
    @Column(name = "IdCriterio")
    public Integer getIdCriterio() {
        return idCriterio;
    }

    public void setIdCriterio(Integer idCriterio) {
        this.idCriterio = idCriterio;
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
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "Meta")
    public Double getMeta() {
        return meta;
    }

    public void setMeta(Double meta) {
        this.meta = meta;
    }

    @Basic
    @Column(name = "Factor")
    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargosCriterios that = (CargosCriterios) o;

        if (idCargoCriterio != null ? !idCargoCriterio.equals(that.idCargoCriterio) : that.idCargoCriterio != null)
            return false;
        if (idCriterio != null ? !idCriterio.equals(that.idCriterio) : that.idCriterio != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (meta != null ? !meta.equals(that.meta) : that.meta != null) return false;
        if (factor != null ? !factor.equals(that.factor) : that.factor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoCriterio != null ? idCargoCriterio.hashCode() : 0;
        result = 31 * result + (idCriterio != null ? idCriterio.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (meta != null ? meta.hashCode() : 0);
        result = 31 * result + (factor != null ? factor.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }


}
