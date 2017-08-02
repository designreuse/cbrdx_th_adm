package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 20/06/2017.
 */
public class RelacionesListasHijos {

    private Integer idRelacionListaHijo;
    private Integer idRelacionLista;
    private Integer idItemHijo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRelacionListaHijo() {
        return idRelacionListaHijo;
    }

    public void setIdRelacionListaHijo(Integer idRelacionListaHijo) {
        this.idRelacionListaHijo = idRelacionListaHijo;
    }

    public Integer getIdRelacionLista() {
        return idRelacionLista;
    }

    public void setIdRelacionLista(Integer idRelacionLista) {
        this.idRelacionLista = idRelacionLista;
    }

    public Integer getIdItemHijo() {
        return idItemHijo;
    }

    public void setIdItemHijo(Integer idItemHijo) {
        this.idItemHijo = idItemHijo;
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
