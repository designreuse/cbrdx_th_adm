package com.ciberdix.th.model;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
public class VTercerosEstudiosNoFormales {
    private Integer idTerceroEstudioNoFormal;
    private Long idTercero;
    private Integer idTipoEstudio;
    private String tipoEstudio;
    private String otroEstudio;
    private Integer idAreaEstudio;
    private String areaEstudio;
    private String tituloEstudio;
    private String institucion;
    private Integer idIntensidadHoraria;
    private String intensidadHoraria;
    private String descripcion;
    private Integer idCiudad;
    private String ciudad;
    private Boolean indicadorTerminacion;
    private Date fechaIngresa;
    private Date fechaTermina;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroEstudioNoFormal() {
        return idTerceroEstudioNoFormal;
    }

    public void setIdTerceroEstudioNoFormal(Integer idTerceroEstudioNoFormal) {
        this.idTerceroEstudioNoFormal = idTerceroEstudioNoFormal;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdTipoEstudio() {
        return idTipoEstudio;
    }

    public void setIdTipoEstudio(Integer idTipoEstudio) {
        this.idTipoEstudio = idTipoEstudio;
    }

    public String getTipoEstudio() {
        return tipoEstudio;
    }

    public void setTipoEstudio(String tipoEstudio) {
        this.tipoEstudio = tipoEstudio;
    }

    public String getOtroEstudio() {
        return otroEstudio;
    }

    public void setOtroEstudio(String otroEstudio) {
        this.otroEstudio = otroEstudio;
    }

    public Integer getIdAreaEstudio() {
        return idAreaEstudio;
    }

    public void setIdAreaEstudio(Integer idAreaEstudio) {
        this.idAreaEstudio = idAreaEstudio;
    }

    public String getAreaEstudio() {
        return areaEstudio;
    }

    public void setAreaEstudio(String areaEstudio) {
        this.areaEstudio = areaEstudio;
    }

    public String getTituloEstudio() {
        return tituloEstudio;
    }

    public void setTituloEstudio(String tituloEstudio) {
        this.tituloEstudio = tituloEstudio;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Integer getIdIntensidadHoraria() {
        return idIntensidadHoraria;
    }

    public void setIdIntensidadHoraria(Integer idIntensidadHoraria) {
        this.idIntensidadHoraria = idIntensidadHoraria;
    }

    public String getIntensidadHoraria() {
        return intensidadHoraria;
    }

    public void setIntensidadHoraria(String intensidadHoraria) {
        this.intensidadHoraria = intensidadHoraria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Boolean getIndicadorTerminacion() {
        return indicadorTerminacion;
    }

    public void setIndicadorTerminacion(Boolean indicadorTerminacion) {
        this.indicadorTerminacion = indicadorTerminacion;
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
}
