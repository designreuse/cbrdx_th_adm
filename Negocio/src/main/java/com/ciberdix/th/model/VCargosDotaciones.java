package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 17/07/2017.
 */
public class VCargosDotaciones {

    private Integer idCargoDotacion;
    private String cargo;
    private Integer idCargo;
    private String grupoDotacion;
    private Integer idGrupoDotacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoDotacion() {
        return idCargoDotacion;
    }

    public void setIdCargoDotacion(Integer idCargoDotacion) {
        this.idCargoDotacion = idCargoDotacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getGrupoDotacion() {
        return grupoDotacion;
    }

    public void setGrupoDotacion(String grupoDotacion) {
        this.grupoDotacion = grupoDotacion;
    }

    public Integer getIdGrupoDotacion() {
        return idGrupoDotacion;
    }

    public void setIdGrupoDotacion(Integer idGrupoDotacion) {
        this.idGrupoDotacion = idGrupoDotacion;
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
