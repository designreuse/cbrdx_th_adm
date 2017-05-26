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
public class TercerosAdaptacionesLaboralesAdjuntos {
    private Integer idTerceroAdaptacionLaboralAdjunto;
    private Integer idTerceroAdaptacionLaboral;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroAdaptacionLaboralAdjunto", nullable = false)
    public Integer getIdTerceroAdaptacionLaboralAdjunto() {
        return idTerceroAdaptacionLaboralAdjunto;
    }

    public void setIdTerceroAdaptacionLaboralAdjunto(Integer idTerceroAdaptacionLaboralAdjunto) {
        this.idTerceroAdaptacionLaboralAdjunto = idTerceroAdaptacionLaboralAdjunto;
    }

    @Basic
    @Column(name = "IdTerceroAdaptacionLaboral", nullable = true)
    public Integer getIdTerceroAdaptacionLaboral() {
        return idTerceroAdaptacionLaboral;
    }

    public void setIdTerceroAdaptacionLaboral(Integer idTerceroAdaptacionLaboral) {
        this.idTerceroAdaptacionLaboral = idTerceroAdaptacionLaboral;
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

        TercerosAdaptacionesLaboralesAdjuntos that = (TercerosAdaptacionesLaboralesAdjuntos) o;

        if (idTerceroAdaptacionLaboralAdjunto != null ? !idTerceroAdaptacionLaboralAdjunto.equals(that.idTerceroAdaptacionLaboralAdjunto) : that.idTerceroAdaptacionLaboralAdjunto != null)
            return false;
        if (idTerceroAdaptacionLaboral != null ? !idTerceroAdaptacionLaboral.equals(that.idTerceroAdaptacionLaboral) : that.idTerceroAdaptacionLaboral != null)
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
        int result = idTerceroAdaptacionLaboralAdjunto != null ? idTerceroAdaptacionLaboralAdjunto.hashCode() : 0;
        result = 31 * result + (idTerceroAdaptacionLaboral != null ? idTerceroAdaptacionLaboral.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
