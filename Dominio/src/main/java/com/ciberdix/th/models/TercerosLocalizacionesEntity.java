package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TercerosLocalizaciones", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosLocalizacionesEntity {
    private int idTerceroLocalizacion;
    private int idTercero;
    //private int idLocalizacion;
    private boolean indicadorHabilitado;
    //private int auditoriaUsuario;
    private Timestamp auditoriaFecha;
    private LocalizacionesEntity localizacion;
    private TercerosEntity terceros;
    private UsuariosEntity usuarios;
    /*public TercerosLocalizacionesEntity(int idTerceroLocalizacion, int idTercero, int idLocalizacion, boolean indicadorHabilitado, int auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
        this.idTercero = idTercero;
        this.idLocalizacion = idLocalizacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }*/

    public TercerosLocalizacionesEntity() {
    }

    @Id
    @Column(name = "IdTerceroLocalizacion", nullable = false)
    public int getIdTerceroLocalizacion() {
        return idTerceroLocalizacion;
    }

    public void setIdTerceroLocalizacion(int idTerceroLocalizacion) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true, length = 64)
    public int getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(int idTercero) {
        this.idTercero = idTercero;
    }
    /*
    @Basic
    @Column(name = "IdLocalizacion", nullable = true, length = 64)
    public int getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(int idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }*/

    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true, length = 64)
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
/*
    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true, length = 64)
    public int getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(int auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }
*/
    @Basic
    @Column(name = "AuditoriaFecha", nullable = true, length = 64)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @ManyToOne(targetEntity = LocalizacionesEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdLocalizacion", nullable=true)
    public LocalizacionesEntity getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(LocalizacionesEntity localizacion) {
        this.localizacion = localizacion;
    }


    @ManyToOne(targetEntity = TercerosEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdTercero", nullable=true,  insertable = false , updatable = false)
    public TercerosEntity getTerceros() {
        return terceros;
    }

    public void setTerceros(TercerosEntity terceros) {
        this.terceros = terceros;
    }

    @ManyToOne(targetEntity = UsuariosEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="AuditoriaUsuario", nullable=true)
    public UsuariosEntity getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UsuariosEntity usuarios) {
        this.usuarios = usuarios;
    }
}
