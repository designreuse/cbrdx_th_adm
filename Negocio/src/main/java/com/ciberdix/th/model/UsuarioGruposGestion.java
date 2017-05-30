package com.ciberdix.th.model;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 25/04/2017.
 */
public class UsuarioGruposGestion {

    private Integer idUsuarioGrupoGestion;
    private Integer idUsuario;
    private Integer idGrupoGestion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private Boolean indicadorHabilitado;

    public Integer getIdUsuarioGrupoGestion() {
        return idUsuarioGrupoGestion;
    }

    public void setIdUsuarioGrupoGestion(Integer idUsuarioGrupoGestion) {
        this.idUsuarioGrupoGestion = idUsuarioGrupoGestion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdGrupoGestion() {
        return idGrupoGestion;
    }

    public void setIdGrupoGestion(Integer idGrupoGestion) {
        this.idGrupoGestion = idGrupoGestion;
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

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
