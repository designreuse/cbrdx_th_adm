package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class CargosRiesgos {
    private Integer idCargoRiesgo;
    private Integer idCargo;
    private Integer idRiesgo;
    private Integer idProbabilidad;
    private Integer idImpacto;
    private String observacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoRiesgo")
    public Integer getIdCargoRiesgo() {
        return idCargoRiesgo;
    }

    public void setIdCargoRiesgo(Integer idCargoRiesgo) {
        this.idCargoRiesgo = idCargoRiesgo;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdRiesgo")
    public Integer getIdRiesgo() {
        return idRiesgo;
    }

    public void setIdRiesgo(Integer idRiesgo) {
        this.idRiesgo = idRiesgo;
    }

    @Basic
    @Column(name = "IdProbabilidad")
    public Integer getIdProbabilidad() {
        return idProbabilidad;
    }

    public void setIdProbabilidad(Integer idProbabilidad) {
        this.idProbabilidad = idProbabilidad;
    }

    @Basic
    @Column(name = "IdImpacto")
    public Integer getIdImpacto() {
        return idImpacto;
    }

    public void setIdImpacto(Integer idImpacto) {
        this.idImpacto = idImpacto;
    }

    @Basic
    @Column(name = "Observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargosRiesgos that = (CargosRiesgos) o;

        if (idCargoRiesgo != null ? !idCargoRiesgo.equals(that.idCargoRiesgo) : that.idCargoRiesgo != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idRiesgo != null ? !idRiesgo.equals(that.idRiesgo) : that.idRiesgo != null) return false;
        if (idProbabilidad != null ? !idProbabilidad.equals(that.idProbabilidad) : that.idProbabilidad != null)
            return false;
        if (idImpacto != null ? !idImpacto.equals(that.idImpacto) : that.idImpacto != null) return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoRiesgo != null ? idCargoRiesgo.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idRiesgo != null ? idRiesgo.hashCode() : 0);
        result = 31 * result + (idProbabilidad != null ? idProbabilidad.hashCode() : 0);
        result = 31 * result + (idImpacto != null ? idImpacto.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
