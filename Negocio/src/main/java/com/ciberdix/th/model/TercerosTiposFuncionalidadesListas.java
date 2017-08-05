package com.ciberdix.th.model;

import java.sql.Timestamp;

public class TercerosTiposFuncionalidadesListas {

    private Integer idTerceroTipoFuncionalidadListas;
    private Integer idTerceroTipoFuncionalidad;
    private Integer idSeccion;
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

    public Integer getIdTerceroTipoFuncionalidad() {
        return idTerceroTipoFuncionalidad;
    }

    public void setIdTerceroTipoFuncionalidad(Integer idTerceroTipoFuncionalidad) {
        this.idTerceroTipoFuncionalidad = idTerceroTipoFuncionalidad;
    }

    public Integer getIdSeccion() {
        return idSeccion;
    }

    public void setIdSeccion(Integer idSeccion) {
        this.idSeccion = idSeccion;
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
