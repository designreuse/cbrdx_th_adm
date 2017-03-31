package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 *
 * @author Roberto Chajin Ortiz
 */
public class TercerosLocalizaciones {
    private Integer idTerceroLocalizacion;
    private Long idTercero;
    private Integer idlocalizacion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TercerosLocalizaciones() {
    }

    public TercerosLocalizaciones(Integer idTerceroLocalizacion, Long idTercero, Integer idlocalizacion, Boolean indicadorHabilitado, Integer auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
        this.idTercero = idTercero;
        this.idlocalizacion = idlocalizacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Integer getIdTerceroLocalizacion() {
        return idTerceroLocalizacion;
    }

    public void setIdTerceroLocalizacion(Integer idTerceroLocalizacion) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdlocalizacion() {
        return idlocalizacion;
    }

    public void setIdlocalizacion(Integer idlocalizacion) {
        this.idlocalizacion = idlocalizacion;
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
