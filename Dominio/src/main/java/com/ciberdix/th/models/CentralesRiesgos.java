package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 13/06/2017.
 */
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

    public CentralesRiesgos() {
    }

    public CentralesRiesgos(String codigo, String nombre, String url, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorReporta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.url = url;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorReporta = indicadorReporta;
    }

    public CentralesRiesgos(Integer idCentralRiesgo, String codigo, String nombre, String url, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorReporta) {
        this.idCentralRiesgo = idCentralRiesgo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.url = url;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorReporta = indicadorReporta;
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
        return result;
    }
}
