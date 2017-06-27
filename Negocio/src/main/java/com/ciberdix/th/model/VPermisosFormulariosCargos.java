package com.ciberdix.th.model;

/**
 * Created by robertochajin on 27/06/17.
 */
public class VPermisosFormulariosCargos {
    private String codigoMenu;
    private String codigo;
    private Boolean indicadorSeccion;
    private Boolean indicadorHabilitadoRfc;
    private Boolean indicadorHabilitadoFc;
    private Boolean indicadorEditar;

    public String getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(String codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getIndicadorSeccion() {
        return indicadorSeccion;
    }

    public void setIndicadorSeccion(Boolean indicadorSeccion) {
        this.indicadorSeccion = indicadorSeccion;
    }

    public Boolean getIndicadorHabilitadoRfc() {
        return indicadorHabilitadoRfc;
    }

    public void setIndicadorHabilitadoRfc(Boolean indicadorHabilitadoRfc) {
        this.indicadorHabilitadoRfc = indicadorHabilitadoRfc;
    }

    public Boolean getIndicadorHabilitadoFc() {
        return indicadorHabilitadoFc;
    }

    public void setIndicadorHabilitadoFc(Boolean indicadorHabilitadoFc) {
        this.indicadorHabilitadoFc = indicadorHabilitadoFc;
    }

    public Boolean getIndicadorEditar() {
        return indicadorEditar;
    }

    public void setIndicadorEditar(Boolean indicadorEditar) {
        this.indicadorEditar = indicadorEditar;
    }
}
