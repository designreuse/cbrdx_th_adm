package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
public class Groups {
    private Long id;
    private String groupName;

    @Id
    @Column(name = "Id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "GroupName")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Groups groups = (Groups) o;

        if (id != null ? !id.equals(groups.id) : groups.id != null) return false;
        if (groupName != null ? !groupName.equals(groups.groupName) : groups.groupName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (groupName != null ? groupName.hashCode() : 0);
        return result;
    }
}
