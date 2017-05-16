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
public class CapacitacionesGruposPreguntas {
    private Integer idCapacitacionGrupoPregunta;
    private Integer idCapacitacion;
    private String grupoPregunta;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCapacitacionGrupoPregunta")
    public Integer getIdCapacitacionGrupoPregunta() {
        return idCapacitacionGrupoPregunta;
    }

    public void setIdCapacitacionGrupoPregunta(Integer idCapacitacionGrupoPregunta) {
        this.idCapacitacionGrupoPregunta = idCapacitacionGrupoPregunta;
    }

    @Basic
    @Column(name = "IdCapacitacion")
    public Integer getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(Integer idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    @Basic
    @Column(name = "GrupoPregunta")
    public String getGrupoPregunta() {
        return grupoPregunta;
    }

    public void setGrupoPregunta(String grupoPregunta) {
        this.grupoPregunta = grupoPregunta;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

        CapacitacionesGruposPreguntas that = (CapacitacionesGruposPreguntas) o;

        if (idCapacitacionGrupoPregunta != null ? !idCapacitacionGrupoPregunta.equals(that.idCapacitacionGrupoPregunta) : that.idCapacitacionGrupoPregunta != null)
            return false;
        if (idCapacitacion != null ? !idCapacitacion.equals(that.idCapacitacion) : that.idCapacitacion != null)
            return false;
        if (grupoPregunta != null ? !grupoPregunta.equals(that.grupoPregunta) : that.grupoPregunta != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
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
        int result = idCapacitacionGrupoPregunta != null ? idCapacitacionGrupoPregunta.hashCode() : 0;
        result = 31 * result + (idCapacitacion != null ? idCapacitacion.hashCode() : 0);
        result = 31 * result + (grupoPregunta != null ? grupoPregunta.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
