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
public class Capacitaciones {
    private Integer idCapacitacion;
    private String titulo;
    private String temas;
    private Integer idTipoCapacitacion;
    private Integer idModalidad;
    private Integer intensidad;
    private Integer cupos;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    private Boolean indicadorNota;
    private Boolean indicadorInscripcion;
    private Integer idDirigidaA;
    private Integer idLugar;
    private Integer idEstado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCapacitacion", nullable = false)
    public Integer getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(Integer idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    @Basic
    @Column(name = "Titulo", nullable = true, length = 50)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Basic
    @Column(name = "Temas", nullable = true, length = 400)
    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    @Basic
    @Column(name = "IdTipoCapacitacion", nullable = true)
    public Integer getIdTipoCapacitacion() {
        return idTipoCapacitacion;
    }

    public void setIdTipoCapacitacion(Integer idTipoCapacitacion) {
        this.idTipoCapacitacion = idTipoCapacitacion;
    }

    @Basic
    @Column(name = "IdModalidad", nullable = true)
    public Integer getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(Integer idModalidad) {
        this.idModalidad = idModalidad;
    }

    @Basic
    @Column(name = "Intensidad", nullable = true, precision = 0)
    public Integer getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(Integer intensidad) {
        this.intensidad = intensidad;
    }

    @Basic
    @Column(name = "Cupos", nullable = true, precision = 0)
    public Integer getCupos() {
        return cupos;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }

    @Basic
    @Column(name = "FechaInicio", nullable = true)
    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin", nullable = true)
    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "IndicadorNota", nullable = true)
    public Boolean getIndicadorNota() {
        return indicadorNota;
    }

    public void setIndicadorNota(Boolean indicadorNota) {
        this.indicadorNota = indicadorNota;
    }

    @Basic
    @Column(name = "IndicadorInscripcion", nullable = true)
    public Boolean getIndicadorInscripcion() {
        return indicadorInscripcion;
    }

    public void setIndicadorInscripcion(Boolean indicadorInscripcion) {
        this.indicadorInscripcion = indicadorInscripcion;
    }

    @Basic
    @Column(name = "IdDirigidaA", nullable = true)
    public Integer getIdDirigidaA() {
        return idDirigidaA;
    }

    public void setIdDirigidaA(Integer idDirigidaA) {
        this.idDirigidaA = idDirigidaA;
    }

    @Basic
    @Column(name = "IdLugar", nullable = true)
    public Integer getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(Integer idLugar) {
        this.idLugar = idLugar;
    }

    @Basic
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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

        Capacitaciones that = (Capacitaciones) o;

        if (idCapacitacion != null ? !idCapacitacion.equals(that.idCapacitacion) : that.idCapacitacion != null)
            return false;
        if (titulo != null ? !titulo.equals(that.titulo) : that.titulo != null) return false;
        if (temas != null ? !temas.equals(that.temas) : that.temas != null) return false;
        if (idTipoCapacitacion != null ? !idTipoCapacitacion.equals(that.idTipoCapacitacion) : that.idTipoCapacitacion != null)
            return false;
        if (idModalidad != null ? !idModalidad.equals(that.idModalidad) : that.idModalidad != null) return false;
        if (intensidad != null ? !intensidad.equals(that.intensidad) : that.intensidad != null) return false;
        if (cupos != null ? !cupos.equals(that.cupos) : that.cupos != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (indicadorNota != null ? !indicadorNota.equals(that.indicadorNota) : that.indicadorNota != null)
            return false;
        if (indicadorInscripcion != null ? !indicadorInscripcion.equals(that.indicadorInscripcion) : that.indicadorInscripcion != null)
            return false;
        if (idDirigidaA != null ? !idDirigidaA.equals(that.idDirigidaA) : that.idDirigidaA != null) return false;
        if (idLugar != null ? !idLugar.equals(that.idLugar) : that.idLugar != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCapacitacion != null ? idCapacitacion.hashCode() : 0;
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (temas != null ? temas.hashCode() : 0);
        result = 31 * result + (idTipoCapacitacion != null ? idTipoCapacitacion.hashCode() : 0);
        result = 31 * result + (idModalidad != null ? idModalidad.hashCode() : 0);
        result = 31 * result + (intensidad != null ? intensidad.hashCode() : 0);
        result = 31 * result + (cupos != null ? cupos.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (indicadorNota != null ? indicadorNota.hashCode() : 0);
        result = 31 * result + (indicadorInscripcion != null ? indicadorInscripcion.hashCode() : 0);
        result = 31 * result + (idDirigidaA != null ? idDirigidaA.hashCode() : 0);
        result = 31 * result + (idLugar != null ? idLugar.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
