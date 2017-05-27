package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "Listas", schema = "dbo", catalog = "CREZCAMOS")
public class Listas {
    private Integer idLista;
    private String nombreTabla;
    private String lista;
    private Boolean indicadorEditable;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String descripcion;
    private Integer idRol;

    public Listas(){

    }

    public Listas(Integer idLista, String nombreTabla, String lista, Boolean indicadorEditable, Integer auditoriaUsuario, String descripcion, Integer idRol) {
        this.idLista = idLista;
        this.nombreTabla = nombreTabla;
        this.lista = lista;
        this.indicadorEditable = indicadorEditable;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.descripcion = descripcion;
        this.idRol = idRol;
    }

    @Id
    @Column(name = "IdLista", nullable = false)
    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    @Basic
    @Column(name = "NombreTabla", nullable = true, length = 100)
    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    @Basic
    @Column(name = "Lista", nullable = true, length = 250)
    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    @Basic
    @Column(name = "IndicadorEditable", nullable = true)
    public Boolean getIndicadorEditable() {
        return indicadorEditable;
    }

    public void setIndicadorEditable(Boolean indicadorEditable) {
        this.indicadorEditable = indicadorEditable;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 500)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IdRol", nullable = true)
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Listas listas = (Listas) o;

        if (!idLista.equals(listas.idLista)) return false;
        if (nombreTabla != null ? !nombreTabla.equals(listas.nombreTabla) : listas.nombreTabla != null) return false;
        if (lista != null ? !lista.equals(listas.lista) : listas.lista != null) return false;
        if (indicadorEditable != null ? !indicadorEditable.equals(listas.indicadorEditable) : listas.indicadorEditable != null)
            return false;
        if (!auditoriaUsuario.equals(listas.auditoriaUsuario)) return false;
        if (!auditoriaFecha.equals(listas.auditoriaFecha)) return false;
        if (descripcion != null ? !descripcion.equals(listas.descripcion) : listas.descripcion != null) return false;
        return idRol != null ? idRol.equals(listas.idRol) : listas.idRol == null;
    }

    @Override
    public int hashCode() {
        int result = idLista.hashCode();
        result = 31 * result + (nombreTabla != null ? nombreTabla.hashCode() : 0);
        result = 31 * result + (lista != null ? lista.hashCode() : 0);
        result = 31 * result + (indicadorEditable != null ? indicadorEditable.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        return result;
    }
}
