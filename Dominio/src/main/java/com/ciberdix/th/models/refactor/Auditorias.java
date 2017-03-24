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
public class Auditorias {
    private Long idAuditoria;
    private Integer usuario;
    private Timestamp fecha;
    private String objeto;
    private String item;
    private String accion;
    private String valorAnterior;
    private String valorNuevo;
    private Long idObjeto;

    @Id
    @Column(name = "IdAuditoria")
    public Long getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Long idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    @Basic
    @Column(name = "Usuario")
    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "Fecha")
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "Objeto")
    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    @Basic
    @Column(name = "Item")
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Basic
    @Column(name = "Accion")
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Basic
    @Column(name = "ValorAnterior")
    public String getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    @Basic
    @Column(name = "ValorNuevo")
    public String getValorNuevo() {
        return valorNuevo;
    }

    public void setValorNuevo(String valorNuevo) {
        this.valorNuevo = valorNuevo;
    }

    @Basic
    @Column(name = "IdObjeto")
    public Long getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(Long idObjeto) {
        this.idObjeto = idObjeto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auditorias that = (Auditorias) o;

        if (idAuditoria != null ? !idAuditoria.equals(that.idAuditoria) : that.idAuditoria != null) return false;
        if (usuario != null ? !usuario.equals(that.usuario) : that.usuario != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (objeto != null ? !objeto.equals(that.objeto) : that.objeto != null) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (accion != null ? !accion.equals(that.accion) : that.accion != null) return false;
        if (valorAnterior != null ? !valorAnterior.equals(that.valorAnterior) : that.valorAnterior != null)
            return false;
        if (valorNuevo != null ? !valorNuevo.equals(that.valorNuevo) : that.valorNuevo != null) return false;
        if (idObjeto != null ? !idObjeto.equals(that.idObjeto) : that.idObjeto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAuditoria != null ? idAuditoria.hashCode() : 0;
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (objeto != null ? objeto.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (accion != null ? accion.hashCode() : 0);
        result = 31 * result + (valorAnterior != null ? valorAnterior.hashCode() : 0);
        result = 31 * result + (valorNuevo != null ? valorNuevo.hashCode() : 0);
        result = 31 * result + (idObjeto != null ? idObjeto.hashCode() : 0);
        return result;
    }
}
