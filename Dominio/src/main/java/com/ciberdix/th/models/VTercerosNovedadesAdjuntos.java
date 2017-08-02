package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "V_TercerosNovedadesAdjuntos", schema = "dbo", catalog = "CREZCAMOS")
public class VTercerosNovedadesAdjuntos {
    private Integer idTerceroNovedadAdjunto;
    private Integer idTerceroNovedad;
    private String nombreArchivo;
    private Integer idAdjunto;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorHabilitado;
    private Boolean indicadorAccidente;

    @Id
    @Column(name = "IdTerceroNovedadAdjunto", nullable = false)
    public Integer getIdTerceroNovedadAdjunto() {
        return idTerceroNovedadAdjunto;
    }

    public void setIdTerceroNovedadAdjunto(Integer idTerceroNovedadAdjunto) {
        this.idTerceroNovedadAdjunto = idTerceroNovedadAdjunto;
    }

    @Basic
    @Column(name = "IdTerceroNovedad", nullable = false)
    public Integer getIdTerceroNovedad() {
        return idTerceroNovedad;
    }

    public void setIdTerceroNovedad(Integer idTerceroNovedad) {
        this.idTerceroNovedad = idTerceroNovedad;
    }

    @Basic
    @Column(name = "NombreArchivo", nullable = true, length = 100)
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Basic
    @Column(name = "IdAdjunto", nullable = false)
    public Integer getIdAdjunto() {
        return idAdjunto;
    }

    public void setIdAdjunto(Integer idAdjunto) {
        this.idAdjunto = idAdjunto;
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
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "IndicadorAccidente", nullable = true)
    public Boolean getIndicadorAccidente() {
        return indicadorAccidente;
    }

    public void setIndicadorAccidente(Boolean indicadorAccidente) {
        this.indicadorAccidente = indicadorAccidente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTercerosNovedadesAdjuntos that = (VTercerosNovedadesAdjuntos) o;

        if (idTerceroNovedadAdjunto != null ? !idTerceroNovedadAdjunto.equals(that.idTerceroNovedadAdjunto) : that.idTerceroNovedadAdjunto != null)
            return false;
        if (idTerceroNovedad != null ? !idTerceroNovedad.equals(that.idTerceroNovedad) : that.idTerceroNovedad != null)
            return false;
        if (nombreArchivo != null ? !nombreArchivo.equals(that.nombreArchivo) : that.nombreArchivo != null)
            return false;
        if (idAdjunto != null ? !idAdjunto.equals(that.idAdjunto) : that.idAdjunto != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (indicadorAccidente != null ? !indicadorAccidente.equals(that.indicadorAccidente) : that.indicadorAccidente != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroNovedadAdjunto != null ? idTerceroNovedadAdjunto.hashCode() : 0;
        result = 31 * result + (idTerceroNovedad != null ? idTerceroNovedad.hashCode() : 0);
        result = 31 * result + (nombreArchivo != null ? nombreArchivo.hashCode() : 0);
        result = 31 * result + (idAdjunto != null ? idAdjunto.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (indicadorAccidente != null ? indicadorAccidente.hashCode() : 0);
        return result;
    }
}
