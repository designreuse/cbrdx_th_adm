package com.ciberdix.th.model.refactor;

import java.sql.Timestamp;

/**
 * Created by Danny on 26/04/2017.
 */
public class TercerosClases {

    private Integer idTerceroClase;
    private Long idTercero;
    private Integer idClaseTercero;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdTerceroClase() {
        return idTerceroClase;
    }

    public void setIdTerceroClase(Integer idTerceroClase) {
        this.idTerceroClase = idTerceroClase;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdClaseTercero() {
        return idClaseTercero;
    }

    public void setIdClaseTercero(Integer idClaseTercero) {
        this.idClaseTercero = idClaseTercero;
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
