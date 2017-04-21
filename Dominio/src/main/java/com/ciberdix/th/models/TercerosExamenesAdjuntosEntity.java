package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TercerosExamenesAdjuntos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class TercerosExamenesAdjuntosEntity {
    private Integer idTerceroExamenAdjunto;
    private Integer idTerceroExamen;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroExamenAdjunto", nullable = false)
    public Integer getIdTerceroExamenAdjunto() {
        return idTerceroExamenAdjunto;
    }

    public void setIdTerceroExamenAdjunto(Integer idTerceroExamenAdjunto) {
        this.idTerceroExamenAdjunto = idTerceroExamenAdjunto;
    }

    @Basic
    @Column(name = "IdTerceroExamen", nullable = true)
    public Integer getIdTerceroExamen() {
        return idTerceroExamen;
    }

    public void setIdTerceroExamen(Integer idTerceroExamen) {
        this.idTerceroExamen = idTerceroExamen;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = true)
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

        TercerosExamenesAdjuntosEntity that = (TercerosExamenesAdjuntosEntity) o;

        if (idTerceroExamenAdjunto != null ? !idTerceroExamenAdjunto.equals(that.idTerceroExamenAdjunto) : that.idTerceroExamenAdjunto != null)
            return false;
        if (idTerceroExamen != null ? !idTerceroExamen.equals(that.idTerceroExamen) : that.idTerceroExamen != null)
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
        int result = idTerceroExamenAdjunto != null ? idTerceroExamenAdjunto.hashCode() : 0;
        result = 31 * result + (idTerceroExamen != null ? idTerceroExamen.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
