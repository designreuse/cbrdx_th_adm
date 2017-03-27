package com.ciberdix.th.model.refactor;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
public class TercerosEstudiosFormales {
    private Integer idTerceroEstudioFormal;
    private Long idTercero;
    private Integer idNivelEstudio;
    private Integer idAreaEstudio;
    private String tituloEstudio;
    private Integer idInstitucion;
    private String otraInstitucion;
    private Integer idPais;
    private Integer idDepartamento;
    private Integer idCiudad;
    private Integer idEstado;
    private Date fechaIngresa;
    private Date fechaTermina;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorVerificado;
    private Timestamp fechaVerificado;

    public Integer getIdTerceroEstudioFormal() {
        return idTerceroEstudioFormal;
    }

    public void setIdTerceroEstudioFormal(Integer idTerceroEstudioFormal) {
        this.idTerceroEstudioFormal = idTerceroEstudioFormal;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdNivelEstudio() {
        return idNivelEstudio;
    }

    public void setIdNivelEstudio(Integer idNivelEstudio) {
        this.idNivelEstudio = idNivelEstudio;
    }

    public Integer getIdAreaEstudio() {
        return idAreaEstudio;
    }

    public void setIdAreaEstudio(Integer idAreaEstudio) {
        this.idAreaEstudio = idAreaEstudio;
    }

    public String getTituloEstudio() {
        return tituloEstudio;
    }

    public void setTituloEstudio(String tituloEstudio) {
        this.tituloEstudio = tituloEstudio;
    }

    public Integer getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Integer idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getOtraInstitucion() {
        return otraInstitucion;
    }

    public void setOtraInstitucion(String otraInstitucion) {
        this.otraInstitucion = otraInstitucion;
    }

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Date getFechaIngresa() {
        return fechaIngresa;
    }

    public void setFechaIngresa(Date fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }

    public Date getFechaTermina() {
        return fechaTermina;
    }

    public void setFechaTermina(Date fechaTermina) {
        this.fechaTermina = fechaTermina;
    }

    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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

    public Boolean getIndicadorVerificado() {
        return indicadorVerificado;
    }

    public void setIndicadorVerificado(Boolean indicadorVerificado) {
        this.indicadorVerificado = indicadorVerificado;
    }

    public Timestamp getFechaVerificado() {
        return fechaVerificado;
    }

    public void setFechaVerificado(Timestamp fechaVerificado) {
        this.fechaVerificado = fechaVerificado;
    }
}
