package com.ciberdix.th.model;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 16/05/2017.
 */
public class VRequerimientos {

    private Integer idRequerimiento;
    private String nombreSolicitante;
    private Integer idSolicitante;
    private String justificacion;
    private String cargo;
    private Integer idCargo;
    private Integer salario;
    private String formaContratacion;
    private Integer idFormaContratacion;
    private String tipoContratacion;
    private Integer idTipoContratacion;
    private Integer cantidadVacantes;
    private Integer cantidadConvocados;
    private String estado;
    private Integer idEstado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String nombreResponsableSeleccion;
    private Integer idResponsableSeleccion;
    private String formaReclutamiento;
    private Integer idFormaReclutamiento;
    private String area;
    private Integer idEstructuraOrganizacional;
    private String zona;
    private Integer idZona;
    private String estructuraFisica;
    private Integer idEstructuraFisica;
    private java.sql.Date fechaSolicitud;
    private Boolean indicadorAutorizacion;
    private Boolean indicadorAumentoPlazas;
    private String nombrejefe;
    private String cargoJefe;
    private Integer idCargoJefe;
    private Long idJefe;
    private String categoria;
    private Integer idCategoria;
    private String tipoSolicitud;
    private Integer idTipoSolicitud;
    private java.sql.Date fechaInicio;
    private java.sql.Date fechaFin;
    private String nombreCargo;
    private String funcionCargo;
    private Integer idPublicacion;
    private java.sql.Date fechaInicioPublicacion;
    private java.sql.Date fechaFinPublicacion;
    private Boolean indicadorSalario;
    private Boolean indicadorBonificacion;
    private String nivelEducacion;
    private Integer idNivelEducacion;
    private String tipoTrabajo;
    private Integer idTipoTrabajo;
    private String descripcionGeneral;
    private String lugarTrabajo;
    private String competenciasLaborales;
    private Boolean indicadorObservacion;
    private String observacion;
    private Integer idProceso;

    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public Integer getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Integer idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getFormaContratacion() {
        return formaContratacion;
    }

    public void setFormaContratacion(String formaContratacion) {
        this.formaContratacion = formaContratacion;
    }

    public Integer getIdFormaContratacion() {
        return idFormaContratacion;
    }

    public void setIdFormaContratacion(Integer idFormaContratacion) {
        this.idFormaContratacion = idFormaContratacion;
    }

    public String getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(String tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }

    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    public Integer getCantidadVacantes() {
        return cantidadVacantes;
    }

    public void setCantidadVacantes(Integer cantidadVacantes) {
        this.cantidadVacantes = cantidadVacantes;
    }

    public Integer getCantidadConvocados() {
        return cantidadConvocados;
    }

    public void setCantidadConvocados(Integer cantidadConvocados) {
        this.cantidadConvocados = cantidadConvocados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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

    public String getNombreResponsableSeleccion() {
        return nombreResponsableSeleccion;
    }

    public void setNombreResponsableSeleccion(String nombreResponsableSeleccion) {
        this.nombreResponsableSeleccion = nombreResponsableSeleccion;
    }

    public Integer getIdResponsableSeleccion() {
        return idResponsableSeleccion;
    }

    public void setIdResponsableSeleccion(Integer idResponsableSeleccion) {
        this.idResponsableSeleccion = idResponsableSeleccion;
    }

    public String getFormaReclutamiento() {
        return formaReclutamiento;
    }

    public void setFormaReclutamiento(String formaReclutamiento) {
        this.formaReclutamiento = formaReclutamiento;
    }

    public Integer getIdFormaReclutamiento() {
        return idFormaReclutamiento;
    }

    public void setIdFormaReclutamiento(Integer idFormaReclutamiento) {
        this.idFormaReclutamiento = idFormaReclutamiento;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public String getEstructuraFisica() {
        return estructuraFisica;
    }

    public void setEstructuraFisica(String estructuraFisica) {
        this.estructuraFisica = estructuraFisica;
    }

    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
    }

    public java.sql.Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(java.sql.Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Boolean getIndicadorAutorizacion() {
        return indicadorAutorizacion;
    }

    public void setIndicadorAutorizacion(Boolean indicadorAutorizacion) {
        this.indicadorAutorizacion = indicadorAutorizacion;
    }

    public Boolean getIndicadorAumentoPlazas() {
        return indicadorAumentoPlazas;
    }

    public void setIndicadorAumentoPlazas(Boolean indicadorAumentoPlazas) {
        this.indicadorAumentoPlazas = indicadorAumentoPlazas;
    }

    public String getNombrejefe() {
        return nombrejefe;
    }

    public void setNombrejefe(String nombrejefe) {
        this.nombrejefe = nombrejefe;
    }

    public String getCargoJefe() {
        return cargoJefe;
    }

    public void setCargoJefe(String cargoJefe) {
        this.cargoJefe = cargoJefe;
    }

    public Integer getIdCargoJefe() {
        return idCargoJefe;
    }

    public void setIdCargoJefe(Integer idCargoJefe) {
        this.idCargoJefe = idCargoJefe;
    }

    public Long getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Long idJefe) {
        this.idJefe = idJefe;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public Integer getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
    }

    public java.sql.Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(java.sql.Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public java.sql.Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(java.sql.Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getFuncionCargo() {
        return funcionCargo;
    }

    public void setFuncionCargo(String funcionCargo) {
        this.funcionCargo = funcionCargo;
    }

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public java.sql.Date getFechaInicioPublicacion() {
        return fechaInicioPublicacion;
    }

    public void setFechaInicioPublicacion(java.sql.Date fechaInicioPublicacion) {
        this.fechaInicioPublicacion = fechaInicioPublicacion;
    }

    public java.sql.Date getFechaFinPublicacion() {
        return fechaFinPublicacion;
    }

    public void setFechaFinPublicacion(java.sql.Date fechaFinPublicacion) {
        this.fechaFinPublicacion = fechaFinPublicacion;
    }

    public Boolean getIndicadorSalario() {
        return indicadorSalario;
    }

    public void setIndicadorSalario(Boolean indicadorSalario) {
        this.indicadorSalario = indicadorSalario;
    }

    public Boolean getIndicadorBonificacion() {
        return indicadorBonificacion;
    }

    public void setIndicadorBonificacion(Boolean indicadorBonificacion) {
        this.indicadorBonificacion = indicadorBonificacion;
    }

    public String getNivelEducacion() {
        return nivelEducacion;
    }

    public void setNivelEducacion(String nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }

    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public Integer getIdTipoTrabajo() {
        return idTipoTrabajo;
    }

    public void setIdTipoTrabajo(Integer idTipoTrabajo) {
        this.idTipoTrabajo = idTipoTrabajo;
    }

    public String getDescripcionGeneral() {
        return descripcionGeneral;
    }

    public void setDescripcionGeneral(String descripcionGeneral) {
        this.descripcionGeneral = descripcionGeneral;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getCompetenciasLaborales() {
        return competenciasLaborales;
    }

    public void setCompetenciasLaborales(String competenciasLaborales) {
        this.competenciasLaborales = competenciasLaborales;
    }

    public Boolean getIndicadorObservacion() {
        return indicadorObservacion;
    }

    public void setIndicadorObservacion(Boolean indicadorObservacion) {
        this.indicadorObservacion = indicadorObservacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }
}
