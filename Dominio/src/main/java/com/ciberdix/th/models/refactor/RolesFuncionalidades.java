package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 18/04/2017.
 */
@Entity
@Table(name = "RolesFuncionalidades", schema = "crz_th", catalog = "CREZCAMOS")
public class RolesFuncionalidades {
    private Integer idRolFuncionalidad;
    private Integer idRol;
    private Integer idFuncionalidad;
    private Boolean indicadorHabilitado;
    private Boolean indicadorExportar;
    private Boolean indicadorImprimir;
    private Boolean indicadorInsertar;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public RolesFuncionalidades() {
    }

    public RolesFuncionalidades(Integer idRol, Integer idFuncionalidad, Boolean indicadorHabilitado, Boolean indicadorExportar, Boolean indicadorImprimir, Boolean indicadorInsertar, Integer auditoriaUsuario) {
        this.idRol = idRol;
        this.idFuncionalidad = idFuncionalidad;
        this.indicadorHabilitado = indicadorHabilitado;
        this.indicadorExportar = indicadorExportar;
        this.indicadorImprimir = indicadorImprimir;
        this.indicadorInsertar = indicadorInsertar;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario:1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdRolFuncionalidad")
    public Integer getIdRolFuncionalidad() {
        return idRolFuncionalidad;
    }

    public void setIdRolFuncionalidad(Integer idRolFuncionalidad) {
        this.idRolFuncionalidad = idRolFuncionalidad;
    }

    @Basic
    @Column(name = "IdRol")
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "IdFuncionalidad")
    public Integer getIdFuncionalidad() {
        return idFuncionalidad;
    }

    public void setIdFuncionalidad(Integer idFuncionalidad) {
        this.idFuncionalidad = idFuncionalidad;
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
    @Column(name = "IndicadorExportar")
    public Boolean getIndicadorExportar() {
        return indicadorExportar;
    }

    public void setIndicadorExportar(Boolean indicadorExportar) {
        this.indicadorExportar = indicadorExportar;
    }

    @Basic
    @Column(name = "IndicadorImprimir")
    public Boolean getIndicadorImprimir() {
        return indicadorImprimir;
    }

    public void setIndicadorImprimir(Boolean indicadorImprimir) {
        this.indicadorImprimir = indicadorImprimir;
    }

    @Basic
    @Column(name = "IndicadorInsertar")
    public Boolean getIndicadorInsertar() {
        return indicadorInsertar;
    }

    public void setIndicadorInsertar(Boolean indicadorInsertar) {
        this.indicadorInsertar = indicadorInsertar;
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

        RolesFuncionalidades that = (RolesFuncionalidades) o;

        if (idRolFuncionalidad != null ? !idRolFuncionalidad.equals(that.idRolFuncionalidad) : that.idRolFuncionalidad != null)
            return false;
        if (idRol != null ? !idRol.equals(that.idRol) : that.idRol != null) return false;
        if (idFuncionalidad != null ? !idFuncionalidad.equals(that.idFuncionalidad) : that.idFuncionalidad != null)
            return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (indicadorExportar != null ? !indicadorExportar.equals(that.indicadorExportar) : that.indicadorExportar != null)
            return false;
        if (indicadorImprimir != null ? !indicadorImprimir.equals(that.indicadorImprimir) : that.indicadorImprimir != null)
            return false;
        if (indicadorInsertar != null ? !indicadorInsertar.equals(that.indicadorInsertar) : that.indicadorInsertar != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRolFuncionalidad != null ? idRolFuncionalidad.hashCode() : 0;
        result = 31 * result + (idRol != null ? idRol.hashCode() : 0);
        result = 31 * result + (idFuncionalidad != null ? idFuncionalidad.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (indicadorExportar != null ? indicadorExportar.hashCode() : 0);
        result = 31 * result + (indicadorImprimir != null ? indicadorImprimir.hashCode() : 0);
        result = 31 * result + (indicadorInsertar != null ? indicadorInsertar.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
