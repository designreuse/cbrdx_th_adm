package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by robertochajin on 8/04/17.
 */
@Entity
@Table(name = "V_CargosExamenes", schema = "crz_th", catalog = "CREZCAMOS")
public class VCargosExamenes {
    private Integer idCargoExamen;
    private Integer idCargo;
    private String cargo;
    private Integer idExamen;
    private String examen;
    private Boolean indicadorIngreso;
    private Boolean indicadorPeriodicidad;
    private Boolean indicadorRetiro;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoExamen")
    public Integer getIdCargoExamen() {
        return idCargoExamen;
    }

    public void setIdCargoExamen(Integer idCargoExamen) {
        this.idCargoExamen = idCargoExamen;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "Cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "IdExamen")
    public Integer getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen) {
        this.idExamen = idExamen;
    }

    @Basic
    @Column(name = "Examen")
    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    @Basic
    @Column(name = "IndicadorIngreso")
    public Boolean getIndicadorIngreso() {
        return indicadorIngreso;
    }

    public void setIndicadorIngreso(Boolean indicadorIngreso) {
        this.indicadorIngreso = indicadorIngreso;
    }

    @Basic
    @Column(name = "IndicadorPeriodicidad")
    public Boolean getIndicadorPeriodicidad() {
        return indicadorPeriodicidad;
    }

    public void setIndicadorPeriodicidad(Boolean indicadorPeriodicidad) {
        this.indicadorPeriodicidad = indicadorPeriodicidad;
    }

    @Basic
    @Column(name = "IndicadorRetiro")
    public Boolean getIndicadorRetiro() {
        return indicadorRetiro;
    }

    public void setIndicadorRetiro(Boolean indicadorRetiro) {
        this.indicadorRetiro = indicadorRetiro;
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

        VCargosExamenes that = (VCargosExamenes) o;

        if (idCargoExamen != null ? !idCargoExamen.equals(that.idCargoExamen) : that.idCargoExamen != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (idExamen != null ? !idExamen.equals(that.idExamen) : that.idExamen != null) return false;
        if (examen != null ? !examen.equals(that.examen) : that.examen != null) return false;
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
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (idExamen != null ? idExamen.hashCode() : 0);
        result = 31 * result + (examen != null ? examen.hashCode() : 0);
        result = 31 * result + (indicadorIngreso != null ? indicadorIngreso.hashCode() : 0);
        result = 31 * result + (indicadorPeriodicidad != null ? indicadorPeriodicidad.hashCode() : 0);
        result = 31 * result + (indicadorRetiro != null ? indicadorRetiro.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
