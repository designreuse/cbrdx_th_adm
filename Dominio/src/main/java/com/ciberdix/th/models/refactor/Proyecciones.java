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
public class Proyecciones {
    private Integer idProyeccion;
    private Integer idSedeArea;
    private Integer idCargo;
    private Integer nroPlazas;
    private Integer costoPlazas;
    private Integer idEstado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdProyeccion")
    public Integer getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(Integer idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    @Basic
    @Column(name = "IdSedeArea")
    public Integer getIdSedeArea() {
        return idSedeArea;
    }

    public void setIdSedeArea(Integer idSedeArea) {
        this.idSedeArea = idSedeArea;
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
    @Column(name = "NroPlazas")
    public Integer getNroPlazas() {
        return nroPlazas;
    }

    public void setNroPlazas(Integer nroPlazas) {
        this.nroPlazas = nroPlazas;
    }

    @Basic
    @Column(name = "CostoPlazas")
    public Integer getCostoPlazas() {
        return costoPlazas;
    }

    public void setCostoPlazas(Integer costoPlazas) {
        this.costoPlazas = costoPlazas;
    }

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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

        Proyecciones that = (Proyecciones) o;

        if (idProyeccion != null ? !idProyeccion.equals(that.idProyeccion) : that.idProyeccion != null) return false;
        if (idSedeArea != null ? !idSedeArea.equals(that.idSedeArea) : that.idSedeArea != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (nroPlazas != null ? !nroPlazas.equals(that.nroPlazas) : that.nroPlazas != null) return false;
        if (costoPlazas != null ? !costoPlazas.equals(that.costoPlazas) : that.costoPlazas != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProyeccion != null ? idProyeccion.hashCode() : 0;
        result = 31 * result + (idSedeArea != null ? idSedeArea.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (nroPlazas != null ? nroPlazas.hashCode() : 0);
        result = 31 * result + (costoPlazas != null ? costoPlazas.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
