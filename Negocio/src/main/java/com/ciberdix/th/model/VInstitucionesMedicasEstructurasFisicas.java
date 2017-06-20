package com.ciberdix.th.model;

import java.sql.Timestamp;

/**
 * Created by Danny on 20/06/2017.
 */
public class VInstitucionesMedicasEstructurasFisicas {

    private Integer idInstitucionMedicaEstructuraFisica;
    private String institucionMedica;
    private Integer idInstitucionMedica;
    private String estructuraFisica;
    private Integer idEstructuraFisica;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Boolean indicadorViaja;
    private Integer valorViaje;

    public Integer getIdInstitucionMedicaEstructuraFisica() {
        return idInstitucionMedicaEstructuraFisica;
    }

    public void setIdInstitucionMedicaEstructuraFisica(Integer idInstitucionMedicaEstructuraFisica) {
        this.idInstitucionMedicaEstructuraFisica = idInstitucionMedicaEstructuraFisica;
    }

    public String getInstitucionMedica() {
        return institucionMedica;
    }

    public void setInstitucionMedica(String institucionMedica) {
        this.institucionMedica = institucionMedica;
    }

    public Integer getIdInstitucionMedica() {
        return idInstitucionMedica;
    }

    public void setIdInstitucionMedica(Integer idInstitucionMedica) {
        this.idInstitucionMedica = idInstitucionMedica;
    }

    public String getEstructuraFisica() {
        return estructuraFisica;
    }

    public void setEstructuraFisica(String estructuraFisica) {
        this.estructuraFisica = estructuraFisica;
    }

    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
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

    public Boolean getIndicadorViaja() {
        return indicadorViaja;
    }

    public void setIndicadorViaja(Boolean indicadorViaja) {
        this.indicadorViaja = indicadorViaja;
    }

    public Integer getValorViaje() {
        return valorViaje;
    }

    public void setValorViaje(Integer valorViaje) {
        this.valorViaje = valorViaje;
    }
}
