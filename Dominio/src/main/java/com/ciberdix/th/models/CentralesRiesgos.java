package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CentralesRiesgos", schema = "dbo", catalog = "CREZCAMOS")
public class CentralesRiesgos {
    private Integer idCentralRiesgo;
    private String codigo;
    private String nombre;
    private String url;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorReporta;
    private String descripcion;
    private Integer idTipoCentralInformacion;
    private Integer idVigencia;
    private Boolean indicadorWebServices;
    private String causal;
    private String usuario;
    private String clave;
    private String nombreDescarga;
    private String numeroDocumento;

    public CentralesRiesgos() {
    }

    public CentralesRiesgos(String codigo, String nombre, String url, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorReporta, String descripcion, Integer idTipoCentralInformacion, Integer idVigencia, Boolean indicadorWebServices, String causal, String usuario, String clave, String nombreDescarga, String numeroDocumento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.url = url;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorReporta = indicadorReporta;
        this.descripcion = descripcion;
        this.idTipoCentralInformacion = idTipoCentralInformacion;
        this.idVigencia = idVigencia;
        this.indicadorWebServices = indicadorWebServices;
        this.causal = causal;
        this.usuario = usuario;
        this.clave = clave;
        this.nombreDescarga = nombreDescarga;
        this.numeroDocumento = numeroDocumento;
    }

    public CentralesRiesgos(Integer idCentralRiesgo, String codigo, String nombre, String url, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorReporta, String descripcion, Integer idTipoCentralInformacion, Integer idVigencia, Boolean indicadorWebServices, String causal, String usuario, String clave, String nombreDescarga, String numeroDocumento) {
        this.idCentralRiesgo = idCentralRiesgo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.url = url;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorReporta = indicadorReporta;
        this.descripcion = descripcion;
        this.idTipoCentralInformacion = idTipoCentralInformacion;
        this.idVigencia = idVigencia;
        this.indicadorWebServices = indicadorWebServices;
        this.causal = causal;
        this.usuario = usuario;
        this.clave = clave;
        this.nombreDescarga = nombreDescarga;
        this.numeroDocumento = numeroDocumento;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCentralRiesgo", nullable = false)
    public Integer getIdCentralRiesgo() {
        return idCentralRiesgo;
    }

    public void setIdCentralRiesgo(Integer idCentralRiesgo) {
        this.idCentralRiesgo = idCentralRiesgo;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 10)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Nombre", nullable = true, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "URL", nullable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
    @Column(name = "IndicadorReporta", nullable = true)
    public Boolean getIndicadorReporta() {
        return indicadorReporta;
    }

    public void setIndicadorReporta(Boolean indicadorReporta) {
        this.indicadorReporta = indicadorReporta;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 500)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IdTipoCentralInformacion", nullable = true)
    public Integer getIdTipoCentralInformacion() {
        return idTipoCentralInformacion;
    }

    public void setIdTipoCentralInformacion(Integer idTipoCentralInformacion) {
        this.idTipoCentralInformacion = idTipoCentralInformacion;
    }

    @Basic
    @Column(name = "IdVigencia", nullable = true)
    public Integer getIdVigencia() {
        return idVigencia;
    }

    public void setIdVigencia(Integer idVigencia) {
        this.idVigencia = idVigencia;
    }

    @Basic
    @Column(name = "IndicadorWebServices", nullable = true)
    public Boolean getIndicadorWebServices() {
        return indicadorWebServices;
    }

    public void setIndicadorWebServices(Boolean indicadorWebServices) {
        this.indicadorWebServices = indicadorWebServices;
    }

    @Basic
    @Column(name = "Causal", nullable = true, length = 100)
    public String getCausal() {
        return causal;
    }

    public void setCausal(String causal) {
        this.causal = causal;
    }

    @Basic
    @Column(name = "Usuario", nullable = true, length = 100)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "Clave", nullable = true, length = 100)
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Basic
    @Column(name = "NombreDescarga", nullable = true, length = 100)
    public String getNombreDescarga() {
        return nombreDescarga;
    }

    public void setNombreDescarga(String nombreDescarga) {
        this.nombreDescarga = nombreDescarga;
    }

    @Basic
    @Column(name = "NumeroDocumento", nullable = true, length = 100)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CentralesRiesgos that = (CentralesRiesgos) o;

        if (idCentralRiesgo != null ? !idCentralRiesgo.equals(that.idCentralRiesgo) : that.idCentralRiesgo != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorReporta != null ? !indicadorReporta.equals(that.indicadorReporta) : that.indicadorReporta != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (idTipoCentralInformacion != null ? !idTipoCentralInformacion.equals(that.idTipoCentralInformacion) : that.idTipoCentralInformacion != null)
            return false;
        if (idVigencia != null ? !idVigencia.equals(that.idVigencia) : that.idVigencia != null) return false;
        if (indicadorWebServices != null ? !indicadorWebServices.equals(that.indicadorWebServices) : that.indicadorWebServices != null)
            return false;
        if (causal != null ? !causal.equals(that.causal) : that.causal != null) return false;
        if (usuario != null ? !usuario.equals(that.usuario) : that.usuario != null) return false;
        if (clave != null ? !clave.equals(that.clave) : that.clave != null) return false;
        if (nombreDescarga != null ? !nombreDescarga.equals(that.nombreDescarga) : that.nombreDescarga != null)
            return false;
        if (numeroDocumento != null ? !numeroDocumento.equals(that.numeroDocumento) : that.numeroDocumento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCentralRiesgo != null ? idCentralRiesgo.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorReporta != null ? indicadorReporta.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (idTipoCentralInformacion != null ? idTipoCentralInformacion.hashCode() : 0);
        result = 31 * result + (idVigencia != null ? idVigencia.hashCode() : 0);
        result = 31 * result + (indicadorWebServices != null ? indicadorWebServices.hashCode() : 0);
        result = 31 * result + (causal != null ? causal.hashCode() : 0);
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        result = 31 * result + (clave != null ? clave.hashCode() : 0);
        result = 31 * result + (nombreDescarga != null ? nombreDescarga.hashCode() : 0);
        result = 31 * result + (numeroDocumento != null ? numeroDocumento.hashCode() : 0);
        return result;
    }
}
