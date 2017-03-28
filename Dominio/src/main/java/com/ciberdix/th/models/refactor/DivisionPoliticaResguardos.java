package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class DivisionPoliticaResguardos {
    private Integer idDivisionPoliticaResguardo;
    private String descripcionDivisionPoliticaResguardo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdDivisionPoliticaResguardo")
    public Integer getIdDivisionPoliticaResguardo() {
        return idDivisionPoliticaResguardo;
    }

    public void setIdDivisionPoliticaResguardo(Integer idDivisionPoliticaResguardo) {
        this.idDivisionPoliticaResguardo = idDivisionPoliticaResguardo;
    }

    @Basic
    @Column(name = "DescripcionDivisionPoliticaResguardo")
    public String getDescripcionDivisionPoliticaResguardo() {
        return descripcionDivisionPoliticaResguardo;
    }

    public void setDescripcionDivisionPoliticaResguardo(String descripcionDivisionPoliticaResguardo) {
        this.descripcionDivisionPoliticaResguardo = descripcionDivisionPoliticaResguardo;
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

        DivisionPoliticaResguardos that = (DivisionPoliticaResguardos) o;

        if (idDivisionPoliticaResguardo != null ? !idDivisionPoliticaResguardo.equals(that.idDivisionPoliticaResguardo) : that.idDivisionPoliticaResguardo != null)
            return false;
        if (descripcionDivisionPoliticaResguardo != null ? !descripcionDivisionPoliticaResguardo.equals(that.descripcionDivisionPoliticaResguardo) : that.descripcionDivisionPoliticaResguardo != null)
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
        int result = idDivisionPoliticaResguardo != null ? idDivisionPoliticaResguardo.hashCode() : 0;
        result = 31 * result + (descripcionDivisionPoliticaResguardo != null ? descripcionDivisionPoliticaResguardo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}