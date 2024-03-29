package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Menus", schema = "dbo", catalog = "CREZCAMOS")
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
    private String clase;

    public Menus() {
    }

    public Menus(String menu, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idPadre, String codigoMenu, String ruta, Integer secuencia, String clase) {
        this.menu = menu;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.idPadre = idPadre;
        this.codigoMenu = codigoMenu;
        this.ruta = ruta;
        this.secuencia = secuencia;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.clase = clase;
    }

    public Menus(Integer idMenu, String menu, Boolean indicadorHabilitado, Integer auditoriaUsuario, Integer idPadre, String codigoMenu, String ruta, Integer secuencia, String clase) {
        this.idMenu = idMenu;
        this.menu = menu;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idPadre = idPadre;
        this.codigoMenu = codigoMenu;
        this.ruta = ruta;
        this.secuencia = secuencia;
        this.clase = clase;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdMenu", nullable = false)
    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    @Basic
    @Column(name = "Menu", nullable = true, length = 64)
    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true)
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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

    @Basic
    @Column(name = "IdPadre", nullable = true)
    public Integer getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Integer idPadre) {
        this.idPadre = idPadre;
    }

    @Basic
    @Column(name = "CodigoMenu", nullable = true, length = 50)
    public String getCodigoMenu() {
        return codigoMenu;
    }

    public void setCodigoMenu(String codigoMenu) {
        this.codigoMenu = codigoMenu;
    }

    @Basic
    @Column(name = "Ruta", nullable = true, length = 50)
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Basic
    @Column(name = "Secuencia", nullable = true)
    public Integer getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }

    @Basic
    @Column(name = "Clase", nullable = true, length = 100)
    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
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
        if (clase != null ? !clase.equals(menus.clase) : menus.clase != null) return false;

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
        result = 31 * result + (clase != null ? clase.hashCode() : 0);
        return result;
    }
}
