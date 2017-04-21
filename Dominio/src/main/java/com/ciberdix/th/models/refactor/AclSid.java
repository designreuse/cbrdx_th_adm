package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
public class AclSid {
    private Long id;
    private Byte principal;
    private String sid;

    @Id
    @Column(name = "Id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Principal")
    public Byte getPrincipal() {
        return principal;
    }

    public void setPrincipal(Byte principal) {
        this.principal = principal;
    }

    @Basic
    @Column(name = "Sid")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AclSid aclSid = (AclSid) o;

        if (id != null ? !id.equals(aclSid.id) : aclSid.id != null) return false;
        if (principal != null ? !principal.equals(aclSid.principal) : aclSid.principal != null) return false;
        if (sid != null ? !sid.equals(aclSid.sid) : aclSid.sid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (principal != null ? principal.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        return result;
    }
}
