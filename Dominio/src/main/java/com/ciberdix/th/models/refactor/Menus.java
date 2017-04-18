package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
public class Menus {
    private Integer idMenu;
    private String menu;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idPadre;
    private String codigoMenu;
    private String ruta;
    private Integer secuencia;

    @Id
    @Column(name = "IdMenu")
    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    @Basic
    @Column(name = "Menu")
    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
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

    @Basic
    @Column(name = "IdPadre")
    public Integer getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Integer idPadre) {
        this.idPadre = idPadre;
    }

    @Basic
    @Column(name = "CodigoMenu")
    public String getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(String codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    @Basic
    @Column(name = "Ruta")
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Basic
    @Column(name = "Secuencia")
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menus menus = (Menus) o;

        if (idMenu != null ? !idMenu.equals(menus.idMenu) : menus.idMenu != null) return false;
        if (menu != null ? !menu.equals(menus.menu) : menus.menu != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(menus.indicadorHabilitado) : menus.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(menus.auditoriaUsuario) : menus.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(menus.auditoriaFecha) : menus.auditoriaFecha != null)
            return false;
        if (idPadre != null ? !idPadre.equals(menus.idPadre) : menus.idPadre != null) return false;
        if (codigoMenu != null ? !codigoMenu.equals(menus.codigoMenu) : menus.codigoMenu != null) return false;
        if (ruta != null ? !ruta.equals(menus.ruta) : menus.ruta != null) return false;
        if (secuencia != null ? !secuencia.equals(menus.secuencia) : menus.secuencia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMenu != null ? idMenu.hashCode() : 0;
        result = 31 * result + (menu != null ? menu.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idPadre != null ? idPadre.hashCode() : 0);
        result = 31 * result + (codigoMenu != null ? codigoMenu.hashCode() : 0);
        result = 31 * result + (ruta != null ? ruta.hashCode() : 0);
        result = 31 * result + (secuencia != null ? secuencia.hashCode() : 0);
        return result;
    }
}
