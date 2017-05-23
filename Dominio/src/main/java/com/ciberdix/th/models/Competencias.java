package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "Competencias", schema = "crz_th", catalog = "CREZCAMOS")
public class Competencias {
    private Integer idCompetencia;
    private Integer idGrupoCompetencia;
    private String competencia;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Competencias() {
    }

    public Competencias(Integer idGrupoCompetencia, String competencia, String descripcion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idGrupoCompetencia = idGrupoCompetencia;
        this.competencia = competencia;
        this.descripcion = descripcion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Competencias(Integer idCompetencia, Integer idGrupoCompetencia, String competencia, String descripcion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idCompetencia = idCompetencia;
        this.idGrupoCompetencia = idGrupoCompetencia;
        this.competencia = competencia;
        this.descripcion = descripcion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCompetencia")
    public Integer getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Integer idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    @Basic
    @Column(name = "IdGrupoCompetencia")
    public Integer getIdGrupoCompetencia() {
        return idGrupoCompetencia;
    }

    public void setIdGrupoCompetencia(Integer idGrupoCompetencia) {
        this.idGrupoCompetencia = idGrupoCompetencia;
    }

    @Basic
    @Column(name = "Competencia")
    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

        Competencias that = (Competencias) o;

        if (idCompetencia != null ? !idCompetencia.equals(that.idCompetencia) : that.idCompetencia != null)
            return false;
        if (idGrupoCompetencia != null ? !idGrupoCompetencia.equals(that.idGrupoCompetencia) : that.idGrupoCompetencia != null)
            return false;
        if (competencia != null ? !competencia.equals(that.competencia) : that.competencia != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
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
        int result = idCompetencia != null ? idCompetencia.hashCode() : 0;
        result = 31 * result + (idGrupoCompetencia != null ? idGrupoCompetencia.hashCode() : 0);
        result = 31 * result + (competencia != null ? competencia.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
