package oasis.express.entity;

import java.util.Date;

/**
 * Created by bl05381 on 2016-11-23.
 */
public class ScanArrVo extends AbstractVO {

    private static final long serialVersionUID = -1L;

    private Double checkFee;

    private Boolean isSign;

    private Date signDate;

    private String signSiteName;

    private String signMan;

    private Double maxWeight;

    private Long preOrNextStationTypeId;

    private String preOrNextStationType;

    private String scanSiteType;

    private String billCode;

    private String scanGuid;

    private String listingCode;

    private String subBillCode;

    private String transfereBillCode;

    private String ownerBagNo;

    private Long scanTypeId;

    private String scanTypeName;

    private Long preOrNextStationId;

    private String preOrNextStation;

    private Long scanManId;

    private String scanManCode;

    private String scanMan;

    private Long scanSiteId;

    private String scanSite;

    private Long scanSiteTypeId;

    private Date scanDate;

    private Date registerDate;

    private Long dispatchOrSendManId;

    private String dispatchOrSendMan;

    private Long customerId;

    private String customerName;

    private Long sendSiteId;

    private String sendSite;

    private String middleTransferCenter;

    private Long piece = 1L;

    private Double weight;

    private String goodsType;

    private String fastType;

    private String orderClass;

    private Double transferOrDispatchFee;

    private Double netManageFee;

    private Double otherFee;

    private Boolean isCheckingId = false;

    private Boolean isBalanceId = false;

    private Boolean isReturnBillId = false;

    private Boolean isElectronId = false;

    private Boolean isNoInputBillId = false;

    private Boolean isReturnWriteId = false;

    // 是否是中心作的扫描,对应k8的blBalanceId。
    private Boolean isCenterRecord = false;

    private Boolean isWithdraw = false;

    private Boolean isRepeated = false;

    private Long destinationId;

    private String destination;

    private Long dispatchSiteId;

    private String dispatchSite;

    private Long modifySiteId;

    private String modifySite;

    private Double otherFee1;

    private Double otherFee2;

    private Double otherFee3;

    private String dataSource;

    private Date adjustScanDate;

    private Double length;

    private Double width;

    private Double height;

    private Double cubic;

    private Double volumetricWeight;

    private String productsCode; //复合产品编码

    private Boolean isVolumeScale = false;

    private Date vipSignEndTime;//VIP件最晚签收时间

    private String scanDispatchType;//派件类型

    private String businessType;//业务类型

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getCubic() {
        return cubic;
    }

    public void setCubic(Double cubic) {
        this.cubic = cubic;
    }

    public Double getVolumetricWeight() {
        return volumetricWeight;
    }

    public void setVolumetricWeight(Double volumetricWeight) {
        this.volumetricWeight = volumetricWeight;
    }

    public Date getAdjustScanDate() {
        return adjustScanDate;
    }

    public void setAdjustScanDate(Date adjustScanDate) {
        this.adjustScanDate = adjustScanDate;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getScanGuid() {
        return scanGuid;
    }

    public void setScanGuid(String scanGuid) {
        this.scanGuid = scanGuid;
    }

    public String getListingCode() {
        return listingCode;
    }

    public void setListingCode(String listingCode) {
        this.listingCode = listingCode;
    }

    public String getSubBillCode() {
        return subBillCode;
    }

    public void setSubBillCode(String subBillCode) {
        this.subBillCode = subBillCode;
    }

    public String getTransfereBillCode() {
        return transfereBillCode;
    }

    public void setTransfereBillCode(String transfereBillCode) {
        this.transfereBillCode = transfereBillCode;
    }

    public String getOwnerBagNo() {
        return ownerBagNo;
    }

    public void setOwnerBagNo(String ownerBagNo) {
        this.ownerBagNo = ownerBagNo;
    }

    public Long getScanTypeId() {
        return scanTypeId;
    }

    public void setScanTypeId(Long scanTypeId) {
        this.scanTypeId = scanTypeId;
    }

    public String getScanTypeName() {
        return scanTypeName;
    }

    public void setScanTypeName(String scanTypeName) {
        this.scanTypeName = scanTypeName;
    }

    public Long getPreOrNextStationId() {
        return preOrNextStationId;
    }

    public void setPreOrNextStationId(Long preOrNextStationId) {
        this.preOrNextStationId = preOrNextStationId;
    }

    public String getPreOrNextStation() {
        return preOrNextStation;
    }

    public void setPreOrNextStation(String preOrNextStation) {
        this.preOrNextStation = preOrNextStation;
    }

    public Long getScanManId() {
        return scanManId;
    }

    public void setScanManId(Long scanManId) {
        this.scanManId = scanManId;
    }

    public String getScanManCode() {
        return scanManCode;
    }

    public void setScanManCode(String scanManCode) {
        this.scanManCode = scanManCode;
    }

    public String getScanMan() {
        return scanMan;
    }

    public void setScanMan(String scanMan) {
        this.scanMan = scanMan;
    }

    public Long getScanSiteId() {
        return scanSiteId;
    }

    public void setScanSiteId(Long scanSiteId) {
        this.scanSiteId = scanSiteId;
    }

    public String getScanSite() {
        return scanSite;
    }

    public void setScanSite(String scanSite) {
        this.scanSite = scanSite;
    }

    public Long getScanSiteTypeId() {
        return scanSiteTypeId;
    }

    public void setScanSiteTypeId(Long scanSiteTypeId) {
        this.scanSiteTypeId = scanSiteTypeId;
    }

    public Date getScanDate() {
        return scanDate;
    }

    public void setScanDate(Date scanDate) {
        this.scanDate = scanDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Long getDispatchOrSendManId() {
        return dispatchOrSendManId;
    }

    public void setDispatchOrSendManId(Long dispatchOrSendManId) {
        this.dispatchOrSendManId = dispatchOrSendManId;
    }

    public String getDispatchOrSendMan() {
        return dispatchOrSendMan;
    }

    public void setDispatchOrSendMan(String dispatchOrSendMan) {
        this.dispatchOrSendMan = dispatchOrSendMan;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getSendSiteId() {
        return sendSiteId;
    }

    public void setSendSiteId(Long sendSiteId) {
        this.sendSiteId = sendSiteId;
    }

    public String getSendSite() {
        return sendSite;
    }

    public void setSendSite(String sendSite) {
        this.sendSite = sendSite;
    }

    public String getMiddleTransferCenter() {
        return middleTransferCenter;
    }

    public void setMiddleTransferCenter(String middleTransferCenter) {
        this.middleTransferCenter = middleTransferCenter;
    }

    public Long getPiece() {
        return piece;
    }

    public void setPiece(Long piece) {
        this.piece = piece;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getFastType() {
        return fastType;
    }

    public void setFastType(String fastType) {
        this.fastType = fastType;
    }

    public String getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass;
    }

    public Double getTransferOrDispatchFee() {
        return transferOrDispatchFee;
    }

    public void setTransferOrDispatchFee(Double transferOrDispatchFee) {
        this.transferOrDispatchFee = transferOrDispatchFee;
    }

    public Double getNetManageFee() {
        return netManageFee;
    }

    public void setNetManageFee(Double netManageFee) {
        this.netManageFee = netManageFee;
    }

    public Double getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Double otherFee) {
        this.otherFee = otherFee;
    }

    public Boolean getIsCheckingId() {
        return isCheckingId;
    }

    public void setIsCheckingId(Boolean isCheckingId) {
        this.isCheckingId = isCheckingId;
    }

    public Boolean getIsBalanceId() {
        return isBalanceId;
    }

    public void setIsBalanceId(Boolean isBalanceId) {
        this.isBalanceId = isBalanceId;
    }

    public Boolean getIsReturnBillId() {
        return isReturnBillId;
    }

    public void setIsReturnBillId(Boolean isReturnBillId) {
        this.isReturnBillId = isReturnBillId;
    }

    public Boolean getIsElectronId() {
        return isElectronId;
    }

    public void setIsElectronId(Boolean isElectronId) {
        this.isElectronId = isElectronId;
    }

    public Boolean getIsNoInputBillId() {
        return isNoInputBillId;
    }

    public void setIsNoInputBillId(Boolean isNoInputBillId) {
        this.isNoInputBillId = isNoInputBillId;
    }

    public Boolean getIsReturnWriteId() {
        return isReturnWriteId;
    }

    public void setIsReturnWriteId(Boolean isReturnWriteId) {
        this.isReturnWriteId = isReturnWriteId;
    }

    public Boolean getIsCenterRecord() {
        return isCenterRecord;
    }

    public void setIsCenterRecord(Boolean isCenterRecord) {
        this.isCenterRecord = isCenterRecord;
    }

    public Boolean getIsWithdraw() {
        return isWithdraw;
    }

    public void setIsWithdraw(Boolean isWithdraw) {
        this.isWithdraw = isWithdraw;
    }

    public Boolean getIsRepeated() {
        return isRepeated;
    }

    public void setIsRepeated(Boolean isRepeated) {
        this.isRepeated = isRepeated;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getDispatchSiteId() {
        return dispatchSiteId;
    }

    public void setDispatchSiteId(Long dispatchSiteId) {
        this.dispatchSiteId = dispatchSiteId;
    }

    public String getDispatchSite() {
        return dispatchSite;
    }

    public void setDispatchSite(String dispatchSite) {
        this.dispatchSite = dispatchSite;
    }

    public Long getModifySiteId() {
        return modifySiteId;
    }

    public void setModifySiteId(Long modifySiteId) {
        this.modifySiteId = modifySiteId;
    }

    public String getModifySite() {
        return modifySite;
    }

    public void setModifySite(String modifySite) {
        this.modifySite = modifySite;
    }

    public Double getOtherFee1() {
        return otherFee1;
    }

    public void setOtherFee1(Double otherFee1) {
        this.otherFee1 = otherFee1;
    }

    public Double getOtherFee2() {
        return otherFee2;
    }

    public void setOtherFee2(Double otherFee2) {
        this.otherFee2 = otherFee2;
    }

    public Double getOtherFee3() {
        return otherFee3;
    }

    public void setOtherFee3(Double otherFee3) {
        this.otherFee3 = otherFee3;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getProductsCode() {
        return productsCode;
    }

    public void setProductsCode(String productsCode) {
        this.productsCode = productsCode;
    }

    public Boolean getIsVolumeScale() {
        return isVolumeScale;
    }

    public void setIsVolumeScale(Boolean isVolumeScale) {
        this.isVolumeScale = isVolumeScale;
    }

    public Date getVipSignEndTime() {
        return vipSignEndTime;
    }

    public void setVipSignEndTime(Date vipSignEndTime) {
        this.vipSignEndTime = vipSignEndTime;
    }

    public String getScanDispatchType() {
        return scanDispatchType;
    }

    public void setScanDispatchType(String scanDispatchType) {
        this.scanDispatchType = scanDispatchType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Long getPreOrNextStationTypeId() {
        return preOrNextStationTypeId;
    }

    public void setPreOrNextStationTypeId(Long preOrNextStationTypeId) {
        this.preOrNextStationTypeId = preOrNextStationTypeId;
    }

    public String getPreOrNextStationType() {
        return preOrNextStationType;
    }

    public void setPreOrNextStationType(String preOrNextStationType) {
        this.preOrNextStationType = preOrNextStationType;
    }

    public String getScanSiteType() {
        return scanSiteType;
    }

    public void setScanSiteType(String scanSiteType) {
        this.scanSiteType = scanSiteType;
    }

    public Double getCheckFee() {
        return checkFee;
    }

    public void setCheckFee(Double checkFee) {
        this.checkFee = checkFee;
    }

    public Boolean getIsSign() {
        return isSign;
    }

    public void setIsSign(Boolean isSign) {
        this.isSign = isSign;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getSignSiteName() {
        return signSiteName;
    }

    public void setSignSiteName(String signSiteName) {
        this.signSiteName = signSiteName;
    }

    public String getSignMan() {
        return signMan;
    }

    public void setSignMan(String signMan) {
        this.signMan = signMan;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
