package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by robertochajin on 9/04/17.
 */
public class ListasRolesProceso {
    private Integer idListaRolProceso;
    private String codigo;
    private String nombre;
    private Integer orden;
    private Boolean indicadorHabilitado;
    private Timestamp auditoriaFecha;

    public Integer getIdListaRolProceso() {
        return idListaRolProceso;
    }

    public void setIdListaRolProceso(Integer idListaRolProceso) {
        this.idListaRolProceso = idListaRolProceso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
}
