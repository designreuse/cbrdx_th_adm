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
public class TercerosAdaptacionesLaborales {
    private Integer idTerceroAdaptacionLaboral;
    private Long idTercero;
    private Integer idCargo;
    private Timestamp fechaEvento;
    private Timestamp fechaRecomendaciones;
    private Boolean idTipoReincorporacion;
    private String tareas;
    private String materiales;
    private String ayudas;
    private String estandares;
    private String posturas;
    private String pausas;
    private Timestamp fechaControl;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroAdaptacionLaboral", nullable = false)
    public Integer getIdTerceroAdaptacionLaboral() {
        return idTerceroAdaptacionLaboral;
    }

    public void setIdTerceroAdaptacionLaboral(Integer idTerceroAdaptacionLaboral) {
        this.idTerceroAdaptacionLaboral = idTerceroAdaptacionLaboral;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
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
    @Column(name = "FechaEvento", nullable = true)
    public Timestamp getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Timestamp fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    @Basic
    @Column(name = "FechaRecomendaciones", nullable = true)
    public Timestamp getFechaRecomendaciones() {
        return fechaRecomendaciones;
    }

    public void setFechaRecomendaciones(Timestamp fechaRecomendaciones) {
        this.fechaRecomendaciones = fechaRecomendaciones;
    }

    @Basic
    @Column(name = "IdTipoReincorporacion", nullable = true)
    public Boolean getIdTipoReincorporacion() {
        return idTipoReincorporacion;
    }

    public void setIdTipoReincorporacion(Boolean idTipoReincorporacion) {
        this.idTipoReincorporacion = idTipoReincorporacion;
    }

    @Basic
    @Column(name = "Tareas", nullable = true, length = 100)
    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    @Basic
    @Column(name = "Materiales", nullable = true, length = 100)
    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    @Basic
    @Column(name = "Ayudas", nullable = true, length = 100)
    public String getAyudas() {
        return ayudas;
    }

    public void setAyudas(String ayudas) {
        this.ayudas = ayudas;
    }

    @Basic
    @Column(name = "Estandares", nullable = true, length = 100)
    public String getEstandares() {
        return estandares;
    }

    public void setEstandares(String estandares) {
        this.estandares = estandares;
    }

    @Basic
    @Column(name = "Posturas", nullable = true, length = 100)
    public String getPosturas() {
        return posturas;
    }

    public void setPosturas(String posturas) {
        this.posturas = posturas;
    }

    @Basic
    @Column(name = "Pausas", nullable = true, length = 100)
    public String getPausas() {
        return pausas;
    }

    public void setPausas(String pausas) {
        this.pausas = pausas;
    }

    @Basic
    @Column(name = "FechaControl", nullable = true)
    public Timestamp getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(Timestamp fechaControl) {
        this.fechaControl = fechaControl;
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

        TercerosAdaptacionesLaborales that = (TercerosAdaptacionesLaborales) o;

        if (idTerceroAdaptacionLaboral != null ? !idTerceroAdaptacionLaboral.equals(that.idTerceroAdaptacionLaboral) : that.idTerceroAdaptacionLaboral != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (fechaEvento != null ? !fechaEvento.equals(that.fechaEvento) : that.fechaEvento != null) return false;
        if (fechaRecomendaciones != null ? !fechaRecomendaciones.equals(that.fechaRecomendaciones) : that.fechaRecomendaciones != null)
            return false;
        if (idTipoReincorporacion != null ? !idTipoReincorporacion.equals(that.idTipoReincorporacion) : that.idTipoReincorporacion != null)
            return false;
        if (tareas != null ? !tareas.equals(that.tareas) : that.tareas != null) return false;
        if (materiales != null ? !materiales.equals(that.materiales) : that.materiales != null) return false;
        if (ayudas != null ? !ayudas.equals(that.ayudas) : that.ayudas != null) return false;
        if (estandares != null ? !estandares.equals(that.estandares) : that.estandares != null) return false;
        if (posturas != null ? !posturas.equals(that.posturas) : that.posturas != null) return false;
        if (pausas != null ? !pausas.equals(that.pausas) : that.pausas != null) return false;
        if (fechaControl != null ? !fechaControl.equals(that.fechaControl) : that.fechaControl != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroAdaptacionLaboral != null ? idTerceroAdaptacionLaboral.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (fechaEvento != null ? fechaEvento.hashCode() : 0);
        result = 31 * result + (fechaRecomendaciones != null ? fechaRecomendaciones.hashCode() : 0);
        result = 31 * result + (idTipoReincorporacion != null ? idTipoReincorporacion.hashCode() : 0);
        result = 31 * result + (tareas != null ? tareas.hashCode() : 0);
        result = 31 * result + (materiales != null ? materiales.hashCode() : 0);
        result = 31 * result + (ayudas != null ? ayudas.hashCode() : 0);
        result = 31 * result + (estandares != null ? estandares.hashCode() : 0);
        result = 31 * result + (posturas != null ? posturas.hashCode() : 0);
        result = 31 * result + (pausas != null ? pausas.hashCode() : 0);
        result = 31 * result + (fechaControl != null ? fechaControl.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
