package com.zdd.risk.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApproveStrategyResultExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public ApproveStrategyResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("`id` is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("`id` is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("`id` =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("`id` <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("`id` >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`id` >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("`id` <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("`id` <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("`id` in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("`id` not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("`id` between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`id` not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("`userId` is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("`userId` is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("`userId` =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("`userId` <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("`userId` >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("`userId` >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("`userId` <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("`userId` <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("`userId` like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("`userId` not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("`userId` in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("`userId` not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("`userId` between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("`userId` not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNull() {
            addCriterion("`bizNo` is null");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNotNull() {
            addCriterion("`bizNo` is not null");
            return (Criteria) this;
        }

        public Criteria andBizNoEqualTo(String value) {
            addCriterion("`bizNo` =", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotEqualTo(String value) {
            addCriterion("`bizNo` <>", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThan(String value) {
            addCriterion("`bizNo` >", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("`bizNo` >=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThan(String value) {
            addCriterion("`bizNo` <", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThanOrEqualTo(String value) {
            addCriterion("`bizNo` <=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLike(String value) {
            addCriterion("`bizNo` like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotLike(String value) {
            addCriterion("`bizNo` not like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoIn(List<String> values) {
            addCriterion("`bizNo` in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotIn(List<String> values) {
            addCriterion("`bizNo` not in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoBetween(String value1, String value2) {
            addCriterion("`bizNo` between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotBetween(String value1, String value2) {
            addCriterion("`bizNo` not between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("`applyId` is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("`applyId` is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(String value) {
            addCriterion("`applyId` =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(String value) {
            addCriterion("`applyId` <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(String value) {
            addCriterion("`applyId` >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("`applyId` >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(String value) {
            addCriterion("`applyId` <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(String value) {
            addCriterion("`applyId` <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLike(String value) {
            addCriterion("`applyId` like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotLike(String value) {
            addCriterion("`applyId` not like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<String> values) {
            addCriterion("`applyId` in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<String> values) {
            addCriterion("`applyId` not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(String value1, String value2) {
            addCriterion("`applyId` between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(String value1, String value2) {
            addCriterion("`applyId` not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationIsNull() {
            addCriterion("`mobileAuthentication` is null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationIsNotNull() {
            addCriterion("`mobileAuthentication` is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationEqualTo(String value) {
            addCriterion("`mobileAuthentication` =", value, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationNotEqualTo(String value) {
            addCriterion("`mobileAuthentication` <>", value, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationGreaterThan(String value) {
            addCriterion("`mobileAuthentication` >", value, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationGreaterThanOrEqualTo(String value) {
            addCriterion("`mobileAuthentication` >=", value, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationLessThan(String value) {
            addCriterion("`mobileAuthentication` <", value, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationLessThanOrEqualTo(String value) {
            addCriterion("`mobileAuthentication` <=", value, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationLike(String value) {
            addCriterion("`mobileAuthentication` like", value, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationNotLike(String value) {
            addCriterion("`mobileAuthentication` not like", value, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationIn(List<String> values) {
            addCriterion("`mobileAuthentication` in", values, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationNotIn(List<String> values) {
            addCriterion("`mobileAuthentication` not in", values, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationBetween(String value1, String value2) {
            addCriterion("`mobileAuthentication` between", value1, value2, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andMobileAuthenticationNotBetween(String value1, String value2) {
            addCriterion("`mobileAuthentication` not between", value1, value2, "mobileAuthentication");
            return (Criteria) this;
        }

        public Criteria andVirtualTipIsNull() {
            addCriterion("`virtualTip` is null");
            return (Criteria) this;
        }

        public Criteria andVirtualTipIsNotNull() {
            addCriterion("`virtualTip` is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualTipEqualTo(String value) {
            addCriterion("`virtualTip` =", value, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipNotEqualTo(String value) {
            addCriterion("`virtualTip` <>", value, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipGreaterThan(String value) {
            addCriterion("`virtualTip` >", value, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipGreaterThanOrEqualTo(String value) {
            addCriterion("`virtualTip` >=", value, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipLessThan(String value) {
            addCriterion("`virtualTip` <", value, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipLessThanOrEqualTo(String value) {
            addCriterion("`virtualTip` <=", value, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipLike(String value) {
            addCriterion("`virtualTip` like", value, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipNotLike(String value) {
            addCriterion("`virtualTip` not like", value, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipIn(List<String> values) {
            addCriterion("`virtualTip` in", values, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipNotIn(List<String> values) {
            addCriterion("`virtualTip` not in", values, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipBetween(String value1, String value2) {
            addCriterion("`virtualTip` between", value1, value2, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andVirtualTipNotBetween(String value1, String value2) {
            addCriterion("`virtualTip` not between", value1, value2, "virtualTip");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeIsNull() {
            addCriterion("`mobileOnlineTime` is null");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeIsNotNull() {
            addCriterion("`mobileOnlineTime` is not null");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeEqualTo(String value) {
            addCriterion("`mobileOnlineTime` =", value, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeNotEqualTo(String value) {
            addCriterion("`mobileOnlineTime` <>", value, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeGreaterThan(String value) {
            addCriterion("`mobileOnlineTime` >", value, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeGreaterThanOrEqualTo(String value) {
            addCriterion("`mobileOnlineTime` >=", value, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeLessThan(String value) {
            addCriterion("`mobileOnlineTime` <", value, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeLessThanOrEqualTo(String value) {
            addCriterion("`mobileOnlineTime` <=", value, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeLike(String value) {
            addCriterion("`mobileOnlineTime` like", value, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeNotLike(String value) {
            addCriterion("`mobileOnlineTime` not like", value, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeIn(List<String> values) {
            addCriterion("`mobileOnlineTime` in", values, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeNotIn(List<String> values) {
            addCriterion("`mobileOnlineTime` not in", values, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeBetween(String value1, String value2) {
            addCriterion("`mobileOnlineTime` between", value1, value2, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andMobileOnlineTimeNotBetween(String value1, String value2) {
            addCriterion("`mobileOnlineTime` not between", value1, value2, "mobileOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListIsNull() {
            addCriterion("`loanBlackList` is null");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListIsNotNull() {
            addCriterion("`loanBlackList` is not null");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListEqualTo(String value) {
            addCriterion("`loanBlackList` =", value, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListNotEqualTo(String value) {
            addCriterion("`loanBlackList` <>", value, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListGreaterThan(String value) {
            addCriterion("`loanBlackList` >", value, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListGreaterThanOrEqualTo(String value) {
            addCriterion("`loanBlackList` >=", value, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListLessThan(String value) {
            addCriterion("`loanBlackList` <", value, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListLessThanOrEqualTo(String value) {
            addCriterion("`loanBlackList` <=", value, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListLike(String value) {
            addCriterion("`loanBlackList` like", value, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListNotLike(String value) {
            addCriterion("`loanBlackList` not like", value, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListIn(List<String> values) {
            addCriterion("`loanBlackList` in", values, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListNotIn(List<String> values) {
            addCriterion("`loanBlackList` not in", values, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListBetween(String value1, String value2) {
            addCriterion("`loanBlackList` between", value1, value2, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andLoanBlackListNotBetween(String value1, String value2) {
            addCriterion("`loanBlackList` not between", value1, value2, "loanBlackList");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("`remark` is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("`remark` is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("`remark` =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("`remark` <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("`remark` >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("`remark` >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("`remark` <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("`remark` <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("`remark` like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("`remark` not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("`remark` in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("`remark` not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("`remark` between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("`remark` not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`createTime` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`createTime` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`createTime` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`createTime` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`createTime` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`createTime` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`createTime` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`createTime` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`createTime` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`createTime` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`createTime` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`createTime` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("`updateTime` is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("`updateTime` is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("`updateTime` =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("`updateTime` <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("`updateTime` >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`updateTime` >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("`updateTime` <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`updateTime` <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("`updateTime` in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("`updateTime` not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("`updateTime` between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`updateTime` not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 06 10:22:54 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table risk_approvestrategyresult
     *
     * @mbg.generated Thu Dec 06 10:22:54 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}