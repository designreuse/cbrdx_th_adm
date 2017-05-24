package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "DivisionPoliticaTipos", schema = "crz_th", catalog = "CREZCAMOS")
public class DivisionPoliticaTipos {
    private Integer idDivisionPoliticaTipo;
    private String descripcionTipo;
    private String codigoDivisionPoliticaTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public DivisionPoliticaTipos() {
    }

    public DivisionPoliticaTipos(String descripcionTipo, String codigoDivisionPoliticaTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.descripcionTipo = descripcionTipo;
        this.codigoDivisionPoliticaTipo = codigoDivisionPoliticaTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public DivisionPoliticaTipos(Integer idDivisionPoliticaTipo, String descripcionTipo, String codigoDivisionPoliticaTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
        this.descripcionTipo = descripcionTipo;
        this.codigoDivisionPoliticaTipo = codigoDivisionPoliticaTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdDivisionPoliticaTipo")
    public Integer getIdDivisionPoliticaTipo() {
        return idDivisionPoliticaTipo;
    }

    public void setIdDivisionPoliticaTipo(Integer idDivisionPoliticaTipo) {
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
    }

    @Basic
    @Column(name = "DescripcionTipo")
    public String getDescripcionTipo() {
        return descripcionTipo;
    }

    public void setDescripcionTipo(String descripcionTipo) {
        this.descripcionTipo = descripcionTipo;
    }

    @Basic
    @Column(name = "CodigoDivisionPoliticaTipo")
    public String getCodigoDivisionPoliticaTipo() {
        return codigoDivisionPoliticaTipo;
    }

    public void setCodigoDivisionPoliticaTipo(String codigoDivisionPoliticaTipo) {
        this.codigoDivisionPoliticaTipo = codigoDivisionPoliticaTipo;
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

        DivisionPoliticaTipos that = (DivisionPoliticaTipos) o;

        if (idDivisionPoliticaTipo != null ? !idDivisionPoliticaTipo.equals(that.idDivisionPoliticaTipo) : that.idDivisionPoliticaTipo != null)
            return false;
        if (descripcionTipo != null ? !descripcionTipo.equals(that.descripcionTipo) : that.descripcionTipo != null)
            return false;
        if (codigoDivisionPoliticaTipo != null ? !codigoDivisionPoliticaTipo.equals(that.codigoDivisionPoliticaTipo) : that.codigoDivisionPoliticaTipo != null)
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
        int result = idDivisionPoliticaTipo != null ? idDivisionPoliticaTipo.hashCode() : 0;
        result = 31 * result + (descripcionTipo != null ? descripcionTipo.hashCode() : 0);
        result = 31 * result + (codigoDivisionPoliticaTipo != null ? codigoDivisionPoliticaTipo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
