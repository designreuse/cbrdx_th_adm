package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by faaguirre on 3/28/2017.
 */
@Entity
public class ActividadesEconomicasTipos {
    private Integer idActividadEconomicaTipo;
    private Integer codigoActividadTipo;
    private String descripcionActividadTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdActividadEconomicaTipo")
    public Integer getIdActividadEconomicaTipo() {
        return idActividadEconomicaTipo;
    }

    public void setIdActividadEconomicaTipo(Integer idActividadEconomicaTipo) {
        this.idActividadEconomicaTipo = idActividadEconomicaTipo;
    }

    @Basic
    @Column(name = "CodigoActividadTipo")
    public Integer getCodigoActividadTipo() {
        return codigoActividadTipo;
    }

    public void setCodigoActividadTipo(Integer codigoActividadTipo) {
        this.codigoActividadTipo = codigoActividadTipo;
    }

    @Basic
    @Column(name = "DescripcionActividadTipo")
    public String getDescripcionActividadTipo() {
        return descripcionActividadTipo;
    }

    public void setDescripcionActividadTipo(String descripcionActividadTipo) {
        this.descripcionActividadTipo = descripcionActividadTipo;
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
