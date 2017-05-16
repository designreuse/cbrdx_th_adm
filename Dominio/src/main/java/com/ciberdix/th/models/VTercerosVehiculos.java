package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_TercerosVehiculos", schema = "crz_th", catalog = "CREZCAMOS")
public class VTercerosVehiculos {
    private Integer idTerceroVehiculo;
    private Long idTercero;
    private Integer idTipoVehiculo;
    private String tipoVehiculo;
    private Integer idTipoServicio;
    private String tipoServicio;
    private Integer idMarca;
    private String marca;
    private Integer modelo;
    private String placa;
    private Integer idCiudad;
    private String ciudad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdTerceroVehiculo")
    public Integer getIdTerceroVehiculo() {
        return idTerceroVehiculo;
    }

    public void setIdTerceroVehiculo(Integer idTerceroVehiculo) {
        this.idTerceroVehiculo = idTerceroVehiculo;
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
    @Column(name = "IdTipoVehiculo")
    public Integer getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(Integer idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    @Basic
    @Column(name = "TipoVehiculo")
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Basic
    @Column(name = "IdTipoServicio")
    public Integer getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(Integer idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    @Basic
    @Column(name = "TipoServicio")
    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Basic
    @Column(name = "IdMarca")
    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    @Basic
    @Column(name = "Marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Basic
    @Column(name = "Modelo")
    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    @Basic
    @Column(name = "Placa")
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
    @Column(name = "Ciudad")
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

        VTercerosVehiculos that = (VTercerosVehiculos) o;

        if (idTerceroVehiculo != null ? !idTerceroVehiculo.equals(that.idTerceroVehiculo) : that.idTerceroVehiculo != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idTipoVehiculo != null ? !idTipoVehiculo.equals(that.idTipoVehiculo) : that.idTipoVehiculo != null)
            return false;
        if (tipoVehiculo != null ? !tipoVehiculo.equals(that.tipoVehiculo) : that.tipoVehiculo != null) return false;
        if (idTipoServicio != null ? !idTipoServicio.equals(that.idTipoServicio) : that.idTipoServicio != null)
            return false;
        if (tipoServicio != null ? !tipoServicio.equals(that.tipoServicio) : that.tipoServicio != null) return false;
        if (idMarca != null ? !idMarca.equals(that.idMarca) : that.idMarca != null) return false;
        if (marca != null ? !marca.equals(that.marca) : that.marca != null) return false;
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) return false;
        if (placa != null ? !placa.equals(that.placa) : that.placa != null) return false;
        if (idCiudad != null ? !idCiudad.equals(that.idCiudad) : that.idCiudad != null) return false;
        if (ciudad != null ? !ciudad.equals(that.ciudad) : that.ciudad != null) return false;
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
        int result = idTerceroVehiculo != null ? idTerceroVehiculo.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idTipoVehiculo != null ? idTipoVehiculo.hashCode() : 0);
        result = 31 * result + (tipoVehiculo != null ? tipoVehiculo.hashCode() : 0);
        result = 31 * result + (idTipoServicio != null ? idTipoServicio.hashCode() : 0);
        result = 31 * result + (tipoServicio != null ? tipoServicio.hashCode() : 0);
        result = 31 * result + (idMarca != null ? idMarca.hashCode() : 0);
        result = 31 * result + (marca != null ? marca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (placa != null ? placa.hashCode() : 0);
        result = 31 * result + (idCiudad != null ? idCiudad.hashCode() : 0);
        result = 31 * result + (ciudad != null ? ciudad.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
