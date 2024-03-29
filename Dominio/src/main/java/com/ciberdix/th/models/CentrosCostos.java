package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "CentrosCostos", schema = "dbo", catalog = "CREZCAMOS")
public class CentrosCostos {
    private Integer idCentroCostos;
    private String centroCostos;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String codigoCentroCostos;

    public CentrosCostos() {
    }

    public CentrosCostos(String centroCostos, Boolean indicadorHabilitado, Integer auditoriaUsuario, String codigoCentroCostos) {
        this.centroCostos = centroCostos;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.codigoCentroCostos = codigoCentroCostos;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public CentrosCostos(Integer idCentroCostos, String centroCostos, Boolean indicadorHabilitado, Integer auditoriaUsuario, String codigoCentroCostos) {
        this.idCentroCostos = idCentroCostos;
        this.centroCostos = centroCostos;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.codigoCentroCostos = codigoCentroCostos;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCentroCostos", nullable = false)
    public Integer getIdCentroCostos() {
        return idCentroCostos;
    }

    public void setIdCentroCostos(Integer idCentroCostos) {
        this.idCentroCostos = idCentroCostos;
    }

    @Basic
    @Column(name = "CentroCostos", nullable = true, length = 30)
    public String getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(String centroCostos) {
        this.centroCostos = centroCostos;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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
    @Column(name = "CodigoCentroCostos", nullable = true, length = 30)
    public String getCodigoCentroCostos() {
        return codigoCentroCostos;
    }

    public void setCodigoCentroCostos(String codigoCentroCostos) {
        this.codigoCentroCostos = codigoCentroCostos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CentrosCostos that = (CentrosCostos) o;

        if (idCentroCostos != null ? !idCentroCostos.equals(that.idCentroCostos) : that.idCentroCostos != null)
            return false;
        if (centroCostos != null ? !centroCostos.equals(that.centroCostos) : that.centroCostos != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (codigoCentroCostos != null ? !codigoCentroCostos.equals(that.codigoCentroCostos) : that.codigoCentroCostos != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCentroCostos != null ? idCentroCostos.hashCode() : 0;
        result = 31 * result + (centroCostos != null ? centroCostos.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (codigoCentroCostos != null ? codigoCentroCostos.hashCode() : 0);
        return result;
    }
}
