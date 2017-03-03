package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "CargosNivelesAptitudes", schema = "crz_th", catalog = "CREZCAMOS")
public class CargosNivelesAptitudesEntity {
    private Integer idCargoNivelAptitud;
    private Integer idCargo;
    private Integer idNivelAptitud;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoNivelAptitud", nullable = false)
    public Integer getIdCargoNivelAptitud() {
        return idCargoNivelAptitud;
    }

    public void setIdCargoNivelAptitud(Integer idCargoNivelAptitud) {
        this.idCargoNivelAptitud = idCargoNivelAptitud;
    }

    @Basic
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdNivelAptitud", nullable = true)
    public Integer getIdNivelAptitud() {
        return idNivelAptitud;
    }

    public void setIdNivelAptitud(Integer idNivelAptitud) {
        this.idNivelAptitud = idNivelAptitud;
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

        CargosNivelesAptitudesEntity that = (CargosNivelesAptitudesEntity) o;

        if (idCargoNivelAptitud != null ? !idCargoNivelAptitud.equals(that.idCargoNivelAptitud) : that.idCargoNivelAptitud != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idNivelAptitud != null ? !idNivelAptitud.equals(that.idNivelAptitud) : that.idNivelAptitud != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoNivelAptitud != null ? idCargoNivelAptitud.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idNivelAptitud != null ? idNivelAptitud.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
