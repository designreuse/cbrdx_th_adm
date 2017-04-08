package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
public class CargosEstadosObservaciones {
    private Integer idCargoEstadoObservacion;
    private Integer idCargo;
    private Integer idEstadoCargo;
    private String observacion;
    private Integer idUsuario;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoEstadoObservacion() {
        return idCargoEstadoObservacion;
    }

    public void setIdCargoEstadoObservacion(Integer idCargoEstadoObservacion) {
        this.idCargoEstadoObservacion = idCargoEstadoObservacion;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdEstadoCargo() {
        return idEstadoCargo;
    }

    public void setIdEstadoCargo(Integer idEstadoCargo) {
        this.idEstadoCargo = idEstadoCargo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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
