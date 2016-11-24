package oasis.express.entity;

import org.apache.commons.lang.StringUtils;

import oasis.express.helper.Distributeable;

public class BillInfo extends AbstractBO implements Distributeable {
    private static final long serialVersionUID = -1L;

    private Long id;

    private String billCode;
    private String type;
    private String itemName;
    private Double insurance;
    private Double insureValue;
    private String sendProvinceCode;
    private String sendProvinceName;
    private String sendCityCode;
    private String sendCityName;
    private String sendCountyCode;
    private String sendCountyName;
    private String sendPostCode;
    private String sendAddress;
    private String sendMan;
    private String sendManPhone;
    private String sendManMobile;
    private String acceptProvinceCode;
    private String acceptProvinceName;
    private String acceptCityCode;
    private String acceptCityName;
    private String acceptCountyCode;
    private String acceptCountyName;
    private String acceptPostCode;
    private String acceptAddress;
    private String acceptMan;
    private String acceptManPhone;
    private String acceptManMobile;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Double getInsureValue() {
        return insureValue;
    }

    public void setInsureValue(Double insureValue) {
        this.insureValue = insureValue;
    }

    public String getSendProvinceCode() {
        return sendProvinceCode;
    }

    public void setSendProvinceCode(String sendProvinceCode) {
        this.sendProvinceCode = sendProvinceCode;
    }

    public String getSendProvinceName() {
        return sendProvinceName;
    }

    public void setSendProvinceName(String sendProvinceName) {
        this.sendProvinceName = sendProvinceName;
    }

    public String getSendCityCode() {
        return sendCityCode;
    }

    public void setSendCityCode(String sendCityCode) {
        this.sendCityCode = sendCityCode;
    }

    public String getSendCityName() {
        return sendCityName;
    }

    public void setSendCityName(String sendCityName) {
        this.sendCityName = sendCityName;
    }

    public String getSendCountyCode() {
        return sendCountyCode;
    }

    public void setSendCountyCode(String sendCountyCode) {
        this.sendCountyCode = sendCountyCode;
    }

    public String getSendCountyName() {
        return sendCountyName;
    }

    public void setSendCountyName(String sendCountyName) {
        this.sendCountyName = sendCountyName;
    }

    public String getSendPostCode() {
        return sendPostCode;
    }

    public void setSendPostCode(String sendPostCode) {
        this.sendPostCode = sendPostCode;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public String getSendMan() {
        return sendMan;
    }

    public void setSendMan(String sendMan) {
        this.sendMan = sendMan;
    }

    public String getSendManPhone() {
        return sendManPhone;
    }

    public void setSendManPhone(String sendManPhone) {
        this.sendManPhone = sendManPhone;
    }

    public String getSendManMobile() {
        return sendManMobile;
    }

    public void setSendManMobile(String sendManMobile) {
        this.sendManMobile = sendManMobile;
    }

    public String getAcceptProvinceCode() {
        return acceptProvinceCode;
    }

    public void setAcceptProvinceCode(String acceptProvinceCode) {
        this.acceptProvinceCode = acceptProvinceCode;
    }

    public String getAcceptProvinceName() {
        return acceptProvinceName;
    }

    public void setAcceptProvinceName(String acceptProvinceName) {
        this.acceptProvinceName = acceptProvinceName;
    }

    public String getAcceptCityCode() {
        return acceptCityCode;
    }

    public void setAcceptCityCode(String acceptCityCode) {
        this.acceptCityCode = acceptCityCode;
    }

    public String getAcceptCityName() {
        return acceptCityName;
    }

    public void setAcceptCityName(String acceptCityName) {
        this.acceptCityName = acceptCityName;
    }

    public String getAcceptCountyCode() {
        return acceptCountyCode;
    }

    public void setAcceptCountyCode(String acceptCountyCode) {
        this.acceptCountyCode = acceptCountyCode;
    }

    public String getAcceptCountyName() {
        return acceptCountyName;
    }

    public void setAcceptCountyName(String acceptCountyName) {
        this.acceptCountyName = acceptCountyName;
    }

    public String getAcceptPostCode() {
        return acceptPostCode;
    }

    public void setAcceptPostCode(String acceptPostCode) {
        this.acceptPostCode = acceptPostCode;
    }

    public String getAcceptAddress() {
        return acceptAddress;
    }

    public void setAcceptAddress(String acceptAddress) {
        this.acceptAddress = acceptAddress;
    }

    public String getAcceptMan() {
        return acceptMan;
    }

    public void setAcceptMan(String acceptMan) {
        this.acceptMan = acceptMan;
    }

    public String getAcceptManPhone() {
        return acceptManPhone;
    }

    public void setAcceptManPhone(String acceptManPhone) {
        this.acceptManPhone = acceptManPhone;
    }

    public String getAcceptManMobile() {
        return acceptManMobile;
    }

    public void setAcceptManMobile(String acceptManMobile) {
        this.acceptManMobile = acceptManMobile;
    }

    public String getFullAcceptAddress() {
        return new StringBuilder().append(StringUtils.defaultString(acceptProvinceName))
                .append(StringUtils.defaultString(acceptCityName)).append(StringUtils.defaultString(acceptCountyName))
                .append(StringUtils.defaultString(acceptAddress)).toString();
    }

}
