package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 9/04/17.
 */
public class CargosRolesProcesos {
    private Integer idCargoRolProceso;
    private Integer idRolProceso;
    private Integer idCargo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdCargoRolProceso() {
        return idCargoRolProceso;
    }

    public void setIdCargoRolProceso(Integer idCargoRolProceso) {
        this.idCargoRolProceso = idCargoRolProceso;
    }

    public Integer getIdRolProceso() {
        return idRolProceso;
    }

    public void setIdRolProceso(Integer idRolProceso) {
        this.idRolProceso = idRolProceso;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
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
