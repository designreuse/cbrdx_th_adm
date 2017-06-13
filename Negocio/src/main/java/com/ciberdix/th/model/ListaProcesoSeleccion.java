package com.ciberdix.th.model;

/**
 * Created by Danny on 12/06/2017.
 */
public class ListaProcesoSeleccion {

    private Integer idProcesoSeleccion;
    private Integer idProcesoPaso;
    private String codigoEstadoDiligenciado;
    private String interfaz;
    private String interfazInterna;
    private int orden;

    public ListaProcesoSeleccion() {
    }

    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    public Integer getIdProcesoPaso() {
        return idProcesoPaso;
    }

    public void setIdProcesoPaso(Integer idProcesoPaso) {
        this.idProcesoPaso = idProcesoPaso;
    }

    public String getCodigoEstadoDiligenciado() {
        return codigoEstadoDiligenciado;
    }

    public void setCodigoEstadoDiligenciado(String codigoEstadoDiligenciado) {
        this.codigoEstadoDiligenciado = codigoEstadoDiligenciado;
    }

    public String getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(String interfaz) {
        this.interfaz = interfaz;
    }

    public String getInterfazInterna() {
        return interfazInterna;
    }

    public void setInterfazInterna(String interfazInterna) {
        this.interfazInterna = interfazInterna;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
