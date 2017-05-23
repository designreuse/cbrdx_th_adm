package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 17/04/2017.
 */
@Entity
@Table(name = "EstructuraOrganizacionalCargos", schema = "crz_th", catalog = "CREZCAMOS")
public class EstructuraOrganizacionalCargos {
    private Integer idEstructuraOrganizacionalCargo;
    private Integer idEstructuraOrganizacional;
    private Integer idCargo;
    private Integer plazas;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public EstructuraOrganizacionalCargos() {
    }

    public EstructuraOrganizacionalCargos(Integer idEstructuraOrganizacional, Integer idCargo, Integer plazas, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.idCargo = idCargo;
        this.plazas = plazas;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public EstructuraOrganizacionalCargos(Integer idEstructuraOrganizacionalCargo, Integer idEstructuraOrganizacional, Integer idCargo, Integer plazas, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idEstructuraOrganizacionalCargo = idEstructuraOrganizacionalCargo;
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
        this.idCargo = idCargo;
        this.plazas = plazas;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdEstructuraOrganizacionalCargo")
    public Integer getIdEstructuraOrganizacionalCargo() {
        return idEstructuraOrganizacionalCargo;
    }

    public void setIdEstructuraOrganizacionalCargo(Integer idEstructuraOrganizacionalCargo) {
        this.idEstructuraOrganizacionalCargo = idEstructuraOrganizacionalCargo;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacional")
    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
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
    @Column(name = "Plazas")
    public Integer getPlazas() {
        return plazas;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

        EstructuraOrganizacionalCargos that = (EstructuraOrganizacionalCargos) o;

        if (idEstructuraOrganizacionalCargo != null ? !idEstructuraOrganizacionalCargo.equals(that.idEstructuraOrganizacionalCargo) : that.idEstructuraOrganizacionalCargo != null)
            return false;
        if (idEstructuraOrganizacional != null ? !idEstructuraOrganizacional.equals(that.idEstructuraOrganizacional) : that.idEstructuraOrganizacional != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (plazas != null ? !plazas.equals(that.plazas) : that.plazas != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEstructuraOrganizacionalCargo != null ? idEstructuraOrganizacionalCargo.hashCode() : 0;
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (plazas != null ? plazas.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
