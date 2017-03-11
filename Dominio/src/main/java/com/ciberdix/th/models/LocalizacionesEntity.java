package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Localizaciones", schema = "crz_th", catalog = "CREZCAMOS")
public class LocalizacionesEntity {
    private Integer idUbicacion;
    private Integer idTipoDireccion;
    private String direccion;
    private String latitud;
    private Integer longitud;
    private String comoLlegar;
    private Boolean indicadorHabilitado;
    private Integer idDivisionPolitica;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;


    private TipoDireccionEntity TipoDireccion;
    private DivPoliticaEntity idDivPolitica;



    public LocalizacionesEntity() {
    }

    public LocalizacionesEntity( Integer idTipoDireccion, String direccion, String latitud, Integer longitud, String comoLlegar, Boolean indicadorHabilitado, Integer idDivisionPolitica, Integer auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idTipoDireccion = idTipoDireccion;
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.comoLlegar = comoLlegar;
        this.indicadorHabilitado = indicadorHabilitado;
        this.idDivisionPolitica = idDivisionPolitica;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdLocalizacion", nullable = false)
    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    @Basic
    @Column(name = "Direccion", nullable = true, length = 30)
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
    @Column(name = "Longitud", nullable = true)
    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    @Basic
    @Column(name = "ComoLlegar", nullable = true, length = 256)
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

    @ManyToOne(targetEntity = TipoDireccionEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdTipoDireccion", nullable=true, insertable = false , updatable = false)
    public TipoDireccionEntity getTipoDireccion() {
        return TipoDireccion;
    }

    public void setTipoDireccion(TipoDireccionEntity tipoDireccion) {
        TipoDireccion = tipoDireccion;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalizacionesEntity that = (LocalizacionesEntity) o;

        if (idUbicacion != null ? !idUbicacion.equals(that.idUbicacion) : that.idUbicacion != null)
            return false;
        if (TipoDireccion != null ? !TipoDireccion.equals(that.TipoDireccion) : that.TipoDireccion != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (latitud != null ? !latitud.equals(that.latitud) : that.latitud != null) return false;
        if (longitud != null ? !longitud.equals(that.longitud) : that.longitud != null) return false;
        if (comoLlegar != null ? !comoLlegar.equals(that.comoLlegar) : that.comoLlegar != null) return false;
        if (indicadorHabilitado != null ? !indicadorHabilitado.equals(that.indicadorHabilitado) : that.indicadorHabilitado != null)
            return false;
        if (idDivPolitica != null ? !idDivPolitica.equals(that.idDivPolitica) : that.idDivPolitica != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUbicacion != null ? idUbicacion.hashCode() : 0;
        result = 31 * result + (TipoDireccion != null ? TipoDireccion.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (latitud != null ? latitud.hashCode() : 0);
        result = 31 * result + (longitud != null ? longitud.hashCode() : 0);
        result = 31 * result + (comoLlegar != null ? comoLlegar.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (idDivPolitica != null ? idDivPolitica.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }


    @Basic
    @Column(name = "IdTipoDireccion", nullable = false)
    public Integer getIdTipoDireccion() {
        return idTipoDireccion;
    }

    public void setIdTipoDireccion(Integer idTipoDireccion) {
        this.idTipoDireccion = idTipoDireccion;
    }

    @Basic
    @Column(name = "IdDivisionPolitica", nullable = false)
    public Integer getIdDivisionPolitica() {
        return idDivisionPolitica;
    }

    public void setIdDivisionPolitica(Integer idDivisionPolitica) {
        this.idDivisionPolitica = idDivisionPolitica;
    }
}
