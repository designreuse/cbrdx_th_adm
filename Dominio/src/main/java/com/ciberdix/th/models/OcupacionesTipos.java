package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "OcupacionesTipos", schema = "dbo", catalog = "CREZCAMOS")
public class OcupacionesTipos {
    private Integer idOcupacionTipo;
    private Integer codigoOcupacionTipo;
    private String descripcionOcupacionTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public OcupacionesTipos() {
    }

    public OcupacionesTipos(Integer codigoOcupacionTipo, String descripcionOcupacionTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.codigoOcupacionTipo = codigoOcupacionTipo;
        this.descripcionOcupacionTipo = descripcionOcupacionTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public OcupacionesTipos(Integer idOcupacionTipo, Integer codigoOcupacionTipo, String descripcionOcupacionTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idOcupacionTipo = idOcupacionTipo;
        this.codigoOcupacionTipo = codigoOcupacionTipo;
        this.descripcionOcupacionTipo = descripcionOcupacionTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdOcupacionTipo")
    public Integer getIdOcupacionTipo() {
        return idOcupacionTipo;
    }

    public void setIdOcupacionTipo(Integer idOcupacionTipo) {
        this.idOcupacionTipo = idOcupacionTipo;
    }

    @Basic
    @Column(name = "CodigoOcupacionTipo")
    public Integer getCodigoOcupacionTipo() {
        return codigoOcupacionTipo;
    }

    public void setCodigoOcupacionTipo(Integer codigoOcupacionTipo) {
        this.codigoOcupacionTipo = codigoOcupacionTipo;
    }

    @Basic
    @Column(name = "DescripcionOcupacionTipo")
    public String getDescripcionOcupacionTipo() {
        return descripcionOcupacionTipo;
    }

    public void setDescripcionOcupacionTipo(String descripcionOcupacionTipo) {
        this.descripcionOcupacionTipo = descripcionOcupacionTipo;
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

        OcupacionesTipos that = (OcupacionesTipos) o;

        if (idOcupacionTipo != null ? !idOcupacionTipo.equals(that.idOcupacionTipo) : that.idOcupacionTipo != null)
            return false;
        if (codigoOcupacionTipo != null ? !codigoOcupacionTipo.equals(that.codigoOcupacionTipo) : that.codigoOcupacionTipo != null)
            return false;
        if (descripcionOcupacionTipo != null ? !descripcionOcupacionTipo.equals(that.descripcionOcupacionTipo) : that.descripcionOcupacionTipo != null)
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
        int result = idOcupacionTipo != null ? idOcupacionTipo.hashCode() : 0;
        result = 31 * result + (codigoOcupacionTipo != null ? codigoOcupacionTipo.hashCode() : 0);
        result = 31 * result + (descripcionOcupacionTipo != null ? descripcionOcupacionTipo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
