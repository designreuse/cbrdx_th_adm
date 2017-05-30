package com.ciberdix.th.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class Beneficios {
    private Integer idBeneficio;
    private Integer idGrupoBeneficio;
    private Integer idTipoBeneficio;
    private String beneficio;
    private Integer costo;
    private Boolean indicadorSolicitable;
    private Integer idEstado;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdBeneficio", nullable = false)
    public Integer getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    @Basic
    @Column(name = "IdGrupoBeneficio", nullable = true)
    public Integer getIdGrupoBeneficio() {
        return idGrupoBeneficio;
    }

    public void setIdGrupoBeneficio(Integer idGrupoBeneficio) {
        this.idGrupoBeneficio = idGrupoBeneficio;
    }

    @Basic
    @Column(name = "IdTipoBeneficio", nullable = true)
    public Integer getIdTipoBeneficio() {
        return idTipoBeneficio;
    }

    public void setIdTipoBeneficio(Integer idTipoBeneficio) {
        this.idTipoBeneficio = idTipoBeneficio;
    }

    @Basic
    @Column(name = "Beneficio", nullable = true, length = 50)
    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    @Basic
    @Column(name = "Costo", nullable = true, precision = 0)
    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    @Basic
    @Column(name = "IndicadorSolicitable", nullable = true)
    public Boolean getIndicadorSolicitable() {
        return indicadorSolicitable;
    }

    public void setIndicadorSolicitable(Boolean indicadorSolicitable) {
        this.indicadorSolicitable = indicadorSolicitable;
    }

    @Basic
    @Column(name = "IdEstado", nullable = true)
    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
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
    @Column(name = "AuditoriaUsuario", nullable = false)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = false)
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

        Beneficios that = (Beneficios) o;

        if (idBeneficio != null ? !idBeneficio.equals(that.idBeneficio) : that.idBeneficio != null) return false;
        if (idGrupoBeneficio != null ? !idGrupoBeneficio.equals(that.idGrupoBeneficio) : that.idGrupoBeneficio != null)
            return false;
        if (idTipoBeneficio != null ? !idTipoBeneficio.equals(that.idTipoBeneficio) : that.idTipoBeneficio != null)
            return false;
        if (beneficio != null ? !beneficio.equals(that.beneficio) : that.beneficio != null) return false;
        if (costo != null ? !costo.equals(that.costo) : that.costo != null) return false;
        if (indicadorSolicitable != null ? !indicadorSolicitable.equals(that.indicadorSolicitable) : that.indicadorSolicitable != null)
            return false;
        if (idEstado != null ? !idEstado.equals(that.idEstado) : that.idEstado != null) return false;
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
        int result = idBeneficio != null ? idBeneficio.hashCode() : 0;
        result = 31 * result + (idGrupoBeneficio != null ? idGrupoBeneficio.hashCode() : 0);
        result = 31 * result + (idTipoBeneficio != null ? idTipoBeneficio.hashCode() : 0);
        result = 31 * result + (beneficio != null ? beneficio.hashCode() : 0);
        result = 31 * result + (costo != null ? costo.hashCode() : 0);
        result = 31 * result + (indicadorSolicitable != null ? indicadorSolicitable.hashCode() : 0);
        result = 31 * result + (idEstado != null ? idEstado.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
