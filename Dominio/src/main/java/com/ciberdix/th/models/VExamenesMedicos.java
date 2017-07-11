package com.ciberdix.th.models;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 11/07/2017.
 */
@Entity
@Table(name = "V_ExamenesMedicos", schema = "dbo", catalog = "CREZCAMOS")
public class VExamenesMedicos {
    private Integer idExamenMedico;
    private Integer idProcesoSeleccion;
    private String estadoExamenMedico;
    private Integer idEstadoExamenMedico;
    private String codigoVerificacion;
    private Boolean indicadorVerificado;
    private Integer idMaestroRespuesta;
    private String medicoResponsable;
    private Integer idMedicoResponsable;
    private String institucionMedica;
    private Integer idInstitucionMedica;
    private Date fechaProgramada;
    private String opcion;
    private Integer idPreguntaOpcion;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorOtraInstitucion;

    @Id
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
    @Column(name = "EstadoExamenMedico", nullable = true, length = 100)
    public String getEstadoExamenMedico() {
        return estadoExamenMedico;
    }

    public void setEstadoExamenMedico(String estadoExamenMedico) {
        this.estadoExamenMedico = estadoExamenMedico;
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
    @Column(name = "MedicoResponsable", nullable = false, length = 259)
    public String getMedicoResponsable() {
        return medicoResponsable;
    }

    public void setMedicoResponsable(String medicoResponsable) {
        this.medicoResponsable = medicoResponsable;
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
    @Column(name = "InstitucionMedica", nullable = true, length = 50)
    public String getInstitucionMedica() {
        return institucionMedica;
    }

    public void setInstitucionMedica(String institucionMedica) {
        this.institucionMedica = institucionMedica;
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
    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    @Basic
    @Column(name = "Opcion", nullable = true, length = 200)
    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
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
    @Column(name = "NombreArchivo", nullable = true, length = 100)
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
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

        VExamenesMedicos that = (VExamenesMedicos) o;

        if (idExamenMedico != null ? !idExamenMedico.equals(that.idExamenMedico) : that.idExamenMedico != null)
            return false;
        if (idProcesoSeleccion != null ? !idProcesoSeleccion.equals(that.idProcesoSeleccion) : that.idProcesoSeleccion != null)
            return false;
        if (estadoExamenMedico != null ? !estadoExamenMedico.equals(that.estadoExamenMedico) : that.estadoExamenMedico != null)
            return false;
        if (idEstadoExamenMedico != null ? !idEstadoExamenMedico.equals(that.idEstadoExamenMedico) : that.idEstadoExamenMedico != null)
            return false;
        if (codigoVerificacion != null ? !codigoVerificacion.equals(that.codigoVerificacion) : that.codigoVerificacion != null)
            return false;
        if (indicadorVerificado != null ? !indicadorVerificado.equals(that.indicadorVerificado) : that.indicadorVerificado != null)
            return false;
        if (idMaestroRespuesta != null ? !idMaestroRespuesta.equals(that.idMaestroRespuesta) : that.idMaestroRespuesta != null)
            return false;
        if (medicoResponsable != null ? !medicoResponsable.equals(that.medicoResponsable) : that.medicoResponsable != null)
            return false;
        if (idMedicoResponsable != null ? !idMedicoResponsable.equals(that.idMedicoResponsable) : that.idMedicoResponsable != null)
            return false;
        if (institucionMedica != null ? !institucionMedica.equals(that.institucionMedica) : that.institucionMedica != null)
            return false;
        if (idInstitucionMedica != null ? !idInstitucionMedica.equals(that.idInstitucionMedica) : that.idInstitucionMedica != null)
            return false;
        if (fechaProgramada != null ? !fechaProgramada.equals(that.fechaProgramada) : that.fechaProgramada != null)
            return false;
        if (opcion != null ? !opcion.equals(that.opcion) : that.opcion != null) return false;
        if (idPreguntaOpcion != null ? !idPreguntaOpcion.equals(that.idPreguntaOpcion) : that.idPreguntaOpcion != null)
            return false;
        if (nombreArchivo != null ? !nombreArchivo.equals(that.nombreArchivo) : that.nombreArchivo != null)
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
        result = 31 * result + (estadoExamenMedico != null ? estadoExamenMedico.hashCode() : 0);
        result = 31 * result + (idEstadoExamenMedico != null ? idEstadoExamenMedico.hashCode() : 0);
        result = 31 * result + (codigoVerificacion != null ? codigoVerificacion.hashCode() : 0);
        result = 31 * result + (indicadorVerificado != null ? indicadorVerificado.hashCode() : 0);
        result = 31 * result + (idMaestroRespuesta != null ? idMaestroRespuesta.hashCode() : 0);
        result = 31 * result + (medicoResponsable != null ? medicoResponsable.hashCode() : 0);
        result = 31 * result + (idMedicoResponsable != null ? idMedicoResponsable.hashCode() : 0);
        result = 31 * result + (institucionMedica != null ? institucionMedica.hashCode() : 0);
        result = 31 * result + (idInstitucionMedica != null ? idInstitucionMedica.hashCode() : 0);
        result = 31 * result + (fechaProgramada != null ? fechaProgramada.hashCode() : 0);
        result = 31 * result + (opcion != null ? opcion.hashCode() : 0);
        result = 31 * result + (idPreguntaOpcion != null ? idPreguntaOpcion.hashCode() : 0);
        result = 31 * result + (nombreArchivo != null ? nombreArchivo.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorOtraInstitucion != null ? indicadorOtraInstitucion.hashCode() : 0);
        return result;
    }
}
