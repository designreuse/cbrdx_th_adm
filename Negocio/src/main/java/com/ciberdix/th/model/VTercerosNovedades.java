package com.ciberdix.th.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

public class VTercerosNovedades {

    private Integer idTerceroNovedad;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String numeroDocumento;
    private String nombreTercero;
    private Integer idEstadoTercero;
    private Integer idEstructuraFisica;
    private String estructuraFisica;
    private Integer idEstructuraArea;
    private String estructuraArea;
    private Long idTercero;
    private String novedad;
    private String tipoNovedad;
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
    private String diagnostico;
    private Integer idDiagnostico;
    private String reemplazadoPor;
    private BigDecimal valor;
    private Integer nroCuotas;
    private String nroReferencia;
    private String entidad;
    private Integer idEntidad;
    private Date periodoInicial;
    private Date periodoFinal;
    private Boolean retiro;
    private String eps;
    private Integer idEps;
    private String fp;
    private Integer idFp;
    private String ccf;
    private Integer idCcf;
    private Boolean indicadorHabilitado;
    private String codigoValidacion;
    private String estadoNovedad;
    private Integer idEstadoNovedad;
    private Date fechaReporte;
    private String nombreTerceroReporta;
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

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
    }

    public Integer getIdEstadoTercero() {
        return idEstadoTercero;
    }

    public void setIdEstadoTercero(Integer idEstadoTercero) {
        this.idEstadoTercero = idEstadoTercero;
    }

    public String getEstructuraFisica() {
        return estructuraFisica;
    }

    public void setEstructuraFisica(String estructuraFisica) {
        this.estructuraFisica = estructuraFisica;
    }

    public String getEstructuraArea() {
        return estructuraArea;
    }

    public void setEstructuraArea(String estructuraArea) {
        this.estructuraArea = estructuraArea;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
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

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
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

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public Integer getIdEps() {
        return idEps;
    }

    public void setIdEps(Integer idEps) {
        this.idEps = idEps;
    }

    public String getFp() {
        return fp;
    }

    public void setFp(String fp) {
        this.fp = fp;
    }

    public Integer getIdFp() {
        return idFp;
    }

    public void setIdFp(Integer idFp) {
        this.idFp = idFp;
    }

    public String getCcf() {
        return ccf;
    }

    public void setCcf(String ccf) {
        this.ccf = ccf;
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

    public String getEstadoNovedad() {
        return estadoNovedad;
    }

    public void setEstadoNovedad(String estadoNovedad) {
        this.estadoNovedad = estadoNovedad;
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

    public String getNombreTerceroReporta() {
        return nombreTerceroReporta;
    }

    public void setNombreTerceroReporta(String nombreTerceroReporta) {
        this.nombreTerceroReporta = nombreTerceroReporta;
    }

    public Long getIdTerceroReporta() {
        return idTerceroReporta;
    }

    public void setIdTerceroReporta(Long idTerceroReporta) {
        this.idTerceroReporta = idTerceroReporta;
    }

    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
    }

    public Integer getIdEstructuraArea() {
        return idEstructuraArea;
    }

    public void setIdEstructuraArea(Integer idEstructuraArea) {
        this.idEstructuraArea = idEstructuraArea;
    }
}
