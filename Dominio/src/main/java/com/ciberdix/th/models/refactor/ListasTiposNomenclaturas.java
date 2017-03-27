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
public class ListasTiposNomenclaturas {
    private Integer idListaTipoNomenclatura;
    private String codigoListaTipoNomenclatura;
    private String nombreListaTipoNomenclatura;
    private Integer ordenListaTipoNomenclatura;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaTipoNomenclatura")
    public Integer getIdListaTipoNomenclatura() {
        return idListaTipoNomenclatura;
    }

    public void setIdListaTipoNomenclatura(Integer idListaTipoNomenclatura) {
        this.idListaTipoNomenclatura = idListaTipoNomenclatura;
    }

    @Basic
    @Column(name = "CodigoListaTipoNomenclatura")
    public String getCodigoListaTipoNomenclatura() {
        return codigoListaTipoNomenclatura;
    }

    public void setCodigoListaTipoNomenclatura(String codigoListaTipoNomenclatura) {
        this.codigoListaTipoNomenclatura = codigoListaTipoNomenclatura;
    }

    @Basic
    @Column(name = "NombreListaTipoNomenclatura")
    public String getNombreListaTipoNomenclatura() {
        return nombreListaTipoNomenclatura;
    }

    public void setNombreListaTipoNomenclatura(String nombreListaTipoNomenclatura) {
        this.nombreListaTipoNomenclatura = nombreListaTipoNomenclatura;
    }

    @Basic
    @Column(name = "OrdenListaTipoNomenclatura")
    public Integer getOrdenListaTipoNomenclatura() {
        return ordenListaTipoNomenclatura;
    }

    public void setOrdenListaTipoNomenclatura(Integer ordenListaTipoNomenclatura) {
        this.ordenListaTipoNomenclatura = ordenListaTipoNomenclatura;
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

        ListasTiposNomenclaturas that = (ListasTiposNomenclaturas) o;

        if (idListaTipoNomenclatura != null ? !idListaTipoNomenclatura.equals(that.idListaTipoNomenclatura) : that.idListaTipoNomenclatura != null)
            return false;
        if (codigoListaTipoNomenclatura != null ? !codigoListaTipoNomenclatura.equals(that.codigoListaTipoNomenclatura) : that.codigoListaTipoNomenclatura != null)
            return false;
        if (nombreListaTipoNomenclatura != null ? !nombreListaTipoNomenclatura.equals(that.nombreListaTipoNomenclatura) : that.nombreListaTipoNomenclatura != null)
            return false;
        if (ordenListaTipoNomenclatura != null ? !ordenListaTipoNomenclatura.equals(that.ordenListaTipoNomenclatura) : that.ordenListaTipoNomenclatura != null)
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
        int result = idListaTipoNomenclatura != null ? idListaTipoNomenclatura.hashCode() : 0;
        result = 31 * result + (codigoListaTipoNomenclatura != null ? codigoListaTipoNomenclatura.hashCode() : 0);
        result = 31 * result + (nombreListaTipoNomenclatura != null ? nombreListaTipoNomenclatura.hashCode() : 0);
        result = 31 * result + (ordenListaTipoNomenclatura != null ? ordenListaTipoNomenclatura.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
