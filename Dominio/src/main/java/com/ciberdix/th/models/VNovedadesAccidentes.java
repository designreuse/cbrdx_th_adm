package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "V_NovedadesAccidentes", schema = "dbo", catalog = "CREZCAMOS")
public class VNovedadesAccidentes {
    private Integer idNovedadAccidente;
    private String nombreTercero;
    private String tipoDocumento;
    private Integer idTipoDocumento;
    private String numeroDocumento;
    private String cargo;
    private String estructuraOrganizacional;
    private String estructuraArea;
    private Date fechaAccidente;
    private String tipoNovedad;
    private Integer idTerceroNovedad;
    private String estadoAccidente;
    private Integer idEstadoAccidente;
    private Boolean indicadorActividades;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdNovedadAccidente", nullable = false)
    public Integer getIdNovedadAccidente() {
        return idNovedadAccidente;
    }

    public void setIdNovedadAccidente(Integer idNovedadAccidente) {
        this.idNovedadAccidente = idNovedadAccidente;
    }

    @Basic
    @Column(name = "NombreTercero", nullable = false, length = 259)
    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    @Basic
    @Column(name = "TipoDocumento", nullable = true, length = 100)
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Basic
    @Column(name = "IdTipoDocumento", nullable = true)
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Basic
    @Column(name = "NumeroDocumento", nullable = true, length = 13)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
    @Column(name = "EstructuraOrganizacional", nullable = true, length = 50)
    public String getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }

    public void setEstructuraOrganizacional(String estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
    }

    @Basic
    @Column(name = "EstructuraArea", nullable = true, length = 40)
    public String getEstructuraArea() {
        return estructuraArea;
    }

    public void setEstructuraArea(String estructuraArea) {
        this.estructuraArea = estructuraArea;
    }

    @Basic
    @Column(name = "FechaAccidente", nullable = true)
    public Date getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(Date fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    @Basic
    @Column(name = "TipoNovedad", nullable = true, length = 100)
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    @Basic
    @Column(name = "IdTerceroNovedad", nullable = true)
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "EstadoAccidente", nullable = true, length = 100)
    public String getEstadoAccidente() {
        return estadoAccidente;
    }

    public void setEstadoAccidente(String estadoAccidente) {
        this.estadoAccidente = estadoAccidente;
    }

    @Basic
    @Column(name = "IdEstadoAccidente", nullable = true)
    public Integer getIdEstadoAccidente() {
        return idEstadoAccidente;
    }

    public void setIdEstadoAccidente(Integer idEstadoAccidente) {
        this.idEstadoAccidente = idEstadoAccidente;
    }

    @Basic
    @Column(name = "IndicadorActividades", nullable = true)
    public Boolean getIndicadorActividades() {
        return indicadorActividades;
    }

    public void setIndicadorActividades(Boolean indicadorActividades) {
        this.indicadorActividades = indicadorActividades;
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

        VNovedadesAccidentes that = (VNovedadesAccidentes) o;

        if (idNovedadAccidente != null ? !idNovedadAccidente.equals(that.idNovedadAccidente) : that.idNovedadAccidente != null)
            return false;
        if (nombreTercero != null ? !nombreTercero.equals(that.nombreTercero) : that.nombreTercero != null)
            return false;
        if (tipoDocumento != null ? !tipoDocumento.equals(that.tipoDocumento) : that.tipoDocumento != null)
            return false;
        if (idTipoDocumento != null ? !idTipoDocumento.equals(that.idTipoDocumento) : that.idTipoDocumento != null)
            return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null)
            return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (estructuraOrganizacional != null ? !estructuraOrganizacional.equals(that.estructuraOrganizacional) : that.estructuraOrganizacional != null)
            return false;
        if (estructuraArea != null ? !estructuraArea.equals(that.estructuraArea) : that.estructuraArea != null)
            return false;
        if (fechaAccidente != null ? !fechaAccidente.equals(that.fechaAccidente) : that.fechaAccidente != null)
            return false;
        if (tipoNovedad != null ? !tipoNovedad.equals(that.tipoNovedad) : that.tipoNovedad != null) return false;
        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (estadoAccidente != null ? !estadoAccidente.equals(that.estadoAccidente) : that.estadoAccidente != null)
            return false;
        if (idEstadoAccidente != null ? !idEstadoAccidente.equals(that.idEstadoAccidente) : that.idEstadoAccidente != null)
            return false;
        if (indicadorActividades != null ? !indicadorActividades.equals(that.indicadorActividades) : that.indicadorActividades != null)
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
        int result = idNovedadAccidente != null ? idNovedadAccidente.hashCode() : 0;
        result = 31 * result + (nombreTercero != null ? nombreTercero.hashCode() : 0);
        result = 31 * result + (tipoDocumento != null ? tipoDocumento.hashCode() : 0);
        result = 31 * result + (idTipoDocumento != null ? idTipoDocumento.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (estructuraOrganizacional != null ? estructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (estructuraArea != null ? estructuraArea.hashCode() : 0);
        result = 31 * result + (fechaAccidente != null ? fechaAccidente.hashCode() : 0);
        result = 31 * result + (tipoNovedad != null ? tipoNovedad.hashCode() : 0);
        result = 31 * result + (idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0);
        result = 31 * result + (estadoAccidente != null ? estadoAccidente.hashCode() : 0);
        result = 31 * result + (idEstadoAccidente != null ? idEstadoAccidente.hashCode() : 0);
        result = 31 * result + (indicadorActividades != null ? indicadorActividades.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
