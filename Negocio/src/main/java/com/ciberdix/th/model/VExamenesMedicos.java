package com.ciberdix.th.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 11/07/2017.
 */
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp fechaProgramada;
    private String opcion;
    private Integer idPreguntaOpcion;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorOtraInstitucion;
    private String nombreTercero;
    private Long idTercero;
    private String conceptoBienestar;
    private Integer idConceptoBienestar;
    private String detalle;
    private Boolean verificado;
    private Boolean indicadorNovedad;
    private String descripcion;
    private Integer idDiagnosticoCie;
    private String tipoExamenMedico;
    private Integer idTipoExamenMedico;
    private String numeroDocumento;
    private String cargo;
    private String tipoArea;
    private String area;

    public Integer getIdExamenMedico() {
        return idExamenMedico;
    }

    public void setIdExamenMedico(Integer idExamenMedico) {
        this.idExamenMedico = idExamenMedico;
    }

    public Integer getIdProcesoSeleccion() {
        return idProcesoSeleccion;
    }

    public void setIdProcesoSeleccion(Integer idProcesoSeleccion) {
        this.idProcesoSeleccion = idProcesoSeleccion;
    }

    public String getEstadoExamenMedico() {
        return estadoExamenMedico;
    }

    public void setEstadoExamenMedico(String estadoExamenMedico) {
        this.estadoExamenMedico = estadoExamenMedico;
    }

    public Integer getIdEstadoExamenMedico() {
        return idEstadoExamenMedico;
    }

    public void setIdEstadoExamenMedico(Integer idEstadoExamenMedico) {
        this.idEstadoExamenMedico = idEstadoExamenMedico;
    }

    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    public Boolean getIndicadorVerificado() {
        return indicadorVerificado;
    }

    public void setIndicadorVerificado(Boolean indicadorVerificado) {
        this.indicadorVerificado = indicadorVerificado;
    }

    public Integer getIdMaestroRespuesta() {
        return idMaestroRespuesta;
    }

    public void setIdMaestroRespuesta(Integer idMaestroRespuesta) {
        this.idMaestroRespuesta = idMaestroRespuesta;
    }

    public String getMedicoResponsable() {
        return medicoResponsable;
    }

    public void setMedicoResponsable(String medicoResponsable) {
        this.medicoResponsable = medicoResponsable;
    }

    public Integer getIdMedicoResponsable() {
        return idMedicoResponsable;
    }

    public void setIdMedicoResponsable(Integer idMedicoResponsable) {
        this.idMedicoResponsable = idMedicoResponsable;
    }

    public String getInstitucionMedica() {
        return institucionMedica;
    }

    public void setInstitucionMedica(String institucionMedica) {
        this.institucionMedica = institucionMedica;
    }

    public Integer getIdInstitucionMedica() {
        return idInstitucionMedica;
    }

    public void setIdInstitucionMedica(Integer idInstitucionMedica) {
        this.idInstitucionMedica = idInstitucionMedica;
    }

    public Timestamp getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Timestamp fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public Integer getIdPreguntaOpcion() {
        return idPreguntaOpcion;
    }

    public void setIdPreguntaOpcion(Integer idPreguntaOpcion) {
        this.idPreguntaOpcion = idPreguntaOpcion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    public Boolean getIndicadorOtraInstitucion() {
        return indicadorOtraInstitucion;
    }

    public void setIndicadorOtraInstitucion(Boolean indicadorOtraInstitucion) {
        this.indicadorOtraInstitucion = indicadorOtraInstitucion;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdConceptoBienestar() {
        return idConceptoBienestar;
    }

    public void setIdConceptoBienestar(Integer idConceptoBienestar) {
        this.idConceptoBienestar = idConceptoBienestar;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getVerificado() {
        return verificado;
    }

    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }

    public Boolean getIndicadorNovedad() {
        return indicadorNovedad;
    }

    public void setIndicadorNovedad(Boolean indicadorNovedad) {
        this.indicadorNovedad = indicadorNovedad;
    }

    public Integer getIdDiagnosticoCie() {
        return idDiagnosticoCie;
    }

    public void setIdDiagnosticoCie(Integer idDiagnosticoCie) {
        this.idDiagnosticoCie = idDiagnosticoCie;
    }

    public String getConceptoBienestar() {
        return conceptoBienestar;
    }

    public void setConceptoBienestar(String conceptoBienestar) {
        this.conceptoBienestar = conceptoBienestar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoExamenMedico() {
        return tipoExamenMedico;
    }

    public void setTipoExamenMedico(String tipoExamenMedico) {
        this.tipoExamenMedico = tipoExamenMedico;
    }

    public Integer getIdTipoExamenMedico() {
        return idTipoExamenMedico;
    }

    public void setIdTipoExamenMedico(Integer idTipoExamenMedico) {
        this.idTipoExamenMedico = idTipoExamenMedico;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
