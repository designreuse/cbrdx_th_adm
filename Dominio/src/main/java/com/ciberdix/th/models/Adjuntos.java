package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class Adjuntos {
    private Integer idAdjunto;
    private Integer idTipoAdjunto;
    private String adjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdAdjunto", nullable = false)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "IdTipoAdjunto", nullable = true)
    public Integer getIdTipoAdjunto() {
        return idTipoAdjunto;
    }

    public void setIdTipoAdjunto(Integer idTipoAdjunto) {
        this.idTipoAdjunto = idTipoAdjunto;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adjuntos adjuntos = (Adjuntos) o;

        if (idAdjunto != null ? !idAdjunto.equals(adjuntos.idAdjunto) : adjuntos.idAdjunto != null) return false;
        if (idTipoAdjunto != null ? !idTipoAdjunto.equals(adjuntos.idTipoAdjunto) : adjuntos.idTipoAdjunto != null)
            return false;
        if (adjunto != null ? !adjunto.equals(adjuntos.adjunto) : adjuntos.adjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(adjuntos.auditoriaUsuario) : adjuntos.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(adjuntos.auditoriaFecha) : adjuntos.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAdjunto != null ? idAdjunto.hashCode() : 0;
        result = 31 * result + (idTipoAdjunto != null ? idTipoAdjunto.hashCode() : 0);
        result = 31 * result + (adjunto != null ? adjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
