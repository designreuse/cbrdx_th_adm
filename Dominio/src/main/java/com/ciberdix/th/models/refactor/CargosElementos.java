package com.ciberdix.th.models.refactor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Felipe Alejandro Aguirre Santos on 24/03/2017.
 */
@Entity
@Table(name = "CargosElementos", schema = "crz_th", catalog = "CREZCAMOS")
public class CargosElementos {
    private Integer idCargoElemento;
    private Integer idCargo;
    private Integer idTipoElemento;
    private String descripcion;
    private BigDecimal valor;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    @Id
    @GeneratedValue
    @Column(name = "IdCargoElemento")
    public Integer getIdCargoElemento() {
        return idCargoElemento;
    }

    public void setIdCargoElemento(Integer idCargoElemento) {
        this.idCargoElemento = idCargoElemento;
    }

    @Basic
    @Column(name = "IdCargo")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "IdTipoElemento")
    public Integer getIdTipoElemento() {
        return idTipoElemento;
    }

    public void setIdTipoElemento(Integer idTipoElemento) {
        this.idTipoElemento = idTipoElemento;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "Valor")
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
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

        CargosElementos that = (CargosElementos) o;

        if (idCargoElemento != null ? !idCargoElemento.equals(that.idCargoElemento) : that.idCargoElemento != null)
            return false;
        if (idCargo != null ? !idCargo.equals(that.idCargo) : that.idCargo != null) return false;
        if (idTipoElemento != null ? !idTipoElemento.equals(that.idTipoElemento) : that.idTipoElemento != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (auditoriaUsuario != null ? !auditoriaUsuario.equals(that.auditoriaUsuario) : that.auditoriaUsuario != null)
            return false;
        if (auditoriaFecha != null ? !auditoriaFecha.equals(that.auditoriaFecha) : that.auditoriaFecha != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCargoElemento != null ? idCargoElemento.hashCode() : 0;
        result = 31 * result + (idCargo != null ? idCargo.hashCode() : 0);
        result = 31 * result + (idTipoElemento != null ? idTipoElemento.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (auditoriaUsuario != null ? auditoriaUsuario.hashCode() : 0);
        result = 31 * result + (auditoriaFecha != null ? auditoriaFecha.hashCode() : 0);
        return result;
    }
}
