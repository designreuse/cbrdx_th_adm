package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Felipe Aguirre on 24/03/2017.
 */
@Entity
@Table(name = "GruposGestion", schema = "dbo", catalog = "CREZCAMOS")
public class GruposGestion {
    private Integer idGrupoGestion;
    private String grupoGestion;
    private String funciones;
    private String responsabilidades;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Date fechaInicio;
    private Date fechaFin;
    private String codigoGrupoGestion;

    public GruposGestion() {
    }

    public GruposGestion(String grupoGestion, String funciones, String responsabilidades, Boolean indicadorHabilitado, Integer auditoriaUsuario, Date fechaInicio, Date fechaFin, String codigoGrupoGestion) {
        this.grupoGestion = grupoGestion;
        this.funciones = funciones;
        this.responsabilidades = responsabilidades;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
        this.codigoGrupoGestion = codigoGrupoGestion;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public GruposGestion(Integer idGrupoGestion, String grupoGestion, String funciones, String responsabilidades, Boolean indicadorHabilitado, Integer auditoriaUsuario, Date fechaInicio, Date fechaFin, String codigoGrupoGestion) {
        this.idGrupoGestion = idGrupoGestion;
        this.grupoGestion = grupoGestion;
        this.funciones = funciones;
        this.responsabilidades = responsabilidades;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
        this.codigoGrupoGestion = codigoGrupoGestion;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdGrupoGestion", nullable = false)
    public Integer getIdGrupoGestion() {
        return idGrupoGestion;
    }

    public void setIdGrupoGestion(Integer idGrupoGestion) {
        this.idGrupoGestion = idGrupoGestion;
    }

    @Basic
    @Column(name = "GrupoGestion", nullable = true, length = 64)
    public String getGrupoGestion() {
        return grupoGestion;
    }

    public void setGrupoGestion(String grupoGestion) {
        this.grupoGestion = grupoGestion;
    }

    @Basic
    @Column(name = "Funciones", nullable = true, length = 500)
    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    @Basic
    @Column(name = "Responsabilidades", nullable = true, length = 500)
    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
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

    @Basic
    @Column(name = "FechaInicio", nullable = true)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "CodigoGrupoGestion", nullable = true, length = 10)
    public String getCodigoGrupoGestion() {
        return codigoGrupoGestion;
    }

    public void setCodigoGrupoGestion(String codigoGrupoGestion) {
        this.codigoGrupoGestion = codigoGrupoGestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GruposGestion that = (GruposGestion) o;

        if (idGrupoGestion != null ? !idGrupoGestion.equals(that.idGrupoGestion) : that.idGrupoGestion != null)
            return false;
        if (grupoGestion != null ? !grupoGestion.equals(that.grupoGestion) : that.grupoGestion != null) return false;
        if (funciones != null ? !funciones.equals(that.funciones) : that.funciones != null) return false;
        if (responsabilidades != null ? !responsabilidades.equals(that.responsabilidades) : that.responsabilidades != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (codigoGrupoGestion != null ? !codigoGrupoGestion.equals(that.codigoGrupoGestion) : that.codigoGrupoGestion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGrupoGestion != null ? idGrupoGestion.hashCode() : 0;
        result = 31 * result + (grupoGestion != null ? grupoGestion.hashCode() : 0);
        result = 31 * result + (funciones != null ? funciones.hashCode() : 0);
        result = 31 * result + (responsabilidades != null ? responsabilidades.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (codigoGrupoGestion != null ? codigoGrupoGestion.hashCode() : 0);
        return result;
    }
}
