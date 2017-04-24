package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 22/03/2017.
 */
@Entity
@Table(name = "TercerosReferencias", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosReferenciasEntity {
    private Integer idTerceroReferencia;
    private Long idTercero;
    private Integer idTipoReferencia;
    private String empresa;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefonoFijo;
    private String telefonoMovil;
    private Integer idLocalizacion;
    private Integer idAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorVerificado;
    private Timestamp fechaVerificado;

    @Id
    @GeneratedValue
    @Column(name = "IdTerceroReferencia")
    public Integer getIdTerceroReferencia() {
        return idTerceroReferencia;
    }

    public void setIdTerceroReferencia(Integer idTerceroReferencia) {
        this.idTerceroReferencia = idTerceroReferencia;
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
    @Column(name = "IdTipoReferencia")
    public Integer getIdTipoReferencia() {
        return idTipoReferencia;
    }

    public void setIdTipoReferencia(Integer idTipoReferencia) {
        this.idTipoReferencia = idTipoReferencia;
    }

    @Basic
    @Column(name = "Empresa")
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Basic
    @Column(name = "PrimerNombre")
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Basic
    @Column(name = "SegundoNombre")
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Basic
    @Column(name = "PrimerApellido")
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Basic
    @Column(name = "SegundoApellido")
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Basic
    @Column(name = "TelefonoFijo")
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    @Basic
    @Column(name = "TelefonoMovil")
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Basic
    @Column(name = "IdLocalizacion")
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
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

        TercerosReferenciasEntity that = (TercerosReferenciasEntity) o;

        if (idTerceroReferencia != null ? !idTerceroReferencia.equals(that.idTerceroReferencia) : that.idTerceroReferencia != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idTipoReferencia != null ? !idTipoReferencia.equals(that.idTipoReferencia) : that.idTipoReferencia != null)
            return false;
        if (empresa != null ? !empresa.equals(that.empresa) : that.empresa != null) return false;
        if (primerNombre != null ? !primerNombre.equals(that.primerNombre) : that.primerNombre != null) return false;
        if (segundoNombre != null ? !segundoNombre.equals(that.segundoNombre) : that.segundoNombre != null)
            return false;
        if (primerApellido != null ? !primerApellido.equals(that.primerApellido) : that.primerApellido != null)
            return false;
        if (segundoApellido != null ? !segundoApellido.equals(that.segundoApellido) : that.segundoApellido != null)
            return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(that.telefonoFijo) : that.telefonoFijo != null) return false;
        if (telefonoMovil != null ? !telefonoMovil.equals(that.telefonoMovil) : that.telefonoMovil != null)
            return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
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
        int result = idTerceroReferencia != null ? idTerceroReferencia.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idTipoReferencia != null ? idTipoReferencia.hashCode() : 0);
        result = 31 * result + (empresa != null ? empresa.hashCode() : 0);
        result = 31 * result + (primerNombre != null ? primerNombre.hashCode() : 0);
        result = 31 * result + (segundoNombre != null ? segundoNombre.hashCode() : 0);
        result = 31 * result + (primerApellido != null ? primerApellido.hashCode() : 0);
        result = 31 * result + (segundoApellido != null ? segundoApellido.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoMovil != null ? telefonoMovil.hashCode() : 0);
        result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorVerificado != null ? indicadorVerificado.hashCode() : 0);
        result = 31 * result + (fechaVerificado != null ? fechaVerificado.hashCode() : 0);
        return result;
    }

    public TercerosReferenciasEntity() {
    }

    public TercerosReferenciasEntity(Long idTercero, Integer idTipoReferencia, String empresa, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefonoFijo, String telefonoMovil, Integer idLocalizacion, Integer idAdjunto, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorVerificado, Timestamp fechaVerificado) {
        this.idTercero = idTercero;
        this.idTipoReferencia = idTipoReferencia;
        this.empresa = empresa;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.idLocalizacion = idLocalizacion;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.indicadorVerificado = indicadorVerificado;
        this.fechaVerificado = fechaVerificado;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }
}
