package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "CentrosPoblados", schema = "crz_th", catalog = "CREZCAMOS")
public class CentrosPobladosEntity {
    private Integer idCentroPoblado;
    private Integer idUnidadTerritorial;
    private String centroPoblado;
    private Integer idTipoCentroPoblado;
    private Integer idProvincia;
    private Integer idAreaMetropolitana;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCentroPoblado", nullable = false)
    public Integer getIdCentroPoblado() {
        return idCentroPoblado;
    }

    public void setIdCentroPoblado(Integer idCentroPoblado) {
        this.idCentroPoblado = idCentroPoblado;
    }

    @Basic
    @Column(name = "IdUnidadTerritorial", nullable = true)
    public Integer getIdUnidadTerritorial() {
        return idUnidadTerritorial;
    }

    public void setIdUnidadTerritorial(Integer idUnidadTerritorial) {
        this.idUnidadTerritorial = idUnidadTerritorial;
    }

    @Basic
    @Column(name = "CentroPoblado", nullable = true, length = 64)
    public String getCentroPoblado() {
        return centroPoblado;
    }

    public void setCentroPoblado(String centroPoblado) {
        this.centroPoblado = centroPoblado;
    }

    @Basic
    @Column(name = "IdTipoCentroPoblado", nullable = true)
    public Integer getIdTipoCentroPoblado() {
        return idTipoCentroPoblado;
    }

    public void setIdTipoCentroPoblado(Integer idTipoCentroPoblado) {
        this.idTipoCentroPoblado = idTipoCentroPoblado;
    }

    @Basic
    @Column(name = "IdProvincia", nullable = true)
    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Basic
    @Column(name = "IdAreaMetropolitana", nullable = true)
    public Integer getIdAreaMetropolitana() {
        return idAreaMetropolitana;
    }

    public void setIdAreaMetropolitana(Integer idAreaMetropolitana) {
        this.idAreaMetropolitana = idAreaMetropolitana;
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

        CentrosPobladosEntity that = (CentrosPobladosEntity) o;

        if (idCentroPoblado != null ? !idCentroPoblado.equals(that.idCentroPoblado) : that.idCentroPoblado != null)
            return false;
        if (idUnidadTerritorial != null ? !idUnidadTerritorial.equals(that.idUnidadTerritorial) : that.idUnidadTerritorial != null)
            return false;
        if (centroPoblado != null ? !centroPoblado.equals(that.centroPoblado) : that.centroPoblado != null)
            return false;
        if (idTipoCentroPoblado != null ? !idTipoCentroPoblado.equals(that.idTipoCentroPoblado) : that.idTipoCentroPoblado != null)
            return false;
        if (idProvincia != null ? !idProvincia.equals(that.idProvincia) : that.idProvincia != null) return false;
        if (idAreaMetropolitana != null ? !idAreaMetropolitana.equals(that.idAreaMetropolitana) : that.idAreaMetropolitana != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCentroPoblado != null ? idCentroPoblado.hashCode() : 0;
        result = 31 * result + (idUnidadTerritorial != null ? idUnidadTerritorial.hashCode() : 0);
        result = 31 * result + (centroPoblado != null ? centroPoblado.hashCode() : 0);
        result = 31 * result + (idTipoCentroPoblado != null ? idTipoCentroPoblado.hashCode() : 0);
        result = 31 * result + (idProvincia != null ? idProvincia.hashCode() : 0);
        result = 31 * result + (idAreaMetropolitana != null ? idAreaMetropolitana.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
