package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 14/06/2017.
 */
@Entity
@Table(name = "Adjuntos", schema = "dbo", catalog = "CREZCAMOS")
public class Adjuntos {
    private Integer idAdjunto;
    private String adjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String nombreArchivo;
    private String idAlfresco;

    public Adjuntos() {
    }

    public Adjuntos(String adjunto, Integer auditoriaUsuario, String nombreArchivo, String idAlfresco) {
        this.adjunto = adjunto;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.nombreArchivo = nombreArchivo;
        this.idAlfresco = idAlfresco;
    }

    public Adjuntos(Integer idAdjunto, String adjunto, Integer auditoriaUsuario, String nombreArchivo, String idAlfresco) {
        this.idAdjunto = idAdjunto;
        this.adjunto = adjunto;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.nombreArchivo = nombreArchivo;
        this.idAlfresco = idAlfresco;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdAdjunto", nullable = false)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "Adjunto", nullable = true, length = 100)
    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
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

    @Basic
    @Column(name = "NombreArchivo", nullable = true, length = 100)
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Basic
    @Column(name = "IdAlfresco", nullable = true, length = 4000)
    public String getIdAlfresco() {
        return idAlfresco;
    }

    public void setIdAlfresco(String idAlfresco) {
        this.idAlfresco = idAlfresco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adjuntos adjuntos = (Adjuntos) o;

        if (idAdjunto != null ? !idAdjunto.equals(adjuntos.idAdjunto) : adjuntos.idAdjunto != null) return false;
        if (adjunto != null ? !adjunto.equals(adjuntos.adjunto) : adjuntos.adjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(adjuntos.auditoriaUsuario) : adjuntos.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(adjuntos.auditoriaFecha) : adjuntos.auditoriaFecha != null)
            return false;
        if (nombreArchivo != null ? !nombreArchivo.equals(adjuntos.nombreArchivo) : adjuntos.nombreArchivo != null)
            return false;
        return idAlfresco != null ? idAlfresco.equals(adjuntos.idAlfresco) : adjuntos.idAlfresco == null;
    }

    @Override
    public int hashCode() {
        int result = idAdjunto != null ? idAdjunto.hashCode() : 0;
        result = 31 * result + (adjunto != null ? adjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (nombreArchivo != null ? nombreArchivo.hashCode() : 0);
        result = 31 * result + (idAlfresco != null ? idAlfresco.hashCode() : 0);
        return result;
    }
}
