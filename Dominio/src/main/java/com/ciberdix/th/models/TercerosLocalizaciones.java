package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "TercerosLocalizaciones", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosLocalizaciones {
    private Integer idTerceroLocalizacion;
    private Long idTercero;
    private Integer idlocalizacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosLocalizaciones() {
    }

    public TercerosLocalizaciones(Long idTercero, Integer idlocalizacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTercero = idTercero;
        this.idlocalizacion = idlocalizacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TercerosLocalizaciones(Integer idTerceroLocalizacion, Long idTercero, Integer idlocalizacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
        this.idTercero = idTercero;
        this.idlocalizacion = idlocalizacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTerceroLocalizacion", nullable = false)
    public Integer getIdTerceroLocalizacion() {
        return idTerceroLocalizacion;
    }

    public void setIdTerceroLocalizacion(Integer idTerceroLocalizacion) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
    }

    @Basic
    @Column(name = "IdTercero", nullable = false)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "Idlocalizacion", nullable = false)
    public Integer getIdlocalizacion() {
        return idlocalizacion;
    }

    public void setIdlocalizacion(Integer idlocalizacion) {
        this.idlocalizacion = idlocalizacion;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosLocalizaciones that = (TercerosLocalizaciones) o;

        if (idTerceroLocalizacion != null ? !idTerceroLocalizacion.equals(that.idTerceroLocalizacion) : that.idTerceroLocalizacion != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idlocalizacion != null ? !idlocalizacion.equals(that.idlocalizacion) : that.idlocalizacion != null)
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
        int result = idTerceroLocalizacion != null ? idTerceroLocalizacion.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idlocalizacion != null ? idlocalizacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
