package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
public class CargosResponsabilidades {
    private Integer idCargoResponsabilidad;
    private Integer idResponsabilidad;
    private Integer idCargo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoResponsabilidad() {
        return idCargoResponsabilidad;
    }

    public void setIdCargoResponsabilidad(Integer idCargoResponsabilidad) {
        this.idCargoResponsabilidad = idCargoResponsabilidad;
    }

    public Integer getIdResponsabilidad() {
        return idResponsabilidad;
    }

    public void setIdResponsabilidad(Integer idResponsabilidad) {
        this.idResponsabilidad = idResponsabilidad;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
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
