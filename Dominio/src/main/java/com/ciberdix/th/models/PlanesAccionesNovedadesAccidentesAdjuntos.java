package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "PlanesAccionesNovedadesAccidentesAdjuntos", schema = "dbo", catalog = "CREZCAMOS")
public class PlanesAccionesNovedadesAccidentesAdjuntos {
    private Integer idPlanAccionNovedadAccidenteAdjunto;
    private Integer idPlanAccionNovedadAccidente;
    private Integer idAdjunto;
    private Boolean indicadorRespuesta;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public PlanesAccionesNovedadesAccidentesAdjuntos() {
    }

    public PlanesAccionesNovedadesAccidentesAdjuntos(Integer idPlanAccionNovedadAccidente, Integer idAdjunto, Boolean indicadorRespuesta, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idPlanAccionNovedadAccidente = idPlanAccionNovedadAccidente;
        this.idAdjunto = idAdjunto;
        this.indicadorRespuesta = indicadorRespuesta;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public PlanesAccionesNovedadesAccidentesAdjuntos(Integer idPlanAccionNovedadAccidenteAdjunto, Integer idPlanAccionNovedadAccidente, Integer idAdjunto, Boolean indicadorRespuesta, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idPlanAccionNovedadAccidenteAdjunto = idPlanAccionNovedadAccidenteAdjunto;
        this.idPlanAccionNovedadAccidente = idPlanAccionNovedadAccidente;
        this.idAdjunto = idAdjunto;
        this.indicadorRespuesta = indicadorRespuesta;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdPlanAccionNovedadAccidenteAdjunto", nullable = false)
    public Integer getIdPlanAccionNovedadAccidenteAdjunto() {
        return idPlanAccionNovedadAccidenteAdjunto;
    }

    public void setIdPlanAccionNovedadAccidenteAdjunto(Integer idPlanAccionNovedadAccidenteAdjunto) {
        this.idPlanAccionNovedadAccidenteAdjunto = idPlanAccionNovedadAccidenteAdjunto;
    }

    @Basic
    @Column(name = "IdPlanAccionNovedadAccidente", nullable = true)
    public Integer getIdPlanAccionNovedadAccidente() {
        return idPlanAccionNovedadAccidente;
    }

    public void setIdPlanAccionNovedadAccidente(Integer idPlanAccionNovedadAccidente) {
        this.idPlanAccionNovedadAccidente = idPlanAccionNovedadAccidente;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "IndicadorRespuesta", nullable = true)
    public Boolean getIndicadorRespuesta() {
        return indicadorRespuesta;
    }

    public void setIndicadorRespuesta(Boolean indicadorRespuesta) {
        this.indicadorRespuesta = indicadorRespuesta;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlanesAccionesNovedadesAccidentesAdjuntos that = (PlanesAccionesNovedadesAccidentesAdjuntos) o;

        if (idPlanAccionNovedadAccidenteAdjunto != null ? !idPlanAccionNovedadAccidenteAdjunto.equals(that.idPlanAccionNovedadAccidenteAdjunto) : that.idPlanAccionNovedadAccidenteAdjunto != null)
            return false;
        if (idPlanAccionNovedadAccidente != null ? !idPlanAccionNovedadAccidente.equals(that.idPlanAccionNovedadAccidente) : that.idPlanAccionNovedadAccidente != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (indicadorRespuesta != null ? !indicadorRespuesta.equals(that.indicadorRespuesta) : that.indicadorRespuesta != null)
            return false;
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
        int result = idPlanAccionNovedadAccidenteAdjunto != null ? idPlanAccionNovedadAccidenteAdjunto.hashCode() : 0;
        result = 31 * result + (idPlanAccionNovedadAccidente != null ? idPlanAccionNovedadAccidente.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorRespuesta != null ? indicadorRespuesta.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
