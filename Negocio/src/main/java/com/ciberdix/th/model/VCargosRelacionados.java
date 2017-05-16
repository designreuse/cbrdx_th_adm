package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 4/05/2017.
 */
public class VCargosRelacionados {

    private int idCargoRelacionado;
    private int idTipoRelacion;
    private int idCargo;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String cargo;
    private Integer idCargoRelacion;
    private Boolean indicadorHabilitado;

    public int getIdCargoRelacionado() {
        return idCargoRelacionado;
    }

    public void setIdCargoRelacionado(int idCargoRelacionado) {
        this.idCargoRelacionado = idCargoRelacionado;
    }

    public int getIdTipoRelacion() {
        return idTipoRelacion;
    }

    public void setIdTipoRelacion(int idTipoRelacion) {
        this.idTipoRelacion = idTipoRelacion;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdCargoRelacion() {
        return idCargoRelacion;
    }

    public void setIdCargoRelacion(Integer idCargoRelacion) {
        this.idCargoRelacion = idCargoRelacion;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
