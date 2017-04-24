package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "SedesCentrosCostos", schema = "crz_th", catalog = "CREZCAMOS")
public class SedesCentrosCostosEntity {
    private Integer idSedeCentroCostos;
    private Integer idSede;
    private Integer idCentroCostos;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdSedeCentroCostos", nullable = false)
    public Integer getIdSedeCentroCostos() {
        return idSedeCentroCostos;
    }

    public void setIdSedeCentroCostos(Integer idSedeCentroCostos) {
        this.idSedeCentroCostos = idSedeCentroCostos;
    }

    @Basic
    @Column(name = "IdSede", nullable = true)
    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    @Basic
    @Column(name = "IdCentroCostos", nullable = true)
    public Integer getIdCentroCostos() {
        return idCentroCostos;
    }

    public void setIdCentroCostos(Integer idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
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

        SedesCentrosCostosEntity that = (SedesCentrosCostosEntity) o;

        if (idSedeCentroCostos != null ? !idSedeCentroCostos.equals(that.idSedeCentroCostos) : that.idSedeCentroCostos != null)
            return false;
        if (idSede != null ? !idSede.equals(that.idSede) : that.idSede != null) return false;
        if (idCentroCostos != null ? !idCentroCostos.equals(that.idCentroCostos) : that.idCentroCostos != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSedeCentroCostos != null ? idSedeCentroCostos.hashCode() : 0;
        result = 31 * result + (idSede != null ? idSede.hashCode() : 0);
        result = 31 * result + (idCentroCostos != null ? idCentroCostos.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
