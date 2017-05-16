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
public class BeneficiosSolicitudesEvaluaciones {
    private Integer idBeneficioSolicitudEvaluacion;
    private Integer idBeneficioSolicitud;
    private Integer idBeneficioRequisito;
    private Boolean indicadorCumplimiento;
    private String adjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdBeneficioSolicitudEvaluacion")
    public Integer getIdBeneficioSolicitudEvaluacion() {
        return idBeneficioSolicitudEvaluacion;
    }

    public void setIdBeneficioSolicitudEvaluacion(Integer idBeneficioSolicitudEvaluacion) {
        this.idBeneficioSolicitudEvaluacion = idBeneficioSolicitudEvaluacion;
    }

    @Basic
    @Column(name = "IdBeneficioSolicitud")
    public Integer getIdBeneficioSolicitud() {
        return idBeneficioSolicitud;
    }

    public void setIdBeneficioSolicitud(Integer idBeneficioSolicitud) {
        this.idBeneficioSolicitud = idBeneficioSolicitud;
    }

    @Basic
    @Column(name = "IdBeneficioRequisito")
    public Integer getIdBeneficioRequisito() {
        return idBeneficioRequisito;
    }

    public void setIdBeneficioRequisito(Integer idBeneficioRequisito) {
        this.idBeneficioRequisito = idBeneficioRequisito;
    }

    @Basic
    @Column(name = "IndicadorCumplimiento")
    public Boolean getIndicadorCumplimiento() {
        return indicadorCumplimiento;
    }

    public void setIndicadorCumplimiento(Boolean indicadorCumplimiento) {
        this.indicadorCumplimiento = indicadorCumplimiento;
    }

    @Basic
    @Column(name = "Adjunto")
    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
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

        BeneficiosSolicitudesEvaluaciones that = (BeneficiosSolicitudesEvaluaciones) o;

        if (idBeneficioSolicitudEvaluacion != null ? !idBeneficioSolicitudEvaluacion.equals(that.idBeneficioSolicitudEvaluacion) : that.idBeneficioSolicitudEvaluacion != null)
            return false;
        if (idBeneficioSolicitud != null ? !idBeneficioSolicitud.equals(that.idBeneficioSolicitud) : that.idBeneficioSolicitud != null)
            return false;
        if (idBeneficioRequisito != null ? !idBeneficioRequisito.equals(that.idBeneficioRequisito) : that.idBeneficioRequisito != null)
            return false;
        if (indicadorCumplimiento != null ? !indicadorCumplimiento.equals(that.indicadorCumplimiento) : that.indicadorCumplimiento != null)
            return false;
        if (adjunto != null ? !adjunto.equals(that.adjunto) : that.adjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBeneficioSolicitudEvaluacion != null ? idBeneficioSolicitudEvaluacion.hashCode() : 0;
        result = 31 * result + (idBeneficioSolicitud != null ? idBeneficioSolicitud.hashCode() : 0);
        result = 31 * result + (idBeneficioRequisito != null ? idBeneficioRequisito.hashCode() : 0);
        result = 31 * result + (indicadorCumplimiento != null ? indicadorCumplimiento.hashCode() : 0);
        result = 31 * result + (adjunto != null ? adjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
