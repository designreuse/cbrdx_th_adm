package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 19/05/2017.
 */
public class VRequerimientosCuestionarios {

    private Integer idRequerimientoCuestionario;
    private Integer idRequerimiento;
    private String cuestionario;
    private Integer idCuestionario;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    public Integer getIdRequerimientoCuestionario() {
        return idRequerimientoCuestionario;
    }

    public void setIdRequerimientoCuestionario(Integer idRequerimientoCuestionario) {
        this.idRequerimientoCuestionario = idRequerimientoCuestionario;
    }

    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(String cuestionario) {
        this.cuestionario = cuestionario;
    }

    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
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

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
