package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
public class VProyeccionLaboral {
    private Integer idProyecccionLaboral;
    private Integer idEstructuraOrganizacional;
    private String estructuraOrganizacional;
    private Integer idCargo;
    private String cargo;
    private Integer plazasActuales;
    private Integer plazasProyectadas;
    private Double costoActual;
    private Double costoProyectado;
    private Integer idEstadoProyeccion;
    private String estadoProyeccion;
    private Integer idUsuarioProyecta;
    private String usuarioProyecta;
    private Integer idUsuarioAprueba;
    private String usuarioAprueba;
    private Integer año;
    private String observacion;
    private String observacionAprobacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdProyecccionLaboral() {
        return idProyecccionLaboral;
    }

    public void setIdProyecccionLaboral(Integer idProyecccionLaboral) {
        this.idProyecccionLaboral = idProyecccionLaboral;
    }

    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    public String getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }

    public void setEstructuraOrganizacional(String estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getPlazasActuales() {
        return plazasActuales;
    }

    public void setPlazasActuales(Integer plazasActuales) {
        this.plazasActuales = plazasActuales;
    }

    public Integer getPlazasProyectadas() {
        return plazasProyectadas;
    }

    public void setPlazasProyectadas(Integer plazasProyectadas) {
        this.plazasProyectadas = plazasProyectadas;
    }

    public Double getCostoActual() {
        return costoActual;
    }

    public void setCostoActual(Double costoActual) {
        this.costoActual = costoActual;
    }

    public Double getCostoProyectado() {
        return costoProyectado;
    }

    public void setCostoProyectado(Double costoProyectado) {
        this.costoProyectado = costoProyectado;
    }

    public Integer getIdEstadoProyeccion() {
        return idEstadoProyeccion;
    }

    public void setIdEstadoProyeccion(Integer idEstadoProyeccion) {
        this.idEstadoProyeccion = idEstadoProyeccion;
    }

    public String getEstadoProyeccion() {
        return estadoProyeccion;
    }

    public void setEstadoProyeccion(String estadoProyeccion) {
        this.estadoProyeccion = estadoProyeccion;
    }

    public Integer getIdUsuarioProyecta() {
        return idUsuarioProyecta;
    }

    public void setIdUsuarioProyecta(Integer idUsuarioProyecta) {
        this.idUsuarioProyecta = idUsuarioProyecta;
    }

    public String getUsuarioProyecta() {
        return usuarioProyecta;
    }

    public void setUsuarioProyecta(String usuarioProyecta) {
        this.usuarioProyecta = usuarioProyecta;
    }

    public Integer getIdUsuarioAprueba() {
        return idUsuarioAprueba;
    }

    public void setIdUsuarioAprueba(Integer idUsuarioAprueba) {
        this.idUsuarioAprueba = idUsuarioAprueba;
    }

    public String getUsuarioAprueba() {
        return usuarioAprueba;
    }

    public void setUsuarioAprueba(String usuarioAprueba) {
        this.usuarioAprueba = usuarioAprueba;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getObservacionAprobacion() {
        return observacionAprobacion;
    }

    public void setObservacionAprobacion(String observacionAprobacion) {
        this.observacionAprobacion = observacionAprobacion;
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
