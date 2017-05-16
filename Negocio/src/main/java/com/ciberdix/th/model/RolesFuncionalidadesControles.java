package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 23/04/17.
 */
public class RolesFuncionalidadesControles {
    private Integer idRolFuncionalidadControl;
    private Integer idRol;
    private Integer idFuncionalidadControl;
    private Boolean indicadorEditar;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRolFuncionalidadControl() {
        return idRolFuncionalidadControl;
    }

    public void setIdRolFuncionalidadControl(Integer idRolFuncionalidadControl) {
        this.idRolFuncionalidadControl = idRolFuncionalidadControl;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdFuncionalidadControl() {
        return idFuncionalidadControl;
    }

    public void setIdFuncionalidadControl(Integer idFuncionalidadControl) {
        this.idFuncionalidadControl = idFuncionalidadControl;
    }

    public Boolean getIndicadorEditar() {
        return indicadorEditar;
    }

    public void setIndicadorEditar(Boolean indicadorEditar) {
        this.indicadorEditar = indicadorEditar;
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
