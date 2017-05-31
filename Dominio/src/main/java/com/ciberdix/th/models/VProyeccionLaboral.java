package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_ProyeccionLaboral", schema = "dbo", catalog = "CREZCAMOS")
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
    private Integer anio;
    private String observacion;
    private String observacionAprobacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdProyecccionLaboral", nullable = false)
    public Integer getIdProyecccionLaboral() {
        return idProyecccionLaboral;
    }

    public void setIdProyecccionLaboral(Integer idProyecccionLaboral) {
        this.idProyecccionLaboral = idProyecccionLaboral;
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
    @Column(name = "EstructuraOrganizacional", nullable = true, length = 50)
    public String getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }

    public void setEstructuraOrganizacional(String estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
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
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "PlazasActuales", nullable = true)
    public Integer getPlazasActuales() {
        return plazasActuales;
    }

    public void setPlazasActuales(Integer plazasActuales) {
        this.plazasActuales = plazasActuales;
    }

    @Basic
    @Column(name = "PlazasProyectadas", nullable = true)
    public Integer getPlazasProyectadas() {
        return plazasProyectadas;
    }

    public void setPlazasProyectadas(Integer plazasProyectadas) {
        this.plazasProyectadas = plazasProyectadas;
    }

    @Basic
    @Column(name = "CostoActual", nullable = true, precision = 0)
    public Double getCostoActual() {
        return costoActual;
    }

    public void setCostoActual(Double costoActual) {
        this.costoActual = costoActual;
    }

    @Basic
    @Column(name = "CostoProyectado", nullable = true, precision = 0)
    public Double getCostoProyectado() {
        return costoProyectado;
    }

    public void setCostoProyectado(Double costoProyectado) {
        this.costoProyectado = costoProyectado;
    }

    @Basic
    @Column(name = "IdEstadoProyeccion", nullable = true)
    public Integer getIdEstadoProyeccion() {
        return idEstadoProyeccion;
    }

    public void setIdEstadoProyeccion(Integer idEstadoProyeccion) {
        this.idEstadoProyeccion = idEstadoProyeccion;
    }

    @Basic
    @Column(name = "EstadoProyeccion", nullable = true, length = 100)
    public String getEstadoProyeccion() {
        return estadoProyeccion;
    }

    public void setEstadoProyeccion(String estadoProyeccion) {
        this.estadoProyeccion = estadoProyeccion;
    }

    @Basic
    @Column(name = "IdUsuarioProyecta", nullable = true)
    public Integer getIdUsuarioProyecta() {
        return idUsuarioProyecta;
    }

    public void setIdUsuarioProyecta(Integer idUsuarioProyecta) {
        this.idUsuarioProyecta = idUsuarioProyecta;
    }

    @Basic
    @Column(name = "UsuarioProyecta", nullable = false, length = 259)
    public String getUsuarioProyecta() {
        return usuarioProyecta;
    }

    public void setUsuarioProyecta(String usuarioProyecta) {
        this.usuarioProyecta = usuarioProyecta;
    }

    @Basic
    @Column(name = "IdUsuarioAprueba", nullable = true)
    public Integer getIdUsuarioAprueba() {
        return idUsuarioAprueba;
    }

    public void setIdUsuarioAprueba(Integer idUsuarioAprueba) {
        this.idUsuarioAprueba = idUsuarioAprueba;
    }

    @Basic
    @Column(name = "UsuarioAprueba", nullable = true, length = 259)
    public String getUsuarioAprueba() {
        return usuarioAprueba;
    }

    public void setUsuarioAprueba(String usuarioAprueba) {
        this.usuarioAprueba = usuarioAprueba;
    }

    @Basic
    @Column(name = "Observacion", nullable = true, length = 500)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "ObservacionAprobacion", nullable = true, length = 500)
    public String getObservacionAprobacion() {
        return observacionAprobacion;
    }

    public void setObservacionAprobacion(String observacionAprobacion) {
        this.observacionAprobacion = observacionAprobacion;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "Año", nullable = true)
    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VProyeccionLaboral that = (VProyeccionLaboral) o;

        if (idProyecccionLaboral != null ? !idProyecccionLaboral.equals(that.idProyecccionLaboral) : that.idProyecccionLaboral != null)
            return false;
        if (idEstructuraOrganizacional != null ? !idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional) : that.idEstructuraOrganizacional != null)
            return false;
        if (estructuraOrganizacional != null ? !estructuraOrganizacional.equals(that.estructuraOrganizacional) : that.estructuraOrganizacional != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (plazasActuales != null ? !plazasActuales.equals(that.plazasActuales) : that.plazasActuales != null)
            return false;
        if (plazasProyectadas != null ? !plazasProyectadas.equals(that.plazasProyectadas) : that.plazasProyectadas != null)
            return false;
        if (costoActual != null ? !costoActual.equals(that.costoActual) : that.costoActual != null) return false;
        if (costoProyectado != null ? !costoProyectado.equals(that.costoProyectado) : that.costoProyectado != null)
            return false;
        if (idEstadoProyeccion != null ? !idEstadoProyeccion.equals(that.idEstadoProyeccion) : that.idEstadoProyeccion != null)
            return false;
        if (estadoProyeccion != null ? !estadoProyeccion.equals(that.estadoProyeccion) : that.estadoProyeccion != null)
            return false;
        if (idUsuarioProyecta != null ? !idUsuarioProyecta.equals(that.idUsuarioProyecta) : that.idUsuarioProyecta != null)
            return false;
        if (usuarioProyecta != null ? !usuarioProyecta.equals(that.usuarioProyecta) : that.usuarioProyecta != null)
            return false;
        if (idUsuarioAprueba != null ? !idUsuarioAprueba.equals(that.idUsuarioAprueba) : that.idUsuarioAprueba != null)
            return false;
        if (usuarioAprueba != null ? !usuarioAprueba.equals(that.usuarioAprueba) : that.usuarioAprueba != null)
            return false;
        if (anio != null ? !anio.equals(that.anio) : that.anio != null) return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (observacionAprobacion != null ? !observacionAprobacion.equals(that.observacionAprobacion) : that.observacionAprobacion != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProyecccionLaboral != null ? idProyecccionLaboral.hashCode() : 0;
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (estructuraOrganizacional != null ? estructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (plazasActuales != null ? plazasActuales.hashCode() : 0);
        result = 31 * result + (plazasProyectadas != null ? plazasProyectadas.hashCode() : 0);
        result = 31 * result + (costoActual != null ? costoActual.hashCode() : 0);
        result = 31 * result + (costoProyectado != null ? costoProyectado.hashCode() : 0);
        result = 31 * result + (idEstadoProyeccion != null ? idEstadoProyeccion.hashCode() : 0);
        result = 31 * result + (estadoProyeccion != null ? estadoProyeccion.hashCode() : 0);
        result = 31 * result + (idUsuarioProyecta != null ? idUsuarioProyecta.hashCode() : 0);
        result = 31 * result + (usuarioProyecta != null ? usuarioProyecta.hashCode() : 0);
        result = 31 * result + (idUsuarioAprueba != null ? idUsuarioAprueba.hashCode() : 0);
        result = 31 * result + (usuarioAprueba != null ? usuarioAprueba.hashCode() : 0);
        result = 31 * result + (anio != null ? anio.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (observacionAprobacion != null ? observacionAprobacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }

}
