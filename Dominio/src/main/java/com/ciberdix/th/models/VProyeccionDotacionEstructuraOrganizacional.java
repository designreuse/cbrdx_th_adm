package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "V_ProyeccionDotacionEstructuraOrganizacional", schema = "dbo", catalog = "CREZCAMOS")
public class VProyeccionDotacionEstructuraOrganizacional {
    private Integer idProyeccionDotacionEstructuraOrganizacional;
    private String nombreProyeccion;
    private Integer idProyeccionDotacion;
    private String nombreArea;
    private Integer idEstructuraOrganizacional;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdProyeccionDotacionEstructuraOrganizacional", nullable = false)
    public Integer getIdProyeccionDotacionEstructuraOrganizacional() {
        return idProyeccionDotacionEstructuraOrganizacional;
    }

    public void setIdProyeccionDotacionEstructuraOrganizacional(Integer idProyeccionDotacionEstructuraOrganizacional) {
        this.idProyeccionDotacionEstructuraOrganizacional = idProyeccionDotacionEstructuraOrganizacional;
    }

    @Basic
    @Column(name = "NombreProyeccion", nullable = true, length = 200)
    public String getNombreProyeccion() {
        return nombreProyeccion;
    }

    public void setNombreProyeccion(String nombreProyeccion) {
        this.nombreProyeccion = nombreProyeccion;
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
    @Column(name = "NombreArea", nullable = true, length = 50)
    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
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

        VProyeccionDotacionEstructuraOrganizacional that = (VProyeccionDotacionEstructuraOrganizacional) o;

        if (idProyeccionDotacionEstructuraOrganizacional != null ? !idProyeccionDotacionEstructuraOrganizacional.equals(that.idProyeccionDotacionEstructuraOrganizacional) : that.idProyeccionDotacionEstructuraOrganizacional != null)
            return false;
        if (nombreProyeccion != null ? !nombreProyeccion.equals(that.nombreProyeccion) : that.nombreProyeccion != null)
            return false;
        if (idProyeccionDotacion != null ? !idProyeccionDotacion.equals(that.idProyeccionDotacion) : that.idProyeccionDotacion != null)
            return false;
        if (nombreArea != null ? !nombreArea.equals(that.nombreArea) : that.nombreArea != null) return false;
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
        result = 31 * result + (nombreProyeccion != null ? nombreProyeccion.hashCode() : 0);
        result = 31 * result + (idProyeccionDotacion != null ? idProyeccionDotacion.hashCode() : 0);
        result = 31 * result + (nombreArea != null ? nombreArea.hashCode() : 0);
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
