package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class CargosPersonalidadAtributos {
    private Integer idCargoPersonalidadAtributo;
    private Integer idCargo;
    private Integer idAtributo;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoPersonalidadAtributo() {
        return idCargoPersonalidadAtributo;
    }

    public void setIdCargoPersonalidadAtributo(Integer idCargoPersonalidadAtributo) {
        this.idCargoPersonalidadAtributo = idCargoPersonalidadAtributo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdAtributo() {
        return idAtributo;
    }

    public void setIdAtributo(Integer idAtributo) {
        this.idAtributo = idAtributo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
