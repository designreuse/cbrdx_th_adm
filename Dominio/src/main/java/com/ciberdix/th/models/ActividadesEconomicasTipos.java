package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by faaguirre on 3/28/2017.
 */
@Entity
@Table(name = "ActividadesEconomicasTipos", schema = "dbo", catalog = "CREZCAMOS")
public class ActividadesEconomicasTipos {
    private Integer idActividadEconomicaTipo;
    private Integer codigoActividadTipo;
    private String descripcionActividadTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ActividadesEconomicasTipos() {
    }

    public ActividadesEconomicasTipos(Integer codigoActividadTipo, String descripcionActividadTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.codigoActividadTipo = codigoActividadTipo;
        this.descripcionActividadTipo = descripcionActividadTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ActividadesEconomicasTipos(Integer idActividadEconomicaTipo, Integer codigoActividadTipo, String descripcionActividadTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idActividadEconomicaTipo = idActividadEconomicaTipo;
        this.codigoActividadTipo = codigoActividadTipo;
        this.descripcionActividadTipo = descripcionActividadTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdActividadEconomicaTipo", nullable = false)
    public Integer getIdActividadEconomicaTipo() {
        return idActividadEconomicaTipo;
    }

    public void setIdActividadEconomicaTipo(Integer idActividadEconomicaTipo) {
        this.idActividadEconomicaTipo = idActividadEconomicaTipo;
    }

    @Basic
    @Column(name = "CodigoActividadTipo", nullable = false)
    public Integer getCodigoActividadTipo() {
        return codigoActividadTipo;
    }

    public void setCodigoActividadTipo(Integer codigoActividadTipo) {
        this.codigoActividadTipo = codigoActividadTipo;
    }

    @Basic
    @Column(name = "DescripcionActividadTipo", nullable = false, length = 50)
    public String getDescripcionActividadTipo() {
        return descripcionActividadTipo;
    }

    public void setDescripcionActividadTipo(String descripcionActividadTipo) {
        this.descripcionActividadTipo = descripcionActividadTipo;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = false)
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

        ActividadesEconomicasTipos that = (ActividadesEconomicasTipos) o;

        if (idActividadEconomicaTipo != null ? !idActividadEconomicaTipo.equals(that.idActividadEconomicaTipo) : that.idActividadEconomicaTipo != null)
            return false;
        if (codigoActividadTipo != null ? !codigoActividadTipo.equals(that.codigoActividadTipo) : that.codigoActividadTipo != null)
            return false;
        if (descripcionActividadTipo != null ? !descripcionActividadTipo.equals(that.descripcionActividadTipo) : that.descripcionActividadTipo != null)
            return false;
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
        int result = idActividadEconomicaTipo != null ? idActividadEconomicaTipo.hashCode() : 0;
        result = 31 * result + (codigoActividadTipo != null ? codigoActividadTipo.hashCode() : 0);
        result = 31 * result + (descripcionActividadTipo != null ? descripcionActividadTipo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
