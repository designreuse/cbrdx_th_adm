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
public class ListasSectoresEmpresas {
    private Integer idListaSectorEmpresa;
    private String codigoListaSectorEmpresa;
    private String nombreListaSectorEmpresa;
    private Integer ordenListaSectorEmpresa;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaSectorEmpresa")
    public Integer getIdListaSectorEmpresa() {
        return idListaSectorEmpresa;
    }

    public void setIdListaSectorEmpresa(Integer idListaSectorEmpresa) {
        this.idListaSectorEmpresa = idListaSectorEmpresa;
    }

    @Basic
    @Column(name = "CodigoListaSectorEmpresa")
    public String getCodigoListaSectorEmpresa() {
        return codigoListaSectorEmpresa;
    }

    public void setCodigoListaSectorEmpresa(String codigoListaSectorEmpresa) {
        this.codigoListaSectorEmpresa = codigoListaSectorEmpresa;
    }

    @Basic
    @Column(name = "NombreListaSectorEmpresa")
    public String getNombreListaSectorEmpresa() {
        return nombreListaSectorEmpresa;
    }

    public void setNombreListaSectorEmpresa(String nombreListaSectorEmpresa) {
        this.nombreListaSectorEmpresa = nombreListaSectorEmpresa;
    }

    @Basic
    @Column(name = "OrdenListaSectorEmpresa")
    public Integer getOrdenListaSectorEmpresa() {
        return ordenListaSectorEmpresa;
    }

    public void setOrdenListaSectorEmpresa(Integer ordenListaSectorEmpresa) {
        this.ordenListaSectorEmpresa = ordenListaSectorEmpresa;
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

        ListasSectoresEmpresas that = (ListasSectoresEmpresas) o;

        if (idListaSectorEmpresa != null ? !idListaSectorEmpresa.equals(that.idListaSectorEmpresa) : that.idListaSectorEmpresa != null)
            return false;
        if (codigoListaSectorEmpresa != null ? !codigoListaSectorEmpresa.equals(that.codigoListaSectorEmpresa) : that.codigoListaSectorEmpresa != null)
            return false;
        if (nombreListaSectorEmpresa != null ? !nombreListaSectorEmpresa.equals(that.nombreListaSectorEmpresa) : that.nombreListaSectorEmpresa != null)
            return false;
        if (ordenListaSectorEmpresa != null ? !ordenListaSectorEmpresa.equals(that.ordenListaSectorEmpresa) : that.ordenListaSectorEmpresa != null)
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
        int result = idListaSectorEmpresa != null ? idListaSectorEmpresa.hashCode() : 0;
        result = 31 * result + (codigoListaSectorEmpresa != null ? codigoListaSectorEmpresa.hashCode() : 0);
        result = 31 * result + (nombreListaSectorEmpresa != null ? nombreListaSectorEmpresa.hashCode() : 0);
        result = 31 * result + (ordenListaSectorEmpresa != null ? ordenListaSectorEmpresa.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
