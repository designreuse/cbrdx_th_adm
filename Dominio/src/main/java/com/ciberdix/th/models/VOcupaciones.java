package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by Danny on 26/04/2017.
 */
@Entity
@Table(name = "V_Ocupaciones", schema = "dbo", catalog = "CREZCAMOS")
public class VOcupaciones {
    private int value;
    private String label;

    public void setValue(Integer value) {
        this.value = value;
    }

    @Basic
    @Id
    @Column(name = "Value", nullable = false)
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Basic
    @Column(name = "Label", nullable = false, length = 352)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VOcupaciones that = (VOcupaciones) o;

        if (value != that.value) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }
}
