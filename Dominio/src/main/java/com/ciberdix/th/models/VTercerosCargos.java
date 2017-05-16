package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_TercerosCargos", schema = "crz_th", catalog = "CREZCAMOS")
public class VTercerosCargos {
    private Integer idTerceroCargo;
    private Integer idEstructuraOrganizacionalCargo;
    private Integer idCargo;
    private String cargo;
    private Long idTercero;
    private String primerNombre;
    private String primerApellido;
    private String segundoNombre;
    private String segundoApellido;
    private Integer idTipoContrato;
    private String tipoContrato;
    private Integer idZona;
    private String zona;
    private Date asignadoDesde;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idEstructuraOrganizacional;

    @Id
    @Column(name = "IdTerceroCargo")
    public Integer getIdTerceroCargo() {
        return idTerceroCargo;
    }

    public void setIdTerceroCargo(Integer idTerceroCargo) {
        this.idTerceroCargo = idTerceroCargo;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacionalCargo")
    public Integer getIdEstructuraOrganizacionalCargo() {
        return idEstructuraOrganizacionalCargo;
    }

    public void setIdEstructuraOrganizacionalCargo(Integer idEstructuraOrganizacionalCargo) {
        this.idEstructuraOrganizacionalCargo = idEstructuraOrganizacionalCargo;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "Cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "PrimerNombre")
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Basic
    @Column(name = "PrimerApellido")
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Basic
    @Column(name = "SegundoNombre")
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Basic
    @Column(name = "SegundoApellido")
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Basic
    @Column(name = "IdTipoContrato")
    public Integer getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(Integer idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    @Basic
    @Column(name = "TipoContrato")
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Basic
    @Column(name = "IdZona")
    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    @Basic
    @Column(name = "Zona")
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Basic
    @Column(name = "AsignadoDesde")
    public Date getAsignadoDesde() {
        return asignadoDesde;
    }

    public void setAsignadoDesde(Date asignadoDesde) {
        this.asignadoDesde = asignadoDesde;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacional")
    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTercerosCargos that = (VTercerosCargos) o;

        if (idTerceroCargo != null ? !idTerceroCargo.equals(that.idTerceroCargo) : that.idTerceroCargo != null)
            return false;
        if (idEstructuraOrganizacionalCargo != null ? !idEstructuraOrganizacionalCargo.equals(that.idEstructuraOrganizacionalCargo) : that.idEstructuraOrganizacionalCargo != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (primerNombre != null ? !primerNombre.equals(that.primerNombre) : that.primerNombre != null) return false;
        if (primerApellido != null ? !primerApellido.equals(that.primerApellido) : that.primerApellido != null)
            return false;
        if (segundoNombre != null ? !segundoNombre.equals(that.segundoNombre) : that.segundoNombre != null)
            return false;
        if (segundoApellido != null ? !segundoApellido.equals(that.segundoApellido) : that.segundoApellido != null)
            return false;
        if (idTipoContrato != null ? !idTipoContrato.equals(that.idTipoContrato) : that.idTipoContrato != null)
            return false;
        if (tipoContrato != null ? !tipoContrato.equals(that.tipoContrato) : that.tipoContrato != null) return false;
        if (idZona != null ? !idZona.equals(that.idZona) : that.idZona != null) return false;
        if (zona != null ? !zona.equals(that.zona) : that.zona != null) return false;
        if (asignadoDesde != null ? !asignadoDesde.equals(that.asignadoDesde) : that.asignadoDesde != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idEstructuraOrganizacional != null ? !idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional) : that.idEstructuraOrganizacional != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroCargo != null ? idTerceroCargo.hashCode() : 0;
        result = 31 * result + (idEstructuraOrganizacionalCargo != null ? idEstructuraOrganizacionalCargo.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (primerNombre != null ? primerNombre.hashCode() : 0);
        result = 31 * result + (primerApellido != null ? primerApellido.hashCode() : 0);
        result = 31 * result + (segundoNombre != null ? segundoNombre.hashCode() : 0);
        result = 31 * result + (segundoApellido != null ? segundoApellido.hashCode() : 0);
        result = 31 * result + (idTipoContrato != null ? idTipoContrato.hashCode() : 0);
        result = 31 * result + (tipoContrato != null ? tipoContrato.hashCode() : 0);
        result = 31 * result + (idZona != null ? idZona.hashCode() : 0);
        result = 31 * result + (zona != null ? zona.hashCode() : 0);
        result = 31 * result + (asignadoDesde != null ? asignadoDesde.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        return result;
    }
}
