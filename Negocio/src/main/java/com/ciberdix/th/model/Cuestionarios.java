package com.ciberdix.th.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Danny on 31/05/2017.
 */
public class Cuestionarios {

    private Integer idCuestionario;
    private String codigoCuestionario;
    private String cuestionario;
    private String descripcion;
    private Boolean indicadorPonderacion;
    private BigDecimal valor;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    public String getCodigoCuestionario() {
        return codigoCuestionario;
    }

    public void setCodigoCuestionario(String codigoCuestionario) {
        this.codigoCuestionario = codigoCuestionario;
    }

    public String getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(String cuestionario) {
        this.cuestionario = cuestionario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getIndicadorPonderacion() {
        return indicadorPonderacion;
    }

    public void setIndicadorPonderacion(Boolean indicadorPonderacion) {
        this.indicadorPonderacion = indicadorPonderacion;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
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
