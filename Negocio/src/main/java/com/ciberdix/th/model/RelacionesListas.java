package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 20/06/2017.
 */
public class RelacionesListas {

    private Integer idRelacionLista;
    private Integer idListaPadre;
    private Integer idListaHijo;
    private Integer idItemPadre;
    private String nombreRelacion;
    private String codigo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdRelacionLista() {
        return idRelacionLista;
    }

    public void setIdRelacionLista(Integer idRelacionLista) {
        this.idRelacionLista = idRelacionLista;
    }

    public Integer getIdListaPadre() {
        return idListaPadre;
    }

    public void setIdListaPadre(Integer idListaPadre) {
        this.idListaPadre = idListaPadre;
    }

    public Integer getIdListaHijo() {
        return idListaHijo;
    }

    public void setIdListaHijo(Integer idListaHijo) {
        this.idListaHijo = idListaHijo;
    }

    public Integer getIdItemPadre() {
        return idItemPadre;
    }

    public void setIdItemPadre(Integer idItemPadre) {
        this.idItemPadre = idItemPadre;
    }

    public String getNombreRelacion() {
        return nombreRelacion;
    }

    public void setNombreRelacion(String nombreRelacion) {
        this.nombreRelacion = nombreRelacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
