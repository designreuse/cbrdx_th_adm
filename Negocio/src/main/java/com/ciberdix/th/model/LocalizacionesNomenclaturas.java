package com.ciberdix.th.model;

import java.sql.Timestamp;

public class LocalizacionesNomenclaturas {

    private Integer idLocalizacionNomenclatura;
    private Integer idTipoNomenclaturaComplementaria;
    private Integer idLocalizacion;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdLocalizacionNomenclatura() {
        return idLocalizacionNomenclatura;
    }

    public void setIdLocalizacionNomenclatura(Integer idLocalizacionNomenclatura) {
        this.idLocalizacionNomenclatura = idLocalizacionNomenclatura;
    }

    public Integer getIdTipoNomenclaturaComplementaria() {
        return idTipoNomenclaturaComplementaria;
    }

    public void setIdTipoNomenclaturaComplementaria(Integer idTipoNomenclaturaComplementaria) {
        this.idTipoNomenclaturaComplementaria = idTipoNomenclaturaComplementaria;
    }

    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
