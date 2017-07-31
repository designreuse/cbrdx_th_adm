package com.ciberdix.th.model;

public class TallaGeneroDotacion {

    private String talla;
    private Boolean indicadorHombre;
    private Boolean indicadorMujer;
    private Integer total;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Boolean getIndicadorHombre() {
        return indicadorHombre;
    }

    public void setIndicadorHombre(Boolean indicadorHombre) {
        this.indicadorHombre = indicadorHombre;
    }

    public Boolean getIndicadorMujer() {
        return indicadorMujer;
    }

    public void setIndicadorMujer(Boolean indicadorMujer) {
        this.indicadorMujer = indicadorMujer;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
