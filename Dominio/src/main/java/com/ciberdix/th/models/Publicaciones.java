package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 31/05/2017.
 */
@Entity
@Table(name = "Publicaciones", schema = "dbo", catalog = "CREZCAMOS")
public class Publicaciones {
    private Integer idPublicacion;
    private Integer idRequerimiento;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean indicadorSalario;
    private Boolean indicadorBonificacion;
    private Integer idNivelEducacion;
    private Integer idTipoTrabajo;
    private String descripcionGeneral;
    private String lugarTrabajo;
    private String competenciasLaborales;
    private Boolean indicadorObservacion;
    private String observacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;

    public Publicaciones() {
    }

    public Publicaciones(Integer idRequerimiento, Date fechaInicio, Date fechaFin, Boolean indicadorSalario, Boolean indicadorBonificacion, Integer idNivelEducacion, Integer idTipoTrabajo, String descripcionGeneral, String lugarTrabajo, String competenciasLaborales, Boolean indicadorObservacion, String observacion, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idRequerimiento = idRequerimiento;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
        this.indicadorSalario = indicadorSalario;
        this.indicadorBonificacion = indicadorBonificacion;
        this.idNivelEducacion = idNivelEducacion;
        this.idTipoTrabajo = idTipoTrabajo;
        this.descripcionGeneral = descripcionGeneral;
        this.lugarTrabajo = lugarTrabajo;
        this.competenciasLaborales = competenciasLaborales;
        this.indicadorObservacion = indicadorObservacion;
        this.observacion = observacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Publicaciones(Integer idPublicacion, Integer idRequerimiento, Date fechaInicio, Date fechaFin, Boolean indicadorSalario, Boolean indicadorBonificacion, Integer idNivelEducacion, Integer idTipoTrabajo, String descripcionGeneral, String lugarTrabajo, String competenciasLaborales, Boolean indicadorObservacion, String observacion, Integer auditoriaUsuario, Boolean indicadorHabilitado) {
        this.idPublicacion = idPublicacion;
        this.idRequerimiento = idRequerimiento;
        this.fechaInicio = fechaInicio != null ? new Date(fechaInicio.getTime()) : null;
        this.fechaFin = fechaFin != null ? new Date(fechaFin.getTime()) : null;
        this.indicadorSalario = indicadorSalario;
        this.indicadorBonificacion = indicadorBonificacion;
        this.idNivelEducacion = idNivelEducacion;
        this.idTipoTrabajo = idTipoTrabajo;
        this.descripcionGeneral = descripcionGeneral;
        this.lugarTrabajo = lugarTrabajo;
        this.competenciasLaborales = competenciasLaborales;
        this.indicadorObservacion = indicadorObservacion;
        this.observacion = observacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdPublicacion", nullable = false)
    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    @Basic
    @Column(name = "IdRequerimiento", nullable = true)
    public Integer getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Integer idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    @Basic
    @Column(name = "FechaInicio", nullable = true)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "IndicadorSalario", nullable = true)
    public Boolean getIndicadorSalario() {
        return indicadorSalario;
    }

    public void setIndicadorSalario(Boolean indicadorSalario) {
        this.indicadorSalario = indicadorSalario;
    }

    @Basic
    @Column(name = "IndicadorBonificacion", nullable = true)
    public Boolean getIndicadorBonificacion() {
        return indicadorBonificacion;
    }

    public void setIndicadorBonificacion(Boolean indicadorBonificacion) {
        this.indicadorBonificacion = indicadorBonificacion;
    }

    @Basic
    @Column(name = "IdNivelEducacion", nullable = true)
    public Integer getIdNivelEducacion() {
        return idNivelEducacion;
    }

    public void setIdNivelEducacion(Integer idNivelEducacion) {
        this.idNivelEducacion = idNivelEducacion;
    }

    @Basic
    @Column(name = "IdTipoTrabajo", nullable = true)
    public Integer getIdTipoTrabajo() {
        return idTipoTrabajo;
    }

    public void setIdTipoTrabajo(Integer idTipoTrabajo) {
        this.idTipoTrabajo = idTipoTrabajo;
    }

    @Basic
    @Column(name = "DescripcionGeneral", nullable = true, length = 500)
    public String getDescripcionGeneral() {
        return descripcionGeneral;
    }

    public void setDescripcionGeneral(String descripcionGeneral) {
        this.descripcionGeneral = descripcionGeneral;
    }

    @Basic
    @Column(name = "LugarTrabajo", nullable = true, length = 500)
    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    @Basic
    @Column(name = "CompetenciasLaborales", nullable = true, length = 500)
    public String getCompetenciasLaborales() {
        return competenciasLaborales;
    }

    public void setCompetenciasLaborales(String competenciasLaborales) {
        this.competenciasLaborales = competenciasLaborales;
    }

    @Basic
    @Column(name = "IndicadorObservacion", nullable = true)
    public Boolean getIndicadorObservacion() {
        return indicadorObservacion;
    }

    public void setIndicadorObservacion(Boolean indicadorObservacion) {
        this.indicadorObservacion = indicadorObservacion;
    }

    @Basic
    @Column(name = "Observacion", nullable = true, length = 500)
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
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

        Publicaciones that = (Publicaciones) o;

        if (idPublicacion != null ? !idPublicacion.equals(that.idPublicacion) : that.idPublicacion != null)
            return false;
        if (idRequerimiento != null ? !idRequerimiento.equals(that.idRequerimiento) : that.idRequerimiento != null)
            return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (indicadorSalario != null ? !indicadorSalario.equals(that.indicadorSalario) : that.indicadorSalario != null)
            return false;
        if (indicadorBonificacion != null ? !indicadorBonificacion.equals(that.indicadorBonificacion) : that.indicadorBonificacion != null)
            return false;
        if (idNivelEducacion != null ? !idNivelEducacion.equals(that.idNivelEducacion) : that.idNivelEducacion != null)
            return false;
        if (idTipoTrabajo != null ? !idTipoTrabajo.equals(that.idTipoTrabajo) : that.idTipoTrabajo != null)
            return false;
        if (descripcionGeneral != null ? !descripcionGeneral.equals(that.descripcionGeneral) : that.descripcionGeneral != null)
            return false;
        if (lugarTrabajo != null ? !lugarTrabajo.equals(that.lugarTrabajo) : that.lugarTrabajo != null) return false;
        if (competenciasLaborales != null ? !competenciasLaborales.equals(that.competenciasLaborales) : that.competenciasLaborales != null)
            return false;
        if (indicadorObservacion != null ? !indicadorObservacion.equals(that.indicadorObservacion) : that.indicadorObservacion != null)
            return false;
        if (observacion != null ? !observacion.equals(that.observacion) : that.observacion != null) return false;
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
        int result = idPublicacion != null ? idPublicacion.hashCode() : 0;
        result = 31 * result + (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (indicadorSalario != null ? indicadorSalario.hashCode() : 0);
        result = 31 * result + (indicadorBonificacion != null ? indicadorBonificacion.hashCode() : 0);
        result = 31 * result + (idNivelEducacion != null ? idNivelEducacion.hashCode() : 0);
        result = 31 * result + (idTipoTrabajo != null ? idTipoTrabajo.hashCode() : 0);
        result = 31 * result + (descripcionGeneral != null ? descripcionGeneral.hashCode() : 0);
        result = 31 * result + (lugarTrabajo != null ? lugarTrabajo.hashCode() : 0);
        result = 31 * result + (competenciasLaborales != null ? competenciasLaborales.hashCode() : 0);
        result = 31 * result + (indicadorObservacion != null ? indicadorObservacion.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
