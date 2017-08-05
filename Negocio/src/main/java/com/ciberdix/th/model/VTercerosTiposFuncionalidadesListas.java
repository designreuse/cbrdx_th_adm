package com.ciberdix.th.model;

import java.sql.Timestamp;

public class VTercerosTiposFuncionalidadesListas {

    private Integer idTerceroTipoFuncionalidadListas;
    private String funcionalidad;
    private Integer idTerceroTipoFuncionalidad;
    private String seccion;
    private Integer idSeccion;
    private String control;
    private Integer idControl;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroTipoFuncionalidadListas() {
        return idTerceroTipoFuncionalidadListas;
    }

    public void setIdTerceroTipoFuncionalidadListas(Integer idTerceroTipoFuncionalidadListas) {
        this.idTerceroTipoFuncionalidadListas = idTerceroTipoFuncionalidadListas;
    }

    public String getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public Integer getIdTerceroTipoFuncionalidad() {
        return idTerceroTipoFuncionalidad;
    }

    public void setIdTerceroTipoFuncionalidad(Integer idTerceroTipoFuncionalidad) {
        this.idTerceroTipoFuncionalidad = idTerceroTipoFuncionalidad;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Integer getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public Integer getIdControl() {
        return idControl;
    }

    public void setIdControl(Integer idControl) {
        this.idControl = idControl;
    }

    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
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
