package com.ciberdix.th.model;

import java.util.Date;
import java.sql.Timestamp;

/**
 * Created by Danny on 8/06/2017.
 */
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
    private Date fechaContratacion;
    private Boolean indicadorContratacion;

    public Integer getIdTercerosPublicaciones() {
        return idTercerosPublicaciones;
    }

    public void setIdTercerosPublicaciones(Integer idTercerosPublicaciones) {
        this.idTercerosPublicaciones = idTercerosPublicaciones;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Boolean getIndicadorTerminos() {
        return indicadorTerminos;
    }

    public void setIndicadorTerminos(Boolean indicadorTerminos) {
        this.indicadorTerminos = indicadorTerminos;
    }

    public Boolean getIndicadorCentrales() {
        return indicadorCentrales;
    }

    public void setIndicadorCentrales(Boolean indicadorCentrales) {
        this.indicadorCentrales = indicadorCentrales;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    public Boolean getIndicadorFinalizado() {
        return indicadorFinalizado;
    }

    public void setIndicadorFinalizado(Boolean indicadorFinalizado) {
        this.indicadorFinalizado = indicadorFinalizado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getPaso() {
        return paso;
    }

    public void setPaso(Integer paso) {
        this.paso = paso;
    }

    public Boolean getIndicadorFinalizadoCuestionarios() {
        return indicadorFinalizadoCuestionarios;
    }

    public void setIndicadorFinalizadoCuestionarios(Boolean indicadorFinalizadoCuestionarios) {
        this.indicadorFinalizadoCuestionarios = indicadorFinalizadoCuestionarios;
    }

    public Integer getIdCuestionarioActual() {
        return idCuestionarioActual;
    }

    public void setIdCuestionarioActual(Integer idCuestionarioActual) {
        this.idCuestionarioActual = idCuestionarioActual;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public Boolean getIndicadorContratacion() {
        return indicadorContratacion;
    }

    public void setIndicadorContratacion(Boolean indicadorContratacion) {
        this.indicadorContratacion = indicadorContratacion;
    }
}
