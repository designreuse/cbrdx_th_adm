package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "TercerosEstudiosNoFormales", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class EstudiosNoFormalesEntity {
    private int idTercerosEstudioNoFormal;
    private int idTercero;
    private int idTipoEstudio;
    private int idAreaEstudio;
    private String tituloEstudio;
    private String institucion;
    private int idIntensidadHoraria;
    private String descripcion;
    private int idPais;
    private int idDepartamento;
    private int idCiudad;
    private boolean indicadorTerminacion;
    private Timestamp fechaIngresa;
    private Timestamp fechaTermina;
    private int idAdjunto;
    private boolean indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private boolean indicadorVerificado;
    private Timestamp fechaVerificado;

    public EstudiosNoFormalesEntity(int idTercerosEstudioNoFormal, int idTercero, int idTipoEstudio, int idAreaEstudio, String tituloEstudio, String institucion, int idIntensidadHoraria, String descripcion, int idPais, int idDepartamento, int idCiudad, boolean indicadorTerminacion, Timestamp fechaIngresa, Timestamp fechaTermina, int idAdjunto, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha, boolean indicadorVerificado, Timestamp fechaVerificado) {
        this.idTercerosEstudioNoFormal = idTercerosEstudioNoFormal;
        this.idTercero = idTercero;
        this.idTipoEstudio = idTipoEstudio;
        this.idAreaEstudio = idAreaEstudio;
        this.tituloEstudio = tituloEstudio;
        this.institucion = institucion;
        this.idIntensidadHoraria = idIntensidadHoraria;
        this.descripcion = descripcion;
        this.idPais = idPais;
        this.idDepartamento = idDepartamento;
        this.idCiudad = idCiudad;
        this.indicadorTerminacion = indicadorTerminacion;
        this.fechaIngresa = fechaIngresa;
        this.fechaTermina = fechaTermina;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
        this.indicadorVerificado = indicadorVerificado;
        this.fechaVerificado = fechaVerificado;
    }

    public EstudiosNoFormalesEntity() {
    }

    @Id
    @Column(name = "IdTerceroEstudioNoFormal", nullable = false)
    public int getIdTercerosEstudioNoFormal() {
        return idTercerosEstudioNoFormal;
    }

    public void setIdTercerosEstudioNoFormal(int idTercerosEstudioNoFormal) {
        this.idTercerosEstudioNoFormal = idTercerosEstudioNoFormal;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public int getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(int idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdTipoEstudio", nullable = true)
    public int getIdTipoEstudio() {
        return idTipoEstudio;
    }

    public void setIdTipoEstudio(int idTipoEstudio) {
        this.idTipoEstudio = idTipoEstudio;
    }

    @Basic
    @Column(name = "IdAreaEstudio", nullable = true)
    public int getIdAreaEstudio() {
        return idAreaEstudio;
    }

    public void setIdAreaEstudio(int idAreaEstudio) {
        this.idAreaEstudio = idAreaEstudio;
    }
    @Basic
    @Column(name = "TituloEstudio", nullable = true)
    public String getTituloEstudio() {
        return tituloEstudio;
    }

    public void setTituloEstudio(String tituloEstudio) {
        this.tituloEstudio = tituloEstudio;
    }
    @Basic
    @Column(name = "Institucion", nullable = true)
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    @Basic
    @Column(name = "IdIntensidadHoraria", nullable = true)
    public int getIdIntensidadHoraria() {
        return idIntensidadHoraria;
    }

    public void setIdIntensidadHoraria(int idIntensidadHoraria) {
        this.idIntensidadHoraria = idIntensidadHoraria;
    }
    @Basic
    @Column(name = "Descripcion", nullable = true)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Basic
    @Column(name = "IdPais", nullable = true)
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    @Basic
    @Column(name = "IdDepartamento", nullable = true)
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    @Basic
    @Column(name = "IdCiudad", nullable = true)
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    @Basic
    @Column(name = "IndicadorTerminacion", nullable = true)
    public boolean isIndicadorTerminacion() {
        return indicadorTerminacion;
    }

    public void setIndicadorTerminacion(boolean indicadorTerminacion) {
        this.indicadorTerminacion = indicadorTerminacion;
    }
    @Basic
    @Column(name = "FechaIngresa", nullable = true)
    public Timestamp getFechaIngresa() {
        return fechaIngresa;
    }

    public void setFechaIngresa(Timestamp fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }
    @Basic
    @Column(name = "FechaTermina", nullable = true)
    public Timestamp getFechaTermina() {
        return fechaTermina;
    }

    public void setFechaTermina(Timestamp fechaTermina) {
        this.fechaTermina = fechaTermina;
    }
    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public int getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(int idAdjunto) {
        this.idAdjunto = idAdjunto;
    }
    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }
    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }
    @Basic
    @Column(name = "IndicadorVerificado", nullable = true)
    public boolean isIndicadorVerificado() {
        return indicadorVerificado;
    }

    public void setIndicadorVerificado(boolean indicadorVerificado) {
        this.indicadorVerificado = indicadorVerificado;
    }
    @Basic
    @Column(name = "FechaVerificado", nullable = true)
    public Timestamp getFechaVerificado() {
        return fechaVerificado;
    }

    public void setFechaVerificado(Timestamp fechaVerificado) {
        this.fechaVerificado = fechaVerificado;
    }
}
