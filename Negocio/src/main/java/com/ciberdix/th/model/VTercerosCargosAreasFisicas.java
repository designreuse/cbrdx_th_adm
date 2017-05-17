package com.ciberdix.th.model;

/**
 * Created by Danny on 17/05/2017.
 */
public class VTercerosCargosAreasFisicas {

    private Long idTercero;
    private String nombreCompleto;
    private String cargo;
    private String area;
    private String direccionGeneral;
    private String correoTercero;
    private String correoUsuario;

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDireccionGeneral() {
        return direccionGeneral;
    }

    public void setDireccionGeneral(String direccionGeneral) {
        this.direccionGeneral = direccionGeneral;
    }

    public String getCorreoTercero() {
        return correoTercero;
    }

    public void setCorreoTercero(String correoTercero) {
        this.correoTercero = correoTercero;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
}
