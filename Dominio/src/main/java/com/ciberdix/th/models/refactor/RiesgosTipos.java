package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "RiesgosTipos", schema = "crz_th", catalog = "CREZCAMOS")
public class RiesgosTipos {
    private Integer idRiesgoTipo;
    private String riesgoTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public RiesgosTipos() {
    }

    public RiesgosTipos(String riesgoTipo, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.riesgoTipo = riesgoTipo;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRiesgoTipo")
    public Integer getIdRiesgoTipo() {
        return idRiesgoTipo;
    }

    public void setIdRiesgoTipo(Integer idRiesgoTipo) {
        this.idRiesgoTipo = idRiesgoTipo;
    }

    @Basic
    @Column(name = "RiesgoTipo")
    public String getRiesgoTipo() {
        return riesgoTipo;
    }

    public void setRiesgoTipo(String riesgoTipo) {
        this.riesgoTipo = riesgoTipo;
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

        RiesgosTipos that = (RiesgosTipos) o;

        if (idRiesgoTipo != null ? !idRiesgoTipo.equals(that.idRiesgoTipo) : that.idRiesgoTipo != null) return false;
        if (riesgoTipo != null ? !riesgoTipo.equals(that.riesgoTipo) : that.riesgoTipo != null) return false;
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
        int result = idRiesgoTipo != null ? idRiesgoTipo.hashCode() : 0;
        result = 31 * result + (riesgoTipo != null ? riesgoTipo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
