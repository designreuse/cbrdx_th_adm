package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_TercerosInmuebles", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class VTercerosInmuebles {
    private Integer idTerceroInmueble;
    private Long idTercero;
    private Integer idTipoVivienda;
    private String tipoVivienda;
    private Integer idClaseVivienda;
    private String claseVivienda;
    private Integer idTipoConstruccionVivienda;
    private String tipoConstruccionVivienda;
    private Integer anioConstruccion;
    private Integer numeroPisos;
    private Integer numeroSotanos;
    private Integer idEstrato;
    private String estrato;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroInmueble")
    public Integer getIdTerceroInmueble() {
        return idTerceroInmueble;
    }

    public void setIdTerceroInmueble(Integer idTerceroInmueble) {
        this.idTerceroInmueble = idTerceroInmueble;
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
    @Column(name = "IdTipoVivienda")
    public Integer getIdTipoVivienda() {
        return idTipoVivienda;
    }

    public void setIdTipoVivienda(Integer idTipoVivienda) {
        this.idTipoVivienda = idTipoVivienda;
    }

    @Basic
    @Column(name = "TipoVivienda")
    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Basic
    @Column(name = "IdClaseVivienda")
    public Integer getIdClaseVivienda() {
        return idClaseVivienda;
    }

    public void setIdClaseVivienda(Integer idClaseVivienda) {
        this.idClaseVivienda = idClaseVivienda;
    }

    @Basic
    @Column(name = "ClaseVivienda")
    public String getClaseVivienda() {
        return claseVivienda;
    }

    public void setClaseVivienda(String claseVivienda) {
        this.claseVivienda = claseVivienda;
    }

    @Basic
    @Column(name = "IdTipoConstruccionVivienda")
    public Integer getIdTipoConstruccionVivienda() {
        return idTipoConstruccionVivienda;
    }

    public void setIdTipoConstruccionVivienda(Integer idTipoConstruccionVivienda) {
        this.idTipoConstruccionVivienda = idTipoConstruccionVivienda;
    }

    @Basic
    @Column(name = "TipoConstruccionVivienda")
    public String getTipoConstruccionVivienda() {
        return tipoConstruccionVivienda;
    }

    public void setTipoConstruccionVivienda(String tipoConstruccionVivienda) {
        this.tipoConstruccionVivienda = tipoConstruccionVivienda;
    }

    @Basic
    @Column(name = "AnioConstruccion")
    public Integer getAnioConstruccion() {
        return anioConstruccion;
    }

    public void setAnioConstruccion(Integer anioConstruccion) {
        this.anioConstruccion = anioConstruccion;
    }

    @Basic
    @Column(name = "NumeroPisos")
    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Basic
    @Column(name = "NumeroSotanos")
    public Integer getNumeroSotanos() {
        return numeroSotanos;
    }

    public void setNumeroSotanos(Integer numeroSotanos) {
        this.numeroSotanos = numeroSotanos;
    }

    @Basic
    @Column(name = "IdEstrato")
    public Integer getIdEstrato() {
        return idEstrato;
    }

    public void setIdEstrato(Integer idEstrato) {
        this.idEstrato = idEstrato;
    }

    @Basic
    @Column(name = "Estrato")
    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTercerosInmuebles that = (VTercerosInmuebles) o;

        if (idTerceroInmueble != null ? !idTerceroInmueble.equals(that.idTerceroInmueble) : that.idTerceroInmueble != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idTipoVivienda != null ? !idTipoVivienda.equals(that.idTipoVivienda) : that.idTipoVivienda != null)
            return false;
        if (tipoVivienda != null ? !tipoVivienda.equals(that.tipoVivienda) : that.tipoVivienda != null) return false;
        if (idClaseVivienda != null ? !idClaseVivienda.equals(that.idClaseVivienda) : that.idClaseVivienda != null)
            return false;
        if (claseVivienda != null ? !claseVivienda.equals(that.claseVivienda) : that.claseVivienda != null)
            return false;
        if (idTipoConstruccionVivienda != null ? !idTipoConstruccionVivienda.equals(that.idTipoConstruccionVivienda) : that.idTipoConstruccionVivienda != null)
            return false;
        if (tipoConstruccionVivienda != null ? !tipoConstruccionVivienda.equals(that.tipoConstruccionVivienda) : that.tipoConstruccionVivienda != null)
            return false;
        if (anioConstruccion != null ? !anioConstruccion.equals(that.anioConstruccion) : that.anioConstruccion != null)
            return false;
        if (numeroPisos != null ? !numeroPisos.equals(that.numeroPisos) : that.numeroPisos != null) return false;
        if (numeroSotanos != null ? !numeroSotanos.equals(that.numeroSotanos) : that.numeroSotanos != null)
            return false;
        if (idEstrato != null ? !idEstrato.equals(that.idEstrato) : that.idEstrato != null) return false;
        if (estrato != null ? !estrato.equals(that.estrato) : that.estrato != null) return false;
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
        int result = idTerceroInmueble != null ? idTerceroInmueble.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idTipoVivienda != null ? idTipoVivienda.hashCode() : 0);
        result = 31 * result + (tipoVivienda != null ? tipoVivienda.hashCode() : 0);
        result = 31 * result + (idClaseVivienda != null ? idClaseVivienda.hashCode() : 0);
        result = 31 * result + (claseVivienda != null ? claseVivienda.hashCode() : 0);
        result = 31 * result + (idTipoConstruccionVivienda != null ? idTipoConstruccionVivienda.hashCode() : 0);
        result = 31 * result + (tipoConstruccionVivienda != null ? tipoConstruccionVivienda.hashCode() : 0);
        result = 31 * result + (anioConstruccion != null ? anioConstruccion.hashCode() : 0);
        result = 31 * result + (numeroPisos != null ? numeroPisos.hashCode() : 0);
        result = 31 * result + (numeroSotanos != null ? numeroSotanos.hashCode() : 0);
        result = 31 * result + (idEstrato != null ? idEstrato.hashCode() : 0);
        result = 31 * result + (estrato != null ? estrato.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
