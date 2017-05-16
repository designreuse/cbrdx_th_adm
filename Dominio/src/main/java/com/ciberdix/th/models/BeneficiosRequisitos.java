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
public class BeneficiosRequisitos {
    private Integer idBeneficioRequisito;
    private Integer idBeneficio;
    private String requisito;
    private Boolean indicadorAdjunto;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdBeneficioRequisito")
    public Integer getIdBeneficioRequisito() {
        return idBeneficioRequisito;
    }

    public void setIdBeneficioRequisito(Integer idBeneficioRequisito) {
        this.idBeneficioRequisito = idBeneficioRequisito;
    }

    @Basic
    @Column(name = "IdBeneficio")
    public Integer getIdBeneficio() {
        return idBeneficio;
    }

    public void setIdBeneficio(Integer idBeneficio) {
        this.idBeneficio = idBeneficio;
    }

    @Basic
    @Column(name = "Requisito")
    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    @Basic
    @Column(name = "IndicadorAdjunto")
    public Boolean getIndicadorAdjunto() {
        return indicadorAdjunto;
    }

    public void setIndicadorAdjunto(Boolean indicadorAdjunto) {
        this.indicadorAdjunto = indicadorAdjunto;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaUsuario")
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha")
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

        BeneficiosRequisitos that = (BeneficiosRequisitos) o;

        if (idBeneficioRequisito != null ? !idBeneficioRequisito.equals(that.idBeneficioRequisito) : that.idBeneficioRequisito != null)
            return false;
        if (idBeneficio != null ? !idBeneficio.equals(that.idBeneficio) : that.idBeneficio != null) return false;
        if (requisito != null ? !requisito.equals(that.requisito) : that.requisito != null) return false;
        if (indicadorAdjunto != null ? !indicadorAdjunto.equals(that.indicadorAdjunto) : that.indicadorAdjunto != null)
            return false;
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
        int result = idBeneficioRequisito != null ? idBeneficioRequisito.hashCode() : 0;
        result = 31 * result + (idBeneficio != null ? idBeneficio.hashCode() : 0);
        result = 31 * result + (requisito != null ? requisito.hashCode() : 0);
        result = 31 * result + (indicadorAdjunto != null ? indicadorAdjunto.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
