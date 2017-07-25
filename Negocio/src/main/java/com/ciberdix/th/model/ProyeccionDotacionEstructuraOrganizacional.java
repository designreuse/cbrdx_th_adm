package com.ciberdix.th.model;

import java.sql.Timestamp;

public class ProyeccionDotacionEstructuraOrganizacional {

    private Integer idProyeccionDotacionEstructuraOrganizacional;
    private Integer idProyeccionDotacion;
    private Integer idEstructuraOrganizacional;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdProyeccionDotacionEstructuraOrganizacional() {
        return idProyeccionDotacionEstructuraOrganizacional;
    }

    public void setIdProyeccionDotacionEstructuraOrganizacional(Integer idProyeccionDotacionEstructuraOrganizacional) {
        this.idProyeccionDotacionEstructuraOrganizacional = idProyeccionDotacionEstructuraOrganizacional;
    }

    public Integer getIdProyeccionDotacion() {
        return idProyeccionDotacion;
    }

    public void setIdProyeccionDotacion(Integer idProyeccionDotacion) {
        this.idProyeccionDotacion = idProyeccionDotacion;
    }

    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
