package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Danny on 1/06/2017.
 */
@Entity
@Table(name = "V_CargosCompetencias", schema = "dbo", catalog = "CREZCAMOS")
public class VCargosCompetencias {
    private Integer idCargoCompetencia;
    private String cargo;
    private Integer idCargo;
    private String competencia;
    private String descripcion;
    private Integer idCompetencia;
    private String ponderacion;
    private Integer idPonderacion;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoCompetencia", nullable = false)
    public Integer getIdCargoCompetencia() {
        return idCargoCompetencia;
    }

    public void setIdCargoCompetencia(Integer idCargoCompetencia) {
        this.idCargoCompetencia = idCargoCompetencia;
    }

    @Basic
    @Column(name = "Cargo", nullable = true, length = 100)
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
    @Column(name = "Competencia", nullable = true, length = 64)
    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 500)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IdCompetencia", nullable = true)
    public Integer getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Integer idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    @Basic
    @Column(name = "Ponderacion", nullable = true, length = 50)
    public String getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(String ponderacion) {
        this.ponderacion = ponderacion;
    }

    @Basic
    @Column(name = "IdPonderacion", nullable = false)
    public Integer getIdPonderacion() {
        return idPonderacion;
    }

    public void setIdPonderacion(Integer idPonderacion) {
        this.idPonderacion = idPonderacion;
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

        VCargosCompetencias that = (VCargosCompetencias) o;

        if (idCargoCompetencia != null ? !idCargoCompetencia.equals(that.idCargoCompetencia) : that.idCargoCompetencia != null)
            return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (competencia != null ? !competencia.equals(that.competencia) : that.competencia != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (idCompetencia != null ? !idCompetencia.equals(that.idCompetencia) : that.idCompetencia != null)
            return false;
        if (ponderacion != null ? !ponderacion.equals(that.ponderacion) : that.ponderacion != null) return false;
        if (idPonderacion != null ? !idPonderacion.equals(that.idPonderacion) : that.idPonderacion != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoCompetencia != null ? idCargoCompetencia.hashCode() : 0;
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (competencia != null ? competencia.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (idCompetencia != null ? idCompetencia.hashCode() : 0);
        result = 31 * result + (ponderacion != null ? ponderacion.hashCode() : 0);
        result = 31 * result + (idPonderacion != null ? idPonderacion.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
