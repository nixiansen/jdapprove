package com.zdd.risk.bean;

/**
 * Created by ZWYnqj on 2018/12/20.
 */
public class TempShuju {
    private String  idcard;
    private String   mobile;
    private String  certificationType;
    private String  certificationItem;
    private String  certificationResult;
    private String   remark;


    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCertificationType() {
        return certificationType;
    }

    public void setCertificationType(String certificationType) {
        this.certificationType = certificationType;
    }

    public String getCertificationItem() {
        return certificationItem;
    }

    public void setCertificationItem(String certificationItem) {
        this.certificationItem = certificationItem;
    }

    public String getCertificationResult() {
        return certificationResult;
    }

    public void setCertificationResult(String certificationResult) {
        this.certificationResult = certificationResult;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "TempShuju{" +
                "idcard='" + idcard + '\'' +
                ", mobile='" + mobile + '\'' +
                ", certificationType='" + certificationType + '\'' +
                ", certificationItem='" + certificationItem + '\'' +
                ", certificationResult='" + certificationResult + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
