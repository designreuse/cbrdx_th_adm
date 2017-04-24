package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
public class VCargosRolesProcesos {
    private Integer idCargoRolProceso;
    private Integer idRolProceso;
    private String cragoRolProceso;
    private Integer idCargo;
    private String cargo;
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

    public String getCragoRolProceso() {
        return cragoRolProceso;
    }

    public void setCragoRolProceso(String cragoRolProceso) {
        this.cragoRolProceso = cragoRolProceso;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
