package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
public class AclEntry {
    private Long id;
    private Long aclObjectIdentity;
    private Integer aceOrder;
    private Long sid;
    private Integer mask;
    private Byte granting;
    private Byte auditSuccess;
    private Byte auditFailure;

    @Id
    @Column(name = "Id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AclObjectIdentity")
    public Long getAclObjectIdentity() {
        return aclObjectIdentity;
    }

    public void setAclObjectIdentity(Long aclObjectIdentity) {
        this.aclObjectIdentity = aclObjectIdentity;
    }

    @Basic
    @Column(name = "AceOrder")
    public Integer getAceOrder() {
        return aceOrder;
    }

    public void setAceOrder(Integer aceOrder) {
        this.aceOrder = aceOrder;
    }

    @Basic
    @Column(name = "Sid")
    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "Mask")
    public Integer getMask() {
        return mask;
    }

    public void setMask(Integer mask) {
        this.mask = mask;
    }

    @Basic
    @Column(name = "Granting")
    public Byte getGranting() {
        return granting;
    }

    public void setGranting(Byte granting) {
        this.granting = granting;
    }

    @Basic
    @Column(name = "AuditSuccess")
    public Byte getAuditSuccess() {
        return auditSuccess;
    }

    public void setAuditSuccess(Byte auditSuccess) {
        this.auditSuccess = auditSuccess;
    }

    @Basic
    @Column(name = "AuditFailure")
    public Byte getAuditFailure() {
        return auditFailure;
    }

    public void setAuditFailure(Byte auditFailure) {
        this.auditFailure = auditFailure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AclEntry aclEntry = (AclEntry) o;

        if (id != null ? !id.equals(aclEntry.id) : aclEntry.id != null) return false;
        if (aclObjectIdentity != null ? !aclObjectIdentity.equals(aclEntry.aclObjectIdentity) : aclEntry.aclObjectIdentity != null)
            return false;
        if (aceOrder != null ? !aceOrder.equals(aclEntry.aceOrder) : aclEntry.aceOrder != null) return false;
        if (sid != null ? !sid.equals(aclEntry.sid) : aclEntry.sid != null) return false;
        if (mask != null ? !mask.equals(aclEntry.mask) : aclEntry.mask != null) return false;
        if (granting != null ? !granting.equals(aclEntry.granting) : aclEntry.granting != null) return false;
        if (auditSuccess != null ? !auditSuccess.equals(aclEntry.auditSuccess) : aclEntry.auditSuccess != null)
            return false;
        if (auditFailure != null ? !auditFailure.equals(aclEntry.auditFailure) : aclEntry.auditFailure != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (aclObjectIdentity != null ? aclObjectIdentity.hashCode() : 0);
        result = 31 * result + (aceOrder != null ? aceOrder.hashCode() : 0);
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + (mask != null ? mask.hashCode() : 0);
        result = 31 * result + (granting != null ? granting.hashCode() : 0);
        result = 31 * result + (auditSuccess != null ? auditSuccess.hashCode() : 0);
        result = 31 * result + (auditFailure != null ? auditFailure.hashCode() : 0);
        return result;
    }
}
