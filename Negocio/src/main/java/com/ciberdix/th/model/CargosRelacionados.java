package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/6/2017.
 */
public class CargosRelacionados {
    private Integer idCargoRelacionado;
    private Integer idTipoRelacion;
    private Integer idCargo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idCargoRelacion;
    private Boolean indicadorHabilitado;

    public Integer getIdCargoRelacionado() {
        return idCargoRelacionado;
    }

    public void setIdCargoRelacionado(Integer idCargoRelacionado) {
        this.idCargoRelacionado = idCargoRelacionado;
    }

    public Integer getIdTipoRelacion() {
        return idTipoRelacion;
    }

    public void setIdTipoRelacion(Integer idTipoRelacion) {
        this.idTipoRelacion = idTipoRelacion;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
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
