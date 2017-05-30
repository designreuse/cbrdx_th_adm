package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_Riesgos", schema = "dbo", catalog = "CREZCAMOS")
public class VRiesgos {
    private Integer idRiesgo;
    private String riesgo;
    private Integer idTipoRiesgo;
    private String riesgoTipo;
    private Integer idSubTipoRiesgo;
    private String riesgoSubTipo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Basic
    @Id
    @Column(name = "IdRiesgo", nullable = false)
    public Integer getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(Integer idRiesgo) {
        this.idRiesgo = idRiesgo;
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
    @Column(name = "IdTipoRiesgo", nullable = true)
    public Integer getIdTipoRiesgo() {
        return idTipoRiesgo;
    }

    public void setIdTipoRiesgo(Integer idTipoRiesgo) {
        this.idTipoRiesgo = idTipoRiesgo;
    }

    @Basic
    @Column(name = "RiesgoTipo", nullable = true, length = 100)
    public String getRiesgoTipo() {
        return riesgoTipo;
    }

    public void setRiesgoTipo(String riesgoTipo) {
        this.riesgoTipo = riesgoTipo;
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
    @Column(name = "RiesgoSubTipo", nullable = true, length = 100)
    public String getRiesgoSubTipo() {
        return riesgoSubTipo;
    }

    public void setRiesgoSubTipo(String riesgoSubTipo) {
        this.riesgoSubTipo = riesgoSubTipo;
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

        VRiesgos vRiesgos = (VRiesgos) o;

        if (idRiesgo != null ? !idRiesgo.equals(vRiesgos.idRiesgo) : vRiesgos.idRiesgo != null) return false;
        if (riesgo != null ? !riesgo.equals(vRiesgos.riesgo) : vRiesgos.riesgo != null) return false;
        if (idTipoRiesgo != null ? !idTipoRiesgo.equals(vRiesgos.idTipoRiesgo) : vRiesgos.idTipoRiesgo != null)
            return false;
        if (riesgoTipo != null ? !riesgoTipo.equals(vRiesgos.riesgoTipo) : vRiesgos.riesgoTipo != null) return false;
        if (idSubTipoRiesgo != null ? !idSubTipoRiesgo.equals(vRiesgos.idSubTipoRiesgo) : vRiesgos.idSubTipoRiesgo != null)
            return false;
        if (riesgoSubTipo != null ? !riesgoSubTipo.equals(vRiesgos.riesgoSubTipo) : vRiesgos.riesgoSubTipo != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(vRiesgos.indicadorHabilitado) : vRiesgos.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(vRiesgos.auditoriaUsuario) : vRiesgos.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(vRiesgos.auditoriaFecha) : vRiesgos.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRiesgo != null ? idRiesgo.hashCode() : 0;
        result = 31 * result + (riesgo != null ? riesgo.hashCode() : 0);
        result = 31 * result + (idTipoRiesgo != null ? idTipoRiesgo.hashCode() : 0);
        result = 31 * result + (riesgoTipo != null ? riesgoTipo.hashCode() : 0);
        result = 31 * result + (idSubTipoRiesgo != null ? idSubTipoRiesgo.hashCode() : 0);
        result = 31 * result + (riesgoSubTipo != null ? riesgoSubTipo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
