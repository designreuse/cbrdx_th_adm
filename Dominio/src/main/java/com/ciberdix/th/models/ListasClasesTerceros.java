package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 26/04/2017.
 */
@Entity
@Table(name = "ListasClasesTerceros", schema = "dbo", catalog = "CREZCAMOS")
public class ListasClasesTerceros {
    private Integer idLista;
    private String codigo;
    private String nombre;
    private Integer orden;
    private boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public ListasClasesTerceros (){
    }
    public ListasClasesTerceros(String codigo, String nombre, Integer orden, boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.orden = orden;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public ListasClasesTerceros(Integer idLista, String codigo, String nombre, Integer orden, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idLista = idLista;
        this.codigo = codigo;
        this.nombre = nombre;
        this.orden = orden;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdLista", nullable = false)
    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    @Basic
    @Column(name = "Codigo", nullable = false, length = 10)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Nombre", nullable = false, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Orden", nullable = false)
    public Integer getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = false)
    public boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListasClasesTerceros that = (ListasClasesTerceros) o;

        if (idLista != that.idLista) return false;
        if (orden != that.orden) return false;
        if (indicadorHabilitado != that.indicadorHabilitado) return false;
        if (auditoriaUsuario != that.auditoriaUsuario) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLista;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + orden;
        result = 31 * result + (indicadorHabilitado ? 1 : 0);
        result = 31 * result + auditoriaUsuario;
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
