package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "RequerimientosActividades", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class RequerimientosActividadesEntity {
    private Integer idRequerimientoActividad;
    private Integer idRequerimiento;
    private String actividad;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idEstado;

    @Id
    @Column(name = "IdRequerimientoActividad", nullable = false)
    public Integer getIdRequerimientoActividad() {
        return idRequerimientoActividad;
    }

    public void setIdRequerimientoActividad(Integer idRequerimientoActividad) {
        this.idRequerimientoActividad = idRequerimientoActividad;
    }

    @Basic
    @Column(name = "IdRequerimiento", nullable = false)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "Actividad", nullable = true, length = 100)
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
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
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequerimientosActividadesEntity that = (RequerimientosActividadesEntity) o;

        if (idRequerimientoActividad != null ? !idRequerimientoActividad.equals(that.idRequerimientoActividad) : that.idRequerimientoActividad != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (actividad != null ? !actividad.equals(that.actividad) : that.actividad != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoActividad != null ? idRequerimientoActividad.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (actividad != null ? actividad.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        return result;
    }
}
