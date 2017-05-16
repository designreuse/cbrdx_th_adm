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
public class TercerosRituales {
    private Integer idTerceroRitual;
    private Long idTercero;
    private Integer idCargo;
    private Integer vigencia;
    private Integer idPeriodo;
    private String fortalezas;
    private String oportunidadesMejora;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroRitual")
    public Integer getIdTerceroRitual() {
        return idTerceroRitual;
    }

    public void setIdTerceroRitual(Integer idTerceroRitual) {
        this.idTerceroRitual = idTerceroRitual;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
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
    @Column(name = "Vigencia")
    public Integer getVigencia() {
        return vigencia;
    }

    public void setVigencia(Integer vigencia) {
        this.vigencia = vigencia;
    }

    @Basic
    @Column(name = "IdPeriodo")
    public Integer getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(Integer idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    @Basic
    @Column(name = "Fortalezas")
    public String getFortalezas() {
        return fortalezas;
    }

    public void setFortalezas(String fortalezas) {
        this.fortalezas = fortalezas;
    }

    @Basic
    @Column(name = "OportunidadesMejora")
    public String getOportunidadesMejora() {
        return oportunidadesMejora;
    }

    public void setOportunidadesMejora(String oportunidadesMejora) {
        this.oportunidadesMejora = oportunidadesMejora;
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

        TercerosRituales that = (TercerosRituales) o;

        if (idTerceroRitual != null ? !idTerceroRitual.equals(that.idTerceroRitual) : that.idTerceroRitual != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (vigencia != null ? !vigencia.equals(that.vigencia) : that.vigencia != null) return false;
        if (idPeriodo != null ? !idPeriodo.equals(that.idPeriodo) : that.idPeriodo != null) return false;
        if (fortalezas != null ? !fortalezas.equals(that.fortalezas) : that.fortalezas != null) return false;
        if (oportunidadesMejora != null ? !oportunidadesMejora.equals(that.oportunidadesMejora) : that.oportunidadesMejora != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroRitual != null ? idTerceroRitual.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (vigencia != null ? vigencia.hashCode() : 0);
        result = 31 * result + (idPeriodo != null ? idPeriodo.hashCode() : 0);
        result = 31 * result + (fortalezas != null ? fortalezas.hashCode() : 0);
        result = 31 * result + (oportunidadesMejora != null ? oportunidadesMejora.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
