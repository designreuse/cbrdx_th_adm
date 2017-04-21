package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_UsuarioGruposGestion", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class VUsuarioGruposGestion {
    private Integer idUsuarioGrupoGestion;
    private Integer idUsuario;
    private String grupoGestion;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean indicadorHabilitado;

    @Id
    @Column(name = "IdUsuarioGrupoGestion")
    public Integer getIdUsuarioGrupoGestion() {
        return idUsuarioGrupoGestion;
    }

    public void setIdUsuarioGrupoGestion(Integer idUsuarioGrupoGestion) {
        this.idUsuarioGrupoGestion = idUsuarioGrupoGestion;
    }

    @Basic
    @Column(name = "IdUsuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "GrupoGestion")
    public String getGrupoGestion() {
        return grupoGestion;
    }

    public void setGrupoGestion(String grupoGestion) {
        this.grupoGestion = grupoGestion;
    }

    @Basic
    @Column(name = "FechaInicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Basic
    @Column(name = "FechaFin")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VUsuarioGruposGestion that = (VUsuarioGruposGestion) o;

        if (idUsuarioGrupoGestion != null ? !idUsuarioGrupoGestion.equals(that.idUsuarioGrupoGestion) : that.idUsuarioGrupoGestion != null)
            return false;
        if (idUsuario != null ? !idUsuario.equals(that.idUsuario) : that.idUsuario != null) return false;
        if (grupoGestion != null ? !grupoGestion.equals(that.grupoGestion) : that.grupoGestion != null) return false;
        if (fechaInicio != null ? !fechaInicio.equals(that.fechaInicio) : that.fechaInicio != null) return false;
        if (fechaFin != null ? !fechaFin.equals(that.fechaFin) : that.fechaFin != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuarioGrupoGestion != null ? idUsuarioGrupoGestion.hashCode() : 0;
        result = 31 * result + (idUsuario != null ? idUsuario.hashCode() : 0);
        result = 31 * result + (grupoGestion != null ? grupoGestion.hashCode() : 0);
        result = 31 * result + (fechaInicio != null ? fechaInicio.hashCode() : 0);
        result = 31 * result + (fechaFin != null ? fechaFin.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        return result;
    }
}
