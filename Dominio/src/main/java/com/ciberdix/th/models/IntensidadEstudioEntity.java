package com.ciberdix.th.models;

/**
 * Created by ingjj on 8/03/2017.
 */
public class IntensidadEstudioEntity {
    private String Nombre;
    private Integer id;

    public IntensidadEstudioEntity(String nombre, Integer id) {
        Nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
