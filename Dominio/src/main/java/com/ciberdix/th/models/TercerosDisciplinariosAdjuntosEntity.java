package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TercerosDisciplinariosAdjuntos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TercerosDisciplinariosAdjuntosEntity {
    private Integer idTerceroDisciplinarioAdjunto;
    private Integer idTerceroDisciplinario;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroDisciplinarioAdjunto", nullable = false)
    public Integer getIdTerceroDisciplinarioAdjunto() {
        return idTerceroDisciplinarioAdjunto;
    }

    public void setIdTerceroDisciplinarioAdjunto(Integer idTerceroDisciplinarioAdjunto) {
        this.idTerceroDisciplinarioAdjunto = idTerceroDisciplinarioAdjunto;
    }

    @Basic
    @Column(name = "IdTerceroDisciplinario", nullable = false)
    public Integer getIdTerceroDisciplinario() {
        return idTerceroDisciplinario;
    }

    public void setIdTerceroDisciplinario(Integer idTerceroDisciplinario) {
        this.idTerceroDisciplinario = idTerceroDisciplinario;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = false)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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

        TercerosDisciplinariosAdjuntosEntity that = (TercerosDisciplinariosAdjuntosEntity) o;

        if (idTerceroDisciplinarioAdjunto != null ? !idTerceroDisciplinarioAdjunto.equals(that.idTerceroDisciplinarioAdjunto) : that.idTerceroDisciplinarioAdjunto != null)
            return false;
        if (idTerceroDisciplinario != null ? !idTerceroDisciplinario.equals(that.idTerceroDisciplinario) : that.idTerceroDisciplinario != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroDisciplinarioAdjunto != null ? idTerceroDisciplinarioAdjunto.hashCode() : 0;
        result = 31 * result + (idTerceroDisciplinario != null ? idTerceroDisciplinario.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
