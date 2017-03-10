package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "TercerosEstudiosFormales", schema = "crz_th", catalog = "CREZCAMOS")
public class EstudiosFormalesEntity {
    private int idTercerosEstudioFormal;
    private int idTercero;
    private int idNivelEstudio;
    private int idAreaEstudio;
    private String tituloEstudio;
    private int idInstitucion;
    private String otraInstitucion;
    private int idPais;
    private int idDepartamento;
    private int idCiudad;
    private int idEstado;
    private Timestamp fechaIngresa;
    private Timestamp fechaTermina;
    private int idAdjunto;
    private int indicadorHabilitado;
    private int auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private boolean indicadorVerificado;
    private Timestamp fechaVerificado;

    public EstudiosFormalesEntity(int idTercerosEstudioFormal, int idTercero, int idNivelEstudio, int idAreaEstudio, String tituloEstudio, int idInstitucion, String otraInstitucion, int idPais, int idDepartamento, int idCiudad, int idEstado, Timestamp fechaIngresa, Timestamp fechaTermina, int idAdjunto, int indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha, boolean indicadorVerificado, Timestamp fechaVerificado) {
        this.idTercerosEstudioFormal = idTercerosEstudioFormal;
        this.idTercero = idTercero;
        this.idNivelEstudio = idNivelEstudio;
        this.idAreaEstudio = idAreaEstudio;
        this.tituloEstudio = tituloEstudio;
        this.idInstitucion = idInstitucion;
        this.otraInstitucion = otraInstitucion;
        this.idPais = idPais;
        this.idDepartamento = idDepartamento;
        this.idCiudad = idCiudad;
        this.idEstado = idEstado;
        this.fechaIngresa = fechaIngresa;
        this.fechaTermina = fechaTermina;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
        this.indicadorVerificado = indicadorVerificado;
        this.fechaVerificado = fechaVerificado;
    }

    public EstudiosFormalesEntity() {
    }

    @Id
    @Column(name = "IdTerceroEstudioFormal", nullable = false)
    public int getIdTercerosEstudioFormal() {
        return idTercerosEstudioFormal;
    }

    public void setIdTercerosEstudioFormal(int idTercerosEstudioFormal) {
        this.idTercerosEstudioFormal = idTercerosEstudioFormal;
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
    @Column(name = "IdNivelEstudio", nullable = true)
    public int getIdNivelEstudio() {
        return idNivelEstudio;
    }

    public void setIdNivelEstudio(int idNivelEstudio) {
        this.idNivelEstudio = idNivelEstudio;
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

    @Basic
    @Column(name = "TituloEstudio", nullable = true)
    public void setTituloEstudio(String tituloEstudio) {
        this.tituloEstudio = tituloEstudio;
    }
    @Basic
    @Column(name = "IdInstitucion", nullable = true)
    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }
    @Basic
    @Column(name = "OtraInstitucion", nullable = true)
    public String getOtraInstitucion() {
        return otraInstitucion;
    }

    public void setOtraInstitucion(String otraInstitucion) {
        this.otraInstitucion = otraInstitucion;
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
    @Column(name = "IdEstado", nullable = true)
    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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
    public int getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(int indicadorHabilitado) {
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

