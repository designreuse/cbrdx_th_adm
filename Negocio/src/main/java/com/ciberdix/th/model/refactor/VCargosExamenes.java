package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
public class VCargosExamenes {
    private Integer idCargoExamen;
    private Integer idCargo;
    private String cargo;
    private Integer idExamen;
    private String examen;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
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
