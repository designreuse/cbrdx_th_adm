package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "SedesAreasCargos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class SedesAreasCargosEntity {
    private Integer idSedeAreaCargo;
    private Integer idSedeArea;
    private Integer idCargo;
    private Integer nroPlazas;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer costoPlazas;

    @Id
    @Column(name = "IdSedeAreaCargo", nullable = false)
    public Integer getIdSedeAreaCargo() {
        return idSedeAreaCargo;
    }

    public void setIdSedeAreaCargo(Integer idSedeAreaCargo) {
        this.idSedeAreaCargo = idSedeAreaCargo;
    }

    @Basic
    @Column(name = "IdSedeArea", nullable = true)
    public Integer getIdSedeArea() {
        return idSedeArea;
    }

    public void setIdSedeArea(Integer idSedeArea) {
        this.idSedeArea = idSedeArea;
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
    @Column(name = "NroPlazas", nullable = true)
    public Integer getNroPlazas() {
        return nroPlazas;
    }

    public void setNroPlazas(Integer nroPlazas) {
        this.nroPlazas = nroPlazas;
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
    @Column(name = "CostoPlazas", nullable = true, precision = 0)
    public Integer getCostoPlazas() {
        return costoPlazas;
    }

    public void setCostoPlazas(Integer costoPlazas) {
        this.costoPlazas = costoPlazas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SedesAreasCargosEntity that = (SedesAreasCargosEntity) o;

        if (idSedeAreaCargo != null ? !idSedeAreaCargo.equals(that.idSedeAreaCargo) : that.idSedeAreaCargo != null)
            return false;
        if (idSedeArea != null ? !idSedeArea.equals(that.idSedeArea) : that.idSedeArea != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (nroPlazas != null ? !nroPlazas.equals(that.nroPlazas) : that.nroPlazas != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (costoPlazas != null ? !costoPlazas.equals(that.costoPlazas) : that.costoPlazas != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSedeAreaCargo != null ? idSedeAreaCargo.hashCode() : 0;
        result = 31 * result + (idSedeArea != null ? idSedeArea.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (nroPlazas != null ? nroPlazas.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (costoPlazas != null ? costoPlazas.hashCode() : 0);
        return result;
    }
}
