package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "LocalizacionesNomenclaturas", schema = "dbo", catalog = "CREZCAMOS")
public class LocalizacionesNomenclaturas {
    private Integer idLocalizacionNomenclatura;
    private Integer idTipoNomenclaturaComplementaria;
    private Integer idLocalizacion;
    private String descripcion;
    private Boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    public LocalizacionesNomenclaturas() {
    }

    public LocalizacionesNomenclaturas(Integer idTipoNomenclaturaComplementaria, Integer idLocalizacion, String descripcion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idTipoNomenclaturaComplementaria = idTipoNomenclaturaComplementaria;
        this.idLocalizacion = idLocalizacion;
        this.descripcion = descripcion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    public LocalizacionesNomenclaturas(Integer idLocalizacionNomenclatura, Integer idTipoNomenclaturaComplementaria, Integer idLocalizacion, String descripcion, Boolean indicadorHabilitado, Integer auditoriaUsuario) {
        this.idLocalizacionNomenclatura = idLocalizacionNomenclatura;
        this.idTipoNomenclaturaComplementaria = idTipoNomenclaturaComplementaria;
        this.idLocalizacion = idLocalizacion;
        this.descripcion = descripcion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario != null ? auditoriaUsuario: 1;
        this.auditoriaFecha = new Timestamp(System.currentTimeMillis());
    }

    @Id
    @GeneratedValue
    @Column(name = "IdLocalizacionNomenclatura", nullable = false)
    public Integer getIdLocalizacionNomenclatura() {
        return idLocalizacionNomenclatura;
    }

    public void setIdLocalizacionNomenclatura(Integer idLocalizacionNomenclatura) {
        this.idLocalizacionNomenclatura = idLocalizacionNomenclatura;
    }

    @Basic
    @Column(name = "IdTipoNomenclaturaComplementaria", nullable = true)
    public Integer getIdTipoNomenclaturaComplementaria() {
        return idTipoNomenclaturaComplementaria;
    }

    public void setIdTipoNomenclaturaComplementaria(Integer idTipoNomenclaturaComplementaria) {
        this.idTipoNomenclaturaComplementaria = idTipoNomenclaturaComplementaria;
    }

    @Basic
    @Column(name = "IdLocalizacion", nullable = true)
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Basic
    @Column(name = "Descripcion", nullable = true, length = 100)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

        LocalizacionesNomenclaturas that = (LocalizacionesNomenclaturas) o;

        if (idLocalizacionNomenclatura != null ? !idLocalizacionNomenclatura.equals(that.idLocalizacionNomenclatura) : that.idLocalizacionNomenclatura != null)
            return false;
        if (idTipoNomenclaturaComplementaria != null ? !idTipoNomenclaturaComplementaria.equals(that.idTipoNomenclaturaComplementaria) : that.idTipoNomenclaturaComplementaria != null)
            return false;
        if (idLocalizacion != null ? !idLocalizacion.equals(that.idLocalizacion) : that.idLocalizacion != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
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
        int result = idLocalizacionNomenclatura != null ? idLocalizacionNomenclatura.hashCode() : 0;
        result = 31 * result + (idTipoNomenclaturaComplementaria != null ? idTipoNomenclaturaComplementaria.hashCode() : 0);
        result = 31 * result + (idLocalizacion != null ? idLocalizacion.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (indicadorHabilitado != null ? indicadorHabilitado.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
