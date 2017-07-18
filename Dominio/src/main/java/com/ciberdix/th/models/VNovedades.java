package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "V_Novedades", schema = "dbo", catalog = "CREZCAMOS")
public class VNovedades {
    private Integer idNovedad;
    private String codigoNovedad;
    private String novedad;
    private String tipoNovedad;
    private Integer idTipoNovedad;
    private String rol;
    private Integer idRolResponsable;
    private String estadoInicialNovedad;
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
    private String tipoAfectacion;
    private Integer idTipoAfectacion;
    private Integer indicadorCancelacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Timestamp fechaCreacion;
    private String estadoTercero;
    private Integer idEstadoTercero;

    @Id
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
    @Column(name = "TipoNovedad", nullable = true, length = 100)
    public String getTipoNovedad() {
        return tipoNovedad;
    }

    public void setTipoNovedad(String tipoNovedad) {
        this.tipoNovedad = tipoNovedad;
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
    @Column(name = "Rol", nullable = true, length = 64)
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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
    @Column(name = "EstadoInicialNovedad", nullable = true, length = 100)
    public String getEstadoInicialNovedad() {
        return estadoInicialNovedad;
    }

    public void setEstadoInicialNovedad(String estadoInicialNovedad) {
        this.estadoInicialNovedad = estadoInicialNovedad;
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
    @Column(name = "TipoAfectacion", nullable = true, length = 100)
    public String getTipoAfectacion() {
        return tipoAfectacion;
    }

    public void setTipoAfectacion(String tipoAfectacion) {
        this.tipoAfectacion = tipoAfectacion;
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

    @Basic
    @Column(name = "EstadoTercero", nullable = true, length = 100)
    public String getEstadoTercero() {
        return estadoTercero;
    }

    public void setEstadoTercero(String estadoTercero) {
        this.estadoTercero = estadoTercero;
    }

    @Basic
    @Column(name = "IdEstadoTercero", nullable = true)
    public Integer getIdEstadoTercero() {
        return idEstadoTercero;
    }

    public void setIdEstadoTercero(Integer idEstadoTercero) {
        this.idEstadoTercero = idEstadoTercero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VNovedades that = (VNovedades) o;

        if (idNovedad != null ? !idNovedad.equals(that.idNovedad) : that.idNovedad != null) return false;
        if (codigoNovedad != null ? !codigoNovedad.equals(that.codigoNovedad) : that.codigoNovedad != null)
            return false;
        if (novedad != null ? !novedad.equals(that.novedad) : that.novedad != null) return false;
        if (tipoNovedad != null ? !tipoNovedad.equals(that.tipoNovedad) : that.tipoNovedad != null) return false;
        if (idTipoNovedad != null ? !idTipoNovedad.equals(that.idTipoNovedad) : that.idTipoNovedad != null)
            return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (idRolResponsable != null ? !idRolResponsable.equals(that.idRolResponsable) : that.idRolResponsable != null)
            return false;
        if (estadoInicialNovedad != null ? !estadoInicialNovedad.equals(that.estadoInicialNovedad) : that.estadoInicialNovedad != null)
            return false;
        if (idEstadoInicialNovedad != null ? !idEstadoInicialNovedad.equals(that.idEstadoInicialNovedad) : that.idEstadoInicialNovedad != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (indicadorAusentismo != null ? !indicadorAusentismo.equals(that.indicadorAusentismo) : that.indicadorAusentismo != null)
            return false;
        if (indicadorSeguimiento != null ? !indicadorSeguimiento.equals(that.indicadorSeguimiento) : that.indicadorSeguimiento != null)
            return false;
        if (indicadorConfirmacion != null ? !indicadorConfirmacion.equals(that.indicadorConfirmacion) : that.indicadorConfirmacion != null)
            return false;
        if (indicadorAdjuntos != null ? !indicadorAdjuntos.equals(that.indicadorAdjuntos) : that.indicadorAdjuntos != null)
            return false;
        if (indicadorAutorizaJefe != null ? !indicadorAutorizaJefe.equals(that.indicadorAutorizaJefe) : that.indicadorAutorizaJefe != null)
            return false;
        if (indicadorNotificaJefe != null ? !indicadorNotificaJefe.equals(that.indicadorNotificaJefe) : that.indicadorNotificaJefe != null)
            return false;
        if (indicadorBandeja != null ? !indicadorBandeja.equals(that.indicadorBandeja) : that.indicadorBandeja != null)
            return false;
        if (indicadorPlanta != null ? !indicadorPlanta.equals(that.indicadorPlanta) : that.indicadorPlanta != null)
            return false;
        if (indicadorAreasApoyo != null ? !indicadorAreasApoyo.equals(that.indicadorAreasApoyo) : that.indicadorAreasApoyo != null)
            return false;
        if (codigoSafix != null ? !codigoSafix.equals(that.codigoSafix) : that.codigoSafix != null) return false;
        if (indicadorNomina != null ? !indicadorNomina.equals(that.indicadorNomina) : that.indicadorNomina != null)
            return false;
        if (indicadorAfecta != null ? !indicadorAfecta.equals(that.indicadorAfecta) : that.indicadorAfecta != null)
            return false;
        if (tipoAfectacion != null ? !tipoAfectacion.equals(that.tipoAfectacion) : that.tipoAfectacion != null)
            return false;
        if (idTipoAfectacion != null ? !idTipoAfectacion.equals(that.idTipoAfectacion) : that.idTipoAfectacion != null)
            return false;
        if (indicadorCancelacion != null ? !indicadorCancelacion.equals(that.indicadorCancelacion) : that.indicadorCancelacion != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (fechaCreacion != null ? !fechaCreacion.equals(that.fechaCreacion) : that.fechaCreacion != null)
            return false;
        if (estadoTercero != null ? !estadoTercero.equals(that.estadoTercero) : that.estadoTercero != null)
            return false;
        if (idEstadoTercero != null ? !idEstadoTercero.equals(that.idEstadoTercero) : that.idEstadoTercero != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idNovedad != null ? idNovedad.hashCode() : 0;
        result = 31 * result + (codigoNovedad != null ? codigoNovedad.hashCode() : 0);
        result = 31 * result + (novedad != null ? novedad.hashCode() : 0);
        result = 31 * result + (tipoNovedad != null ? tipoNovedad.hashCode() : 0);
        result = 31 * result + (idTipoNovedad != null ? idTipoNovedad.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (idRolResponsable != null ? idRolResponsable.hashCode() : 0);
        result = 31 * result + (estadoInicialNovedad != null ? estadoInicialNovedad.hashCode() : 0);
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
        result = 31 * result + (tipoAfectacion != null ? tipoAfectacion.hashCode() : 0);
        result = 31 * result + (idTipoAfectacion != null ? idTipoAfectacion.hashCode() : 0);
        result = 31 * result + (indicadorCancelacion != null ? indicadorCancelacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (fechaCreacion != null ? fechaCreacion.hashCode() : 0);
        result = 31 * result + (estadoTercero != null ? estadoTercero.hashCode() : 0);
        result = 31 * result + (idEstadoTercero != null ? idEstadoTercero.hashCode() : 0);
        return result;
    }
}
