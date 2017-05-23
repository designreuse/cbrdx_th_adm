package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 4/6/2017.
 */
@Entity
@Table(name = "Faltas", schema = "crz_th", catalog = "CREZCAMOS")
public class Faltas {
    private Integer idFalta;
    private String falta;
    private Integer idTipoFalta;
    private String accion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public Faltas() {
    }

    public Faltas(String falta, Integer idTipoFalta, String accion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.falta = falta;
        this.idTipoFalta = idTipoFalta;
        this.accion = accion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public Faltas(Integer idFalta, String falta, Integer idTipoFalta, String accion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idFalta = idFalta;
        this.falta = falta;
        this.idTipoFalta = idTipoFalta;
        this.accion = accion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdFalta")
    public Integer getIdFalta() {
        return idFalta;
    }

    public void setIdFalta(Integer idFalta) {
        this.idFalta = idFalta;
    }

    @Basic
    @Column(name = "Falta")
    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    @Basic
    @Column(name = "IdTipoFalta")
    public Integer getIdTipoFalta() {
        return idTipoFalta;
    }

    public void setIdTipoFalta(Integer idTipoFalta) {
        this.idTipoFalta = idTipoFalta;
    }

    @Basic
    @Column(name = "Accion")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
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

        Faltas faltas = (Faltas) o;

        if (idFalta != null ? !idFalta.equals(faltas.idFalta) : faltas.idFalta != null) return false;
        if (falta != null ? !falta.equals(faltas.falta) : faltas.falta != null) return false;
        if (idTipoFalta != null ? !idTipoFalta.equals(faltas.idTipoFalta) : faltas.idTipoFalta != null) return false;
        if (accion != null ? !accion.equals(faltas.accion) : faltas.accion != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(faltas.indicadorHabilitado) : faltas.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(faltas.auditoriaUsuario) : faltas.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(faltas.auditoriaFecha) : faltas.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFalta != null ? idFalta.hashCode() : 0;
        result = 31 * result + (falta != null ? falta.hashCode() : 0);
        result = 31 * result + (idTipoFalta != null ? idTipoFalta.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
