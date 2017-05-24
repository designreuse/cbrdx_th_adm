package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 19/05/2017.
 */
@Entity
@Table(name = "RequerimientosCuestionarios", schema = "crz_th", catalog = "CREZCAMOS")
public class RequerimientosCuestionarios {
    private Integer idRequerimientoCuestionario;
    private Integer idRequerimiento;
    private Integer idCuestionario;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    public RequerimientosCuestionarios() {
    }

    public RequerimientosCuestionarios(Integer idRequerimiento, Integer idCuestionario, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idRequerimiento = idRequerimiento;
        this.idCuestionario = idCuestionario;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public RequerimientosCuestionarios(Integer idRequerimientoCuestionario, Integer idRequerimiento, Integer idCuestionario, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idRequerimientoCuestionario = idRequerimientoCuestionario;
        this.idRequerimiento = idRequerimiento;
        this.idCuestionario = idCuestionario;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRequerimientoCuestionario", nullable = false)
    public Integer getIdRequerimientoCuestionario() {
        return idRequerimientoCuestionario;
    }

    public void setIdRequerimientoCuestionario(Integer idRequerimientoCuestionario) {
        this.idRequerimientoCuestionario = idRequerimientoCuestionario;
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
    @Column(name = "IdCuestionario", nullable = true)
    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
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
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequerimientosCuestionarios that = (RequerimientosCuestionarios) o;

        if (idRequerimientoCuestionario != null ? !idRequerimientoCuestionario.equals(that.idRequerimientoCuestionario) : that.idRequerimientoCuestionario != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (idCuestionario != null ? !idCuestionario.equals(that.idCuestionario) : that.idCuestionario != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequerimientoCuestionario != null ? idRequerimientoCuestionario.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (idCuestionario != null ? idCuestionario.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
