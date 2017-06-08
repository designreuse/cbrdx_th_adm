package com.ciberdix.th.model;

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
}
