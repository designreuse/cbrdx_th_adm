package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "TercerosEstudiosFormales", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosEstudiosFormales {
    private Integer idTerceroEstudioFormal;
    private Long idTercero;
    private Integer idNivelEstudio;
    private Integer idAreaEstudio;
    private String tituloEstudio;
    private Integer idInstitucion;
    private String otraInstitucion;
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

    public TercerosEstudiosFormales() {
    }

    public TercerosEstudiosFormales(Long idTercero, Integer idNivelEstudio, Integer idAreaEstudio, String tituloEstudio, Integer idInstitucion, String otraInstitucion, Integer idCiudad, Integer idEstado, Date fechaIngresa, Date fechaTermina, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorVerificado, Timestamp fechaVerificado) {
        this.idTercero = idTercero;
        this.idNivelEstudio = idNivelEstudio;
        this.idAreaEstudio = idAreaEstudio;
        this.tituloEstudio = tituloEstudio;
        this.idInstitucion = idInstitucion;
        this.otraInstitucion = otraInstitucion;
        this.idCiudad = idCiudad;
        this.idEstado = idEstado;
        this.fechaIngresa = fechaIngresa;
        this.fechaTermina = fechaTermina;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.indicadorVerificado = indicadorVerificado;
        this.fechaVerificado = fechaVerificado;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroEstudioFormal")
    public Integer getIdTerceroEstudioFormal() {
        return idTerceroEstudioFormal;
    }

    public void setIdTerceroEstudioFormal(Integer idTerceroEstudioFormal) {
        this.idTerceroEstudioFormal = idTerceroEstudioFormal;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "IdNivelEstudio")
    public Integer getIdNivelEstudio() {
        return idNivelEstudio;
    }

    public void setIdNivelEstudio(Integer idNivelEstudio) {
        this.idNivelEstudio = idNivelEstudio;
    }

    @Basic
    @Column(name = "IdAreaEstudio")
    public Integer getIdAreaEstudio() {
        return idAreaEstudio;
    }

    public void setIdAreaEstudio(Integer idAreaEstudio) {
        this.idAreaEstudio = idAreaEstudio;
    }

    @Basic
    @Column(name = "TituloEstudio")
    public String getTituloEstudio() {
        return tituloEstudio;
    }

    public void setTituloEstudio(String tituloEstudio) {
        this.tituloEstudio = tituloEstudio;
    }

    @Basic
    @Column(name = "IdInstitucion")
    public Integer getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Integer idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @Basic
    @Column(name = "OtraInstitucion")
    public String getOtraInstitucion() {
        return otraInstitucion;
    }

    public void setOtraInstitucion(String otraInstitucion) {
        this.otraInstitucion = otraInstitucion;
    }

    @Basic
    @Column(name = "IdCiudad")
    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Basic
    @Column(name = "FechaIngresa")
    public Date getFechaIngresa() {
        return fechaIngresa;
    }

    public void setFechaIngresa(Date fechaIngresa) {
        this.fechaIngresa = fechaIngresa;
    }

    @Basic
    @Column(name = "FechaTermina")
    public Date getFechaTermina() {
        return fechaTermina;
    }

    public void setFechaTermina(Date fechaTermina) {
        this.fechaTermina = fechaTermina;
    }

    @Basic
    @Column(name = "IdAdjunto")
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "IndicadorVerificado")
    public Boolean getIndicadorVerificado() {
        return indicadorVerificado;
    }

    public void setIndicadorVerificado(Boolean indicadorVerificado) {
        this.indicadorVerificado = indicadorVerificado;
    }

    @Basic
    @Column(name = "FechaVerificado")
    public Timestamp getFechaVerificado() {
        return fechaVerificado;
    }

    public void setFechaVerificado(Timestamp fechaVerificado) {
        this.fechaVerificado = fechaVerificado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosEstudiosFormales that = (TercerosEstudiosFormales) o;

        if (idTerceroEstudioFormal != null ? !idTerceroEstudioFormal.equals(that.idTerceroEstudioFormal) : that.idTerceroEstudioFormal != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idNivelEstudio != null ? !idNivelEstudio.equals(that.idNivelEstudio) : that.idNivelEstudio != null)
            return false;
        if (idAreaEstudio != null ? !idAreaEstudio.equals(that.idAreaEstudio) : that.idAreaEstudio != null)
            return false;
        if (tituloEstudio != null ? !tituloEstudio.equals(that.tituloEstudio) : that.tituloEstudio != null)
            return false;
        if (idInstitucion != null ? !idInstitucion.equals(that.idInstitucion) : that.idInstitucion != null)
            return false;
        if (otraInstitucion != null ? !otraInstitucion.equals(that.otraInstitucion) : that.otraInstitucion != null)
            return false;
        if (idCiudad != null ? !idCiudad.equals(that.idCiudad) : that.idCiudad != null) return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
        if (fechaIngresa != null ? !fechaIngresa.equals(that.fechaIngresa) : that.fechaIngresa != null) return false;
        if (fechaTermina != null ? !fechaTermina.equals(that.fechaTermina) : that.fechaTermina != null) return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorVerificado != null ? !indicadorVerificado.equals(that.indicadorVerificado) : that.indicadorVerificado != null)
            return false;
        if (fechaVerificado != null ? !fechaVerificado.equals(that.fechaVerificado) : that.fechaVerificado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroEstudioFormal != null ? idTerceroEstudioFormal.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idNivelEstudio != null ? idNivelEstudio.hashCode() : 0);
        result = 31 * result + (idAreaEstudio != null ? idAreaEstudio.hashCode() : 0);
        result = 31 * result + (tituloEstudio != null ? tituloEstudio.hashCode() : 0);
        result = 31 * result + (idInstitucion != null ? idInstitucion.hashCode() : 0);
        result = 31 * result + (otraInstitucion != null ? otraInstitucion.hashCode() : 0);
        result = 31 * result + (idCiudad != null ? idCiudad.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (fechaIngresa != null ? fechaIngresa.hashCode() : 0);
        result = 31 * result + (fechaTermina != null ? fechaTermina.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorVerificado != null ? indicadorVerificado.hashCode() : 0);
        result = 31 * result + (fechaVerificado != null ? fechaVerificado.hashCode() : 0);
        return result;
    }
}