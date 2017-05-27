package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Aguirre on 23/05/2017.
 */
@Entity
@Table(name = "DivisionPoliticaAgrupaciones", schema = "dbo", catalog = "CREZCAMOS")
public class DivisionPoliticaAgrupaciones {
    private Long idDivisionPoliticaAgrupacion;
    private Integer idDivisionPolitica;
    private Integer idDivisionPoliticaArea;
    private String agrupacion;
    private Integer idTipoAgrupacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public DivisionPoliticaAgrupaciones() {
    }

    public DivisionPoliticaAgrupaciones(Integer idDivisionPolitica, Integer idDivisionPoliticaArea, String agrupacion, Integer idTipoAgrupacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idDivisionPolitica = idDivisionPolitica;
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
        this.agrupacion = agrupacion;
        this.idTipoAgrupacion = idTipoAgrupacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public DivisionPoliticaAgrupaciones(Long idDivisionPoliticaAgrupacion, Integer idDivisionPolitica, Integer idDivisionPoliticaArea, String agrupacion, Integer idTipoAgrupacion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idDivisionPoliticaAgrupacion = idDivisionPoliticaAgrupacion;
        this.idDivisionPolitica = idDivisionPolitica;
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
        this.agrupacion = agrupacion;
        this.idTipoAgrupacion = idTipoAgrupacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdDivisionPoliticaAgrupacion", nullable = false)
    public Long getIdDivisionPoliticaAgrupacion() {
        return idDivisionPoliticaAgrupacion;
    }

    public void setIdDivisionPoliticaAgrupacion(Long idDivisionPoliticaAgrupacion) {
        this.idDivisionPoliticaAgrupacion = idDivisionPoliticaAgrupacion;
    }

    @Basic
    @Column(name = "IdDivisionPolitica", nullable = true)
    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }

    @Basic
    @Column(name = "IdDivisionPoliticaArea", nullable = true)
    public Integer getIdDivisionPoliticaArea() {
        return idDivisionPoliticaArea;
    }

    public void setIdDivisionPoliticaArea(Integer idDivisionPoliticaArea) {
        this.idDivisionPoliticaArea = idDivisionPoliticaArea;
    }

    @Basic
    @Column(name = "Agrupacion", nullable = true, length = 100)
    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    @Basic
    @Column(name = "IdTipoAgrupacion", nullable = true)
    public Integer getIdTipoAgrupacion() {
        return idTipoAgrupacion;
    }

    public void setIdTipoAgrupacion(Integer idTipoAgrupacion) {
        this.idTipoAgrupacion = idTipoAgrupacion;
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
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
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

        DivisionPoliticaAgrupaciones that = (DivisionPoliticaAgrupaciones) o;

        if (idDivisionPoliticaAgrupacion != null ? !idDivisionPoliticaAgrupacion.equals(that.idDivisionPoliticaAgrupacion) : that.idDivisionPoliticaAgrupacion != null)
            return false;
        if (idDivisionPolitica != null ? !idDivisionPolitica.equals(that.idDivisionPolitica) : that.idDivisionPolitica != null)
            return false;
        if (idDivisionPoliticaArea != null ? !idDivisionPoliticaArea.equals(that.idDivisionPoliticaArea) : that.idDivisionPoliticaArea != null)
            return false;
        if (agrupacion != null ? !agrupacion.equals(that.agrupacion) : that.agrupacion != null) return false;
        if (idTipoAgrupacion != null ? !idTipoAgrupacion.equals(that.idTipoAgrupacion) : that.idTipoAgrupacion != null)
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
        int result = idDivisionPoliticaAgrupacion != null ? idDivisionPoliticaAgrupacion.hashCode() : 0;
        result = 31 * result + (idDivisionPolitica != null ? idDivisionPolitica.hashCode() : 0);
        result = 31 * result + (idDivisionPoliticaArea != null ? idDivisionPoliticaArea.hashCode() : 0);
        result = 31 * result + (agrupacion != null ? agrupacion.hashCode() : 0);
        result = 31 * result + (idTipoAgrupacion != null ? idTipoAgrupacion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
