package com.ciberdix.th.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by felip on 2/03/2017.
 */
@Entity
@Table(name = "TercerosLocalizaciones", schema = "crz_th", catalog = "CREZCAMOS")
public class TercerosLocalizacionesEntity {
    private Integer idTerceroLocalizacion;
    private Integer idTercero;
    private Integer idLocalizacion;
    private boolean indicadorHabilitado;
    private Integer auditoriaUsuario;
    private Timestamp auditoriaFecha;

    private LocalizacionesEntity localizacion;
    private TercerosEntity terceros;
    private UsuariosEntity usuarios;


    public TercerosLocalizacionesEntity() {
    }

    public TercerosLocalizacionesEntity( Integer idTercero, Integer idLocalizacion, boolean indicadorHabilitado, Integer auditoriaUsuario, Timestamp auditoriaFecha) {
        this.idTercero = idTercero;
        this.idLocalizacion = idLocalizacion;
        this.indicadorHabilitado = indicadorHabilitado;
        this.auditoriaUsuario = auditoriaUsuario;
        this.auditoriaFecha = auditoriaFecha;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTerceroLocalizacion", nullable = false)
    public Integer getIdTerceroLocalizacion() {
        return idTerceroLocalizacion;
    }

    public void setIdTerceroLocalizacion(Integer idTerceroLocalizacion) {
        this.idTerceroLocalizacion = idTerceroLocalizacion;
    }

    @Basic
    @Column(name = "IdTercero", nullable = true, length = 64)
    public Integer getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Integer idTercero) {
        this.idTercero = idTercero;
    }


    @Basic
    @Column(name = "IndicadorHabilitado", nullable = true, length = 64)
    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "AuditoriaFecha", nullable = true, length = 64)
    public Timestamp getAuditoriaFecha() {
        return auditoriaFecha;
    }

    public void setAuditoriaFecha(Timestamp auditoriaFecha) {
        this.auditoriaFecha = auditoriaFecha;
    }

    @Basic
    @Column(name = "IdLocalizacion", nullable = true, length = 64)
    public Integer getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Integer idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Basic
    @Column(name = "AuditoriaUsuario", nullable = true, length = 64)
    public Integer getAuditoriaUsuario() {
        return auditoriaUsuario;
    }

    public void setAuditoriaUsuario(Integer auditoriaUsuario) {
        this.auditoriaUsuario = auditoriaUsuario;
    }

    @ManyToOne(targetEntity = LocalizacionesEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="IdLocalizacion", nullable=true, insertable = false , updatable = false)
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
    @JoinColumn(name="AuditoriaUsuario", nullable=true,insertable = false , updatable = false)
    public UsuariosEntity getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UsuariosEntity usuarios) {
        this.usuarios = usuarios;
    }


}
