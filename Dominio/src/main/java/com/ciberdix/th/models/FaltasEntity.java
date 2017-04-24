package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Faltas", schema = "crz_th", catalog = "CREZCAMOS")
public class FaltasEntity {
    private Integer idFalta;
    private String falta;
    private Integer idTipoFalta;
    private String accion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdFalta", nullable = false)
    public Integer getIdFalta() {
        return idFalta;
    }

    public void setIdFalta(Integer idFalta) {
        this.idFalta = idFalta;
    }

    @Basic
    @Column(name = "Falta", nullable = true, length = 100)
    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    @Basic
    @Column(name = "IdTipoFalta", nullable = true)
    public Integer getIdTipoFalta() {
        return idTipoFalta;
    }

    public void setIdTipoFalta(Integer idTipoFalta) {
        this.idTipoFalta = idTipoFalta;
    }

    @Basic
    @Column(name = "Accion", nullable = true, length = 1000)
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
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

        FaltasEntity that = (FaltasEntity) o;

        if (idFalta != null ? !idFalta.equals(that.idFalta) : that.idFalta != null) return false;
        if (falta != null ? !falta.equals(that.falta) : that.falta != null) return false;
        if (idTipoFalta != null ? !idTipoFalta.equals(that.idTipoFalta) : that.idTipoFalta != null) return false;
        if (accion != null ? !accion.equals(that.accion) : that.accion != null) return false;
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
