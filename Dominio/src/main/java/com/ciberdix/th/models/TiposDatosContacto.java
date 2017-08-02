package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ActividadesEconomicasTipos", schema = "dbo", catalog = "CREZCAMOS")
public class TiposDatosContacto {
    private Integer idTipoDatoContacto;
    private String codigo;
    private String tipoDatoContacto;
    private Boolean indicadorRequiereConfirmacion;
    private Boolean indicadorObligatorio;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public TiposDatosContacto() {
    }

    public TiposDatosContacto(String codigo, String tipoDatoContacto, Boolean indicadorRequiereConfirmacion, Boolean indicadorObligatorio, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.codigo = codigo;
        this.tipoDatoContacto = tipoDatoContacto;
        this.indicadorRequiereConfirmacion = indicadorRequiereConfirmacion;
        this.indicadorObligatorio = indicadorObligatorio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public TiposDatosContacto(Integer idTipoDatoContacto, String codigo, String tipoDatoContacto, Boolean indicadorRequiereConfirmacion, Boolean indicadorObligatorio, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTipoDatoContacto = idTipoDatoContacto;
        this.codigo = codigo;
        this.tipoDatoContacto = tipoDatoContacto;
        this.indicadorRequiereConfirmacion = indicadorRequiereConfirmacion;
        this.indicadorObligatorio = indicadorObligatorio;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario : 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdTipoDatoContacto", nullable = false)
    public Integer getIdTipoDatoContacto() {
        return idTipoDatoContacto;
    }

    public void setIdTipoDatoContacto(Integer idTipoDatoContacto) {
        this.idTipoDatoContacto = idTipoDatoContacto;
    }

    @Basic
    @Column(name = "Codigo", nullable = true, length = 10)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "TipoDatoContacto", nullable = true, length = 200)
    public String getTipoDatoContacto() {
        return tipoDatoContacto;
    }

    public void setTipoDatoContacto(String tipoDatoContacto) {
        this.tipoDatoContacto = tipoDatoContacto;
    }

    @Basic
    @Column(name = "IndicadorRequiereConfirmacion", nullable = true)
    public Boolean getIndicadorRequiereConfirmacion() {
        return indicadorRequiereConfirmacion;
    }

    public void setIndicadorRequiereConfirmacion(Boolean indicadorRequiereConfirmacion) {
        this.indicadorRequiereConfirmacion = indicadorRequiereConfirmacion;
    }

    @Basic
    @Column(name = "IndicadorObligatorio", nullable = true)
    public Boolean getIndicadorObligatorio() {
        return indicadorObligatorio;
    }

    public void setIndicadorObligatorio(Boolean indicadorObligatorio) {
        this.indicadorObligatorio = indicadorObligatorio;
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

        TiposDatosContacto that = (TiposDatosContacto) o;

        if (idTipoDatoContacto != null ? !idTipoDatoContacto.equals(that.idTipoDatoContacto) : that.idTipoDatoContacto != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (tipoDatoContacto != null ? !tipoDatoContacto.equals(that.tipoDatoContacto) : that.tipoDatoContacto != null)
            return false;
        if (indicadorRequiereConfirmacion != null ? !indicadorRequiereConfirmacion.equals(that.indicadorRequiereConfirmacion) : that.indicadorRequiereConfirmacion != null)
            return false;
        if (indicadorObligatorio != null ? !indicadorObligatorio.equals(that.indicadorObligatorio) : that.indicadorObligatorio != null)
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
        int result = idTipoDatoContacto != null ? idTipoDatoContacto.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (tipoDatoContacto != null ? tipoDatoContacto.hashCode() : 0);
        result = 31 * result + (indicadorRequiereConfirmacion != null ? indicadorRequiereConfirmacion.hashCode() : 0);
        result = 31 * result + (indicadorObligatorio != null ? indicadorObligatorio.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
