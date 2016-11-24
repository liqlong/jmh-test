package oasis.express.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public abstract class AbstractVO implements Serializable {

    private Long id;

    private Set<String> operations;

    private Date createdTime;

    private Date updatedTime;

    private Long domainId;

    private String creatorName;

    private String updatorName;

    private long lockVersion;

    private String domainName;

    private OperateType operate;

    private Long creatorId;

    private Long updatorId;

    private Long updateSiteId;

    private String updateSiteName;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<String> getOperations() {
        return operations;
    }

    public void setOperations(Set<String> operations) {
        this.operations = operations;
    }

    protected String getTrimString(String inputData) {
        if (null != inputData) {
            inputData = inputData.trim();
        }
        return inputData;
    }

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

    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
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

    // public long getLockVersion() {
    // return lockVersion;
    // }
    //
    // public void setLockVersion(long lockVersion) {
    // this.lockVersion = lockVersion;
    // }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public OperateType getOperate() {
        return operate;
    }

    public void setOperate(OperateType operate) {
        this.operate = operate;
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

    public long getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(long lockVersion) {
        this.lockVersion = lockVersion;
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

