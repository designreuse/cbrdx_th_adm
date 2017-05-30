package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by Danny on 5/05/2017.
 */
@Entity
@Table(name = "V_ListasRolesProceso_CargoRolesProceso", schema = "dbo", catalog = "CREZCAMOS")
public class VListasRolesProcesoCargoRolesProceso {
    private int idCargoRolProceso;
    private int idLista;
    private String codigo;
    private String nombre;
    private int idCargo;
    private Boolean indicadorHabilitado;

    public void setIdCargoRolProceso(Integer idCargoRolProceso) {
        this.idCargoRolProceso = idCargoRolProceso;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Id
    @Column(name = "IdCargoRolProceso", nullable = false)
    public int getIdCargoRolProceso() {
        return idCargoRolProceso;
    }

    public void setIdCargoRolProceso(int idCargoRolProceso) {
        this.idCargoRolProceso = idCargoRolProceso;
    }

    @Basic
    @Column(name = "IdLista", nullable = false)
    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    @Basic
    @Column(name = "Codigo", nullable = false, length = 10)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Nombre", nullable = false, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "IdCargo", nullable = false)
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VListasRolesProcesoCargoRolesProceso that = (VListasRolesProcesoCargoRolesProceso) o;

        if (idCargoRolProceso != that.idCargoRolProceso) return false;
        if (idLista != that.idLista) return false;
        if (idCargo != that.idCargo) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoRolProceso;
        result = 31 * result + idLista;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + idCargo;
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
