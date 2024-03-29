package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Localizaciones", schema = "dbo", catalog = "CREZCAMOS")
public class Localizaciones {
    private Integer idLocalizacion;
    private Integer idTipoDireccion;
    private String direccion;
    private String latitud;
    private String longitud;
    private String comoLlegar;
    private Boolean indicadorHabilitado;
    private Integer idDivisionPolitica;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private Integer idTipoNomenclatura;
    private String principal;
    private String adicional;
    private String adicionalComplementaria;

    public Localizaciones() {
    }

    public Localizaciones(Integer idTipoDireccion, String direccion, String latitud, String longitud, String comoLlegar, Boolean indicadorHabilitado, Integer idDivisionPolitica, Integer auditoriaUsuario, Integer idTipoNomenclatura, String principal, String adicional, String adicionalComplementaria) {
        this.idTipoDireccion = idTipoDireccion;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.comoLlegar = comoLlegar;
        this.indicadorHabilitado = indicadorHabilitado;
        this.idDivisionPolitica = idDivisionPolitica;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idTipoNomenclatura = idTipoNomenclatura;
        this.principal = principal;
        this.adicional = adicional;
        this.adicionalComplementaria = adicionalComplementaria;
    }

    public Localizaciones(Integer idLocalizacion, Integer idTipoDireccion, String direccion, String latitud, String longitud, String comoLlegar, Boolean indicadorHabilitado, Integer idDivisionPolitica, Integer auditoriaUsuario, Integer idTipoNomenclatura, String principal, String adicional, String adicionalComplementaria) {
        this.idLocalizacion = idLocalizacion;
        this.idTipoDireccion = idTipoDireccion;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.comoLlegar = comoLlegar;
        this.indicadorHabilitado = indicadorHabilitado;
        this.idDivisionPolitica = idDivisionPolitica;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
        this.idTipoNomenclatura = idTipoNomenclatura;
        this.principal = principal;
        this.adicional = adicional;
        this.adicionalComplementaria = adicionalComplementaria;
    }

    @Id
    @GeneratedValue
    @Column(name = "IdLocalizacion", nullable = false)
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Basic
    @Column(name = "IdTipoDireccion", nullable = true)
    public Integer getIdTipoDireccion() {
        return idTipoDireccion;
    }

    public void setIdTipoDireccion(Integer idTipoDireccion) {
        this.idTipoDireccion = idTipoDireccion;
    }

    @Basic
    @Column(name = "Direccion", nullable = true, length = 512)
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "Latitud", nullable = true, length = 30)
    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    @Basic
    @Column(name = "Longitud", nullable = true, length = 30)
    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Basic
    @Column(name = "ComoLlegar", nullable = true, length = 512)
    public String getComoLlegar() {
        return comoLlegar;
    }

    public void setComoLlegar(String comoLlegar) {
        this.comoLlegar = comoLlegar;
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
    @Column(name = "IdDivisionPolitica", nullable = true)
    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
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

    @Basic
    @Column(name = "IdTipoNomenclatura", nullable = true)
    public Integer getIdTipoNomenclatura() {
        return idTipoNomenclatura;
    }

    public void setIdTipoNomenclatura(Integer idTipoNomenclatura) {
        this.idTipoNomenclatura = idTipoNomenclatura;
    }

    @Basic
    @Column(name = "Principal", nullable = true, length = 40)
    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Basic
    @Column(name = "Adicional", nullable = true, length = 40)
    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    @Basic
    @Column(name = "AdicionalComplementaria", nullable = true, length = 40)
    public String getAdicionalComplementaria() {
        return adicionalComplementaria;
    }

    public void setAdicionalComplementaria(String adicionalComplementaria) {
        this.adicionalComplementaria = adicionalComplementaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Localizaciones that = (Localizaciones) o;

        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
        if (idTipoDireccion != null ? !idTipoDireccion.equals(that.idTipoDireccion) : that.idTipoDireccion != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (latitud != null ? !latitud.equals(that.latitud) : that.latitud != null) return false;
        if (longitud != null ? !longitud.equals(that.longitud) : that.longitud != null) return false;
        if (comoLlegar != null ? !comoLlegar.equals(that.comoLlegar) : that.comoLlegar != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (idDivisionPolitica != null ? !idDivisionPolitica.equals(that.idDivisionPolitica) : that.idDivisionPolitica != null)
            return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;
        if (idTipoNomenclatura != null ? !idTipoNomenclatura.equals(that.idTipoNomenclatura) : that.idTipoNomenclatura != null)
            return false;
        if (principal != null ? !principal.equals(that.principal) : that.principal != null) return false;
        if (adicional != null ? !adicional.equals(that.adicional) : that.adicional != null) return false;
        if (adicionalComplementaria != null ? !adicionalComplementaria.equals(that.adicionalComplementaria) : that.adicionalComplementaria != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLocalizacion != null ? idLocalizacion.hashCode() : 0;
        result = 31 * result + (idTipoDireccion != null ? idTipoDireccion.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (latitud != null ? latitud.hashCode() : 0);
        result = 31 * result + (longitud != null ? longitud.hashCode() : 0);
        result = 31 * result + (comoLlegar != null ? comoLlegar.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (idDivisionPolitica != null ? idDivisionPolitica.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        result = 31 * result + (idTipoNomenclatura != null ? idTipoNomenclatura.hashCode() : 0);
        result = 31 * result + (principal != null ? principal.hashCode() : 0);
        result = 31 * result + (adicional != null ? adicional.hashCode() : 0);
        result = 31 * result + (adicionalComplementaria != null ? adicionalComplementaria.hashCode() : 0);
        return result;
    }
}
