package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/6/2017.
 */
@Entity
@Table(name = "Productividades", schema = "crz_th", catalog = "CREZCAMOS")
public class Productividades {
    private Integer idProductividad;
    private String productividad;
    private Integer minimoIq;
    private Integer maximoIq;
    private Integer minimoAptitud;
    private Integer maximoAptitud;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Productividades() {
    }

    public Productividades(String productividad, Integer minimoIq, Integer maximoIq, Integer minimoAptitud, Integer maximoAptitud, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.productividad = productividad;
        this.minimoIq = minimoIq;
        this.maximoIq = maximoIq;
        this.minimoAptitud = minimoAptitud;
        this.maximoAptitud = maximoAptitud;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @Column(name = "IdProductividad")
    public Integer getIdProductividad() {
        return idProductividad;
    }

    public void setIdProductividad(Integer idProductividad) {
        this.idProductividad = idProductividad;
    }

    @Basic
    @Column(name = "Productividad")
    public String getProductividad() {
        return productividad;
    }

    public void setProductividad(String productividad) {
        this.productividad = productividad;
    }

    @Basic
    @Column(name = "MinimoIQ")
    public Integer getMinimoIq() {
        return minimoIq;
    }

    public void setMinimoIq(Integer minimoIq) {
        this.minimoIq = minimoIq;
    }

    @Basic
    @Column(name = "MaximoIQ")
    public Integer getMaximoIq() {
        return maximoIq;
    }

    public void setMaximoIq(Integer maximoIq) {
        this.maximoIq = maximoIq;
    }

    @Basic
    @Column(name = "MinimoAptitud")
    public Integer getMinimoAptitud() {
        return minimoAptitud;
    }

    public void setMinimoAptitud(Integer minimoAptitud) {
        this.minimoAptitud = minimoAptitud;
    }

    @Basic
    @Column(name = "MaximoAptitud")
    public Integer getMaximoAptitud() {
        return maximoAptitud;
    }

    public void setMaximoAptitud(Integer maximoAptitud) {
        this.maximoAptitud = maximoAptitud;
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

        Productividades that = (Productividades) o;

        if (idProductividad != null ? !idProductividad.equals(that.idProductividad) : that.idProductividad != null)
            return false;
        if (productividad != null ? !productividad.equals(that.productividad) : that.productividad != null)
            return false;
        if (minimoIq != null ? !minimoIq.equals(that.minimoIq) : that.minimoIq != null) return false;
        if (maximoIq != null ? !maximoIq.equals(that.maximoIq) : that.maximoIq != null) return false;
        if (minimoAptitud != null ? !minimoAptitud.equals(that.minimoAptitud) : that.minimoAptitud != null)
            return false;
        if (maximoAptitud != null ? !maximoAptitud.equals(that.maximoAptitud) : that.maximoAptitud != null)
            return false;
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
        int result = idProductividad != null ? idProductividad.hashCode() : 0;
        result = 31 * result + (productividad != null ? productividad.hashCode() : 0);
        result = 31 * result + (minimoIq != null ? minimoIq.hashCode() : 0);
        result = 31 * result + (maximoIq != null ? maximoIq.hashCode() : 0);
        result = 31 * result + (minimoAptitud != null ? minimoAptitud.hashCode() : 0);
        result = 31 * result + (maximoAptitud != null ? maximoAptitud.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
