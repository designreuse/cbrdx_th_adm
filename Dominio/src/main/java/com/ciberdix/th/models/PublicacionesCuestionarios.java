package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 31/05/2017.
 */
@Entity
@Table(name = "PublicacionesCuestionarios", schema = "dbo", catalog = "CREZCAMOS")
public class PublicacionesCuestionarios {
    private Integer idPublicacionCustionario;
    private Integer idPublicacion;
    private Integer idCuestionario;
    private Integer orden;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public PublicacionesCuestionarios() {
    }

    public PublicacionesCuestionarios(Integer idPublicacion, Integer idCuestionario, Integer orden, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idPublicacion = idPublicacion;
        this.idCuestionario = idCuestionario;
        this.orden = orden;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public PublicacionesCuestionarios(Integer idPublicacionCustionario, Integer idPublicacion, Integer idCuestionario, Integer orden, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idPublicacionCustionario = idPublicacionCustionario;
        this.idPublicacion = idPublicacion;
        this.idCuestionario = idCuestionario;
        this.orden = orden;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdPublicacionCustionario", nullable = false)
    public Integer getIdPublicacionCustionario() {
        return idPublicacionCustionario;
    }

    public void setIdPublicacionCustionario(Integer idPublicacionCustionario) {
        this.idPublicacionCustionario = idPublicacionCustionario;
    }

    @Basic
    @Column(name = "IdPublicacion", nullable = true)
    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    @Basic
    @Column(name = "IdCuestionario", nullable = true)
    public Integer getIdCuestionario() {
        return idCuestionario;
    }

    public void setIdCuestionario(Integer idCuestionario) {
        this.idCuestionario = idCuestionario;
    }

    @Basic
    @Column(name = "Orden", nullable = true)
    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
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

        PublicacionesCuestionarios that = (PublicacionesCuestionarios) o;

        if (idPublicacionCustionario != null ? !idPublicacionCustionario.equals(that.idPublicacionCustionario) : that.idPublicacionCustionario != null)
            return false;
        if (idPublicacion != null ? !idPublicacion.equals(that.idPublicacion) : that.idPublicacion != null)
            return false;
        if (idCuestionario != null ? !idCuestionario.equals(that.idCuestionario) : that.idCuestionario != null)
            return false;
        if (orden != null ? !orden.equals(that.orden) : that.orden != null) return false;
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
        int result = idPublicacionCustionario != null ? idPublicacionCustionario.hashCode() : 0;
        result = 31 * result + (idPublicacion != null ? idPublicacion.hashCode() : 0);
        result = 31 * result + (idCuestionario != null ? idCuestionario.hashCode() : 0);
        result = 31 * result + (orden != null ? orden.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
