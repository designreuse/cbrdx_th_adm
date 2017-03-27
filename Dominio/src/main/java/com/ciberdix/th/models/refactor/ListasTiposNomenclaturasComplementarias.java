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
public class ListasTiposNomenclaturasComplementarias {
    private Integer idListaTipoNomenclaturaComplementaria;
    private String codigoListaTipoNomenclaturaComplementaria;
    private String nombreListaTipoNomenclaturaComplementaria;
    private Integer ordenListaTipoNomenclaturaComplementaria;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @Column(name = "IdListaTipoNomenclaturaComplementaria")
    public Integer getIdListaTipoNomenclaturaComplementaria() {
        return idListaTipoNomenclaturaComplementaria;
    }

    public void setIdListaTipoNomenclaturaComplementaria(Integer idListaTipoNomenclaturaComplementaria) {
        this.idListaTipoNomenclaturaComplementaria = idListaTipoNomenclaturaComplementaria;
    }

    @Basic
    @Column(name = "CodigoListaTipoNomenclaturaComplementaria")
    public String getCodigoListaTipoNomenclaturaComplementaria() {
        return codigoListaTipoNomenclaturaComplementaria;
    }

    public void setCodigoListaTipoNomenclaturaComplementaria(String codigoListaTipoNomenclaturaComplementaria) {
        this.codigoListaTipoNomenclaturaComplementaria = codigoListaTipoNomenclaturaComplementaria;
    }

    @Basic
    @Column(name = "NombreListaTipoNomenclaturaComplementaria")
    public String getNombreListaTipoNomenclaturaComplementaria() {
        return nombreListaTipoNomenclaturaComplementaria;
    }

    public void setNombreListaTipoNomenclaturaComplementaria(String nombreListaTipoNomenclaturaComplementaria) {
        this.nombreListaTipoNomenclaturaComplementaria = nombreListaTipoNomenclaturaComplementaria;
    }

    @Basic
    @Column(name = "OrdenListaTipoNomenclaturaComplementaria")
    public Integer getOrdenListaTipoNomenclaturaComplementaria() {
        return ordenListaTipoNomenclaturaComplementaria;
    }

    public void setOrdenListaTipoNomenclaturaComplementaria(Integer ordenListaTipoNomenclaturaComplementaria) {
        this.ordenListaTipoNomenclaturaComplementaria = ordenListaTipoNomenclaturaComplementaria;
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

        ListasTiposNomenclaturasComplementarias that = (ListasTiposNomenclaturasComplementarias) o;

        if (idListaTipoNomenclaturaComplementaria != null ? !idListaTipoNomenclaturaComplementaria.equals(that.idListaTipoNomenclaturaComplementaria) : that.idListaTipoNomenclaturaComplementaria != null)
            return false;
        if (codigoListaTipoNomenclaturaComplementaria != null ? !codigoListaTipoNomenclaturaComplementaria.equals(that.codigoListaTipoNomenclaturaComplementaria) : that.codigoListaTipoNomenclaturaComplementaria != null)
            return false;
        if (nombreListaTipoNomenclaturaComplementaria != null ? !nombreListaTipoNomenclaturaComplementaria.equals(that.nombreListaTipoNomenclaturaComplementaria) : that.nombreListaTipoNomenclaturaComplementaria != null)
            return false;
        if (ordenListaTipoNomenclaturaComplementaria != null ? !ordenListaTipoNomenclaturaComplementaria.equals(that.ordenListaTipoNomenclaturaComplementaria) : that.ordenListaTipoNomenclaturaComplementaria != null)
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
        int result = idListaTipoNomenclaturaComplementaria != null ? idListaTipoNomenclaturaComplementaria.hashCode() : 0;
        result = 31 * result + (codigoListaTipoNomenclaturaComplementaria != null ? codigoListaTipoNomenclaturaComplementaria.hashCode() : 0);
        result = 31 * result + (nombreListaTipoNomenclaturaComplementaria != null ? nombreListaTipoNomenclaturaComplementaria.hashCode() : 0);
        result = 31 * result + (ordenListaTipoNomenclaturaComplementaria != null ? ordenListaTipoNomenclaturaComplementaria.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
