package com.ciberdix.th.model;

/**
 * Created by Danny on 5/05/2017.
 */
public class VListaRolesProcesoCargoRolesProceso {
    private int idCargoRolProceso;
    private int idLista;
    private String codigo;
    private String nombre;
    private int idCargo;
    private Boolean indicadorHabilitado;

    public int getIdCargoRolProceso() {
        return idCargoRolProceso;
    }

    public void setIdCargoRolProceso(int idCargoRolProceso) {
        this.idCargoRolProceso = idCargoRolProceso;
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
