package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/4/2017.
 */
@Entity
@Table(name = "TercerosVehiculos", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosVehiculos {
    private Integer idTerceroVehiculo;
    private Long idTercero;
    private Integer idTipoVehiculo;
    private Integer idTipoServicio;
    private Integer idMarca;
    private Integer modelo;
    private String placa;
    private Integer idCiudad;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosVehiculos() {
    }

    public TercerosVehiculos(Long idTercero, Integer idTipoVehiculo, Integer idTipoServicio, Integer idMarca, Integer modelo, String placa, Integer idCiudad, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTercero = idTercero;
        this.idTipoVehiculo = idTipoVehiculo;
        this.idTipoServicio = idTipoServicio;
        this.idMarca = idMarca;
        this.modelo = modelo;
        this.placa = placa;
        this.idCiudad = idCiudad;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
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
    @Column(name = "IdTipoServicio")
    public Integer getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(Integer idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
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

        TercerosVehiculos that = (TercerosVehiculos) o;

        if (idTerceroVehiculo != null ? !idTerceroVehiculo.equals(that.idTerceroVehiculo) : that.idTerceroVehiculo != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idTipoVehiculo != null ? !idTipoVehiculo.equals(that.idTipoVehiculo) : that.idTipoVehiculo != null)
            return false;
        if (idTipoServicio != null ? !idTipoServicio.equals(that.idTipoServicio) : that.idTipoServicio != null)
            return false;
        if (idMarca != null ? !idMarca.equals(that.idMarca) : that.idMarca != null) return false;
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) return false;
        if (placa != null ? !placa.equals(that.placa) : that.placa != null) return false;
        if (idCiudad != null ? !idCiudad.equals(that.idCiudad) : that.idCiudad != null) return false;
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
        result = 31 * result + (idTipoServicio != null ? idTipoServicio.hashCode() : 0);
        result = 31 * result + (idMarca != null ? idMarca.hashCode() : 0);
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (placa != null ? placa.hashCode() : 0);
        result = 31 * result + (idCiudad != null ? idCiudad.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
