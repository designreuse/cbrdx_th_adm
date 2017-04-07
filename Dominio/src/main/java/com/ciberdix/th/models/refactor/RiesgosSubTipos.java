package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "RiesgosSubTipos", schema = "crz_th", catalog = "CREZCAMOS")
public class RiesgosSubTipos {
    private Integer idRiesgoSubTipo;
    private Integer idRiesgoTipo;
    private String riesgoSubTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @GeneratedValue
    @Column(name = "IdRiesgoSubTipo")
    public Integer getIdRiesgoSubTipo() {
        return idRiesgoSubTipo;
    }

    public void setIdRiesgoSubTipo(Integer idRiesgoSubTipo) {
        this.idRiesgoSubTipo = idRiesgoSubTipo;
    }

    @Basic
    @Column(name = "IdRiesgoTipo")
    public Integer getIdRiesgoTipo() {
        return idRiesgoTipo;
    }

    public void setIdRiesgoTipo(Integer idRiesgoTipo) {
        this.idRiesgoTipo = idRiesgoTipo;
    }

    @Basic
    @Column(name = "RiesgoSubTipo")
    public String getRiesgoSubTipo() {
        return riesgoSubTipo;
    }

    public void setRiesgoSubTipo(String riesgoSubTipo) {
        this.riesgoSubTipo = riesgoSubTipo;
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

        RiesgosSubTipos that = (RiesgosSubTipos) o;

        if (idRiesgoSubTipo != null ? !idRiesgoSubTipo.equals(that.idRiesgoSubTipo) : that.idRiesgoSubTipo != null)
            return false;
        if (idRiesgoTipo != null ? !idRiesgoTipo.equals(that.idRiesgoTipo) : that.idRiesgoTipo != null) return false;
        if (riesgoSubTipo != null ? !riesgoSubTipo.equals(that.riesgoSubTipo) : that.riesgoSubTipo != null)
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
        int result = idRiesgoSubTipo != null ? idRiesgoSubTipo.hashCode() : 0;
        result = 31 * result + (idRiesgoTipo != null ? idRiesgoTipo.hashCode() : 0);
        result = 31 * result + (riesgoSubTipo != null ? riesgoSubTipo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
