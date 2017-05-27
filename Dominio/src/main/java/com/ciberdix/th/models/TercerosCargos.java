package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "TercerosCargos", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosCargos {
    private Integer idTerceroCargo;
    private Long idTercero;
    private Integer idEstructuraOrganizacionalCargo;
    private Date asignadoDesde;
    private Integer idTipoContrato;
    private Integer idZona;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    public TercerosCargos() {
    }


    public TercerosCargos(Long idTercero, Integer idEstructuraOrganizacionalCargo, Date asignadoDesde, Integer idTipoContrato, Integer idZona, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTercero = idTercero;
        this.idEstructuraOrganizacionalCargo = idEstructuraOrganizacionalCargo;
        this.asignadoDesde = asignadoDesde;
        this.idTipoContrato = idTipoContrato;
        this.idZona = idZona;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosCargos(Integer idTerceroCargo, Long idTercero, Integer idEstructuraOrganizacionalCargo, Date asignadoDesde, Integer idTipoContrato, Integer idZona, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroCargo = idTerceroCargo;
        this.idTercero = idTercero;
        this.idEstructuraOrganizacionalCargo = idEstructuraOrganizacionalCargo;
        this.asignadoDesde = asignadoDesde;
        this.idTipoContrato = idTipoContrato;
        this.idZona = idZona;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public void setAsignadoDesde(java.sql.Date asignadoDesde) {
        this.asignadoDesde = asignadoDesde;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroCargo", nullable = false)
    public Integer getIdTerceroCargo() {
        return idTerceroCargo;
    }

    public void setIdTerceroCargo(Integer idTerceroCargo) {
        this.idTerceroCargo = idTerceroCargo;
    }

    @Basic
    @Column(name = "IdTipoContrato", nullable = true)
    public Integer getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(Integer idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
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
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosCargos that = (TercerosCargos) o;

        if (idTerceroCargo != null ? !idTerceroCargo.equals(that.idTerceroCargo) : that.idTerceroCargo != null)
            return false;
        if (idTipoContrato != null ? !idTipoContrato.equals(that.idTipoContrato) : that.idTipoContrato != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroCargo != null ? idTerceroCargo.hashCode() : 0;
        result = 31 * result + (idTipoContrato != null ? idTipoContrato.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacionalCargo", nullable = true)
    public Integer getIdEstructuraOrganizacionalCargo() {
        return idEstructuraOrganizacionalCargo;
    }

    public void setIdEstructuraOrganizacionalCargo(Integer idEstructuraOrganizacionalCargo) {
        this.idEstructuraOrganizacionalCargo = idEstructuraOrganizacionalCargo;
    }

    @Basic
    @Column(name = "AsignadoDesde", nullable = true)
    public Date getAsignadoDesde() {
        return asignadoDesde;
    }

    public void setAsignadoDesde(Date asignadoDesde) {
        this.asignadoDesde = asignadoDesde;
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
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
