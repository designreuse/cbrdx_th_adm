package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 20/06/2017.
 */
@Entity
@Table(name = "InstitucionesMedicasEstructurasFisicas", schema = "dbo", catalog = "CREZCAMOS")
public class InstitucionesMedicasEstructurasFisicas {
    private Integer idInstitucionMedicaEstructuraFisica;
    private Integer idInstitucionMedica;
    private Integer idEstructuraFisica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public InstitucionesMedicasEstructurasFisicas() {
    }

    public InstitucionesMedicasEstructurasFisicas(Integer idInstitucionMedica, Integer idEstructuraFisica, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idInstitucionMedica = idInstitucionMedica;
        this.idEstructuraFisica = idEstructuraFisica;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public InstitucionesMedicasEstructurasFisicas(Integer idInstitucionMedicaEstructuraFisica, Integer idInstitucionMedica, Integer idEstructuraFisica, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idInstitucionMedicaEstructuraFisica = idInstitucionMedicaEstructuraFisica;
        this.idInstitucionMedica = idInstitucionMedica;
        this.idEstructuraFisica = idEstructuraFisica;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdInstitucionMedicaEstructuraFisica", nullable = false)
    public Integer getIdInstitucionMedicaEstructuraFisica() {
        return idInstitucionMedicaEstructuraFisica;
    }

    public void setIdInstitucionMedicaEstructuraFisica(Integer idInstitucionMedicaEstructuraFisica) {
        this.idInstitucionMedicaEstructuraFisica = idInstitucionMedicaEstructuraFisica;
    }

    @Basic
    @Column(name = "IdInstitucionMedica", nullable = true)
    public Integer getIdInstitucionMedica() {
        return idInstitucionMedica;
    }

    public void setIdInstitucionMedica(Integer idInstitucionMedica) {
        this.idInstitucionMedica = idInstitucionMedica;
    }

    @Basic
    @Column(name = "IdEstructuraFisica", nullable = true)
    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
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

        InstitucionesMedicasEstructurasFisicas that = (InstitucionesMedicasEstructurasFisicas) o;

        if (idInstitucionMedicaEstructuraFisica != null ? !idInstitucionMedicaEstructuraFisica.equals(that.idInstitucionMedicaEstructuraFisica) : that.idInstitucionMedicaEstructuraFisica != null)
            return false;
        if (idInstitucionMedica != null ? !idInstitucionMedica.equals(that.idInstitucionMedica) : that.idInstitucionMedica != null)
            return false;
        if (idEstructuraFisica != null ? !idEstructuraFisica.equals(that.idEstructuraFisica) : that.idEstructuraFisica != null)
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
        int result = idInstitucionMedicaEstructuraFisica != null ? idInstitucionMedicaEstructuraFisica.hashCode() : 0;
        result = 31 * result + (idInstitucionMedica != null ? idInstitucionMedica.hashCode() : 0);
        result = 31 * result + (idEstructuraFisica != null ? idEstructuraFisica.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
