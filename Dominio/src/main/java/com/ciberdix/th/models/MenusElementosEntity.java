package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "MenusElementos", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class MenusElementosEntity {
    private Integer idMenuElemento;
    private Integer idMenu;
    private String elementoMenu;
    private String enlace;
    private Integer secuencia;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdMenuElemento", nullable = false)
    public Integer getIdMenuElemento() {
        return idMenuElemento;
    }

    public void setIdMenuElemento(Integer idMenuElemento) {
        this.idMenuElemento = idMenuElemento;
    }

    @Basic
    @Column(name = "IdMenu", nullable = true)
    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    @Basic
    @Column(name = "ElementoMenu", nullable = true, length = 64)
    public String getElementoMenu() {
        return elementoMenu;
    }

    public void setElementoMenu(String elementoMenu) {
        this.elementoMenu = elementoMenu;
    }

    @Basic
    @Column(name = "Enlace", nullable = true, length = 150)
    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenusElementosEntity that = (MenusElementosEntity) o;

        if (idMenuElemento != null ? !idMenuElemento.equals(that.idMenuElemento) : that.idMenuElemento != null)
            return false;
        if (idMenu != null ? !idMenu.equals(that.idMenu) : that.idMenu != null) return false;
        if (elementoMenu != null ? !elementoMenu.equals(that.elementoMenu) : that.elementoMenu != null) return false;
        if (enlace != null ? !enlace.equals(that.enlace) : that.enlace != null) return false;
        if (secuencia != null ? !secuencia.equals(that.secuencia) : that.secuencia != null) return false;
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
        int result = idMenuElemento != null ? idMenuElemento.hashCode() : 0;
        result = 31 * result + (idMenu != null ? idMenu.hashCode() : 0);
        result = 31 * result + (elementoMenu != null ? elementoMenu.hashCode() : 0);
        result = 31 * result + (enlace != null ? enlace.hashCode() : 0);
        result = 31 * result + (secuencia != null ? secuencia.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
