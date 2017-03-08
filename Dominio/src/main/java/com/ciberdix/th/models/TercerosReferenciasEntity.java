package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by ingjj on 8/03/2017.
 */
@Entity
@Table(name = "TercerosReferencias", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosReferenciasEntity {
    private int idTercerosReferencia;
    private int idTerceros;
    private int idTipoReferencia;
    private String empresa;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefonoFijo;
    private String telefonoFMovil;
    private Integer idLocalizacion;
    private Integer idAdjunto;
    private boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private boolean indicadorVerificado;
    private Timestamp fechaVerificado;

    public TercerosReferenciasEntity(int idTercerosReferencia, int idTerceros, int idTipoReferencia, String empresa, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String telefonoFijo, String telefonoFMovil, Integer idLocalizacion, Integer idAdjunto, boolean indicadorHabilitado, Integer auditoriaUsuario, Timestamp auditoriaFecha, boolean indicadorVerificado, Timestamp fechaVerificado) {
        this.idTercerosReferencia = idTercerosReferencia;
        this.idTerceros = idTerceros;
        this.idTipoReferencia = idTipoReferencia;
        this.empresa = empresa;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefonoFijo = telefonoFijo;
        this.telefonoFMovil = telefonoFMovil;
        this.idLocalizacion = idLocalizacion;
        this.idAdjunto = idAdjunto;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
        this.indicadorVerificado = indicadorVerificado;
        this.fechaVerificado = fechaVerificado;
    }

    public TercerosReferenciasEntity() {
    }

    @Id
    @Column(name = "IdTercerosReferencia", nullable = false)
    public int getIdTercerosReferencia() {
        return idTercerosReferencia;
    }

    public void setIdTercerosReferencia(int idTercerosReferencia) {
        this.idTercerosReferencia = idTercerosReferencia;
    }

    @Basic
    @Column(name = "IdTerceros", nullable = true)
    public int getIdTerceros() {
        return idTerceros;
    }

    public void setIdTerceros(int idTerceros) {
        this.idTerceros = idTerceros;
    }
    @Basic
    @Column(name = "IdTipoReferencia", nullable = true)
    public int getIdTipoReferencia() {
        return idTipoReferencia;
    }

    public void setIdTipoReferencia(int idTipoReferencia) {
        this.idTipoReferencia = idTipoReferencia;
    }

    @Basic
    @Column(name = "Empresa", nullable = true)
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    @Basic
    @Column(name = "PrimerNombre", nullable = true)
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    @Basic
    @Column(name = "SegundoNombre", nullable = true)
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    @Basic
    @Column(name = "PrimerApellido", nullable = true)
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    @Basic
    @Column(name = "SegundoApellido", nullable = true)
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    @Basic
    @Column(name = "TelefonoFijo", nullable = true)
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }
    @Basic
    @Column(name = "TelefonoFMovil", nullable = true)
    public String getTelefonoFMovil() {
        return telefonoFMovil;
    }

    public void setTelefonoFMovil(String telefonoFMovil) {
        this.telefonoFMovil = telefonoFMovil;
    }
    @Basic
    @Column(name = "IdLocalizacion", nullable = true)
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }
    @Basic
    @Column(name = "IdAdjunto", nullable = true)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
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
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
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
