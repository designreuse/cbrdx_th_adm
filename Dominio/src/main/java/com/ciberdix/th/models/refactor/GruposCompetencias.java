package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class GruposCompetencias {
    private Integer idGrupoCompetencia;
    private String grupoCompetencia;
    private String descripcion;
    private BigDecimal ponderacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdGrupoCompetencia")
    public Integer getIdGrupoCompetencia() {
        return idGrupoCompetencia;
    }

    public void setIdGrupoCompetencia(Integer idGrupoCompetencia) {
        this.idGrupoCompetencia = idGrupoCompetencia;
    }

    @Basic
    @Column(name = "GrupoCompetencia")
    public String getGrupoCompetencia() {
        return grupoCompetencia;
    }

    public void setGrupoCompetencia(String grupoCompetencia) {
        this.grupoCompetencia = grupoCompetencia;
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
    @Column(name = "Ponderacion")
    public BigDecimal getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(BigDecimal ponderacion) {
        this.ponderacion = ponderacion;
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

        GruposCompetencias that = (GruposCompetencias) o;

        if (idGrupoCompetencia != null ? !idGrupoCompetencia.equals(that.idGrupoCompetencia) : that.idGrupoCompetencia != null)
            return false;
        if (grupoCompetencia != null ? !grupoCompetencia.equals(that.grupoCompetencia) : that.grupoCompetencia != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (ponderacion != null ? !ponderacion.equals(that.ponderacion) : that.ponderacion != null) return false;
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
        int result = idGrupoCompetencia != null ? idGrupoCompetencia.hashCode() : 0;
        result = 31 * result + (grupoCompetencia != null ? grupoCompetencia.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (ponderacion != null ? ponderacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
