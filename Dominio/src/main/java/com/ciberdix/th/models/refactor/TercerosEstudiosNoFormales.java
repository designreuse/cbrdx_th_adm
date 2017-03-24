package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class TercerosEstudiosNoFormales {
    private Integer idTerceroEstudioNoFormal;
    private Long idTercero;
    private Integer idTipoEstudio;
    private String otroEstudio;
    private Integer idAreaEstudio;
    private String tituloEstudio;
    private String institucion;
    private Integer idIntensidadHoraria;
    private String descripcion;
    private Integer idPais;
    private Integer idDepartamento;
    private Integer idCiudad;
    private Boolean indicadorTerminacion;
    private Date fechaIngresa;
    private Date fechaTermina;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorVerificado;
    private Timestamp fechaVerificado;
    private Integer idEstado;

    @Id
    @Column(name = "IdTerceroEstudioNoFormal")
    public Integer getIdTerceroEstudioNoFormal() {
        return idTerceroEstudioNoFormal;
    }

    public void setIdTerceroEstudioNoFormal(Integer idTerceroEstudioNoFormal) {
        this.idTerceroEstudioNoFormal = idTerceroEstudioNoFormal;
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
    @Column(name = "IdTipoEstudio")
    public Integer getIdTipoEstudio() {
        return idTipoEstudio;
    }

    public void setIdTipoEstudio(Integer idTipoEstudio) {
        this.idTipoEstudio = idTipoEstudio;
    }

    @Basic
    @Column(name = "OtroEstudio")
    public String getOtroEstudio() {
        return otroEstudio;
    }

    public void setOtroEstudio(String otroEstudio) {
        this.otroEstudio = otroEstudio;
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
    @Column(name = "Institucion")
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    @Basic
    @Column(name = "IdIntensidadHoraria")
    public Integer getIdIntensidadHoraria() {
        return idIntensidadHoraria;
    }

    public void setIdIntensidadHoraria(Integer idIntensidadHoraria) {
        this.idIntensidadHoraria = idIntensidadHoraria;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IdPais")
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    @Basic
    @Column(name = "IdDepartamento")
    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
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
    @Column(name = "IndicadorTerminacion")
    public Boolean getIndicadorTerminacion() {
        return indicadorTerminacion;
    }

    public void setIndicadorTerminacion(Boolean indicadorTerminacion) {
        this.indicadorTerminacion = indicadorTerminacion;
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

    @Basic
    @Column(name = "IdEstado")
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosEstudiosNoFormales that = (TercerosEstudiosNoFormales) o;

        if (idTerceroEstudioNoFormal != null ? !idTerceroEstudioNoFormal.equals(that.idTerceroEstudioNoFormal) : that.idTerceroEstudioNoFormal != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idTipoEstudio != null ? !idTipoEstudio.equals(that.idTipoEstudio) : that.idTipoEstudio != null)
            return false;
        if (otroEstudio != null ? !otroEstudio.equals(that.otroEstudio) : that.otroEstudio != null) return false;
        if (idAreaEstudio != null ? !idAreaEstudio.equals(that.idAreaEstudio) : that.idAreaEstudio != null)
            return false;
        if (tituloEstudio != null ? !tituloEstudio.equals(that.tituloEstudio) : that.tituloEstudio != null)
            return false;
        if (institucion != null ? !institucion.equals(that.institucion) : that.institucion != null) return false;
        if (idIntensidadHoraria != null ? !idIntensidadHoraria.equals(that.idIntensidadHoraria) : that.idIntensidadHoraria != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (idPais != null ? !idPais.equals(that.idPais) : that.idPais != null) return false;
        if (idDepartamento != null ? !idDepartamento.equals(that.idDepartamento) : that.idDepartamento != null)
            return false;
        if (idCiudad != null ? !idCiudad.equals(that.idCiudad) : that.idCiudad != null) return false;
        if (indicadorTerminacion != null ? !indicadorTerminacion.equals(that.indicadorTerminacion) : that.indicadorTerminacion != null)
            return false;
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
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroEstudioNoFormal != null ? idTerceroEstudioNoFormal.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idTipoEstudio != null ? idTipoEstudio.hashCode() : 0);
        result = 31 * result + (otroEstudio != null ? otroEstudio.hashCode() : 0);
        result = 31 * result + (idAreaEstudio != null ? idAreaEstudio.hashCode() : 0);
        result = 31 * result + (tituloEstudio != null ? tituloEstudio.hashCode() : 0);
        result = 31 * result + (institucion != null ? institucion.hashCode() : 0);
        result = 31 * result + (idIntensidadHoraria != null ? idIntensidadHoraria.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (idPais != null ? idPais.hashCode() : 0);
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (idCiudad != null ? idCiudad.hashCode() : 0);
        result = 31 * result + (indicadorTerminacion != null ? indicadorTerminacion.hashCode() : 0);
        result = 31 * result + (fechaIngresa != null ? fechaIngresa.hashCode() : 0);
        result = 31 * result + (fechaTermina != null ? fechaTermina.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorVerificado != null ? indicadorVerificado.hashCode() : 0);
        result = 31 * result + (fechaVerificado != null ? fechaVerificado.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        return result;
    }
}
