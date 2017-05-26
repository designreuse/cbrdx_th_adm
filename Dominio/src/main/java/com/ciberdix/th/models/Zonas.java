package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 17/04/2017.
 */
@Entity
@Table(name = "Zonas", schema = "dbo", catalog = "CREZCAMOS")
public class Zonas {
    private Integer idZona;
    private String zona;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private String codigo;
    private Integer idEstructuraOrganizacional;

    public Zonas() {
    }

    public Zonas(String zona, Boolean indicadorHabilitado, Integer auditoriaUsuario, String codigo, Integer idEstructuraOrganizacional) {
        this.zona = zona;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.codigo = codigo;
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    public Zonas(Integer idZona, String zona, Boolean indicadorHabilitado, Integer auditoriaUsuario, String codigo, Integer idEstructuraOrganizacional) {
        this.idZona = idZona;
        this.zona = zona;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.codigo = codigo;
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdZona", nullable = false)
    public Integer getIdZona() {
        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    @Basic
    @Column(name = "Zona", nullable = true, length = 50)
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
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
    @Column(name = "AuditoriaUsuario", nullable = true)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "Codigo", nullable = true)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "IdEstructuraOrganizacional", nullable = true)
    public Integer getIdEstructuraOrganizacional() {
        return idEstructuraOrganizacional;
    }

    public void setIdEstructuraOrganizacional(Integer idEstructuraOrganizacional) {
        this.idEstructuraOrganizacional = idEstructuraOrganizacional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zonas zonas = (Zonas) o;

        if (!idZona.equals(zonas.idZona)) return false;
        if (zona != null ? !zona.equals(zonas.zona) : zonas.zona != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(zonas.indicadorHabilitado) : zonas.indicadorHabilitado != null)
            return false;
        if (!auditoriaUsuario.equals(zonas.auditoriaUsuario)) return false;
        if (!auditoriaFecha.equals(zonas.auditoriaFecha)) return false;
        if (codigo != null ? !codigo.equals(zonas.codigo) : zonas.codigo != null) return false;
        return idEstructuraOrganizacional != null ? idEstructuraOrganizacional.equals(zonas.idEstructuraOrganizacional) : zonas.idEstructuraOrganizacional == null;
    }

    @Override
    public int hashCode() {
        int result = idZona.hashCode();
        result = 31 * result + (zona != null ? zona.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + auditoriaUsuario.hashCode();
        result = 31 * result + auditoriaFecha.hashCode();
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (idEstructuraOrganizacional != null ? idEstructuraOrganizacional.hashCode() : 0);
        return result;
    }
}
