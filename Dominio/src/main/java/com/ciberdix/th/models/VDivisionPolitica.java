package com.ciberdix.th.models;

import javax.persistence.*;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
@Table(name = "V_DivisionPolitica", schema = "crz_th", catalog = "CREZCAMOS")
public class VDivisionPolitica {
    private Integer value;
    private String label;

    @Id
    @Column(name = "Value")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Basic
    @Column(name = "Label")
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

        VDivisionPolitica that = (VDivisionPolitica) o;

        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }
}