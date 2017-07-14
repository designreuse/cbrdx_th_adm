package com.ciberdix.th.model;

/**
 * Created by Danny on 14/07/2017.
 */
public class GenericObject {

    private Integer idValue;
    private String value;

    public GenericObject() {
    }

    public GenericObject(Integer idValue, String value) {
        this.idValue = idValue;
        this.value = value;
    }

    public Integer getId() {
        return idValue;
    }

    public void setId(Integer idValue) {
        this.idValue = idValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
