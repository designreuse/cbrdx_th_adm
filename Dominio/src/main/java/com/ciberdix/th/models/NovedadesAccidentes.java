package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "NovedadesAccidentes", schema = "dbo", catalog = "CREZCAMOS")
public class NovedadesAccidentes {
    private Integer idNovedadAccidente;
    private Integer idTerceroNovedad;
    private Integer idEstadoAccidente;
    private Boolean indicadorActividades;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public NovedadesAccidentes() {
    }

    public NovedadesAccidentes(Integer idTerceroNovedad, Integer idEstadoAccidente, Boolean indicadorActividades, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTerceroNovedad = idTerceroNovedad;
        this.idEstadoAccidente = idEstadoAccidente;
        this.indicadorActividades = indicadorActividades;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public NovedadesAccidentes(Integer idNovedadAccidente, Integer idTerceroNovedad, Integer idEstadoAccidente, Boolean indicadorActividades, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idNovedadAccidente = idNovedadAccidente;
        this.idTerceroNovedad = idTerceroNovedad;
        this.idEstadoAccidente = idEstadoAccidente;
        this.indicadorActividades = indicadorActividades;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdNovedadAccidente", nullable = false)
    public Integer getIdNovedadAccidente() {
        return idNovedadAccidente;
    }

    public void setIdNovedadAccidente(Integer idNovedadAccidente) {
        this.idNovedadAccidente = idNovedadAccidente;
    }

    @Basic
    @Column(name = "IdTerceroNovedad", nullable = true)
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "IdEstadoAccidente", nullable = true)
    public Integer getIdEstadoAccidente() {
        return idEstadoAccidente;
    }

    public void setIdEstadoAccidente(Integer idEstadoAccidente) {
        this.idEstadoAccidente = idEstadoAccidente;
    }

    @Basic
    @Column(name = "IndicadorActividades", nullable = true)
    public Boolean getIndicadorActividades() {
        return indicadorActividades;
    }

    public void setIndicadorActividades(Boolean indicadorActividades) {
        this.indicadorActividades = indicadorActividades;
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

        NovedadesAccidentes that = (NovedadesAccidentes) o;

        if (idNovedadAccidente != null ? !idNovedadAccidente.equals(that.idNovedadAccidente) : that.idNovedadAccidente != null)
            return false;
        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (idEstadoAccidente != null ? !idEstadoAccidente.equals(that.idEstadoAccidente) : that.idEstadoAccidente != null)
            return false;
        if (indicadorActividades != null ? !indicadorActividades.equals(that.indicadorActividades) : that.indicadorActividades != null)
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
        int result = idNovedadAccidente != null ? idNovedadAccidente.hashCode() : 0;
        result = 31 * result + (idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0);
        result = 31 * result + (idEstadoAccidente != null ? idEstadoAccidente.hashCode() : 0);
        result = 31 * result + (indicadorActividades != null ? indicadorActividades.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
