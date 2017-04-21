package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_Faltas", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class VFaltas {
    private Integer idFalta;
    private String falta;
    private Integer idTipoFalta;
    private String tipoFalta;
    private String accion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
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
    @Column(name = "TipoFalta")
    public String getTipoFalta() {
        return tipoFalta;
    }

    public void setTipoFalta(String tipoFalta) {
        this.tipoFalta = tipoFalta;
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

        VFaltas vFaltas = (VFaltas) o;

        if (idFalta != null ? !idFalta.equals(vFaltas.idFalta) : vFaltas.idFalta != null) return false;
        if (falta != null ? !falta.equals(vFaltas.falta) : vFaltas.falta != null) return false;
        if (idTipoFalta != null ? !idTipoFalta.equals(vFaltas.idTipoFalta) : vFaltas.idTipoFalta != null) return false;
        if (tipoFalta != null ? !tipoFalta.equals(vFaltas.tipoFalta) : vFaltas.tipoFalta != null) return false;
        if (accion != null ? !accion.equals(vFaltas.accion) : vFaltas.accion != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(vFaltas.indicadorHabilitado) : vFaltas.indicadorHabilitado != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(vFaltas.auditoriaUsuario) : vFaltas.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(vFaltas.auditoriaFecha) : vFaltas.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFalta != null ? idFalta.hashCode() : 0;
        result = 31 * result + (falta != null ? falta.hashCode() : 0);
        result = 31 * result + (idTipoFalta != null ? idTipoFalta.hashCode() : 0);
        result = 31 * result + (tipoFalta != null ? tipoFalta.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
