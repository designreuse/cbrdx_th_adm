package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "Auditorias", schema = "crz_th", catalog = "CREZCAMOS_TEST")
public class AuditoriasEntity {
    private Long idAuditoria;
    private Integer usuario;
    private Timestamp fecha;
    private String objeto;
    private String item;
    private String accion;
    private String valorAnterior;
    private String valorNuevo;

    @Id
    @Column(name = "IdAuditoria", nullable = false)
    public Long getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Long idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    @Basic
    @Column(name = "Usuario", nullable = false)
    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "Fecha", nullable = false)
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "Objeto", nullable = false, length = 100)
    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    @Basic
    @Column(name = "Item", nullable = false, length = 100)
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Basic
    @Column(name = "Accion", nullable = false, length = 100)
    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    @Basic
    @Column(name = "ValorAnterior", nullable = true, length = 50)
    public String getValorAnterior() {
        return valorAnterior;
    }

    public void setValorAnterior(String valorAnterior) {
        this.valorAnterior = valorAnterior;
    }

    @Basic
    @Column(name = "ValorNuevo", nullable = true, length = 50)
    public String getValorNuevo() {
        return valorNuevo;
    }

    public void setValorNuevo(String valorNuevo) {
        this.valorNuevo = valorNuevo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuditoriasEntity that = (AuditoriasEntity) o;

        if (idAuditoria != null ? !idAuditoria.equals(that.idAuditoria) : that.idAuditoria != null) return false;
        if (usuario != null ? !usuario.equals(that.usuario) : that.usuario != null) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (objeto != null ? !objeto.equals(that.objeto) : that.objeto != null) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (accion != null ? !accion.equals(that.accion) : that.accion != null) return false;
        if (valorAnterior != null ? !valorAnterior.equals(that.valorAnterior) : that.valorAnterior != null)
            return false;
        if (valorNuevo != null ? !valorNuevo.equals(that.valorNuevo) : that.valorNuevo != null) return false;

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
        return result;
    }
}
