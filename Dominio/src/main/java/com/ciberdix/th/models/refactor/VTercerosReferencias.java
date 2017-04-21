package com.ciberdix.th.models.refactor;

import javax.persistence.*;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_TercerosReferencias", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class VTercerosReferencias {
    private Integer idTerceroReferencia;
    private Long idTercero;
    private String tipoReferencia;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefonoFijo;
    private String telefonoMovil;
    private String descripcionDivisonPolitica;

    @Id
    @Column(name = "IdTerceroReferencia")
    public Integer getIdTerceroReferencia() {
        return idTerceroReferencia;
    }

    public void setIdTerceroReferencia(Integer idTerceroReferencia) {
        this.idTerceroReferencia = idTerceroReferencia;
    }

    @Basic
    @Column(name = "IdTercero")
    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    @Basic
    @Column(name = "TipoReferencia")
    public String getTipoReferencia() {
        return tipoReferencia;
    }

    public void setTipoReferencia(String tipoReferencia) {
        this.tipoReferencia = tipoReferencia;
    }

    @Basic
    @Column(name = "PrimerNombre")
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Basic
    @Column(name = "SegundoNombre")
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Basic
    @Column(name = "PrimerApellido")
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Basic
    @Column(name = "SegundoApellido")
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Basic
    @Column(name = "TelefonoFijo")
    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    @Basic
    @Column(name = "TelefonoMovil")
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    @Basic
    @Column(name = "DescripcionDivisonPolitica")
    public String getDescripcionDivisonPolitica() {
        return descripcionDivisonPolitica;
    }

    public void setDescripcionDivisonPolitica(String descripcionDivisonPolitica) {
        this.descripcionDivisonPolitica = descripcionDivisonPolitica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VTercerosReferencias that = (VTercerosReferencias) o;

        if (idTerceroReferencia != null ? !idTerceroReferencia.equals(that.idTerceroReferencia) : that.idTerceroReferencia != null)
            return false;
        if (idTercero != null ? !idTercero.equals(that.idTercero) : that.idTercero != null) return false;
        if (tipoReferencia != null ? !tipoReferencia.equals(that.tipoReferencia) : that.tipoReferencia != null)
            return false;
        if (primerNombre != null ? !primerNombre.equals(that.primerNombre) : that.primerNombre != null) return false;
        if (segundoNombre != null ? !segundoNombre.equals(that.segundoNombre) : that.segundoNombre != null)
            return false;
        if (primerApellido != null ? !primerApellido.equals(that.primerApellido) : that.primerApellido != null)
            return false;
        if (segundoApellido != null ? !segundoApellido.equals(that.segundoApellido) : that.segundoApellido != null)
            return false;
        if (telefonoFijo != null ? !telefonoFijo.equals(that.telefonoFijo) : that.telefonoFijo != null) return false;
        if (telefonoMovil != null ? !telefonoMovil.equals(that.telefonoMovil) : that.telefonoMovil != null)
            return false;
        if (descripcionDivisonPolitica != null ? !descripcionDivisonPolitica.equals(that.descripcionDivisonPolitica) : that.descripcionDivisonPolitica != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTerceroReferencia != null ? idTerceroReferencia.hashCode() : 0;
        result = 31 * result + (idTercero != null ? idTercero.hashCode() : 0);
        result = 31 * result + (tipoReferencia != null ? tipoReferencia.hashCode() : 0);
        result = 31 * result + (primerNombre != null ? primerNombre.hashCode() : 0);
        result = 31 * result + (segundoNombre != null ? segundoNombre.hashCode() : 0);
        result = 31 * result + (primerApellido != null ? primerApellido.hashCode() : 0);
        result = 31 * result + (segundoApellido != null ? segundoApellido.hashCode() : 0);
        result = 31 * result + (telefonoFijo != null ? telefonoFijo.hashCode() : 0);
        result = 31 * result + (telefonoMovil != null ? telefonoMovil.hashCode() : 0);
        result = 31 * result + (descripcionDivisonPolitica != null ? descripcionDivisonPolitica.hashCode() : 0);
        return result;
    }
}
