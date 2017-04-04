package com.ciberdix.th.model.refactor;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class VTercerosDatosClinicos {
    private Integer idTerceroDatoClinico;
    private Integer idDiagnosticoCie;
    private String codigo;
    private String descripcion;
    private Long idTercero;
    private Integer idDiagnostico;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;    

    public Integer getIdTerceroDatoClinico() {
        return idTerceroDatoClinico;
    }

    public void setIdTerceroDatoClinico(Integer idTerceroDatoClinico) {
        this.idTerceroDatoClinico = idTerceroDatoClinico;
    }

    public Integer getIdDiagnosticoCie() {
        return idDiagnosticoCie;
    }

    public void setIdDiagnosticoCie(Integer idDiagnosticoCie) {
        this.idDiagnosticoCie = idDiagnosticoCie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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
}
