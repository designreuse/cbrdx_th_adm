package com.ciberdix.th.security.abac.policy.model;

/**
 * Created by robertochajin on 24/04/17.
 */
public class VPolicyRules {
    private Integer idRolFuncionalidad;
    private Integer idFuncionalidad;
    private Boolean indicadorInsertar;
    private Boolean indicadorHabilitado;
    private String rol;
    private Integer idMenu;
    private String menu;
    private String codigoMenu;
    private Integer idPadre;
    private String ruta;
    private Integer secuencia;

    public Integer getIdRolFuncionalidad() {
        return idRolFuncionalidad;
    }

    public void setIdRolFuncionalidad(Integer idRolFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
    }

    public Integer getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Integer idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
    }

    public Boolean getIndicadorInsertar() {
        return indicadorInsertar;
    }

    public void setIndicadorInsertar(Boolean indicadorInsertar) {
        this.indicadorInsertar = indicadorInsertar;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(String codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    public Integer getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Integer idPadre) {
        this.idPadre = idPadre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }
}
