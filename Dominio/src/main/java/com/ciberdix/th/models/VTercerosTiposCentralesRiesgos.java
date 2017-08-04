package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "V_TercerosTiposCentralesRiesgos", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosTiposCentralesRiesgos {
    private Integer idTerceroTipoCentralRiesgos;
    private String terceroTipo;
    private Integer idTerceroTipo;
    private String centralRiesgo;
    private Integer idCentralRiesgo;
    private Boolean indicadorRequiere;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroTipoCentralRiesgos", nullable = false)
    public Integer getIdTerceroTipoCentralRiesgos() {
        return idTerceroTipoCentralRiesgos;
    }

    public void setIdTerceroTipoCentralRiesgos(Integer idTerceroTipoCentralRiesgos) {
        this.idTerceroTipoCentralRiesgos = idTerceroTipoCentralRiesgos;
    }

    @Basic
    @Column(name = "TerceroTipo", nullable = true, length = 200)
    public String getTerceroTipo() {
        return terceroTipo;
    }

    public void setTerceroTipo(String terceroTipo) {
        this.terceroTipo = terceroTipo;
    }

    @Basic
    @Column(name = "IdTerceroTipo", nullable = true)
    public Integer getIdTerceroTipo() {
        return idTerceroTipo;
    }

    public void setIdTerceroTipo(Integer idTerceroTipo) {
        this.idTerceroTipo = idTerceroTipo;
    }

    @Basic
    @Column(name = "CentralRiesgo", nullable = true, length = 100)
    public String getCentralRiesgo() {
        return centralRiesgo;
    }

    public void setCentralRiesgo(String centralRiesgo) {
        this.centralRiesgo = centralRiesgo;
    }

    @Basic
    @Column(name = "IdCentralRiesgo", nullable = true)
    public Integer getIdCentralRiesgo() {
        return idCentralRiesgo;
    }

    public void setIdCentralRiesgo(Integer idCentralRiesgo) {
        this.idCentralRiesgo = idCentralRiesgo;
    }

    @Basic
    @Column(name = "IndicadorRequiere", nullable = true)
    public Boolean getIndicadorRequiere() {
        return indicadorRequiere;
    }

    public void setIndicadorRequiere(Boolean indicadorRequiere) {
        this.indicadorRequiere = indicadorRequiere;
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

        VTercerosTiposCentralesRiesgos that = (VTercerosTiposCentralesRiesgos) o;

        if (idTerceroTipoCentralRiesgos != null ? !idTerceroTipoCentralRiesgos.equals(that.idTerceroTipoCentralRiesgos) : that.idTerceroTipoCentralRiesgos != null)
            return false;
        if (terceroTipo != null ? !terceroTipo.equals(that.terceroTipo) : that.terceroTipo != null) return false;
        if (idTerceroTipo != null ? !idTerceroTipo.equals(that.idTerceroTipo) : that.idTerceroTipo != null)
            return false;
        if (centralRiesgo != null ? !centralRiesgo.equals(that.centralRiesgo) : that.centralRiesgo != null)
            return false;
        if (idCentralRiesgo != null ? !idCentralRiesgo.equals(that.idCentralRiesgo) : that.idCentralRiesgo != null)
            return false;
        if (indicadorRequiere != null ? !indicadorRequiere.equals(that.indicadorRequiere) : that.indicadorRequiere != null)
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
        int result = idTerceroTipoCentralRiesgos != null ? idTerceroTipoCentralRiesgos.hashCode() : 0;
        result = 31 * result + (terceroTipo != null ? terceroTipo.hashCode() : 0);
        result = 31 * result + (idTerceroTipo != null ? idTerceroTipo.hashCode() : 0);
        result = 31 * result + (centralRiesgo != null ? centralRiesgo.hashCode() : 0);
        result = 31 * result + (idCentralRiesgo != null ? idCentralRiesgo.hashCode() : 0);
        result = 31 * result + (indicadorRequiere != null ? indicadorRequiere.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
