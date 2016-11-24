package oasis.express.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.HashCodeBuilder;

import se.spagettikod.optimist.Version;


public abstract class AbstractBO implements Serializable {

    // @Column(name = "DOMAIN_ID")
    // @ManyToOne(fetch = FetchType.LAZY)
    // private SysDomain domain;

    private Long domainId;

    private Date createdTime;

    private Date updatedTime;

    private Long creatorId;

    private Long updatorId;

    @Version("LOCK_VERSION")
    private Long lockVersion;

    private String creatorName;

    private String updatorName;

    private String domainName;

    private Long updateSiteId;

    private String updateSiteName;

    private OperateType operate;

    /**
     * 备注
     */
    private String reMark;

    private String udf1;

    private String udf2;

    private String udf3;

    private String udf4;

    private String udf5;

    private String udf6;

    private String udf7;

    private String udf8;

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public OperateType getOperate() {
        return operate;
    }

    public void setOperate(OperateType operate) {
        this.operate = operate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        // 考虑到lazy load的proxy的问题，这里改用为instance of了，
        // 因为通过CGLib或者Javassit动态生成的proxy对象中的equals方法会去调用super.equals方法
        // 所以这里的this一定是本尊，而作为参数obj可能是本尊也可能是proxy代理
        // if (getClass() != obj.getClass())
        // return false;
        if (!this.getClass().isInstance(obj)) {
            return false;
        }

        final AbstractBO other = (AbstractBO) obj;

        Long id1 = getId();
        Long id2 = other.getId();
        if (id1 == null) {
            return false;
        }
        else {
            return id1.equals(id2);
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getId()).toHashCode();
    }

    public String toString() {
        return this.getClass().getName() + "[id=" + getId() + "]";
    }

    public abstract Long getId();

    public abstract void setId(Long id);

    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    public Long getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(Long lockVersion) {
        this.lockVersion = lockVersion;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Long getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(Long updatorId) {
        this.updatorId = updatorId;
    }

    public String getReMark() {
        return reMark;
    }

    public void setReMark(String reMark) {
        this.reMark = reMark;
    }

    public String getUdf1() {
        return udf1;
    }

    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }

    public String getUdf2() {
        return udf2;
    }

    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }

    public String getUdf3() {
        return udf3;
    }

    public void setUdf3(String udf3) {
        this.udf3 = udf3;
    }

    public String getUdf4() {
        return udf4;
    }

    public void setUdf4(String udf4) {
        this.udf4 = udf4;
    }

    public String getUdf5() {
        return udf5;
    }

    public void setUdf5(String udf5) {
        this.udf5 = udf5;
    }

    public String getUdf6() {
        return udf6;
    }

    public void setUdf6(String udf6) {
        this.udf6 = udf6;
    }

    public String getUdf7() {
        return udf7;
    }

    public void setUdf7(String udf7) {
        this.udf7 = udf7;
    }

    public String getUdf8() {
        return udf8;
    }

    public void setUdf8(String udf8) {
        this.udf8 = udf8;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public Long getUpdateSiteId() {
        return updateSiteId;
    }

    public void setUpdateSiteId(Long updateSiteId) {
        this.updateSiteId = updateSiteId;
    }

    public String getUpdateSiteName() {
        return updateSiteName;
    }

    public void setUpdateSiteName(String updateSiteName) {
        this.updateSiteName = updateSiteName;
    }

}