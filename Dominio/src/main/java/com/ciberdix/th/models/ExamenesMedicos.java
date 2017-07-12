package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 12/07/2017.
 */
@Entity
@Table(name = "EstructuraOrganizacional", schema = "dbo", catalog = "CREZCAMOS")
public class ExamenesMedicos {
    private Integer idExamenMedico;
    private Integer idProcesoSeleccion;
    private Integer idEstadoExamenMedico;
    private String codigoVerificacion;
    private Boolean indicadorVerificado;
    private Integer idMaestroRespuesta;
    private Integer idMedicoResponsable;
    private Integer idInstitucionMedica;
    private Timestamp fechaProgramada;
    private Integer idPreguntaOpcion;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorOtraInstitucion;

    public ExamenesMedicos() {
    }

    public ExamenesMedicos(Integer idProcesoSeleccion, Integer idEstadoExamenMedico, String codigoVerificacion, Boolean indicadorVerificado, Integer idMaestroRespuesta, Integer idMedicoResponsable, Integer idInstitucionMedica, Timestamp fechaProgramada, Integer idPreguntaOpcion, Integer idAdjunto, Integer auditoriaUsuario, Boolean indicadorOtraInstitucion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
        this.idEstadoExamenMedico = idEstadoExamenMedico;
        this.codigoVerificacion = codigoVerificacion;
        this.indicadorVerificado = indicadorVerificado;
        this.idMaestroRespuesta = idMaestroRespuesta;
        this.idMedicoResponsable = idMedicoResponsable;
        this.idInstitucionMedica = idInstitucionMedica;
        this.fechaProgramada = fechaProgramada;
        this.idPreguntaOpcion = idPreguntaOpcion;
        this.idAdjunto = idAdjunto;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorOtraInstitucion = indicadorOtraInstitucion;
    }

    public ExamenesMedicos(Integer idExamenMedico, Integer idProcesoSeleccion, Integer idEstadoExamenMedico, String codigoVerificacion, Boolean indicadorVerificado, Integer idMaestroRespuesta, Integer idMedicoResponsable, Integer idInstitucionMedica, Timestamp fechaProgramada, Integer idPreguntaOpcion, Integer idAdjunto, Integer auditoriaUsuario, Boolean indicadorOtraInstitucion) {
        this.idExamenMedico = idExamenMedico;
        this.idProcesoSeleccion = idProcesoSeleccion;
        this.idEstadoExamenMedico = idEstadoExamenMedico;
        this.codigoVerificacion = codigoVerificacion;
        this.indicadorVerificado = indicadorVerificado;
        this.idMaestroRespuesta = idMaestroRespuesta;
        this.idMedicoResponsable = idMedicoResponsable;
        this.idInstitucionMedica = idInstitucionMedica;
        this.fechaProgramada = fechaProgramada;
        this.idPreguntaOpcion = idPreguntaOpcion;
        this.idAdjunto = idAdjunto;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorOtraInstitucion = indicadorOtraInstitucion;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdExamenMedico", nullable = false)
    public Integer getIdExamenMedico() {
        return idExamenMedico;
    }

    public void setIdExamenMedico(Integer idExamenMedico) {
        this.idExamenMedico = idExamenMedico;
    }

    @Basic
    @Column(name = "IdProcesoSeleccion", nullable = true)
    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    @Basic
    @Column(name = "IdEstadoExamenMedico", nullable = true)
    public Integer getIdEstadoExamenMedico() {
        return idEstadoExamenMedico;
    }

    public void setIdEstadoExamenMedico(Integer idEstadoExamenMedico) {
        this.idEstadoExamenMedico = idEstadoExamenMedico;
    }

    @Basic
    @Column(name = "CodigoVerificacion", nullable = true, length = 10)
    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    @Basic
    @Column(name = "IndicadorVerificado", nullable = true)
    public Boolean getIndicadorVerificado() {
        return indicadorVerificado;
    }

    public void setIndicadorVerificado(Boolean indicadorVerificado) {
        this.indicadorVerificado = indicadorVerificado;
    }

    @Basic
    @Column(name = "IdMaestroRespuesta", nullable = true)
    public Integer getIdMaestroRespuesta() {
        return idMaestroRespuesta;
    }

    public void setIdMaestroRespuesta(Integer idMaestroRespuesta) {
        this.idMaestroRespuesta = idMaestroRespuesta;
    }

    @Basic
    @Column(name = "IdMedicoResponsable", nullable = true)
    public Integer getIdMedicoResponsable() {
        return idMedicoResponsable;
    }

    public void setIdMedicoResponsable(Integer idMedicoResponsable) {
        this.idMedicoResponsable = idMedicoResponsable;
    }

    @Basic
    @Column(name = "IdInstitucionMedica", nullable = true)
    public Integer getIdInstitucionMedica() {
        return idInstitucionMedica;
    }

    public void setIdInstitucionMedica(Integer idInstitucionMedica) {
        this.idInstitucionMedica = idInstitucionMedica;
    }

    @Basic
    @Column(name = "FechaProgramada", nullable = true)
    public Timestamp getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Timestamp fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    @Basic
    @Column(name = "IdPreguntaOpcion", nullable = true)
    public Integer getIdPreguntaOpcion() {
        return idPreguntaOpcion;
    }

    public void setIdPreguntaOpcion(Integer idPreguntaOpcion) {
        this.idPreguntaOpcion = idPreguntaOpcion;
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
    @Column(name = "IndicadorOtraInstitucion", nullable = true)
    public Boolean getIndicadorOtraInstitucion() {
        return indicadorOtraInstitucion;
    }

    public void setIndicadorOtraInstitucion(Boolean indicadorOtraInstitucion) {
        this.indicadorOtraInstitucion = indicadorOtraInstitucion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamenesMedicos that = (ExamenesMedicos) o;

        if (idExamenMedico != null ? !idExamenMedico.equals(that.idExamenMedico) : that.idExamenMedico != null)
            return false;
        if (idProcesoSeleccion != null ? !idProcesoSeleccion.equals(that.idProcesoSeleccion) : that.idProcesoSeleccion != null)
            return false;
        if (idEstadoExamenMedico != null ? !idEstadoExamenMedico.equals(that.idEstadoExamenMedico) : that.idEstadoExamenMedico != null)
            return false;
        if (codigoVerificacion != null ? !codigoVerificacion.equals(that.codigoVerificacion) : that.codigoVerificacion != null)
            return false;
        if (indicadorVerificado != null ? !indicadorVerificado.equals(that.indicadorVerificado) : that.indicadorVerificado != null)
            return false;
        if (idMaestroRespuesta != null ? !idMaestroRespuesta.equals(that.idMaestroRespuesta) : that.idMaestroRespuesta != null)
            return false;
        if (idMedicoResponsable != null ? !idMedicoResponsable.equals(that.idMedicoResponsable) : that.idMedicoResponsable != null)
            return false;
        if (idInstitucionMedica != null ? !idInstitucionMedica.equals(that.idInstitucionMedica) : that.idInstitucionMedica != null)
            return false;
        if (fechaProgramada != null ? !fechaProgramada.equals(that.fechaProgramada) : that.fechaProgramada != null)
            return false;
        if (idPreguntaOpcion != null ? !idPreguntaOpcion.equals(that.idPreguntaOpcion) : that.idPreguntaOpcion != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorOtraInstitucion != null ? !indicadorOtraInstitucion.equals(that.indicadorOtraInstitucion) : that.indicadorOtraInstitucion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idExamenMedico != null ? idExamenMedico.hashCode() : 0;
        result = 31 * result + (idProcesoSeleccion != null ? idProcesoSeleccion.hashCode() : 0);
        result = 31 * result + (idEstadoExamenMedico != null ? idEstadoExamenMedico.hashCode() : 0);
        result = 31 * result + (codigoVerificacion != null ? codigoVerificacion.hashCode() : 0);
        result = 31 * result + (indicadorVerificado != null ? indicadorVerificado.hashCode() : 0);
        result = 31 * result + (idMaestroRespuesta != null ? idMaestroRespuesta.hashCode() : 0);
        result = 31 * result + (idMedicoResponsable != null ? idMedicoResponsable.hashCode() : 0);
        result = 31 * result + (idInstitucionMedica != null ? idInstitucionMedica.hashCode() : 0);
        result = 31 * result + (fechaProgramada != null ? fechaProgramada.hashCode() : 0);
        result = 31 * result + (idPreguntaOpcion != null ? idPreguntaOpcion.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorOtraInstitucion != null ? indicadorOtraInstitucion.hashCode() : 0);
        return result;
    }
}
