package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 1/06/2017.
 */
public class VCargosCompetencias {

    private Integer idCargoCompetencia;
    private String cargo;
    private Integer idCargo;
    private String competencia;
    private String descripcion;
    private Integer idCompetencia;
    private String ponderacion;
    private Integer idPonderacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoCompetencia() {
        return idCargoCompetencia;
    }

    public void setIdCargoCompetencia(Integer idCargoCompetencia) {
        this.idCargoCompetencia = idCargoCompetencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Integer idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }

    public Integer getIdPonderacion() {
        return idPonderacion;
    }

    public void setIdPonderacion(Integer idPonderacion) {
        this.idPonderacion = idPonderacion;
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
