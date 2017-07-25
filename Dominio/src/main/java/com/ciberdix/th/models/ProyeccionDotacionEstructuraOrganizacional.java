package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ProyeccionDotacionEstructuraOrganizacional", schema = "dbo", catalog = "CREZCAMOS")
public class ProyeccionDotacionEstructuraOrganizacional {
    private Integer idProyeccionDotacionEstructuraOrganizacional;
    private Integer idProyeccionDotacion;
    private Integer idEstructuraOrganizacional;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ProyeccionDotacionEstructuraOrganizacional() {
    }

    public ProyeccionDotacionEstructuraOrganizacional(Integer idProyeccionDotacion, Integer idEstructuraOrganizacional, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idProyeccionDotacion = idProyeccionDotacion;
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ProyeccionDotacionEstructuraOrganizacional(Integer idProyeccionDotacionEstructuraOrganizacional, Integer idProyeccionDotacion, Integer idEstructuraOrganizacional, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idProyeccionDotacionEstructuraOrganizacional = idProyeccionDotacionEstructuraOrganizacional;
        this.idProyeccionDotacion = idProyeccionDotacion;
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdProyeccionDotacionEstructuraOrganizacional", nullable = false)
    public Integer getIdProyeccionDotacionEstructuraOrganizacional() {
        return idProyeccionDotacionEstructuraOrganizacional;
    }

    public void setIdProyeccionDotacionEstructuraOrganizacional(Integer idProyeccionDotacionEstructuraOrganizacional) {
        this.idProyeccionDotacionEstructuraOrganizacional = idProyeccionDotacionEstructuraOrganizacional;
    }

    @Basic
    @Column(name = "IdProyeccionDotacion", nullable = true)
    public Integer getIdProyeccionDotacion() {
        return idProyeccionDotacion;
    }

    public void setIdProyeccionDotacion(Integer idProyeccionDotacion) {
        this.idProyeccionDotacion = idProyeccionDotacion;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacional", nullable = true)
    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
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

        ProyeccionDotacionEstructuraOrganizacional that = (ProyeccionDotacionEstructuraOrganizacional) o;

        if (idProyeccionDotacionEstructuraOrganizacional != null ? !idProyeccionDotacionEstructuraOrganizacional.equals(that.idProyeccionDotacionEstructuraOrganizacional) : that.idProyeccionDotacionEstructuraOrganizacional != null)
            return false;
        if (idProyeccionDotacion != null ? !idProyeccionDotacion.equals(that.idProyeccionDotacion) : that.idProyeccionDotacion != null)
            return false;
        if (idEstructuraOrganizacional != null ? !idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional) : that.idEstructuraOrganizacional != null)
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
        int result = idProyeccionDotacionEstructuraOrganizacional != null ? idProyeccionDotacionEstructuraOrganizacional.hashCode() : 0;
        result = 31 * result + (idProyeccionDotacion != null ? idProyeccionDotacion.hashCode() : 0);
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
