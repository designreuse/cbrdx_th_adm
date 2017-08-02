package com.ciberdix.th.model;

import java.sql.Timestamp;

public class VCentralesRiesgos {

    private Integer idCentralRiesgo;
    private String codigo;
    private String nombre;
    private String url;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorReporta;
    private String descripcion;
    private String tipoCentralInformacion;
    private Integer idTipoCentralInformacion;
    private String vigencia;
    private Integer idVigencia;
    private Boolean indicadorWebServices;
    private String causal;
    private String usuario;
    private String clave;
    private String nombreDescarga;
    private String numeroDocumento;

    public Integer getIdCentralRiesgo() {
        return idCentralRiesgo;
    }

    public void setIdCentralRiesgo(Integer idCentralRiesgo) {
        this.idCentralRiesgo = idCentralRiesgo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Boolean getIndicadorReporta() {
        return indicadorReporta;
    }

    public void setIndicadorReporta(Boolean indicadorReporta) {
        this.indicadorReporta = indicadorReporta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoCentralInformacion() {
        return tipoCentralInformacion;
    }

    public void setTipoCentralInformacion(String tipoCentralInformacion) {
        this.tipoCentralInformacion = tipoCentralInformacion;
    }

    public Integer getIdTipoCentralInformacion() {
        return idTipoCentralInformacion;
    }

    public void setIdTipoCentralInformacion(Integer idTipoCentralInformacion) {
        this.idTipoCentralInformacion = idTipoCentralInformacion;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public Integer getIdVigencia() {
        return idVigencia;
    }

    public void setIdVigencia(Integer idVigencia) {
        this.idVigencia = idVigencia;
    }

    public Boolean getIndicadorWebServices() {
        return indicadorWebServices;
    }

    public void setIndicadorWebServices(Boolean indicadorWebServices) {
        this.indicadorWebServices = indicadorWebServices;
    }

    public String getCausal() {
        return causal;
    }

    public void setCausal(String causal) {
        this.causal = causal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreDescarga() {
        return nombreDescarga;
    }

    public void setNombreDescarga(String nombreDescarga) {
        this.nombreDescarga = nombreDescarga;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
