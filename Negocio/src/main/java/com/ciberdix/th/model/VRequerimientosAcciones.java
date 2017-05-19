package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 18/05/2017.
 */
public class VRequerimientosAcciones {

    private Integer idRequerimientoAccion;
    private Integer idRequerimiento;
    private String accion;
    private Integer idAccion;
    private Integer idRequerimientoHistorico;
    private String observacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRequerimientoAccion() {
        return idRequerimientoAccion;
    }

    public void setIdRequerimientoAccion(Integer idRequerimientoAccion) {
        this.idRequerimientoAccion = idRequerimientoAccion;
    }

    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public Integer getIdRequerimientoHistorico() {
        return idRequerimientoHistorico;
    }

    public void setIdRequerimientoHistorico(Integer idRequerimientoHistorico) {
        this.idRequerimientoHistorico = idRequerimientoHistorico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
