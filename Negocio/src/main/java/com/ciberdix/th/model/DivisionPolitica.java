package com.ciberdix.th.model;

import java.sql.Timestamp;

public class DivisionPolitica {

    private Integer idDivisionPolitica;
    private String descripcionDivisionPolitica;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idDivisionPoliticaTipo;
    private Integer idDivisionPoliticaPadre;

    public Integer getIdDivisionPoliticaPadre() {
        return idDivisionPoliticaPadre;
    }

    public void setIdDivisionPoliticaPadre(Integer idDivisionPoliticaPadre) {
        this.idDivisionPoliticaPadre = idDivisionPoliticaPadre;
    }

    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }

    public Integer getIdDivisionPoliticaTipo() {
        return idDivisionPoliticaTipo;
    }

    public void setIdDivisionPoliticaTipo(Integer idDivisionPoliticaTipo) {
        this.idDivisionPoliticaTipo = idDivisionPoliticaTipo;
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

    public String getDescripcionDivisionPolitica() {
        return descripcionDivisionPolitica;
    }

    public void setDescripcionDivisionPolitica(String descripcionDivisionPolitica) {
        this.descripcionDivisionPolitica = descripcionDivisionPolitica;
    }
}
