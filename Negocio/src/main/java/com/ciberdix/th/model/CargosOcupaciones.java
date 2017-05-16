package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/6/2017.
 */
public class CargosOcupaciones {
    private Integer idCargoOcupacion;
    private Integer idCargo;
    private Integer idOcupacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoOcupacion() {
        return idCargoOcupacion;
    }

    public void setIdCargoOcupacion(Integer idCargoOcupacion) {
        this.idCargoOcupacion = idCargoOcupacion;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(Integer idOcupacion) {
        this.idOcupacion = idOcupacion;
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
