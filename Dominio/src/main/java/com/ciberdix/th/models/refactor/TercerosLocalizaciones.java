package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "TercerosLocalizaciones", schema = "crz_th", catalog = "CREZCAMOS")
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
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Id
    @Column(name = "IdTerceroLocalizacion")
    public Integer getIdTerceroLocalizacion() {
        return idTerceroLocalizacion;
    }

    public void setIdTerceroLocalizacion(Integer idTerceroLocalizacion) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
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
    @Column(name = "Idlocalizacion")
    public Integer getIdlocalizacion() {
        return idlocalizacion;
    }

    public void setIdlocalizacion(Integer idlocalizacion) {
        this.idlocalizacion = idlocalizacion;
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
