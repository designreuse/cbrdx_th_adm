package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 16/05/2017.
 */
@Entity
@Table(name = "V_Requerimientos", schema = "crz_th", catalog = "CREZCAMOS")
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
    private String estructuraOrganizacional;
    private Integer idEstructuraOrganizacional;
    private String zona;
    private Integer idZona;
    private String estructuraFisica;
    private Integer idEstructuraFisica;
    private Date fechaSolicitud;
    private Boolean indicadorAutorizacion;
    private Boolean indicadorAumentoPlazas;
    private String cargoJefe;
    private Integer idJefe;
    private String categoria;
    private Integer idCategoria;
    private String tipoSolicitud;
    private Integer idTipoSolicitud;
    private Date fechaInicio;
    private Date fechaFin;

    @Id
    @Column(name = "IdRequerimiento", nullable = false)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "NombreSolicitante", nullable = false, length = 259)
    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    @Basic
    @Column(name = "IdSolicitante", nullable = true)
    public Integer getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Integer idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    @Basic
    @Column(name = "Justificacion", nullable = true, length = 200)
    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    @Basic
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "Salario", nullable = true, precision = 0)
    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "FormaContratacion", nullable = true, length = 100)
    public String getFormaContratacion() {
        return formaContratacion;
    }

    public void setFormaContratacion(String formaContratacion) {
        this.formaContratacion = formaContratacion;
    }

    @Basic
    @Column(name = "IdFormaContratacion", nullable = true)
    public Integer getIdFormaContratacion() {
        return idFormaContratacion;
    }

    public void setIdFormaContratacion(Integer idFormaContratacion) {
        this.idFormaContratacion = idFormaContratacion;
    }

    @Basic
    @Column(name = "TipoContratacion", nullable = true, length = 100)
    public String getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(String tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }

    @Basic
    @Column(name = "IdTipoContratacion", nullable = true)
    public Integer getIdTipoContratacion() {
        return idTipoContratacion;
    }

    public void setIdTipoContratacion(Integer idTipoContratacion) {
        this.idTipoContratacion = idTipoContratacion;
    }

    @Basic
    @Column(name = "CantidadVacantes", nullable = true)
    public Integer getCantidadVacantes() {
        return cantidadVacantes;
    }

    public void setCantidadVacantes(Integer cantidadVacantes) {
        this.cantidadVacantes = cantidadVacantes;
    }

    @Basic
    @Column(name = "CantidadConvocados", nullable = true)
    public Integer getCantidadConvocados() {
        return cantidadConvocados;
    }

    public void setCantidadConvocados(Integer cantidadConvocados) {
        this.cantidadConvocados = cantidadConvocados;
    }

    @Basic
    @Column(name = "Estado", nullable = true, length = 100)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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
    @Column(name = "NombreResponsableSeleccion", nullable = false, length = 259)
    public String getNombreResponsableSeleccion() {
        return nombreResponsableSeleccion;
    }

    public void setNombreResponsableSeleccion(String nombreResponsableSeleccion) {
        this.nombreResponsableSeleccion = nombreResponsableSeleccion;
    }

    @Basic
    @Column(name = "IdResponsableSeleccion", nullable = true)
    public Integer getIdResponsableSeleccion() {
        return idResponsableSeleccion;
    }

    public void setIdResponsableSeleccion(Integer idResponsableSeleccion) {
        this.idResponsableSeleccion = idResponsableSeleccion;
    }

    @Basic
    @Column(name = "FormaReclutamiento", nullable = true, length = 100)
    public String getFormaReclutamiento() {
        return formaReclutamiento;
    }

    public void setFormaReclutamiento(String formaReclutamiento) {
        this.formaReclutamiento = formaReclutamiento;
    }

    @Basic
    @Column(name = "IdFormaReclutamiento", nullable = true)
    public Integer getIdFormaReclutamiento() {
        return idFormaReclutamiento;
    }

    public void setIdFormaReclutamiento(Integer idFormaReclutamiento) {
        this.idFormaReclutamiento = idFormaReclutamiento;
    }

    @Basic
    @Column(name = "EstructuraOrganizacional", nullable = true, length = 50)
    public String getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }

    public void setEstructuraOrganizacional(String estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
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
    @Column(name = "Zona", nullable = true, length = 50)
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Basic
    @Column(name = "IdZona", nullable = true)
    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    @Basic
    @Column(name = "EstructuraFisica", nullable = true, length = 50)
    public String getEstructuraFisica() {
        return estructuraFisica;
    }

    public void setEstructuraFisica(String estructuraFisica) {
        this.estructuraFisica = estructuraFisica;
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
    @Column(name = "FechaSolicitud", nullable = true)
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Basic
    @Column(name = "IndicadorAutorizacion", nullable = true)
    public Boolean getIndicadorAutorizacion() {
        return indicadorAutorizacion;
    }

    public void setIndicadorAutorizacion(Boolean indicadorAutorizacion) {
        this.indicadorAutorizacion = indicadorAutorizacion;
    }

    @Basic
    @Column(name = "IndicadorAumentoPlazas", nullable = true)
    public Boolean getIndicadorAumentoPlazas() {
        return indicadorAumentoPlazas;
    }

    public void setIndicadorAumentoPlazas(Boolean indicadorAumentoPlazas) {
        this.indicadorAumentoPlazas = indicadorAumentoPlazas;
    }

    @Basic
    @Column(name = "CargoJefe", nullable = true, length = 100)
    public String getCargoJefe() {
        return cargoJefe;
    }

    public void setCargoJefe(String cargoJefe) {
        this.cargoJefe = cargoJefe;
    }

    @Basic
    @Column(name = "IdJefe", nullable = true)
    public Integer getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(Integer idJefe) {
        this.idJefe = idJefe;
    }

    @Basic
    @Column(name = "Categoria", nullable = true, length = 30)
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Basic
    @Column(name = "IdCategoria", nullable = true)
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "TipoSolicitud", nullable = true, length = 100)
    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    @Basic
    @Column(name = "IdTipoSolicitud", nullable = true)
    public Integer getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(Integer idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VRequerimientos that = (VRequerimientos) o;

        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (nombreSolicitante != null ? !nombreSolicitante.equals(that.nombreSolicitante) : that.nombreSolicitante != null)
            return false;
        if (idSolicitante != null ? !idSolicitante.equals(that.idSolicitante) : that.idSolicitante != null)
            return false;
        if (justificacion != null ? !justificacion.equals(that.justificacion) : that.justificacion != null)
            return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (salario != null ? !salario.equals(that.salario) : that.salario != null) return false;
        if (formaContratacion != null ? !formaContratacion.equals(that.formaContratacion) : that.formaContratacion != null)
            return false;
        if (idFormaContratacion != null ? !idFormaContratacion.equals(that.idFormaContratacion) : that.idFormaContratacion != null)
            return false;
        if (tipoContratacion != null ? !tipoContratacion.equals(that.tipoContratacion) : that.tipoContratacion != null)
            return false;
        if (idTipoContratacion != null ? !idTipoContratacion.equals(that.idTipoContratacion) : that.idTipoContratacion != null)
            return false;
        if (cantidadVacantes != null ? !cantidadVacantes.equals(that.cantidadVacantes) : that.cantidadVacantes != null)
            return false;
        if (cantidadConvocados != null ? !cantidadConvocados.equals(that.cantidadConvocados) : that.cantidadConvocados != null)
            return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (nombreResponsableSeleccion != null ? !nombreResponsableSeleccion.equals(that.nombreResponsableSeleccion) : that.nombreResponsableSeleccion != null)
            return false;
        if (idResponsableSeleccion != null ? !idResponsableSeleccion.equals(that.idResponsableSeleccion) : that.idResponsableSeleccion != null)
            return false;
        if (formaReclutamiento != null ? !formaReclutamiento.equals(that.formaReclutamiento) : that.formaReclutamiento != null)
            return false;
        if (idFormaReclutamiento != null ? !idFormaReclutamiento.equals(that.idFormaReclutamiento) : that.idFormaReclutamiento != null)
            return false;
        if (estructuraOrganizacional != null ? !estructuraOrganizacional.equals(that.estructuraOrganizacional) : that.estructuraOrganizacional != null)
            return false;
        if (idEstructuraOrganizacional != null ? !idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional) : that.idEstructuraOrganizacional != null)
            return false;
        if (zona != null ? !zona.equals(that.zona) : that.zona != null) return false;
        if (idZona != null ? !idZona.equals(that.idZona) : that.idZona != null) return false;
        if (estructuraFisica != null ? !estructuraFisica.equals(that.estructuraFisica) : that.estructuraFisica != null)
            return false;
        if (idEstructuraFisica != null ? !idEstructuraFisica.equals(that.idEstructuraFisica) : that.idEstructuraFisica != null)
            return false;
        if (fechaSolicitud != null ? !fechaSolicitud.equals(that.fechaSolicitud) : that.fechaSolicitud != null)
            return false;
        if (indicadorAutorizacion != null ? !indicadorAutorizacion.equals(that.indicadorAutorizacion) : that.indicadorAutorizacion != null)
            return false;
        if (indicadorAumentoPlazas != null ? !indicadorAumentoPlazas.equals(that.indicadorAumentoPlazas) : that.indicadorAumentoPlazas != null)
            return false;
        if (cargoJefe != null ? !cargoJefe.equals(that.cargoJefe) : that.cargoJefe != null) return false;
        if (idJefe != null ? !idJefe.equals(that.idJefe) : that.idJefe != null) return false;
        if (categoria != null ? !categoria.equals(that.categoria) : that.categoria != null) return false;
        if (idCategoria != null ? !idCategoria.equals(that.idCategoria) : that.idCategoria != null) return false;
        if (tipoSolicitud != null ? !tipoSolicitud.equals(that.tipoSolicitud) : that.tipoSolicitud != null)
            return false;
        if (idTipoSolicitud != null ? !idTipoSolicitud.equals(that.idTipoSolicitud) : that.idTipoSolicitud != null)
            return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimiento != null ? idRequerimiento.hashCode() : 0;
        result = 31 * result + (nombreSolicitante != null ? nombreSolicitante.hashCode() : 0);
        result = 31 * result + (idSolicitante != null ? idSolicitante.hashCode() : 0);
        result = 31 * result + (justificacion != null ? justificacion.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        result = 31 * result + (formaContratacion != null ? formaContratacion.hashCode() : 0);
        result = 31 * result + (idFormaContratacion != null ? idFormaContratacion.hashCode() : 0);
        result = 31 * result + (tipoContratacion != null ? tipoContratacion.hashCode() : 0);
        result = 31 * result + (idTipoContratacion != null ? idTipoContratacion.hashCode() : 0);
        result = 31 * result + (cantidadVacantes != null ? cantidadVacantes.hashCode() : 0);
        result = 31 * result + (cantidadConvocados != null ? cantidadConvocados.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (nombreResponsableSeleccion != null ? nombreResponsableSeleccion.hashCode() : 0);
        result = 31 * result + (idResponsableSeleccion != null ? idResponsableSeleccion.hashCode() : 0);
        result = 31 * result + (formaReclutamiento != null ? formaReclutamiento.hashCode() : 0);
        result = 31 * result + (idFormaReclutamiento != null ? idFormaReclutamiento.hashCode() : 0);
        result = 31 * result + (estructuraOrganizacional != null ? estructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (zona != null ? zona.hashCode() : 0);
        result = 31 * result + (idZona != null ? idZona.hashCode() : 0);
        result = 31 * result + (estructuraFisica != null ? estructuraFisica.hashCode() : 0);
        result = 31 * result + (idEstructuraFisica != null ? idEstructuraFisica.hashCode() : 0);
        result = 31 * result + (fechaSolicitud != null ? fechaSolicitud.hashCode() : 0);
        result = 31 * result + (indicadorAutorizacion != null ? indicadorAutorizacion.hashCode() : 0);
        result = 31 * result + (indicadorAumentoPlazas != null ? indicadorAumentoPlazas.hashCode() : 0);
        result = 31 * result + (cargoJefe != null ? cargoJefe.hashCode() : 0);
        result = 31 * result + (idJefe != null ? idJefe.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        result = 31 * result + (idCategoria != null ? idCategoria.hashCode() : 0);
        result = 31 * result + (tipoSolicitud != null ? tipoSolicitud.hashCode() : 0);
        result = 31 * result + (idTipoSolicitud != null ? idTipoSolicitud.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        return result;
    }
}
