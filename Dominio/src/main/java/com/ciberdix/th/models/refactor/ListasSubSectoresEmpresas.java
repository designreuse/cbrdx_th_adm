package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
public class ListasSubSectoresEmpresas {
    private Integer idListaSubSectorEmpresa;
    private String codigoListaSubSectorEmpresa;
    private String nombreListaSubSectorEmpresa;
    private Integer ordenListaSubSectorEmpresa;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaSubSectorEmpresa")
    public Integer getIdListaSubSectorEmpresa() {
        return idListaSubSectorEmpresa;
    }

    public void setIdListaSubSectorEmpresa(Integer idListaSubSectorEmpresa) {
        this.idListaSubSectorEmpresa = idListaSubSectorEmpresa;
    }

    @Basic
    @Column(name = "CodigoListaSubSectorEmpresa")
    public String getCodigoListaSubSectorEmpresa() {
        return codigoListaSubSectorEmpresa;
    }

    public void setCodigoListaSubSectorEmpresa(String codigoListaSubSectorEmpresa) {
        this.codigoListaSubSectorEmpresa = codigoListaSubSectorEmpresa;
    }

    @Basic
    @Column(name = "NombreListaSubSectorEmpresa")
    public String getNombreListaSubSectorEmpresa() {
        return nombreListaSubSectorEmpresa;
    }

    public void setNombreListaSubSectorEmpresa(String nombreListaSubSectorEmpresa) {
        this.nombreListaSubSectorEmpresa = nombreListaSubSectorEmpresa;
    }

    @Basic
    @Column(name = "OrdenListaSubSectorEmpresa")
    public Integer getOrdenListaSubSectorEmpresa() {
        return ordenListaSubSectorEmpresa;
    }

    public void setOrdenListaSubSectorEmpresa(Integer ordenListaSubSectorEmpresa) {
        this.ordenListaSubSectorEmpresa = ordenListaSubSectorEmpresa;
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

        ListasSubSectoresEmpresas that = (ListasSubSectoresEmpresas) o;

        if (idListaSubSectorEmpresa != null ? !idListaSubSectorEmpresa.equals(that.idListaSubSectorEmpresa) : that.idListaSubSectorEmpresa != null)
            return false;
        if (codigoListaSubSectorEmpresa != null ? !codigoListaSubSectorEmpresa.equals(that.codigoListaSubSectorEmpresa) : that.codigoListaSubSectorEmpresa != null)
            return false;
        if (nombreListaSubSectorEmpresa != null ? !nombreListaSubSectorEmpresa.equals(that.nombreListaSubSectorEmpresa) : that.nombreListaSubSectorEmpresa != null)
            return false;
        if (ordenListaSubSectorEmpresa != null ? !ordenListaSubSectorEmpresa.equals(that.ordenListaSubSectorEmpresa) : that.ordenListaSubSectorEmpresa != null)
            return false;
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
        int result = idListaSubSectorEmpresa != null ? idListaSubSectorEmpresa.hashCode() : 0;
        result = 31 * result + (codigoListaSubSectorEmpresa != null ? codigoListaSubSectorEmpresa.hashCode() : 0);
        result = 31 * result + (nombreListaSubSectorEmpresa != null ? nombreListaSubSectorEmpresa.hashCode() : 0);
        result = 31 * result + (ordenListaSubSectorEmpresa != null ? ordenListaSubSectorEmpresa.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
