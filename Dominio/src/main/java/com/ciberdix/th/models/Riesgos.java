package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "Riesgos", schema = "dbo", catalog = "CREZCAMOS")
public class Riesgos {
    private Integer idRiesgo;
    private Integer idSubTipoRiesgo;
    private Integer idTipoRiesgo;
    private String riesgo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Riesgos() {
    }

    public Riesgos(Integer idSubTipoRiesgo, Integer idTipoRiesgo, String riesgo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idSubTipoRiesgo = idSubTipoRiesgo;
        this.idTipoRiesgo = idTipoRiesgo;
        this.riesgo = riesgo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Riesgos(Integer idRiesgo, Integer idSubTipoRiesgo, Integer idTipoRiesgo, String riesgo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idRiesgo = idRiesgo;
        this.idSubTipoRiesgo = idSubTipoRiesgo;
        this.idTipoRiesgo = idTipoRiesgo;
        this.riesgo = riesgo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRiesgo", nullable = false)
    public Integer getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(Integer idRiesgo) {
        this.idRiesgo = idRiesgo;
    }

    @Basic
    @Column(name = "IdSubTipoRiesgo", nullable = true)
    public Integer getIdSubTipoRiesgo() {
        return idSubTipoRiesgo;
    }

    public void setIdSubTipoRiesgo(Integer idSubTipoRiesgo) {
        this.idSubTipoRiesgo = idSubTipoRiesgo;
    }

    @Basic
    @Column(name = "IdTipoRiesgo", nullable = true)
    public Integer getIdTipoRiesgo() {
        return idTipoRiesgo;
    }

    public void setIdTipoRiesgo(Integer idTipoRiesgo) {
        this.idTipoRiesgo = idTipoRiesgo;
    }

    @Basic
    @Column(name = "Riesgo", nullable = true, length = 100)
    public String getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(String riesgo) {
        this.riesgo = riesgo;
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

        Riesgos riesgos = (Riesgos) o;

        if (idRiesgo != null ? !idRiesgo.equals(riesgos.idRiesgo) : riesgos.idRiesgo != null) return false;
        if (idSubTipoRiesgo != null ? !idSubTipoRiesgo.equals(riesgos.idSubTipoRiesgo) : riesgos.idSubTipoRiesgo != null)
            return false;
        if (idTipoRiesgo != null ? !idTipoRiesgo.equals(riesgos.idTipoRiesgo) : riesgos.idTipoRiesgo != null)
            return false;
        if (riesgo != null ? !riesgo.equals(riesgos.riesgo) : riesgos.riesgo != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(riesgos.indicadorHabilitado) : riesgos.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(riesgos.auditoriaUsuario) : riesgos.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(riesgos.auditoriaFecha) : riesgos.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRiesgo != null ? idRiesgo.hashCode() : 0;
        result = 31 * result + (idSubTipoRiesgo != null ? idSubTipoRiesgo.hashCode() : 0);
        result = 31 * result + (idTipoRiesgo != null ? idTipoRiesgo.hashCode() : 0);
        result = 31 * result + (riesgo != null ? riesgo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
