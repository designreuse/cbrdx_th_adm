package com.ciberdix.th.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

public class TercerosNovedades {

    private Integer idTerceroNovedad;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Long idTercero;
    private Integer idNovedad;
    private Date fechaInicio;
    private Date fechaFin;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp horaInicio;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp horaFin;
    private Date fechaReintegro;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp horaReintegro;
    private Integer dias;
    private Integer idDiagnostico;
    private String reemplazadoPor;
    private BigDecimal valor;
    private Integer nroCuotas;
    private String nroReferencia;
    private Integer idEntidad;
    private Date periodoInicial;
    private Date periodoFinal;
    private Boolean retiro;
    private Integer idEps;
    private Integer idFp;
    private Integer idCcf;
    private Boolean indicadorHabilitado;
    private String codigoValidacion;
    private Integer idEstadoNovedad;
    private Date fechaReporte;
    private Long idTerceroReporta;

    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Integer idNovedad) {
        this.idNovedad = idNovedad;
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

    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    public Date getFechaReintegro() {
        return fechaReintegro;
    }

    public void setFechaReintegro(Date fechaReintegro) {
        this.fechaReintegro = fechaReintegro;
    }

    public Timestamp getHoraReintegro() {
        return horaReintegro;
    }

    public void setHoraReintegro(Timestamp horaReintegro) {
        this.horaReintegro = horaReintegro;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getReemplazadoPor() {
        return reemplazadoPor;
    }

    public void setReemplazadoPor(String reemplazadoPor) {
        this.reemplazadoPor = reemplazadoPor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(Integer nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public String getNroReferencia() {
        return nroReferencia;
    }

    public void setNroReferencia(String nroReferencia) {
        this.nroReferencia = nroReferencia;
    }

    public Integer getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(Integer idEntidad) {
        this.idEntidad = idEntidad;
    }

    public Date getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(Date periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public Date getPeriodoFinal() {
        return periodoFinal;
    }

    public void setPeriodoFinal(Date periodoFinal) {
        this.periodoFinal = periodoFinal;
    }

    public Boolean getRetiro() {
        return retiro;
    }

    public void setRetiro(Boolean retiro) {
        this.retiro = retiro;
    }

    public Integer getIdEps() {
        return idEps;
    }

    public void setIdEps(Integer idEps) {
        this.idEps = idEps;
    }

    public Integer getIdFp() {
        return idFp;
    }

    public void setIdFp(Integer idFp) {
        this.idFp = idFp;
    }

    public Integer getIdCcf() {
        return idCcf;
    }

    public void setIdCcf(Integer idCcf) {
        this.idCcf = idCcf;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public String getCodigoValidacion() {
        return codigoValidacion;
    }

    public void setCodigoValidacion(String codigoValidacion) {
        this.codigoValidacion = codigoValidacion;
    }

    public Integer getIdEstadoNovedad() {
        return idEstadoNovedad;
    }

    public void setIdEstadoNovedad(Integer idEstadoNovedad) {
        this.idEstadoNovedad = idEstadoNovedad;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Long getIdTerceroReporta() {
        return idTerceroReporta;
    }

    public void setIdTerceroReporta(Long idTerceroReporta) {
        this.idTerceroReporta = idTerceroReporta;
    }
}
