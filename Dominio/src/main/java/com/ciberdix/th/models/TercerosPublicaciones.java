package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/06/2017.
 */
@Entity
@Table(name = "TercerosPublicaciones", schema = "dbo", catalog = "CREZCAMOS")
public class TercerosPublicaciones {
    private Integer idTercerosPublicaciones;
    private Long idTercero;
    private Integer idPublicacion;
    private Boolean indicadorTerminos;
    private Boolean indicadorCentrales;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorFinalizado;
    private String codigo;
    private Integer paso;
    private Boolean indicadorFinalizadoCuestionarios;
    private Integer idCuestionarioActual;

    public TercerosPublicaciones() {
    }

    public TercerosPublicaciones(Long idTercero, Integer idPublicacion, Boolean indicadorTerminos, Boolean indicadorCentrales, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorFinalizado, String codigo, Integer paso, Boolean indicadorFinalizadoCuestionarios, Integer idCuestionarioActual) {
        this.idTercero = idTercero;
        this.idPublicacion = idPublicacion;
        this.indicadorTerminos = indicadorTerminos;
        this.indicadorCentrales = indicadorCentrales;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorFinalizado = indicadorFinalizado;
        this.codigo = codigo;
        this.paso = paso;
        this.indicadorFinalizadoCuestionarios = indicadorFinalizadoCuestionarios;
        this.idCuestionarioActual = idCuestionarioActual;
    }

    public TercerosPublicaciones(Integer idTercerosPublicaciones, Long idTercero, Integer idPublicacion, Boolean indicadorTerminos, Boolean indicadorCentrales, Boolean indicadorHabilitado, Integer auditoriaUsuario, Boolean indicadorFinalizado, String codigo, Integer paso, Boolean indicadorFinalizadoCuestionarios, Integer idCuestionarioActual) {
        this.idTercerosPublicaciones = idTercerosPublicaciones;
        this.idTercero = idTercero;
        this.idPublicacion = idPublicacion;
        this.indicadorTerminos = indicadorTerminos;
        this.indicadorCentrales = indicadorCentrales;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.indicadorFinalizado = indicadorFinalizado;
        this.codigo = codigo;
        this.paso = paso;
        this.indicadorFinalizadoCuestionarios = indicadorFinalizadoCuestionarios;
        this.idCuestionarioActual = idCuestionarioActual;
    }

    @Basic
    @Column(name = "IndicadorFinalizadoCuestionarios", nullable = true)
    public Boolean isIndicadorFinalizadoCuestionarios() {
        return indicadorFinalizadoCuestionarios;
    }

    public void setIndicadorFinalizadoCuestionarios(boolean indicadorFinalizadoCuestionarios) {
        this.indicadorFinalizadoCuestionarios = indicadorFinalizadoCuestionarios;
    }

    @Basic
    @Column(name = "IdCuestionarioActual", nullable = true)
    public Integer getIdCuestionarioActual() {
        return idCuestionarioActual;
    }

    public void setIdCuestionarioActual(Integer idCuestionarioActual) {
        this.idCuestionarioActual = idCuestionarioActual;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTercerosPublicaciones", nullable = false)
    public Integer getIdTercerosPublicaciones() {
        return idTercerosPublicaciones;
    }

    public void setIdTercerosPublicaciones(Integer idTercerosPublicaciones) {
        this.idTercerosPublicaciones = idTercerosPublicaciones;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true)
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
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
    @Column(name = "IndicadorTerminos", nullable = true)
    public Boolean getIndicadorTerminos() {
        return indicadorTerminos;
    }

    public void setIndicadorTerminos(Boolean indicadorTerminos) {
        this.indicadorTerminos = indicadorTerminos;
    }

    @Basic
    @Column(name = "IndicadorCentrales", nullable = true)
    public Boolean getIndicadorCentrales() {
        return indicadorCentrales;
    }

    public void setIndicadorCentrales(Boolean indicadorCentrales) {
        this.indicadorCentrales = indicadorCentrales;
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

    @Basic
    @Column(name = "IndicadorFinalizado", nullable = true)
    public Boolean getIndicadorFinalizado() {
        return indicadorFinalizado;
    }

    public void setIndicadorFinalizado(Boolean indicadorFinalizado) {
        this.indicadorFinalizado = indicadorFinalizado;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 6)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Paso", nullable = true)
    public Integer getPaso() {
        return paso;
    }

    public void setPaso(Integer paso) {
        this.paso = paso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TercerosPublicaciones that = (TercerosPublicaciones) o;

        if (idTercerosPublicaciones != null ? !idTercerosPublicaciones.equals(that.idTercerosPublicaciones) : that.idTercerosPublicaciones != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (idPublicacion != null ? !idPublicacion.equals(that.idPublicacion) : that.idPublicacion != null)
            return false;
        if (indicadorTerminos != null ? !indicadorTerminos.equals(that.indicadorTerminos) : that.indicadorTerminos != null)
            return false;
        if (indicadorCentrales != null ? !indicadorCentrales.equals(that.indicadorCentrales) : that.indicadorCentrales != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (indicadorFinalizado != null ? !indicadorFinalizado.equals(that.indicadorFinalizado) : that.indicadorFinalizado != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        return paso != null ? paso.equals(that.paso) : that.paso == null;
    }

    @Override
    public int hashCode() {
        int result = idTercerosPublicaciones != null ? idTercerosPublicaciones.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (idPublicacion != null ? idPublicacion.hashCode() : 0);
        result = 31 * result + (indicadorTerminos != null ? indicadorTerminos.hashCode() : 0);
        result = 31 * result + (indicadorCentrales != null ? indicadorCentrales.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (indicadorFinalizado != null ? indicadorFinalizado.hashCode() : 0);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (paso != null ? paso.hashCode() : 0);
        return result;
    }
}
