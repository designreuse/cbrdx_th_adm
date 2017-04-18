package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 18/04/17.
 */
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

    public Integer getIdEstructuraOrganizacionalCargo() {
        return idEstructuraOrganizacionalCargo;
    }

    public void setIdEstructuraOrganizacionalCargo(Integer idEstructuraOrganizacionalCargo) {
        this.idEstructuraOrganizacionalCargo = idEstructuraOrganizacionalCargo;
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

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Integer getPlazas() {
        return plazas;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
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
