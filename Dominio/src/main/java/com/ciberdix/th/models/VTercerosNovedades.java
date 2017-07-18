package com.ciberdix.th.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "V_TercerosNovedades", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosNovedades {
    private Integer idTerceroNovedad;
    private String descripcion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String nombreTercero;
    private Long idTercero;
    private String novedad;
    private String tipoNovedad;
    private Integer idNovedad;
    private Date fechaInicio;
    private Date fechaFin;
    private Timestamp horaInicio;
    private Timestamp horaFin;
    private Date fechaReintegro;
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

    @Id
    @Column(name = "IdTerceroNovedad", nullable = false)
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    @Column(name = "NombreTercero", nullable = false, length = 259)
    public String getNombreTercero() {
        return nombreTercero;
    }

    public void setNombreTercero(String nombreTercero) {
        this.nombreTercero = nombreTercero;
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
    @Column(name = "Novedad", nullable = true, length = 100)
    public String getNovedad() {
        return novedad;
    }

    public void setNovedad(String novedad) {
        this.novedad = novedad;
    }

    @Basic
    @Column(name = "TipoNovedad", nullable = true, length = 100)
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
    }

    @Basic
    @Column(name = "IdNovedad", nullable = true)
    public Integer getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Integer idNovedad) {
        this.idNovedad = idNovedad;
    }

    @Basic
    @Column(name = "FechaInicio", nullable = true)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "HoraInicio", nullable = true)
    public Timestamp getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Timestamp horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Basic
    @Column(name = "HoraFin", nullable = true)
    public Timestamp getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Timestamp horaFin) {
        this.horaFin = horaFin;
    }

    @Basic
    @Column(name = "FechaReintegro", nullable = true)
    public Date getFechaReintegro() {
        return fechaReintegro;
    }

    public void setFechaReintegro(Date fechaReintegro) {
        this.fechaReintegro = fechaReintegro;
    }

    @Basic
    @Column(name = "HoraReintegro", nullable = true)
    public Timestamp getHoraReintegro() {
        return horaReintegro;
    }

    public void setHoraReintegro(Timestamp horaReintegro) {
        this.horaReintegro = horaReintegro;
    }

    @Basic
    @Column(name = "Dias", nullable = true)
    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    @Basic
    @Column(name = "Diagnostico", nullable = true, length = 100)
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Basic
    @Column(name = "IdDiagnostico", nullable = true)
    public Integer getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Integer idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    @Basic
    @Column(name = "ReemplazadoPor", nullable = true, length = 200)
    public String getReemplazadoPor() {
        return reemplazadoPor;
    }

    public void setReemplazadoPor(String reemplazadoPor) {
        this.reemplazadoPor = reemplazadoPor;
    }

    @Basic
    @Column(name = "Valor", nullable = true, precision = 2)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "NroCuotas", nullable = true)
    public Integer getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(Integer nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    @Basic
    @Column(name = "NroReferencia", nullable = true, length = 100)
    public String getNroReferencia() {
        return nroReferencia;
    }

    public void setNroReferencia(String nroReferencia) {
        this.nroReferencia = nroReferencia;
    }

    @Basic
    @Column(name = "Entidad", nullable = true, length = 100)
    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Basic
    @Column(name = "IdEntidad", nullable = true)
    public Integer getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(Integer idEntidad) {
        this.idEntidad = idEntidad;
    }

    @Basic
    @Column(name = "PeriodoInicial", nullable = true)
    public Date getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(Date periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    @Basic
    @Column(name = "PeriodoFinal", nullable = true)
    public Date getPeriodoFinal() {
        return periodoFinal;
    }

    public void setPeriodoFinal(Date periodoFinal) {
        this.periodoFinal = periodoFinal;
    }

    @Basic
    @Column(name = "Retiro", nullable = true)
    public Boolean getRetiro() {
        return retiro;
    }

    public void setRetiro(Boolean retiro) {
        this.retiro = retiro;
    }

    @Basic
    @Column(name = "EPS", nullable = true, length = 100)
    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    @Basic
    @Column(name = "IdEPS", nullable = true)
    public Integer getIdEps() {
        return idEps;
    }

    public void setIdEps(Integer idEps) {
        this.idEps = idEps;
    }

    @Basic
    @Column(name = "FP", nullable = true, length = 100)
    public String getFp() {
        return fp;
    }

    public void setFp(String fp) {
        this.fp = fp;
    }

    @Basic
    @Column(name = "IdFP", nullable = true)
    public Integer getIdFp() {
        return idFp;
    }

    public void setIdFp(Integer idFp) {
        this.idFp = idFp;
    }

    @Basic
    @Column(name = "CCF", nullable = true, length = 100)
    public String getCcf() {
        return ccf;
    }

    public void setCcf(String ccf) {
        this.ccf = ccf;
    }

    @Basic
    @Column(name = "IdCCF", nullable = true)
    public Integer getIdCcf() {
        return idCcf;
    }

    public void setIdCcf(Integer idCcf) {
        this.idCcf = idCcf;
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
    @Column(name = "CodigoValidacion", nullable = true, length = 10)
    public String getCodigoValidacion() {
        return codigoValidacion;
    }

    public void setCodigoValidacion(String codigoValidacion) {
        this.codigoValidacion = codigoValidacion;
    }

    @Basic
    @Column(name = "EstadoNovedad", nullable = true, length = 100)
    public String getEstadoNovedad() {
        return estadoNovedad;
    }

    public void setEstadoNovedad(String estadoNovedad) {
        this.estadoNovedad = estadoNovedad;
    }

    @Basic
    @Column(name = "IdEstadoNovedad", nullable = true)
    public Integer getIdEstadoNovedad() {
        return idEstadoNovedad;
    }

    public void setIdEstadoNovedad(Integer idEstadoNovedad) {
        this.idEstadoNovedad = idEstadoNovedad;
    }

    @Basic
    @Column(name = "FechaReporte", nullable = true)
    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    @Basic
    @Column(name = "NombreTerceroReporta", nullable = false, length = 259)
    public String getNombreTerceroReporta() {
        return nombreTerceroReporta;
    }

    public void setNombreTerceroReporta(String nombreTerceroReporta) {
        this.nombreTerceroReporta = nombreTerceroReporta;
    }

    @Basic
    @Column(name = "IdTerceroReporta", nullable = true)
    public Long getIdTerceroReporta() {
        return idTerceroReporta;
    }

    public void setIdTerceroReporta(Long idTerceroReporta) {
        this.idTerceroReporta = idTerceroReporta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTercerosNovedades that = (VTercerosNovedades) o;

        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (nombreTercero != null ? !nombreTercero.equals(that.nombreTercero) : that.nombreTercero != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (novedad != null ? !novedad.equals(that.novedad) : that.novedad != null) return false;
        if (tipoNovedad != null ? !tipoNovedad.equals(that.tipoNovedad) : that.tipoNovedad != null) return false;
        if (idNovedad != null ? !idNovedad.equals(that.idNovedad) : that.idNovedad != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (horaInicio != null ? !horaInicio.equals(that.horaInicio) : that.horaInicio != null) return false;
        if (horaFin != null ? !horaFin.equals(that.horaFin) : that.horaFin != null) return false;
        if (fechaReintegro != null ? !fechaReintegro.equals(that.fechaReintegro) : that.fechaReintegro != null)
            return false;
        if (horaReintegro != null ? !horaReintegro.equals(that.horaReintegro) : that.horaReintegro != null)
            return false;
        if (dias != null ? !dias.equals(that.dias) : that.dias != null) return false;
        if (diagnostico != null ? !diagnostico.equals(that.diagnostico) : that.diagnostico != null) return false;
        if (idDiagnostico != null ? !idDiagnostico.equals(that.idDiagnostico) : that.idDiagnostico != null)
            return false;
        if (reemplazadoPor != null ? !reemplazadoPor.equals(that.reemplazadoPor) : that.reemplazadoPor != null)
            return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (nroCuotas != null ? !nroCuotas.equals(that.nroCuotas) : that.nroCuotas != null) return false;
        if (nroReferencia != null ? !nroReferencia.equals(that.nroReferencia) : that.nroReferencia != null)
            return false;
        if (entidad != null ? !entidad.equals(that.entidad) : that.entidad != null) return false;
        if (idEntidad != null ? !idEntidad.equals(that.idEntidad) : that.idEntidad != null) return false;
        if (periodoInicial != null ? !periodoInicial.equals(that.periodoInicial) : that.periodoInicial != null)
            return false;
        if (periodoFinal != null ? !periodoFinal.equals(that.periodoFinal) : that.periodoFinal != null) return false;
        if (retiro != null ? !retiro.equals(that.retiro) : that.retiro != null) return false;
        if (eps != null ? !eps.equals(that.eps) : that.eps != null) return false;
        if (idEps != null ? !idEps.equals(that.idEps) : that.idEps != null) return false;
        if (fp != null ? !fp.equals(that.fp) : that.fp != null) return false;
        if (idFp != null ? !idFp.equals(that.idFp) : that.idFp != null) return false;
        if (ccf != null ? !ccf.equals(that.ccf) : that.ccf != null) return false;
        if (idCcf != null ? !idCcf.equals(that.idCcf) : that.idCcf != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (codigoValidacion != null ? !codigoValidacion.equals(that.codigoValidacion) : that.codigoValidacion != null)
            return false;
        if (estadoNovedad != null ? !estadoNovedad.equals(that.estadoNovedad) : that.estadoNovedad != null)
            return false;
        if (idEstadoNovedad != null ? !idEstadoNovedad.equals(that.idEstadoNovedad) : that.idEstadoNovedad != null)
            return false;
        if (fechaReporte != null ? !fechaReporte.equals(that.fechaReporte) : that.fechaReporte != null) return false;
        if (nombreTerceroReporta != null ? !nombreTerceroReporta.equals(that.nombreTerceroReporta) : that.nombreTerceroReporta != null)
            return false;
        if (idTerceroReporta != null ? !idTerceroReporta.equals(that.idTerceroReporta) : that.idTerceroReporta != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (nombreTercero != null ? nombreTercero.hashCode() : 0);
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (novedad != null ? novedad.hashCode() : 0);
        result = 31 * result + (tipoNovedad != null ? tipoNovedad.hashCode() : 0);
        result = 31 * result + (idNovedad != null ? idNovedad.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (horaInicio != null ? horaInicio.hashCode() : 0);
        result = 31 * result + (horaFin != null ? horaFin.hashCode() : 0);
        result = 31 * result + (fechaReintegro != null ? fechaReintegro.hashCode() : 0);
        result = 31 * result + (horaReintegro != null ? horaReintegro.hashCode() : 0);
        result = 31 * result + (dias != null ? dias.hashCode() : 0);
        result = 31 * result + (diagnostico != null ? diagnostico.hashCode() : 0);
        result = 31 * result + (idDiagnostico != null ? idDiagnostico.hashCode() : 0);
        result = 31 * result + (reemplazadoPor != null ? reemplazadoPor.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (nroCuotas != null ? nroCuotas.hashCode() : 0);
        result = 31 * result + (nroReferencia != null ? nroReferencia.hashCode() : 0);
        result = 31 * result + (entidad != null ? entidad.hashCode() : 0);
        result = 31 * result + (idEntidad != null ? idEntidad.hashCode() : 0);
        result = 31 * result + (periodoInicial != null ? periodoInicial.hashCode() : 0);
        result = 31 * result + (periodoFinal != null ? periodoFinal.hashCode() : 0);
        result = 31 * result + (retiro != null ? retiro.hashCode() : 0);
        result = 31 * result + (eps != null ? eps.hashCode() : 0);
        result = 31 * result + (idEps != null ? idEps.hashCode() : 0);
        result = 31 * result + (fp != null ? fp.hashCode() : 0);
        result = 31 * result + (idFp != null ? idFp.hashCode() : 0);
        result = 31 * result + (ccf != null ? ccf.hashCode() : 0);
        result = 31 * result + (idCcf != null ? idCcf.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (codigoValidacion != null ? codigoValidacion.hashCode() : 0);
        result = 31 * result + (estadoNovedad != null ? estadoNovedad.hashCode() : 0);
        result = 31 * result + (idEstadoNovedad != null ? idEstadoNovedad.hashCode() : 0);
        result = 31 * result + (fechaReporte != null ? fechaReporte.hashCode() : 0);
        result = 31 * result + (nombreTerceroReporta != null ? nombreTerceroReporta.hashCode() : 0);
        result = 31 * result + (idTerceroReporta != null ? idTerceroReporta.hashCode() : 0);
        return result;
    }
}
