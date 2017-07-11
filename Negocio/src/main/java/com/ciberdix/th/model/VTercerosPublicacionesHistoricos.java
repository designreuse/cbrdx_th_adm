package com.ciberdix.th.model;

import java.util.Date;

/**
 * Created by Danny on 10/07/2017.
 */
public class VTercerosPublicacionesHistoricos {

    private Long idTercero;
    private String cargo;
    private Date fechaInicio;
    private String estado;
    private String responsableSeleccion;
    private String codigo;

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getResponsableSeleccion() {
        return responsableSeleccion;
    }

    public void setResponsableSeleccion(String responsableSeleccion) {
        this.responsableSeleccion = responsableSeleccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
