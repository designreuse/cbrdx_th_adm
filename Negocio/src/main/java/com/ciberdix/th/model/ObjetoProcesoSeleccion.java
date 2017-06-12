package com.ciberdix.th.model;

/**
 * Created by Danny on 12/06/2017.
 */
public class ObjetoProcesoSeleccion {

    private Long idTercero;
    private String NombreCompleto;
    private ListaProcesoSeleccion list;

    public Long getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Long idTercero) {
        this.idTercero = idTercero;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public ListaProcesoSeleccion getList() {
        return list;
    }

    public void setList(ListaProcesoSeleccion list) {
        this.list = list;
    }
}
