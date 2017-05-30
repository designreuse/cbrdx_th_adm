package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "CargosPersonalidadAtributos", schema = "dbo", catalog = "CREZCAMOS")
public class CargosPersonalidadAtributos {
    private Integer idCargoPersonalidadAtributo;
    private Integer idCargo;
    private Integer idAtributo;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public CargosPersonalidadAtributos() {
    }

    public CargosPersonalidadAtributos(Integer idCargo, Integer idAtributo, String descripcion, Integer auditoriaUsuario) {
        this.idCargo = idCargo;
        this.idAtributo = idAtributo;
        this.descripcion = descripcion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public CargosPersonalidadAtributos(Integer idCargoPersonalidadAtributo, Integer idCargo, Integer idAtributo, String descripcion, Integer auditoriaUsuario) {
        this.idCargoPersonalidadAtributo = idCargoPersonalidadAtributo;
        this.idCargo = idCargo;
        this.idAtributo = idAtributo;
        this.descripcion = descripcion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCargoPersonalidadAtributo", nullable = false)
    public Integer getIdCargoPersonalidadAtributo() {
        return idCargoPersonalidadAtributo;
    }

    public void setIdCargoPersonalidadAtributo(Integer idCargoPersonalidadAtributo) {
        this.idCargoPersonalidadAtributo = idCargoPersonalidadAtributo;
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
    @Column(name = "IdAtributo", nullable = true)
    public Integer getIdAtributo() {
        return idAtributo;
    }

    public void setIdAtributo(Integer idAtributo) {
        this.idAtributo = idAtributo;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

        CargosPersonalidadAtributos that = (CargosPersonalidadAtributos) o;

        if (idCargoPersonalidadAtributo != null ? !idCargoPersonalidadAtributo.equals(that.idCargoPersonalidadAtributo) : that.idCargoPersonalidadAtributo != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idAtributo != null ? !idAtributo.equals(that.idAtributo) : that.idAtributo != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoPersonalidadAtributo != null ? idCargoPersonalidadAtributo.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idAtributo != null ? idAtributo.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
