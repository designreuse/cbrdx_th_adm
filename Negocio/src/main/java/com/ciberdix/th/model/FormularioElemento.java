package com.ciberdix.th.model;

import java.sql.Timestamp;

public class FormularioElemento {
    private Integer idFormularioElemento;
    private Integer idFormulario;
    private String formularioElemento;
    private String etiqueta;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdFormularioElemento() {
        return idFormularioElemento;
    }

    public void setIdFormularioElemento(Integer idFormularioElemento) {
        this.idFormularioElemento = idFormularioElemento;
    }

    public Integer getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(Integer idFormulario) {
        this.idFormulario = idFormulario;
    }

    public String getFormularioElemento() {
        return formularioElemento;
    }

    public void setFormularioElemento(String formularioElemento) {
        this.formularioElemento = formularioElemento;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
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
