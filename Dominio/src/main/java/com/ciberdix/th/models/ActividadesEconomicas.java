package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by faaguirre on 3/28/2017.
 */
@Entity
@Table(name = "ActividadesEconomicas", schema = "dbo", catalog = "CREZCAMOS")
public class ActividadesEconomicas {
    private Integer idActividadEconomica;
    private Integer idActividadPadre;
    private Integer idActividadTipo;
    private String actividadEconomica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String codigoActividadEconomica;

    public ActividadesEconomicas() {
    }

    public ActividadesEconomicas(Integer idActividadPadre, Integer idActividadTipo, String actividadEconomica, Boolean indicadorHabilitado, Integer auditoriaUsuario, String codigoActividadEconomica) {
        this.idActividadPadre = idActividadPadre;
        this.idActividadTipo = idActividadTipo;
        this.actividadEconomica = actividadEconomica;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.codigoActividadEconomica = codigoActividadEconomica;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ActividadesEconomicas(Integer idActividadEconomica, Integer idActividadPadre, Integer idActividadTipo, String actividadEconomica, Boolean indicadorHabilitado, Integer auditoriaUsuario, String codigoActividadEconomica) {
        this.idActividadEconomica = idActividadEconomica;
        this.idActividadPadre = idActividadPadre;
        this.idActividadTipo = idActividadTipo;
        this.actividadEconomica = actividadEconomica;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.codigoActividadEconomica = codigoActividadEconomica;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdActividadEconomica")
    public Integer getIdActividadEconomica() {
        return idActividadEconomica;
    }

    public void setIdActividadEconomica(Integer idActividadEconomica) {
        this.idActividadEconomica = idActividadEconomica;
    }

    @Basic
    @Column(name = "IdActividadPadre")
    public Integer getIdActividadPadre() {
        return idActividadPadre;
    }

    public void setIdActividadPadre(Integer idActividadPadre) {
        this.idActividadPadre = idActividadPadre;
    }

    @Basic
    @Column(name = "IdActividadTipo")
    public Integer getIdActividadTipo() {
        return idActividadTipo;
    }

    public void setIdActividadTipo(Integer idActividadTipo) {
        this.idActividadTipo = idActividadTipo;
    }

    @Basic
    @Column(name = "ActividadEconomica")
    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public void setActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
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
    @Column(name = "CodigoActividadEconomica")
    public String getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }

    public void setCodigoActividadEconomica(String codigoActividadEconomica) {
        this.codigoActividadEconomica = codigoActividadEconomica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActividadesEconomicas that = (ActividadesEconomicas) o;

        if (idActividadEconomica != null ? !idActividadEconomica.equals(that.idActividadEconomica) : that.idActividadEconomica != null)
            return false;
        if (idActividadPadre != null ? !idActividadPadre.equals(that.idActividadPadre) : that.idActividadPadre != null)
            return false;
        if (idActividadTipo != null ? !idActividadTipo.equals(that.idActividadTipo) : that.idActividadTipo != null)
            return false;
        if (actividadEconomica != null ? !actividadEconomica.equals(that.actividadEconomica) : that.actividadEconomica != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (codigoActividadEconomica != null ? !codigoActividadEconomica.equals(that.codigoActividadEconomica) : that.codigoActividadEconomica != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idActividadEconomica != null ? idActividadEconomica.hashCode() : 0;
        result = 31 * result + (idActividadPadre != null ? idActividadPadre.hashCode() : 0);
        result = 31 * result + (idActividadTipo != null ? idActividadTipo.hashCode() : 0);
        result = 31 * result + (actividadEconomica != null ? actividadEconomica.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (codigoActividadEconomica != null ? codigoActividadEconomica.hashCode() : 0);
        return result;
    }
}
