package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_EstructuraOrganizacionalCargos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class VEstructuraOrganizacionalCargos {
    private Integer idEstructuraOrganizacionalCargo;
    private Integer idEstructuraOrganizacional;
    private String estructuraOrganizacional;
    private Integer idCargo;
    private String cargo;
    private Integer salario;
    private Integer plazas;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer ocupados;

    @Id
    @Column(name = "IdEstructuraOrganizacionalCargo")
    public Integer getIdEstructuraOrganizacionalCargo() {
        return idEstructuraOrganizacionalCargo;
    }

    public void setIdEstructuraOrganizacionalCargo(Integer idEstructuraOrganizacionalCargo) {
        this.idEstructuraOrganizacionalCargo = idEstructuraOrganizacionalCargo;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacional")
    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    @Basic
    @Column(name = "EstructuraOrganizacional")
    public String getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }

    public void setEstructuraOrganizacional(String estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
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
    @Column(name = "Salario")
    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "Plazas")
    public Integer getPlazas() {
        return plazas;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
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
    @Column(name = "Ocupados")
    public Integer getOcupados() {
        return ocupados;
    }

    public void setOcupados(Integer ocupados) {
        this.ocupados = ocupados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VEstructuraOrganizacionalCargos that = (VEstructuraOrganizacionalCargos) o;

        if (idEstructuraOrganizacionalCargo != null ? !idEstructuraOrganizacionalCargo.equals(that.idEstructuraOrganizacionalCargo) : that.idEstructuraOrganizacionalCargo != null)
            return false;
        if (idEstructuraOrganizacional != null ? !idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional) : that.idEstructuraOrganizacional != null)
            return false;
        if (estructuraOrganizacional != null ? !estructuraOrganizacional.equals(that.estructuraOrganizacional) : that.estructuraOrganizacional != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (salario != null ? !salario.equals(that.salario) : that.salario != null) return false;
        if (plazas != null ? !plazas.equals(that.plazas) : that.plazas != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (ocupados != null ? !ocupados.equals(that.ocupados) : that.ocupados != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEstructuraOrganizacionalCargo != null ? idEstructuraOrganizacionalCargo.hashCode() : 0;
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (estructuraOrganizacional != null ? estructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (salario != null ? salario.hashCode() : 0);
        result = 31 * result + (plazas != null ? plazas.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (ocupados != null ? ocupados.hashCode() : 0);
        return result;
    }
}
