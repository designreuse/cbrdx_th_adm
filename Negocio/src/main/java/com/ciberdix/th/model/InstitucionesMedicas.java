package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 16/06/2017.
 */
public class InstitucionesMedicas {

    private Integer idInstitucionMedica;
    private String institucionMedica;
    private String representanteLegal;
    private Integer idLocalizacion;
    private String correoElectronico;
    private String telefonoContacto;
    private Integer valorExamenOsteosmuscular;
    private Integer valorExamenVisiometria;
    private Integer valorExamenOptometria;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Integer getIdInstitucionMedica() {
        return idInstitucionMedica;
    }

    public void setIdInstitucionMedica(Integer idInstitucionMedica) {
        this.idInstitucionMedica = idInstitucionMedica;
    }

    public String getInstitucionMedica() {
        return institucionMedica;
    }

    public void setInstitucionMedica(String institucionMedica) {
        this.institucionMedica = institucionMedica;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public Integer getValorExamenOsteosmuscular() {
        return valorExamenOsteosmuscular;
    }

    public void setValorExamenOsteosmuscular(Integer valorExamenOsteosmuscular) {
        this.valorExamenOsteosmuscular = valorExamenOsteosmuscular;
    }

    public Integer getValorExamenVisiometria() {
        return valorExamenVisiometria;
    }

    public void setValorExamenVisiometria(Integer valorExamenVisiometria) {
        this.valorExamenVisiometria = valorExamenVisiometria;
    }

    public Integer getValorExamenOptometria() {
        return valorExamenOptometria;
    }

    public void setValorExamenOptometria(Integer valorExamenOptometria) {
        this.valorExamenOptometria = valorExamenOptometria;
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
