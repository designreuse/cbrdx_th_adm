package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "CargosIQNiveles", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class CargosIqNivelesEntity {
    private Integer idCargoIqNivel;
    private Integer idCargo;
    private Integer idIqNivel;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoIQNivel", nullable = false)
    public Integer getIdCargoIqNivel() {
        return idCargoIqNivel;
    }

    public void setIdCargoIqNivel(Integer idCargoIqNivel) {
        this.idCargoIqNivel = idCargoIqNivel;
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
    @Column(name = "IdIQNivel", nullable = true)
    public Integer getIdIqNivel() {
        return idIqNivel;
    }

    public void setIdIqNivel(Integer idIqNivel) {
        this.idIqNivel = idIqNivel;
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

        CargosIqNivelesEntity that = (CargosIqNivelesEntity) o;

        if (idCargoIqNivel != null ? !idCargoIqNivel.equals(that.idCargoIqNivel) : that.idCargoIqNivel != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idIqNivel != null ? !idIqNivel.equals(that.idIqNivel) : that.idIqNivel != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoIqNivel != null ? idCargoIqNivel.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idIqNivel != null ? idIqNivel.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
