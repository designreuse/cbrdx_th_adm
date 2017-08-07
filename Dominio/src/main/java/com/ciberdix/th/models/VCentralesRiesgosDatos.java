package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "V_CentralesRiesgosDatos", schema = "dbo", catalog = "CREZCAMOS")
public class VCentralesRiesgosDatos {
    private Integer idCentralRiesgoDato;
    private Integer idCentralRiesgo;
    private String dato;
    private Integer idDato;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCentralRiesgoDato", nullable = false)
    public Integer getIdCentralRiesgoDato() {
        return idCentralRiesgoDato;
    }

    public void setIdCentralRiesgoDato(Integer idCentralRiesgoDato) {
        this.idCentralRiesgoDato = idCentralRiesgoDato;
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
    @Column(name = "Dato", nullable = true, length = 100)
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Basic
    @Column(name = "IdDato", nullable = true)
    public Integer getIdDato() {
        return idDato;
    }

    public void setIdDato(Integer idDato) {
        this.idDato = idDato;
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

        VCentralesRiesgosDatos that = (VCentralesRiesgosDatos) o;

        if (idCentralRiesgoDato != null ? !idCentralRiesgoDato.equals(that.idCentralRiesgoDato) : that.idCentralRiesgoDato != null)
            return false;
        if (idCentralRiesgo != null ? !idCentralRiesgo.equals(that.idCentralRiesgo) : that.idCentralRiesgo != null)
            return false;
        if (dato != null ? !dato.equals(that.dato) : that.dato != null) return false;
        if (idDato != null ? !idDato.equals(that.idDato) : that.idDato != null) return false;
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
        int result = idCentralRiesgoDato != null ? idCentralRiesgoDato.hashCode() : 0;
        result = 31 * result + (idCentralRiesgo != null ? idCentralRiesgo.hashCode() : 0);
        result = 31 * result + (dato != null ? dato.hashCode() : 0);
        result = 31 * result + (idDato != null ? idDato.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
