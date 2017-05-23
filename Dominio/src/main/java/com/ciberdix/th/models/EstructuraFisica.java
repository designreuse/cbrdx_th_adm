package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 17/04/2017.
 */
@Entity
@Table(name = "EstructuraFisica", schema = "crz_th", catalog = "CREZCAMOS")
public class EstructuraFisica {
    private Integer idEstructuraFisica;
    private String codigo;
    private String estructuraFisica;
    private Integer idClasificacionSede;
    private Integer idLocalizacion;
    private String telefono;
    private String celular;
    private String correoElectronico;
    private Boolean indicadorVirtual;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public EstructuraFisica() {
    }

    public EstructuraFisica(String codigo, String estructuraFisica, Integer idClasificacionSede, Integer idLocalizacion, String telefono, String celular, String correoElectronico, Boolean indicadorVirtual, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.codigo = codigo;
        this.estructuraFisica = estructuraFisica;
        this.idClasificacionSede = idClasificacionSede;
        this.idLocalizacion = idLocalizacion;
        this.telefono = telefono;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.indicadorVirtual = indicadorVirtual;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public EstructuraFisica(Integer idEstructuraFisica, String codigo, String estructuraFisica, Integer idClasificacionSede, Integer idLocalizacion, String telefono, String celular, String correoElectronico, Boolean indicadorVirtual, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idEstructuraFisica = idEstructuraFisica;
        this.codigo = codigo;
        this.estructuraFisica = estructuraFisica;
        this.idClasificacionSede = idClasificacionSede;
        this.idLocalizacion = idLocalizacion;
        this.telefono = telefono;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.indicadorVirtual = indicadorVirtual;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdEstructuraFisica")
    public Integer getIdEstructuraFisica() {
        return idEstructuraFisica;
    }

    public void setIdEstructuraFisica(Integer idEstructuraFisica) {
        this.idEstructuraFisica = idEstructuraFisica;
    }

    @Basic
    @Column(name = "Codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "EstructuraFisica")
    public String getEstructuraFisica() {
        return estructuraFisica;
    }

    public void setEstructuraFisica(String estructuraFisica) {
        this.estructuraFisica = estructuraFisica;
    }

    @Basic
    @Column(name = "IdClasificacionSede")
    public Integer getIdClasificacionSede() {
        return idClasificacionSede;
    }

    public void setIdClasificacionSede(Integer idClasificacionSede) {
        this.idClasificacionSede = idClasificacionSede;
    }

    @Basic
    @Column(name = "IdLocalizacion")
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Basic
    @Column(name = "Telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "Celular")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "CorreoElectronico")
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Basic
    @Column(name = "IndicadorVirtual")
    public Boolean getIndicadorVirtual() {
        return indicadorVirtual;
    }

    public void setIndicadorVirtual(Boolean indicadorVirtual) {
        this.indicadorVirtual = indicadorVirtual;
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

        EstructuraFisica that = (EstructuraFisica) o;

        if (idEstructuraFisica != null ? !idEstructuraFisica.equals(that.idEstructuraFisica) : that.idEstructuraFisica != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (estructuraFisica != null ? !estructuraFisica.equals(that.estructuraFisica) : that.estructuraFisica != null)
            return false;
        if (idClasificacionSede != null ? !idClasificacionSede.equals(that.idClasificacionSede) : that.idClasificacionSede != null)
            return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (celular != null ? !celular.equals(that.celular) : that.celular != null) return false;
        if (correoElectronico != null ? !correoElectronico.equals(that.correoElectronico) : that.correoElectronico != null)
            return false;
        if (indicadorVirtual != null ? !indicadorVirtual.equals(that.indicadorVirtual) : that.indicadorVirtual != null)
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
        int result = idEstructuraFisica != null ? idEstructuraFisica.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (estructuraFisica != null ? estructuraFisica.hashCode() : 0);
        result = 31 * result + (idClasificacionSede != null ? idClasificacionSede.hashCode() : 0);
        result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        result = 31 * result + (indicadorVirtual != null ? indicadorVirtual.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
