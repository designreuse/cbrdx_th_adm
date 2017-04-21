package com.ciberdix.th.models.refactor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by felip on 21/04/2017.
 */
@Entity
public class AclObjectIdentity {
    private Long id;
    private Long objectIdClass;
    private Long objectIdIdentity;
    private Long parentObject;
    private Long ownerSid;
    private Byte entriesInheriting;
    private Integer column7;

    @Id
    @Column(name = "Id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ObjectIdClass")
    public Long getObjectIdClass() {
        return objectIdClass;
    }

    public void setObjectIdClass(Long objectIdClass) {
        this.objectIdClass = objectIdClass;
    }

    @Basic
    @Column(name = "ObjectIdIdentity")
    public Long getObjectIdIdentity() {
        return objectIdIdentity;
    }

    public void setObjectIdIdentity(Long objectIdIdentity) {
        this.objectIdIdentity = objectIdIdentity;
    }

    @Basic
    @Column(name = "ParentObject")
    public Long getParentObject() {
        return parentObject;
    }

    public void setParentObject(Long parentObject) {
        this.parentObject = parentObject;
    }

    @Basic
    @Column(name = "OwnerSid")
    public Long getOwnerSid() {
        return ownerSid;
    }

    public void setOwnerSid(Long ownerSid) {
        this.ownerSid = ownerSid;
    }

    @Basic
    @Column(name = "EntriesInheriting")
    public Byte getEntriesInheriting() {
        return entriesInheriting;
    }

    public void setEntriesInheriting(Byte entriesInheriting) {
        this.entriesInheriting = entriesInheriting;
    }

    @Basic
    @Column(name = "column_7")
    public Integer getColumn7() {
        return column7;
    }

    public void setColumn7(Integer column7) {
        this.column7 = column7;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AclObjectIdentity that = (AclObjectIdentity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (objectIdClass != null ? !objectIdClass.equals(that.objectIdClass) : that.objectIdClass != null)
            return false;
        if (objectIdIdentity != null ? !objectIdIdentity.equals(that.objectIdIdentity) : that.objectIdIdentity != null)
            return false;
        if (parentObject != null ? !parentObject.equals(that.parentObject) : that.parentObject != null) return false;
        if (ownerSid != null ? !ownerSid.equals(that.ownerSid) : that.ownerSid != null) return false;
        if (entriesInheriting != null ? !entriesInheriting.equals(that.entriesInheriting) : that.entriesInheriting != null)
            return false;
        if (column7 != null ? !column7.equals(that.column7) : that.column7 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (objectIdClass != null ? objectIdClass.hashCode() : 0);
        result = 31 * result + (objectIdIdentity != null ? objectIdIdentity.hashCode() : 0);
        result = 31 * result + (parentObject != null ? parentObject.hashCode() : 0);
        result = 31 * result + (ownerSid != null ? ownerSid.hashCode() : 0);
        result = 31 * result + (entriesInheriting != null ? entriesInheriting.hashCode() : 0);
        result = 31 * result + (column7 != null ? column7.hashCode() : 0);
        return result;
    }
}
