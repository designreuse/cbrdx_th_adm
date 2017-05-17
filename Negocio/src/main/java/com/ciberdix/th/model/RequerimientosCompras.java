package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 17/05/2017.
 */
public class RequerimientosCompras {

    private Integer idRequerimientoCompra;
    private Integer idRequerimiento;
    private Integer idCompra;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRequerimientoCompra() {
        return idRequerimientoCompra;
    }

    public void setIdRequerimientoCompra(Integer idRequerimientoCompra) {
        this.idRequerimientoCompra = idRequerimientoCompra;
    }

    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
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
