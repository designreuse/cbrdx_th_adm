package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/6/2017.
 */
public class CargosProductividades {
    private Integer idCargoProductividad;
    private Integer idCargo;
    private Integer idProductividad;
    private Integer idProductividadIq;
    private Integer idProductividadAptitud;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoProductividad() {
        return idCargoProductividad;
    }

    public void setIdCargoProductividad(Integer idCargoProductividad) {
        this.idCargoProductividad = idCargoProductividad;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdProductividad() {
        return idProductividad;
    }

    public void setIdProductividad(Integer idProductividad) {
        this.idProductividad = idProductividad;
    }

    public Integer getIdProductividadIq() {
        return idProductividadIq;
    }

    public void setIdProductividadIq(Integer idProductividadIq) {
        this.idProductividadIq = idProductividadIq;
    }

    public Integer getIdProductividadAptitud() {
        return idProductividadAptitud;
    }

    public void setIdProductividadAptitud(Integer idProductividadAptitud) {
        this.idProductividadAptitud = idProductividadAptitud;
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
