package com.zdd.risk.bean;

import java.util.Date;

public class Certification {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.id
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.userId
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.idCard
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private String idcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.mobile
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.certificationType
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private String certificationtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.certificationItem
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private String certificationitem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.certificationLimit
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private Date certificationlimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.flag
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private Integer flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.remark
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.creatTime
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private Date creattime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column risk_certification.certificationResult
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    private String certificationresult;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.id
     *
     * @return the value of risk_certification.id
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.id
     *
     * @param id the value for risk_certification.id
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.userId
     *
     * @return the value of risk_certification.userId
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.userId
     *
     * @param userid the value for risk_certification.userId
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.idCard
     *
     * @return the value of risk_certification.idCard
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.idCard
     *
     * @param idcard the value for risk_certification.idCard
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.mobile
     *
     * @return the value of risk_certification.mobile
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.mobile
     *
     * @param mobile the value for risk_certification.mobile
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.certificationType
     *
     * @return the value of risk_certification.certificationType
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public String getCertificationtype() {
        return certificationtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.certificationType
     *
     * @param certificationtype the value for risk_certification.certificationType
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setCertificationtype(String certificationtype) {
        this.certificationtype = certificationtype == null ? null : certificationtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.certificationItem
     *
     * @return the value of risk_certification.certificationItem
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public String getCertificationitem() {
        return certificationitem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.certificationItem
     *
     * @param certificationitem the value for risk_certification.certificationItem
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setCertificationitem(String certificationitem) {
        this.certificationitem = certificationitem == null ? null : certificationitem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.certificationLimit
     *
     * @return the value of risk_certification.certificationLimit
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public Date getCertificationlimit() {
        return certificationlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.certificationLimit
     *
     * @param certificationlimit the value for risk_certification.certificationLimit
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setCertificationlimit(Date certificationlimit) {
        this.certificationlimit = certificationlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.flag
     *
     * @return the value of risk_certification.flag
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.flag
     *
     * @param flag the value for risk_certification.flag
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.remark
     *
     * @return the value of risk_certification.remark
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.remark
     *
     * @param remark the value for risk_certification.remark
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.creatTime
     *
     * @return the value of risk_certification.creatTime
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public Date getCreattime() {
        return creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.creatTime
     *
     * @param creattime the value for risk_certification.creatTime
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column risk_certification.certificationResult
     *
     * @return the value of risk_certification.certificationResult
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public String getCertificationresult() {
        return certificationresult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column risk_certification.certificationResult
     *
     * @param certificationresult the value for risk_certification.certificationResult
     *
     * @mbg.generated Fri Nov 16 15:55:23 CST 2018
     */
    public void setCertificationresult(String certificationresult) {
        this.certificationresult = certificationresult == null ? null : certificationresult.trim();
    }
}