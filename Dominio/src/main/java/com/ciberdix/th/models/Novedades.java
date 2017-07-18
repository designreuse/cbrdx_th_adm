package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 17/07/2017.
 */
@Entity
@Table(name = "Novedades", schema = "dbo", catalog = "CREZCAMOS")
public class Novedades {
    private Integer idNovedad;
    private String codigoNovedad;
    private String novedad;
    private Integer idTipoNovedad;
    private Integer idRolResponsable;
    private Integer idEstadoInicialNovedad;
    private Boolean indicadorHabilitado;
    private Boolean indicadorAusentismo;
    private Boolean indicadorSeguimiento;
    private Boolean indicadorConfirmacion;
    private Boolean indicadorAdjuntos;
    private Boolean indicadorAutorizaJefe;
    private Boolean indicadorNotificaJefe;
    private Boolean indicadorBandeja;
    private Boolean indicadorPlanta;
    private Boolean indicadorAreasApoyo;
    private String codigoSafix;
    private Boolean indicadorNomina;
    private Boolean indicadorAfecta;
    private Integer idTipoAfectacion;
    private Integer indicadorCancelacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Timestamp fechaCreacion;

    public Novedades() {
    }

    public Novedades(String codigoNovedad, String novedad, Integer idTipoNovedad, Integer idRolResponsable, Integer idEstadoInicialNovedad, Boolean indicadorHabilitado, Boolean indicadorAusentismo, Boolean indicadorSeguimiento, Boolean indicadorConfirmacion, Boolean indicadorAdjuntos, Boolean indicadorAutorizaJefe, Boolean indicadorNotificaJefe, Boolean indicadorBandeja, Boolean indicadorPlanta, Boolean indicadorAreasApoyo, String codigoSafix, Boolean indicadorNomina, Boolean indicadorAfecta, Integer idTipoAfectacion, Integer indicadorCancelacion, Integer auditoriaUsuario) {
        this.codigoNovedad = codigoNovedad;
        this.novedad = novedad;
        this.idTipoNovedad = idTipoNovedad;
        this.idRolResponsable = idRolResponsable;
        this.idEstadoInicialNovedad = idEstadoInicialNovedad;
        this.indicadorHabilitado = indicadorHabilitado;
        this.indicadorAusentismo = indicadorAusentismo;
        this.indicadorSeguimiento = indicadorSeguimiento;
        this.indicadorConfirmacion = indicadorConfirmacion;
        this.indicadorAdjuntos = indicadorAdjuntos;
        this.indicadorAutorizaJefe = indicadorAutorizaJefe;
        this.indicadorNotificaJefe = indicadorNotificaJefe;
        this.indicadorBandeja = indicadorBandeja;
        this.indicadorPlanta = indicadorPlanta;
        this.indicadorAreasApoyo = indicadorAreasApoyo;
        this.codigoSafix = codigoSafix;
        this.indicadorNomina = indicadorNomina;
        this.indicadorAfecta = indicadorAfecta;
        this.idTipoAfectacion = idTipoAfectacion;
        this.indicadorCancelacion = indicadorCancelacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.fechaCreacion = new Timestamp(System.currentTimeMillis());
    }

    public Novedades(Integer idNovedad, String codigoNovedad, String novedad, Integer idTipoNovedad, Integer idRolResponsable, Integer idEstadoInicialNovedad, Boolean indicadorHabilitado, Boolean indicadorAusentismo, Boolean indicadorSeguimiento, Boolean indicadorConfirmacion, Boolean indicadorAdjuntos, Boolean indicadorAutorizaJefe, Boolean indicadorNotificaJefe, Boolean indicadorBandeja, Boolean indicadorPlanta, Boolean indicadorAreasApoyo, String codigoSafix, Boolean indicadorNomina, Boolean indicadorAfecta, Integer idTipoAfectacion, Integer indicadorCancelacion, Integer auditoriaUsuario) {
        this.idNovedad = idNovedad;
        this.codigoNovedad = codigoNovedad;
        this.novedad = novedad;
        this.idTipoNovedad = idTipoNovedad;
        this.idRolResponsable = idRolResponsable;
        this.idEstadoInicialNovedad = idEstadoInicialNovedad;
        this.indicadorHabilitado = indicadorHabilitado;
        this.indicadorAusentismo = indicadorAusentismo;
        this.indicadorSeguimiento = indicadorSeguimiento;
        this.indicadorConfirmacion = indicadorConfirmacion;
        this.indicadorAdjuntos = indicadorAdjuntos;
        this.indicadorAutorizaJefe = indicadorAutorizaJefe;
        this.indicadorNotificaJefe = indicadorNotificaJefe;
        this.indicadorBandeja = indicadorBandeja;
        this.indicadorPlanta = indicadorPlanta;
        this.indicadorAreasApoyo = indicadorAreasApoyo;
        this.codigoSafix = codigoSafix;
        this.indicadorNomina = indicadorNomina;
        this.indicadorAfecta = indicadorAfecta;
        this.idTipoAfectacion = idTipoAfectacion;
        this.indicadorCancelacion = indicadorCancelacion;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdNovedad", nullable = false)
    public Integer getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Integer idNovedad) {
        this.idNovedad = idNovedad;
    }

    @Basic
    @Column(name = "CodigoNovedad", nullable = true, length = 10)
    public String getCodigoNovedad() {
        return codigoNovedad;
    }

    public void setCodigoNovedad(String codigoNovedad) {
        this.codigoNovedad = codigoNovedad;
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
    @Column(name = "IdTipoNovedad", nullable = true)
    public Integer getIdTipoNovedad() {
        return idTipoNovedad;
    }

    public void setIdTipoNovedad(Integer idTipoNovedad) {
        this.idTipoNovedad = idTipoNovedad;
    }

    @Basic
    @Column(name = "IdRolResponsable", nullable = true)
    public Integer getIdRolResponsable() {
        return idRolResponsable;
    }

    public void setIdRolResponsable(Integer idRolResponsable) {
        this.idRolResponsable = idRolResponsable;
    }

    @Basic
    @Column(name = "IdEstadoInicialNovedad", nullable = true)
    public Integer getIdEstadoInicialNovedad() {
        return idEstadoInicialNovedad;
    }

    public void setIdEstadoInicialNovedad(Integer idEstadoInicialNovedad) {
        this.idEstadoInicialNovedad = idEstadoInicialNovedad;
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
    @Column(name = "IndicadorAusentismo", nullable = true)
    public Boolean getIndicadorAusentismo() {
        return indicadorAusentismo;
    }

    public void setIndicadorAusentismo(Boolean indicadorAusentismo) {
        this.indicadorAusentismo = indicadorAusentismo;
    }

    @Basic
    @Column(name = "IndicadorSeguimiento", nullable = true)
    public Boolean getIndicadorSeguimiento() {
        return indicadorSeguimiento;
    }

    public void setIndicadorSeguimiento(Boolean indicadorSeguimiento) {
        this.indicadorSeguimiento = indicadorSeguimiento;
    }

    @Basic
    @Column(name = "IndicadorConfirmacion", nullable = true)
    public Boolean getIndicadorConfirmacion() {
        return indicadorConfirmacion;
    }

    public void setIndicadorConfirmacion(Boolean indicadorConfirmacion) {
        this.indicadorConfirmacion = indicadorConfirmacion;
    }

    @Basic
    @Column(name = "IndicadorAdjuntos", nullable = true)
    public Boolean getIndicadorAdjuntos() {
        return indicadorAdjuntos;
    }

    public void setIndicadorAdjuntos(Boolean indicadorAdjuntos) {
        this.indicadorAdjuntos = indicadorAdjuntos;
    }

    @Basic
    @Column(name = "IndicadorAutorizaJefe", nullable = true)
    public Boolean getIndicadorAutorizaJefe() {
        return indicadorAutorizaJefe;
    }

    public void setIndicadorAutorizaJefe(Boolean indicadorAutorizaJefe) {
        this.indicadorAutorizaJefe = indicadorAutorizaJefe;
    }

    @Basic
    @Column(name = "IndicadorNotificaJefe", nullable = true)
    public Boolean getIndicadorNotificaJefe() {
        return indicadorNotificaJefe;
    }

    public void setIndicadorNotificaJefe(Boolean indicadorNotificaJefe) {
        this.indicadorNotificaJefe = indicadorNotificaJefe;
    }

    @Basic
    @Column(name = "IndicadorBandeja", nullable = true)
    public Boolean getIndicadorBandeja() {
        return indicadorBandeja;
    }

    public void setIndicadorBandeja(Boolean indicadorBandeja) {
        this.indicadorBandeja = indicadorBandeja;
    }

    @Basic
    @Column(name = "IndicadorPlanta", nullable = true)
    public Boolean getIndicadorPlanta() {
        return indicadorPlanta;
    }

    public void setIndicadorPlanta(Boolean indicadorPlanta) {
        this.indicadorPlanta = indicadorPlanta;
    }

    @Basic
    @Column(name = "IndicadorAreasApoyo", nullable = true)
    public Boolean getIndicadorAreasApoyo() {
        return indicadorAreasApoyo;
    }

    public void setIndicadorAreasApoyo(Boolean indicadorAreasApoyo) {
        this.indicadorAreasApoyo = indicadorAreasApoyo;
    }

    @Basic
    @Column(name = "CodigoSafix", nullable = true, length = 10)
    public String getCodigoSafix() {
        return codigoSafix;
    }

    public void setCodigoSafix(String codigoSafix) {
        this.codigoSafix = codigoSafix;
    }

    @Basic
    @Column(name = "IndicadorNomina", nullable = true)
    public Boolean getIndicadorNomina() {
        return indicadorNomina;
    }

    public void setIndicadorNomina(Boolean indicadorNomina) {
        this.indicadorNomina = indicadorNomina;
    }

    @Basic
    @Column(name = "IndicadorAfecta", nullable = true)
    public Boolean getIndicadorAfecta() {
        return indicadorAfecta;
    }

    public void setIndicadorAfecta(Boolean indicadorAfecta) {
        this.indicadorAfecta = indicadorAfecta;
    }

    @Basic
    @Column(name = "IdTipoAfectacion", nullable = true)
    public Integer getIdTipoAfectacion() {
        return idTipoAfectacion;
    }

    public void setIdTipoAfectacion(Integer idTipoAfectacion) {
        this.idTipoAfectacion = idTipoAfectacion;
    }

    @Basic
    @Column(name = "IndicadorCancelacion", nullable = true)
    public Integer getIndicadorCancelacion() {
        return indicadorCancelacion;
    }

    public void setIndicadorCancelacion(Integer indicadorCancelacion) {
        this.indicadorCancelacion = indicadorCancelacion;
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
    @Column(name = "FechaCreacion", nullable = true)
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Novedades novedades = (Novedades) o;

        if (!idNovedad.equals(novedades.idNovedad)) return false;
        if (codigoNovedad != null ? !codigoNovedad.equals(novedades.codigoNovedad) : novedades.codigoNovedad != null)
            return false;
        if (novedad != null ? !novedad.equals(novedades.novedad) : novedades.novedad != null) return false;
        if (idTipoNovedad != null ? !idTipoNovedad.equals(novedades.idTipoNovedad) : novedades.idTipoNovedad != null)
            return false;
        if (idRolResponsable != null ? !idRolResponsable.equals(novedades.idRolResponsable) : novedades.idRolResponsable != null)
            return false;
        if (idEstadoInicialNovedad != null ? !idEstadoInicialNovedad.equals(novedades.idEstadoInicialNovedad) : novedades.idEstadoInicialNovedad != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(novedades.indicadorHabilitado) : novedades.indicadorHabilitado != null)
            return false;
        if (indicadorAusentismo != null ? !indicadorAusentismo.equals(novedades.indicadorAusentismo) : novedades.indicadorAusentismo != null)
            return false;
        if (indicadorSeguimiento != null ? !indicadorSeguimiento.equals(novedades.indicadorSeguimiento) : novedades.indicadorSeguimiento != null)
            return false;
        if (indicadorConfirmacion != null ? !indicadorConfirmacion.equals(novedades.indicadorConfirmacion) : novedades.indicadorConfirmacion != null)
            return false;
        if (indicadorAdjuntos != null ? !indicadorAdjuntos.equals(novedades.indicadorAdjuntos) : novedades.indicadorAdjuntos != null)
            return false;
        if (indicadorAutorizaJefe != null ? !indicadorAutorizaJefe.equals(novedades.indicadorAutorizaJefe) : novedades.indicadorAutorizaJefe != null)
            return false;
        if (indicadorNotificaJefe != null ? !indicadorNotificaJefe.equals(novedades.indicadorNotificaJefe) : novedades.indicadorNotificaJefe != null)
            return false;
        if (indicadorBandeja != null ? !indicadorBandeja.equals(novedades.indicadorBandeja) : novedades.indicadorBandeja != null)
            return false;
        if (indicadorPlanta != null ? !indicadorPlanta.equals(novedades.indicadorPlanta) : novedades.indicadorPlanta != null)
            return false;
        if (indicadorAreasApoyo != null ? !indicadorAreasApoyo.equals(novedades.indicadorAreasApoyo) : novedades.indicadorAreasApoyo != null)
            return false;
        if (codigoSafix != null ? !codigoSafix.equals(novedades.codigoSafix) : novedades.codigoSafix != null)
            return false;
        if (indicadorNomina != null ? !indicadorNomina.equals(novedades.indicadorNomina) : novedades.indicadorNomina != null)
            return false;
        if (indicadorAfecta != null ? !indicadorAfecta.equals(novedades.indicadorAfecta) : novedades.indicadorAfecta != null)
            return false;
        if (idTipoAfectacion != null ? !idTipoAfectacion.equals(novedades.idTipoAfectacion) : novedades.idTipoAfectacion != null)
            return false;
        if (indicadorCancelacion != null ? !indicadorCancelacion.equals(novedades.indicadorCancelacion) : novedades.indicadorCancelacion != null)
            return false;
        if (!auditoriaUsuario.equals(novedades.auditoriaUsuario)) return false;
        if (!auditoriaFecha.equals(novedades.auditoriaFecha)) return false;
        return fechaCreacion != null ? fechaCreacion.equals(novedades.fechaCreacion) : novedades.fechaCreacion == null;
    }

    @Override
    public int hashCode() {
        int result = idNovedad.hashCode();
        result = 31 * result + (codigoNovedad != null ? codigoNovedad.hashCode() : 0);
        result = 31 * result + (novedad != null ? novedad.hashCode() : 0);
        result = 31 * result + (idTipoNovedad != null ? idTipoNovedad.hashCode() : 0);
        result = 31 * result + (idRolResponsable != null ? idRolResponsable.hashCode() : 0);
        result = 31 * result + (idEstadoInicialNovedad != null ? idEstadoInicialNovedad.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (indicadorAusentismo != null ? indicadorAusentismo.hashCode() : 0);
        result = 31 * result + (indicadorSeguimiento != null ? indicadorSeguimiento.hashCode() : 0);
        result = 31 * result + (indicadorConfirmacion != null ? indicadorConfirmacion.hashCode() : 0);
        result = 31 * result + (indicadorAdjuntos != null ? indicadorAdjuntos.hashCode() : 0);
        result = 31 * result + (indicadorAutorizaJefe != null ? indicadorAutorizaJefe.hashCode() : 0);
        result = 31 * result + (indicadorNotificaJefe != null ? indicadorNotificaJefe.hashCode() : 0);
        result = 31 * result + (indicadorBandeja != null ? indicadorBandeja.hashCode() : 0);
        result = 31 * result + (indicadorPlanta != null ? indicadorPlanta.hashCode() : 0);
        result = 31 * result + (indicadorAreasApoyo != null ? indicadorAreasApoyo.hashCode() : 0);
        result = 31 * result + (codigoSafix != null ? codigoSafix.hashCode() : 0);
        result = 31 * result + (indicadorNomina != null ? indicadorNomina.hashCode() : 0);
        result = 31 * result + (indicadorAfecta != null ? indicadorAfecta.hashCode() : 0);
        result = 31 * result + (idTipoAfectacion != null ? idTipoAfectacion.hashCode() : 0);
        result = 31 * result + (indicadorCancelacion != null ? indicadorCancelacion.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        return result;
    }
}
