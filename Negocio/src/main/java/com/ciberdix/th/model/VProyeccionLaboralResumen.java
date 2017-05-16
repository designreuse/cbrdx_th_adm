package com.ciberdix.th.model;

/**
 * Created by felip on 21/04/2017.
 */
public class VProyeccionLaboralResumen {
    private Long idProyeccionLaboralResumen;
    private Integer idArea;
    private String area;
    private String estado;
    private Integer cantidad;

    public Long getIdProyeccionLaboralResumen() {
        return idProyeccionLaboralResumen;
    }

    public void setIdProyeccionLaboralResumen(Long idProyeccionLaboralResumen) {
        this.idProyeccionLaboralResumen = idProyeccionLaboralResumen;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
