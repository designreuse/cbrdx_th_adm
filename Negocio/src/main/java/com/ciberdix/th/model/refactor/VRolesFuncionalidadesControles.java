package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 24/04/17.
 */
public class VRolesFuncionalidadesControles {
    private Integer idRolFuncionalidadControl;
    private Integer idRol;
    private String rol;
    private Integer idFuncionalidadControl;
    private String control;
    private Boolean indicadorSeccion;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getIdFuncionalidadControl() {
        return idFuncionalidadControl;
    }

    public void setIdFuncionalidadControl(Integer idFuncionalidadControl) {
        this.idFuncionalidadControl = idFuncionalidadControl;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public Boolean getIndicadorSeccion() {
        return indicadorSeccion;
    }

    public void setIndicadorSeccion(Boolean indicadorSeccion) {
        this.indicadorSeccion = indicadorSeccion;
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
