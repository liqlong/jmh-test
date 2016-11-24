package oasis.express.entity;

import java.util.Date;


public class TaoBaoBill extends AbstractBO {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String txLogisticId;// 电子商务物流交易号

    private String tradeNo;// 电子商务业务号

    private String billCode;// 百世快递运单号

    private String orderType;// 订单类型(0-COD 1-普通订单)

    private String serviceType;// 服务类型(1-上门揽收, 2-次日达 4-次晨达 8-当日达b)

    private Double totalServiceFee;// 总服务费[COD]

    private Double buyServiceFee;// 买家服务费[COD]

    private Double codSplitFee;// 物流公司分润[COD]

    private Long flag;

    private Long statusId;

    private String statusCode;

    private String statusName;

    private Long recSiteId;

    private String recSiteName;

    private Long recManId;

    private String recManName;

    private Long recBillManId;

    private String recBillManName;

    private Date recDate;// 揽件时间

    private Date acceptDate;// 接单时间

    private Long dispatchSiteId;

    private String dispatchSiteName;

    private Long dispatchManId;

    private String dispatchManName;

    private Date dispatchDate;

    private Boolean isCancel = false;

    private Date cancelDate;

    private Long cancelDescId;

    private String cancelDescCode;

    private String cancelDescName;

    private Boolean isDispart;

    private String prepareSite;

    private String name;

    private String address;

    private String postCode;

    private String phone;

    private String mobile;

    private String provName;

    private String cityName;

    private String countyName;

    private Date sendStartTime;

    private Date sendEndTime;

    private String itemName;

    private Long piece;

    private Long specialId;

    private String specialName;

    private Double insuranceValue;

    private Boolean isPackageOrNot;

    private String consignee;// 收货人

    private String shippingAddress;// 收货人地址

    private String consigneeZipCode;// 收货人邮编

    private String consigneePhone;// 收货人电话

    private String consigneeMobile;// 收货人手机

    private String consigneeProv;// 收货人所在省

    private String consigneeCity;// 收货人所在市

    private String consigneeCounty;// 收货人所在县/区

    private Long cancelSiteId;

    private String cancelSiteName;

    private Long cancelManId;

    private String cancelManName;

    private Long recGoodsManId;

    private String recGoodsManName;

    private String message;

    private String customerId;

    private String dataSource;// 来源淘宝或其他电子商务平台

    private Double itemWeight;// 商品重量(千克)

    private Double itemVolume;// 商品体积(立方厘米)

    private String orderSpecial;//业务特殊要求

    private String orderFlag;//业务类型

    private String memberType;//会员类型（用于日后1688对账时使用）

    private String customerSource;//客户源，用于区分不同产业线

    private String bagNo;//包裹号

    private String serviceFlag;//后续淘宝业务拓展类型

    private Date storeDeliveryTime;//仓库包裹出库存时间

    private Date promiseSignTime;//承诺妥投时间，售卖商品时给卖家和买家承诺的送达时间

    private Date endSignTime;//最后妥投时间，必需送达的最后时间点

    private String expressScheduleType;//投递表达时延要求(投递时延要求：1-工作日，2-节假日，101-当日达，102-次晨达，103-次日达，104-预约达),售卖商品时买卖家所看到的时效表达，实际履行时效受截单时间影响

    private Double itemsValue;//支付订单总金额

    private Double goodsValue;//订单商品金额

    private String cusSendCode;//寄件码

    private String sendStoreCode;//同一发货人不同仓库编码

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTxLogisticId() {
        return txLogisticId;
    }

    public void setTxLogisticId(String txLogisticId) {
        this.txLogisticId = txLogisticId;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public Long getFlag() {
        return flag;
    }

    public void setFlag(Long flag) {
        this.flag = flag;
    }

    public Long getRecSiteId() {
        return recSiteId;
    }

    public void setRecSiteId(Long recSiteId) {
        this.recSiteId = recSiteId;
    }

    public String getRecSiteName() {
        return recSiteName;
    }

    public void setRecSiteName(String recSiteName) {
        this.recSiteName = recSiteName;
    }

    public Long getRecManId() {
        return recManId;
    }

    public void setRecManId(Long recManId) {
        this.recManId = recManId;
    }

    public String getRecManName() {
        return recManName;
    }

    public void setRecManName(String recManName) {
        this.recManName = recManName;
    }

    public Long getRecBillManId() {
        return recBillManId;
    }

    public void setRecBillManId(Long recBillManId) {
        this.recBillManId = recBillManId;
    }

    public String getRecBillManName() {
        return recBillManName;
    }

    public void setRecBillManName(String recBillManName) {
        this.recBillManName = recBillManName;
    }

    public Date getRecDate() {
        return recDate;
    }

    public void setRecDate(Date recDate) {
        this.recDate = recDate;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public Long getDispatchSiteId() {
        return dispatchSiteId;
    }

    public void setDispatchSiteId(Long dispatchSiteId) {
        this.dispatchSiteId = dispatchSiteId;
    }

    public String getDispatchSiteName() {
        return dispatchSiteName;
    }

    public void setDispatchSiteName(String dispatchSiteName) {
        this.dispatchSiteName = dispatchSiteName;
    }

    public Long getDispatchManId() {
        return dispatchManId;
    }

    public void setDispatchManId(Long dispatchManId) {
        this.dispatchManId = dispatchManId;
    }

    public String getDispatchManName() {
        return dispatchManName;
    }

    public void setDispatchManName(String dispatchManName) {
        this.dispatchManName = dispatchManName;
    }

    public Date getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public Boolean getIsCancel() {
        return isCancel;
    }

    public void setIsCancel(Boolean isCancel) {
        this.isCancel = isCancel;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Long getCancelDescId() {
        return cancelDescId;
    }

    public void setCancelDescId(Long cancelDescId) {
        this.cancelDescId = cancelDescId;
    }

    public String getCancelDescName() {
        return cancelDescName;
    }

    public void setCancelDescName(String cancelDescName) {
        this.cancelDescName = cancelDescName;
    }

    public Boolean getIsDispart() {
        return isDispart;
    }

    public void setIsDispart(Boolean isDispart) {
        this.isDispart = isDispart;
    }

    public String getPrepareSite() {
        return prepareSite;
    }

    public void setPrepareSite(String prepareSite) {
        this.prepareSite = prepareSite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public Date getSendStartTime() {
        return sendStartTime;
    }

    public void setSendStartTime(Date sendStartTime) {
        this.sendStartTime = sendStartTime;
    }

    public Date getSendEndTime() {
        return sendEndTime;
    }

    public void setSendEndTime(Date sendEndTime) {
        this.sendEndTime = sendEndTime;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getPiece() {
        return piece;
    }

    public void setPiece(Long piece) {
        this.piece = piece;
    }

    public Long getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Long specialId) {
        this.specialId = specialId;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName;
    }

    public Double getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(Double insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public Boolean getIsPackageOrNot() {
        return isPackageOrNot;
    }

    public void setIsPackageOrNot(Boolean isPackageOrNot) {
        this.isPackageOrNot = isPackageOrNot;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getConsigneeZipCode() {
        return consigneeZipCode;
    }

    public void setConsigneeZipCode(String consigneeZipCode) {
        this.consigneeZipCode = consigneeZipCode;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneeMobile() {
        return consigneeMobile;
    }

    public void setConsigneeMobile(String consigneeMobile) {
        this.consigneeMobile = consigneeMobile;
    }

    public String getConsigneeProv() {
        return consigneeProv;
    }

    public void setConsigneeProv(String consigneeProv) {
        this.consigneeProv = consigneeProv;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getConsigneeCounty() {
        return consigneeCounty;
    }

    public void setConsigneeCounty(String consigneeCounty) {
        this.consigneeCounty = consigneeCounty;
    }

    public Long getCancelSiteId() {
        return cancelSiteId;
    }

    public void setCancelSiteId(Long cancelSiteId) {
        this.cancelSiteId = cancelSiteId;
    }

    public String getCancelSiteName() {
        return cancelSiteName;
    }

    public void setCancelSiteName(String cancelSiteName) {
        this.cancelSiteName = cancelSiteName;
    }

    public Long getCancelManId() {
        return cancelManId;
    }

    public void setCancelManId(Long cancelManId) {
        this.cancelManId = cancelManId;
    }

    public String getCancelManName() {
        return cancelManName;
    }

    public void setCancelManName(String cancelManName) {
        this.cancelManName = cancelManName;
    }

    public Long getRecGoodsManId() {
        return recGoodsManId;
    }

    public void setRecGoodsManId(Long recGoodsManId) {
        this.recGoodsManId = recGoodsManId;
    }

    public String getRecGoodsManName() {
        return recGoodsManName;
    }

    public void setRecGoodsManName(String recGoodsManName) {
        this.recGoodsManName = recGoodsManName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }


    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getCancelDescCode() {
        return cancelDescCode;
    }

    public void setCancelDescCode(String cancelDescCode) {
        this.cancelDescCode = cancelDescCode;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Double getTotalServiceFee() {
        return totalServiceFee;
    }

    public void setTotalServiceFee(Double totalServiceFee) {
        this.totalServiceFee = totalServiceFee;
    }

    public Double getBuyServiceFee() {
        return buyServiceFee;
    }

    public void setBuyServiceFee(Double buyServiceFee) {
        this.buyServiceFee = buyServiceFee;
    }

    public Double getCodSplitFee() {
        return codSplitFee;
    }

    public void setCodSplitFee(Double codSplitFee) {
        this.codSplitFee = codSplitFee;
    }


    public Double getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Double itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Double getItemVolume() {
        return itemVolume;
    }

    public void setItemVolume(Double itemVolume) {
        this.itemVolume = itemVolume;
    }

    public String getOrderSpecial() {
        return orderSpecial;
    }

    public void setOrderSpecial(String orderSpecial) {
        this.orderSpecial = orderSpecial;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getCustomerSource() {
        return customerSource;
    }

    public void setCustomerSource(String customerSource) {
        this.customerSource = customerSource;
    }

    public String getBagNo() {
        return bagNo;
    }

    public void setBagNo(String bagNo) {
        this.bagNo = bagNo;
    }

    public String getServiceFlag() {
        return serviceFlag;
    }

    public void setServiceFlag(String serviceFlag) {
        this.serviceFlag = serviceFlag;
    }

    public Date getStoreDeliveryTime() {
        return storeDeliveryTime;
    }

    public void setStoreDeliveryTime(Date storeDeliveryTime) {
        this.storeDeliveryTime = storeDeliveryTime;
    }

    public Date getPromiseSignTime() {
        return promiseSignTime;
    }

    public void setPromiseSignTime(Date promiseSignTime) {
        this.promiseSignTime = promiseSignTime;
    }

    public Date getEndSignTime() {
        return endSignTime;
    }

    public void setEndSignTime(Date endSignTime) {
        this.endSignTime = endSignTime;
    }

    public String getExpressScheduleType() {
        return expressScheduleType;
    }

    public void setExpressScheduleType(String expressScheduleType) {
        this.expressScheduleType = expressScheduleType;
    }

    public Double getItemsValue() {
        return itemsValue;
    }

    public void setItemsValue(Double itemsValue) {
        this.itemsValue = itemsValue;
    }

    public Double getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(Double goodsValue) {
        this.goodsValue = goodsValue;
    }

    public String getCusSendCode() {
        return cusSendCode;
    }

    public void setCusSendCode(String cusSendCode) {
        this.cusSendCode = cusSendCode;
    }

    public String getSendStoreCode() {
        return sendStoreCode;
    }

    public void setSendStoreCode(String sendStoreCode) {
        this.sendStoreCode = sendStoreCode;
    }
}