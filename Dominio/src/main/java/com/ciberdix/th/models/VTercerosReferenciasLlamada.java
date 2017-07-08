package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/07/2017.
 */
@Entity
@Table(name = "V_TercerosReferenciasLlamada", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosReferenciasLlamada {
    private Integer idTerceroReferenciaLlamada;
    private String tipoReferencia;
    private String terceroReferencia;
    private String telefonoFijo;
    private String telefonoMovil;
    private Integer idTerceroReferencia;
    private String resultadoLlamada;
    private Integer idResultadoLlamada;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Integer idCuestionario;
    private Integer idRespuestaCuestionario;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String descripcionDivisonPolitica;

    @Id
    @Column(name = "IdTerceroReferenciaLlamada", nullable = false)
    public Integer getIdTerceroReferenciaLlamada() {
        return idTerceroReferenciaLlamada;
    }

    public void setIdTerceroReferenciaLlamada(Integer idTerceroReferenciaLlamada) {
        this.idTerceroReferenciaLlamada = idTerceroReferenciaLlamada;
    }

    @Basic
    @Column(name = "TipoReferencia", nullable = true, length = 100)
    public String getTipoReferencia() {
        return tipoReferencia;
    }

    public void setTipoReferencia(String tipoReferencia) {
        this.tipoReferencia = tipoReferencia;
    }

    @Basic
    @Column(name = "TerceroReferencia", nullable = false, length = 203)
    public String getTerceroReferencia() {
        return terceroReferencia;
    }

    public void setTerceroReferencia(String terceroReferencia) {
        this.terceroReferencia = terceroReferencia;
    }

    @Basic
    @Column(name = "TelefonoFijo", nullable = true, length = 50)
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    @Basic
    @Column(name = "TelefonoMovil", nullable = true, length = 50)
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Basic
    @Column(name = "IdTerceroReferencia", nullable = true)
    public Integer getIdTerceroReferencia() {
        return idTerceroReferencia;
    }

    public void setIdTerceroReferencia(Integer idTerceroReferencia) {
        this.idTerceroReferencia = idTerceroReferencia;
    }

    @Basic
    @Column(name = "ResultadoLlamada", nullable = true, length = 100)
    public String getResultadoLlamada() {
        return resultadoLlamada;
    }

    public void setResultadoLlamada(String resultadoLlamada) {
        this.resultadoLlamada = resultadoLlamada;
    }

    @Basic
    @Column(name = "IdResultadoLlamada", nullable = true)
    public Integer getIdResultadoLlamada() {
        return idResultadoLlamada;
    }

    public void setIdResultadoLlamada(Integer idResultadoLlamada) {
        this.idResultadoLlamada = idResultadoLlamada;
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
    @Column(name = "IdCuestionario", nullable = true)
    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    @Basic
    @Column(name = "IdRespuestaCuestionario", nullable = true)
    public Integer getIdRespuestaCuestionario() {
        return idRespuestaCuestionario;
    }

    public void setIdRespuestaCuestionario(Integer idRespuestaCuestionario) {
        this.idRespuestaCuestionario = idRespuestaCuestionario;
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

        VTercerosReferenciasLlamada that = (VTercerosReferenciasLlamada) o;

        if (idTerceroReferenciaLlamada != null ? !idTerceroReferenciaLlamada.equals(that.idTerceroReferenciaLlamada) : that.idTerceroReferenciaLlamada != null)
            return false;
        if (tipoReferencia != null ? !tipoReferencia.equals(that.tipoReferencia) : that.tipoReferencia != null)
            return false;
        if (terceroReferencia != null ? !terceroReferencia.equals(that.terceroReferencia) : that.terceroReferencia != null)
            return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(that.telefonoFijo) : that.telefonoFijo != null) return false;
        if (telefonoMovil != null ? !telefonoMovil.equals(that.telefonoMovil) : that.telefonoMovil != null)
            return false;
        if (idTerceroReferencia != null ? !idTerceroReferencia.equals(that.idTerceroReferencia) : that.idTerceroReferencia != null)
            return false;
        if (resultadoLlamada != null ? !resultadoLlamada.equals(that.resultadoLlamada) : that.resultadoLlamada != null)
            return false;
        if (idResultadoLlamada != null ? !idResultadoLlamada.equals(that.idResultadoLlamada) : that.idResultadoLlamada != null)
            return false;
        if (nombreArchivo != null ? !nombreArchivo.equals(that.nombreArchivo) : that.nombreArchivo != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (idCuestionario != null ? !idCuestionario.equals(that.idCuestionario) : that.idCuestionario != null)
            return false;
        if (idRespuestaCuestionario != null ? !idRespuestaCuestionario.equals(that.idRespuestaCuestionario) : that.idRespuestaCuestionario != null)
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
        int result = idTerceroReferenciaLlamada != null ? idTerceroReferenciaLlamada.hashCode() : 0;
        result = 31 * result + (tipoReferencia != null ? tipoReferencia.hashCode() : 0);
        result = 31 * result + (terceroReferencia != null ? terceroReferencia.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoMovil != null ? telefonoMovil.hashCode() : 0);
        result = 31 * result + (idTerceroReferencia != null ? idTerceroReferencia.hashCode() : 0);
        result = 31 * result + (resultadoLlamada != null ? resultadoLlamada.hashCode() : 0);
        result = 31 * result + (idResultadoLlamada != null ? idResultadoLlamada.hashCode() : 0);
        result = 31 * result + (nombreArchivo != null ? nombreArchivo.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (idCuestionario != null ? idCuestionario.hashCode() : 0);
        result = 31 * result + (idRespuestaCuestionario != null ? idRespuestaCuestionario.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "DescripcionDivisonPolitica", nullable = true, length = 200)
    public String getDescripcionDivisonPolitica() {
        return descripcionDivisonPolitica;
    }

    public void setDescripcionDivisonPolitica(String descripcionDivisonPolitica) {
        this.descripcionDivisonPolitica = descripcionDivisonPolitica;
    }
}
