package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_Historico_Usuarios", schema = "dbo", catalog = "CREZCAMOS")
public class VHistoricoUsuarios {
    private Integer usuario;
    private String objeto;
    private Long idObjeto;
    private String item;
    private String valorAnterior;
    private String valorNuevo;
    private String historia;
    private Long idAuditoria;

    @Basic
    @Id
    @Column(name = "Usuario", nullable = false)
    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
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
    @Column(name = "IdObjeto", nullable = false)
    public Long getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(Long idObjeto) {
        this.idObjeto = idObjeto;
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

    @Basic
    @Column(name = "historia", nullable = true, length = 8000)
    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    @Basic
    @Column(name = "IdAuditoria", nullable = false)
    public Long getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Long idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VHistoricoUsuarios that = (VHistoricoUsuarios) o;

        if (usuario != null ? !usuario.equals(that.usuario) : that.usuario != null) return false;
        if (objeto != null ? !objeto.equals(that.objeto) : that.objeto != null) return false;
        if (idObjeto != null ? !idObjeto.equals(that.idObjeto) : that.idObjeto != null) return false;
        if (item != null ? !item.equals(that.item) : that.item != null) return false;
        if (valorAnterior != null ? !valorAnterior.equals(that.valorAnterior) : that.valorAnterior != null)
            return false;
        if (valorNuevo != null ? !valorNuevo.equals(that.valorNuevo) : that.valorNuevo != null) return false;
        if (historia != null ? !historia.equals(that.historia) : that.historia != null) return false;
        if (idAuditoria != null ? !idAuditoria.equals(that.idAuditoria) : that.idAuditoria != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usuario != null ? usuario.hashCode() : 0;
        result = 31 * result + (objeto != null ? objeto.hashCode() : 0);
        result = 31 * result + (idObjeto != null ? idObjeto.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (valorAnterior != null ? valorAnterior.hashCode() : 0);
        result = 31 * result + (valorNuevo != null ? valorNuevo.hashCode() : 0);
        result = 31 * result + (historia != null ? historia.hashCode() : 0);
        result = 31 * result + (idAuditoria != null ? idAuditoria.hashCode() : 0);
        return result;
    }
}
