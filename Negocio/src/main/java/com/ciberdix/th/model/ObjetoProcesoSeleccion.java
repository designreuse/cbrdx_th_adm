package com.ciberdix.th.model;

import java.util.List;

/**
 * Created by Danny on 12/06/2017.
 */
public class ObjetoProcesoSeleccion {

    private Integer idTerceroPublicacion;
    private Long idTercero;
    private String nombreCompleto;
    private List<ListaProcesoSeleccion> pasos;

    public ObjetoProcesoSeleccion(Integer idTerceroPublicacion, Long idTercero, String nombreCompleto, List<ListaProcesoSeleccion> pasos) {
        this.idTerceroPublicacion = idTerceroPublicacion;
        this.idTercero = idTercero;
        this.nombreCompleto = nombreCompleto;
        this.pasos = pasos;
    }

    public Integer getIdTerceroPublicacion() {
        return idTerceroPublicacion;
    }

    public void setIdTerceroPublicacion(Integer idTerceroPublicacion) {
        this.idTerceroPublicacion = idTerceroPublicacion;
    }

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public List<ListaProcesoSeleccion> getPasos() {
        return pasos;
    }

    public void setPasos(List<ListaProcesoSeleccion> pasos) {
        this.pasos = pasos;
    }
}
