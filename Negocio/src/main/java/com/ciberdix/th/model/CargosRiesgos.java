package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
public class CargosRiesgos {
    private Integer idCargoRiesgo;
    private Integer idCargo;
    private Integer idRiesgo;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;
    private Integer idProbabilidad;
    private Integer idConsecuencia;

    public Integer getIdCargoRiesgo() {
        return idCargoRiesgo;
    }

    public void setIdCargoRiesgo(Integer idCargoRiesgo) {
        this.idCargoRiesgo = idCargoRiesgo;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public Integer getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(Integer idRiesgo) {
        this.idRiesgo = idRiesgo;
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

    public Integer getIdProbabilidad() {
        return idProbabilidad;
    }

    public void setIdProbabilidad(Integer idProbabilidad) {
        this.idProbabilidad = idProbabilidad;
    }

    public Integer getIdConsecuencia() {
        return idConsecuencia;
    }

    public void setIdConsecuencia(Integer idConsecuencia) {
        this.idConsecuencia = idConsecuencia;
    }
}
