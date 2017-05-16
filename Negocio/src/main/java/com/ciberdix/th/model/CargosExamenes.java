package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 9/04/17.
 */
public class CargosExamenes {
    private Integer idCargoExamen;
    private Integer idCargo;
    private Integer idExamen;
    private Boolean indicadorIngreso;
    private Boolean indicadorPeriodicidad;
    private Boolean indicadorRetiro;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoExamen() {
        return idCargoExamen;
    }

    public void setIdCargoExamen(Integer idCargoExamen) {
        this.idCargoExamen = idCargoExamen;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public Boolean getIndicadorIngreso() {
        return indicadorIngreso;
    }

    public void setIndicadorIngreso(Boolean indicadorIngreso) {
        this.indicadorIngreso = indicadorIngreso;
    }

    public Boolean getIndicadorPeriodicidad() {
        return indicadorPeriodicidad;
    }

    public void setIndicadorPeriodicidad(Boolean indicadorPeriodicidad) {
        this.indicadorPeriodicidad = indicadorPeriodicidad;
    }

    public Boolean getIndicadorRetiro() {
        return indicadorRetiro;
    }

    public void setIndicadorRetiro(Boolean indicadorRetiro) {
        this.indicadorRetiro = indicadorRetiro;
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
