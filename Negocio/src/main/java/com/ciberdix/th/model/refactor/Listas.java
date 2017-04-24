package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
public class Listas {
    private Integer idLista;
    private String nombreTabla;
    private String lista;
    private Boolean indicadorEditable;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String descripcion;

    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public Boolean getIndicadorEditable() {
        return indicadorEditable;
    }

    public void setIndicadorEditable(Boolean indicadorEditable) {
        this.indicadorEditable = indicadorEditable;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
