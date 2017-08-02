package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "InstitucionesMedicasTiposExamenes", schema = "dbo", catalog = "CREZCAMOS")
public class InstitucionesMedicasTiposExamenes {
    private Integer idInstitucionMedicaTipoExamen;
    private Integer idInstitucionMedica;
    private Integer idTipoExamen;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public InstitucionesMedicasTiposExamenes() {
    }

    public InstitucionesMedicasTiposExamenes(Integer idInstitucionMedica, Integer idTipoExamen, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idInstitucionMedica = idInstitucionMedica;
        this.idTipoExamen = idTipoExamen;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public InstitucionesMedicasTiposExamenes(Integer idInstitucionMedicaTipoExamen, Integer idInstitucionMedica, Integer idTipoExamen, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idInstitucionMedicaTipoExamen = idInstitucionMedicaTipoExamen;
        this.idInstitucionMedica = idInstitucionMedica;
        this.idTipoExamen = idTipoExamen;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdInstitucionMedicaTipoExamen", nullable = false)
    public Integer getIdInstitucionMedicaTipoExamen() {
        return idInstitucionMedicaTipoExamen;
    }

    public void setIdInstitucionMedicaTipoExamen(Integer idInstitucionMedicaTipoExamen) {
        this.idInstitucionMedicaTipoExamen = idInstitucionMedicaTipoExamen;
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
    @Column(name = "IdTipoExamen", nullable = true)
    public Integer getIdTipoExamen() {
        return idTipoExamen;
    }

    public void setIdTipoExamen(Integer idTipoExamen) {
        this.idTipoExamen = idTipoExamen;
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

        InstitucionesMedicasTiposExamenes that = (InstitucionesMedicasTiposExamenes) o;

        if (idInstitucionMedicaTipoExamen != null ? !idInstitucionMedicaTipoExamen.equals(that.idInstitucionMedicaTipoExamen) : that.idInstitucionMedicaTipoExamen != null)
            return false;
        if (idInstitucionMedica != null ? !idInstitucionMedica.equals(that.idInstitucionMedica) : that.idInstitucionMedica != null)
            return false;
        if (idTipoExamen != null ? !idTipoExamen.equals(that.idTipoExamen) : that.idTipoExamen != null) return false;
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
        int result = idInstitucionMedicaTipoExamen != null ? idInstitucionMedicaTipoExamen.hashCode() : 0;
        result = 31 * result + (idInstitucionMedica != null ? idInstitucionMedica.hashCode() : 0);
        result = 31 * result + (idTipoExamen != null ? idTipoExamen.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
