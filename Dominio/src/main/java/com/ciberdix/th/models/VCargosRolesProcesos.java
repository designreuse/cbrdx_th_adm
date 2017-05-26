package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_CargosRolesProcesos", schema = "dbo", catalog = "CREZCAMOS")
public class VCargosRolesProcesos {
    private Integer idCargoRolProceso;
    private Integer idRolProceso;
    private String cragoRolProceso;
    private Integer idCargo;
    private String cargo;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdCargoRolProceso")
    public Integer getIdCargoRolProceso() {
        return idCargoRolProceso;
    }

    public void setIdCargoRolProceso(Integer idCargoRolProceso) {
        this.idCargoRolProceso = idCargoRolProceso;
    }

    @Basic
    @Column(name = "IdRolProceso")
    public Integer getIdRolProceso() {
        return idRolProceso;
    }

    public void setIdRolProceso(Integer idRolProceso) {
        this.idRolProceso = idRolProceso;
    }

    @Basic
    @Column(name = "CragoRolProceso")
    public String getCragoRolProceso() {
        return cragoRolProceso;
    }

    public void setCragoRolProceso(String cragoRolProceso) {
        this.cragoRolProceso = cragoRolProceso;
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

        VCargosRolesProcesos that = (VCargosRolesProcesos) o;

        if (idCargoRolProceso != null ? !idCargoRolProceso.equals(that.idCargoRolProceso) : that.idCargoRolProceso != null)
            return false;
        if (idRolProceso != null ? !idRolProceso.equals(that.idRolProceso) : that.idRolProceso != null) return false;
        if (cragoRolProceso != null ? !cragoRolProceso.equals(that.cragoRolProceso) : that.cragoRolProceso != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (cargo != null ? !cargo.equals(that.cargo) : that.cargo != null) return false;
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
        int result = idCargoRolProceso != null ? idCargoRolProceso.hashCode() : 0;
        result = 31 * result + (idRolProceso != null ? idRolProceso.hashCode() : 0);
        result = 31 * result + (cragoRolProceso != null ? cragoRolProceso.hashCode() : 0);
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (cargo != null ? cargo.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
