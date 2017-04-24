package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "Listas", schema = "crz_th", catalog = "CREZCAMOS")
public class Listas {
    private Integer idLista;
    private String nombreTabla;
    private String lista;
    private Boolean indicadorEditable;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String descripcion;

    @Id
    @Column(name = "IdLista")
    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    @Basic
    @Column(name = "NombreTabla")
    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    @Basic
    @Column(name = "Lista")
    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    @Basic
    @Column(name = "IndicadorEditable")
    public Boolean getIndicadorEditable() {
        return indicadorEditable;
    }

    public void setIndicadorEditable(Boolean indicadorEditable) {
        this.indicadorEditable = indicadorEditable;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Listas listas = (Listas) o;

        if (idLista != null ? !idLista.equals(listas.idLista) : listas.idLista != null) return false;
        if (nombreTabla != null ? !nombreTabla.equals(listas.nombreTabla) : listas.nombreTabla != null) return false;
        if (lista != null ? !lista.equals(listas.lista) : listas.lista != null) return false;
        if (indicadorEditable != null ? !indicadorEditable.equals(listas.indicadorEditable) : listas.indicadorEditable != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(listas.auditoriaUsuario) : listas.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(listas.auditoriaFecha) : listas.auditoriaFecha != null)
            return false;
        if (descripcion != null ? !descripcion.equals(listas.descripcion) : listas.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLista != null ? idLista.hashCode() : 0;
        result = 31 * result + (nombreTabla != null ? nombreTabla.hashCode() : 0);
        result = 31 * result + (lista != null ? lista.hashCode() : 0);
        result = 31 * result + (indicadorEditable != null ? indicadorEditable.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
