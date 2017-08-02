package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 21/06/2017.
 */
public class VRelacionesListas {

    private Integer idRelacionLista;
    private String listaPadre;
    private Integer idListaPadre;
    private String listaHijo;
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

    public String getListaPadre() {
        return listaPadre;
    }

    public void setListaPadre(String listaPadre) {
        this.listaPadre = listaPadre;
    }

    public Integer getIdListaPadre() {
        return idListaPadre;
    }

    public void setIdListaPadre(Integer idListaPadre) {
        this.idListaPadre = idListaPadre;
    }

    public String getListaHijo() {
        return listaHijo;
    }

    public void setListaHijo(String listaHijo) {
        this.listaHijo = listaHijo;
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
