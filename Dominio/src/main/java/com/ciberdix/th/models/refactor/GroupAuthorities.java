package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
public class GroupAuthorities {
    private Long groupId;
    private String authority;

    @Basic
    @Column(name = "GroupId")
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "Authority")
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupAuthorities that = (GroupAuthorities) o;

        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (authority != null ? !authority.equals(that.authority) : that.authority != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupId != null ? groupId.hashCode() : 0;
        result = 31 * result + (authority != null ? authority.hashCode() : 0);
        return result;
    }
}
