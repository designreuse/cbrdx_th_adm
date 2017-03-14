package com.ciberdix.th.model;
import java.sql.Date;
import java.sql.Timestamp;
public class TerceroCargo {

    private Integer idTerceroCargo;
    private Integer idSede;
    private Integer idArea;
    private Integer idCargo;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private Integer idTipoContrato;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idTercero;
    private Cargo cargo;

    public TerceroCargo(Integer idTerceroCargo, Integer idSede, Integer idArea, Integer idCargo, Timestamp fechaInicio, Timestamp fechaFin, Integer idTipoContrato, Integer auditoriaUsuario, Timestamp auditoriaFecha, Integer idTercero) {
        this.idTerceroCargo = idTerceroCargo;
        this.idSede = idSede;
        this.idArea = idArea;
        this.idCargo = idCargo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idTipoContrato = idTipoContrato;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
        this.idTercero = idTercero;
    }


    public Integer getIdTerceroCargo() {
        return idTerceroCargo;
    }

    public void setIdTerceroCargo(Integer idTerceroCargo) {
        this.idTerceroCargo = idTerceroCargo;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(Integer idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
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

    public Integer getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Integer idTercero) {
        this.idTercero = idTercero;
    }
}
