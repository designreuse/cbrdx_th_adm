package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/8/2017.
 */
@Entity
@Table(name = "CargosExamenes", schema = "dbo", catalog = "CREZCAMOS")
public class CargosExamenes {
    private Integer idCargoExamen;
    private Integer idCargo;
    private Integer idExamen;
    private Boolean indicadorIngreso;
    private Boolean indicadorPeriodicidad;
    private Boolean indicadorRetiro;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public CargosExamenes() {
    }

    public CargosExamenes(Integer idCargo, Integer idExamen, Boolean indicadorIngreso, Boolean indicadorPeriodicidad, Boolean indicadorRetiro, Integer auditoriaUsuario) {
        this.idCargo = idCargo;
        this.idExamen = idExamen;
        this.indicadorIngreso = indicadorIngreso;
        this.indicadorPeriodicidad = indicadorPeriodicidad;
        this.indicadorRetiro = indicadorRetiro;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public CargosExamenes(Integer idCargoExamen, Integer idCargo, Integer idExamen, Boolean indicadorIngreso, Boolean indicadorPeriodicidad, Boolean indicadorRetiro, Integer auditoriaUsuario) {
        this.idCargoExamen = idCargoExamen;
        this.idCargo = idCargo;
        this.idExamen = idExamen;
        this.indicadorIngreso = indicadorIngreso;
        this.indicadorPeriodicidad = indicadorPeriodicidad;
        this.indicadorRetiro = indicadorRetiro;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdCargoExamen", nullable = false)
    public Integer getIdCargoExamen() {
        return idCargoExamen;
    }

    public void setIdCargoExamen(Integer idCargoExamen) {
        this.idCargoExamen = idCargoExamen;
    }

    @Basic
    @Column(name = "IdCargo", nullable = true)
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdExamen", nullable = true)
    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    @Basic
    @Column(name = "IndicadorIngreso", nullable = true)
    public Boolean getIndicadorIngreso() {
        return indicadorIngreso;
    }

    public void setIndicadorIngreso(Boolean indicadorIngreso) {
        this.indicadorIngreso = indicadorIngreso;
    }

    @Basic
    @Column(name = "IndicadorPeriodicidad", nullable = true)
    public Boolean getIndicadorPeriodicidad() {
        return indicadorPeriodicidad;
    }

    public void setIndicadorPeriodicidad(Boolean indicadorPeriodicidad) {
        this.indicadorPeriodicidad = indicadorPeriodicidad;
    }

    @Basic
    @Column(name = "IndicadorRetiro", nullable = true)
    public Boolean getIndicadorRetiro() {
        return indicadorRetiro;
    }

    public void setIndicadorRetiro(Boolean indicadorRetiro) {
        this.indicadorRetiro = indicadorRetiro;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
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

        CargosExamenes that = (CargosExamenes) o;

        if (idCargoExamen != null ? !idCargoExamen.equals(that.idCargoExamen) : that.idCargoExamen != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idExamen != null ? !idExamen.equals(that.idExamen) : that.idExamen != null) return false;
        if (indicadorIngreso != null ? !indicadorIngreso.equals(that.indicadorIngreso) : that.indicadorIngreso != null)
            return false;
        if (indicadorPeriodicidad != null ? !indicadorPeriodicidad.equals(that.indicadorPeriodicidad) : that.indicadorPeriodicidad != null)
            return false;
        if (indicadorRetiro != null ? !indicadorRetiro.equals(that.indicadorRetiro) : that.indicadorRetiro != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoExamen != null ? idCargoExamen.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idExamen != null ? idExamen.hashCode() : 0);
        result = 31 * result + (indicadorIngreso != null ? indicadorIngreso.hashCode() : 0);
        result = 31 * result + (indicadorPeriodicidad != null ? indicadorPeriodicidad.hashCode() : 0);
        result = 31 * result + (indicadorRetiro != null ? indicadorRetiro.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
