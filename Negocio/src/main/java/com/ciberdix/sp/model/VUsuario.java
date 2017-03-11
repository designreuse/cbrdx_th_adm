package com.ciberdix.sp.model;

public class VUsuario {
    private Integer idUsuario;
    private String usuario;
    private Boolean indHab;
    private String documento;
    private String nombre;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Boolean getIndHab() {
        return indHab;
    }

    public void setIndHab(Boolean indHab) {
        this.indHab = indHab;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
