package com.readFile.po;

import java.util.ArrayList;
import java.util.List;

public class hotel2000wExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public hotel2000wExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CardNo is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CardNo =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CardNo <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CardNo >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CardNo >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CardNo <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CardNo <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CardNo like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CardNo not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CardNo in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CardNo not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CardNo between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CardNo not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andDescriotIsNull() {
            addCriterion("Descriot is null");
            return (Criteria) this;
        }

        public Criteria andDescriotIsNotNull() {
            addCriterion("Descriot is not null");
            return (Criteria) this;
        }

        public Criteria andDescriotEqualTo(String value) {
            addCriterion("Descriot =", value, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotNotEqualTo(String value) {
            addCriterion("Descriot <>", value, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotGreaterThan(String value) {
            addCriterion("Descriot >", value, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotGreaterThanOrEqualTo(String value) {
            addCriterion("Descriot >=", value, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotLessThan(String value) {
            addCriterion("Descriot <", value, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotLessThanOrEqualTo(String value) {
            addCriterion("Descriot <=", value, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotLike(String value) {
            addCriterion("Descriot like", value, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotNotLike(String value) {
            addCriterion("Descriot not like", value, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotIn(List<String> values) {
            addCriterion("Descriot in", values, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotNotIn(List<String> values) {
            addCriterion("Descriot not in", values, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotBetween(String value1, String value2) {
            addCriterion("Descriot between", value1, value2, "descriot");
            return (Criteria) this;
        }

        public Criteria andDescriotNotBetween(String value1, String value2) {
            addCriterion("Descriot not between", value1, value2, "descriot");
            return (Criteria) this;
        }

        public Criteria andCtfTpIsNull() {
            addCriterion("CtfTp is null");
            return (Criteria) this;
        }

        public Criteria andCtfTpIsNotNull() {
            addCriterion("CtfTp is not null");
            return (Criteria) this;
        }

        public Criteria andCtfTpEqualTo(String value) {
            addCriterion("CtfTp =", value, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpNotEqualTo(String value) {
            addCriterion("CtfTp <>", value, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpGreaterThan(String value) {
            addCriterion("CtfTp >", value, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpGreaterThanOrEqualTo(String value) {
            addCriterion("CtfTp >=", value, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpLessThan(String value) {
            addCriterion("CtfTp <", value, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpLessThanOrEqualTo(String value) {
            addCriterion("CtfTp <=", value, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpLike(String value) {
            addCriterion("CtfTp like", value, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpNotLike(String value) {
            addCriterion("CtfTp not like", value, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpIn(List<String> values) {
            addCriterion("CtfTp in", values, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpNotIn(List<String> values) {
            addCriterion("CtfTp not in", values, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpBetween(String value1, String value2) {
            addCriterion("CtfTp between", value1, value2, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfTpNotBetween(String value1, String value2) {
            addCriterion("CtfTp not between", value1, value2, "ctfTp");
            return (Criteria) this;
        }

        public Criteria andCtfIdIsNull() {
            addCriterion("CtfId is null");
            return (Criteria) this;
        }

        public Criteria andCtfIdIsNotNull() {
            addCriterion("CtfId is not null");
            return (Criteria) this;
        }

        public Criteria andCtfIdEqualTo(String value) {
            addCriterion("CtfId =", value, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdNotEqualTo(String value) {
            addCriterion("CtfId <>", value, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdGreaterThan(String value) {
            addCriterion("CtfId >", value, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdGreaterThanOrEqualTo(String value) {
            addCriterion("CtfId >=", value, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdLessThan(String value) {
            addCriterion("CtfId <", value, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdLessThanOrEqualTo(String value) {
            addCriterion("CtfId <=", value, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdLike(String value) {
            addCriterion("CtfId like", value, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdNotLike(String value) {
            addCriterion("CtfId not like", value, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdIn(List<String> values) {
            addCriterion("CtfId in", values, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdNotIn(List<String> values) {
            addCriterion("CtfId not in", values, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdBetween(String value1, String value2) {
            addCriterion("CtfId between", value1, value2, "ctfId");
            return (Criteria) this;
        }

        public Criteria andCtfIdNotBetween(String value1, String value2) {
            addCriterion("CtfId not between", value1, value2, "ctfId");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("Gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("Gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("Birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("Birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("Zip is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("Zip is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("Zip =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("Zip <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("Zip >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("Zip >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("Zip <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("Zip <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("Zip like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("Zip not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("Zip in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("Zip not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("Zip between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("Zip not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andDirtyIsNull() {
            addCriterion("Dirty is null");
            return (Criteria) this;
        }

        public Criteria andDirtyIsNotNull() {
            addCriterion("Dirty is not null");
            return (Criteria) this;
        }

        public Criteria andDirtyEqualTo(String value) {
            addCriterion("Dirty =", value, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyNotEqualTo(String value) {
            addCriterion("Dirty <>", value, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyGreaterThan(String value) {
            addCriterion("Dirty >", value, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyGreaterThanOrEqualTo(String value) {
            addCriterion("Dirty >=", value, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyLessThan(String value) {
            addCriterion("Dirty <", value, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyLessThanOrEqualTo(String value) {
            addCriterion("Dirty <=", value, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyLike(String value) {
            addCriterion("Dirty like", value, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyNotLike(String value) {
            addCriterion("Dirty not like", value, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyIn(List<String> values) {
            addCriterion("Dirty in", values, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyNotIn(List<String> values) {
            addCriterion("Dirty not in", values, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyBetween(String value1, String value2) {
            addCriterion("Dirty between", value1, value2, "dirty");
            return (Criteria) this;
        }

        public Criteria andDirtyNotBetween(String value1, String value2) {
            addCriterion("Dirty not between", value1, value2, "dirty");
            return (Criteria) this;
        }

        public Criteria andDistrict1IsNull() {
            addCriterion("District1 is null");
            return (Criteria) this;
        }

        public Criteria andDistrict1IsNotNull() {
            addCriterion("District1 is not null");
            return (Criteria) this;
        }

        public Criteria andDistrict1EqualTo(String value) {
            addCriterion("District1 =", value, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1NotEqualTo(String value) {
            addCriterion("District1 <>", value, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1GreaterThan(String value) {
            addCriterion("District1 >", value, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1GreaterThanOrEqualTo(String value) {
            addCriterion("District1 >=", value, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1LessThan(String value) {
            addCriterion("District1 <", value, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1LessThanOrEqualTo(String value) {
            addCriterion("District1 <=", value, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1Like(String value) {
            addCriterion("District1 like", value, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1NotLike(String value) {
            addCriterion("District1 not like", value, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1In(List<String> values) {
            addCriterion("District1 in", values, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1NotIn(List<String> values) {
            addCriterion("District1 not in", values, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1Between(String value1, String value2) {
            addCriterion("District1 between", value1, value2, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict1NotBetween(String value1, String value2) {
            addCriterion("District1 not between", value1, value2, "district1");
            return (Criteria) this;
        }

        public Criteria andDistrict2IsNull() {
            addCriterion("District2 is null");
            return (Criteria) this;
        }

        public Criteria andDistrict2IsNotNull() {
            addCriterion("District2 is not null");
            return (Criteria) this;
        }

        public Criteria andDistrict2EqualTo(String value) {
            addCriterion("District2 =", value, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2NotEqualTo(String value) {
            addCriterion("District2 <>", value, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2GreaterThan(String value) {
            addCriterion("District2 >", value, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2GreaterThanOrEqualTo(String value) {
            addCriterion("District2 >=", value, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2LessThan(String value) {
            addCriterion("District2 <", value, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2LessThanOrEqualTo(String value) {
            addCriterion("District2 <=", value, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2Like(String value) {
            addCriterion("District2 like", value, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2NotLike(String value) {
            addCriterion("District2 not like", value, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2In(List<String> values) {
            addCriterion("District2 in", values, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2NotIn(List<String> values) {
            addCriterion("District2 not in", values, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2Between(String value1, String value2) {
            addCriterion("District2 between", value1, value2, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict2NotBetween(String value1, String value2) {
            addCriterion("District2 not between", value1, value2, "district2");
            return (Criteria) this;
        }

        public Criteria andDistrict3IsNull() {
            addCriterion("District3 is null");
            return (Criteria) this;
        }

        public Criteria andDistrict3IsNotNull() {
            addCriterion("District3 is not null");
            return (Criteria) this;
        }

        public Criteria andDistrict3EqualTo(String value) {
            addCriterion("District3 =", value, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3NotEqualTo(String value) {
            addCriterion("District3 <>", value, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3GreaterThan(String value) {
            addCriterion("District3 >", value, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3GreaterThanOrEqualTo(String value) {
            addCriterion("District3 >=", value, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3LessThan(String value) {
            addCriterion("District3 <", value, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3LessThanOrEqualTo(String value) {
            addCriterion("District3 <=", value, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3Like(String value) {
            addCriterion("District3 like", value, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3NotLike(String value) {
            addCriterion("District3 not like", value, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3In(List<String> values) {
            addCriterion("District3 in", values, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3NotIn(List<String> values) {
            addCriterion("District3 not in", values, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3Between(String value1, String value2) {
            addCriterion("District3 between", value1, value2, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict3NotBetween(String value1, String value2) {
            addCriterion("District3 not between", value1, value2, "district3");
            return (Criteria) this;
        }

        public Criteria andDistrict4IsNull() {
            addCriterion("District4 is null");
            return (Criteria) this;
        }

        public Criteria andDistrict4IsNotNull() {
            addCriterion("District4 is not null");
            return (Criteria) this;
        }

        public Criteria andDistrict4EqualTo(String value) {
            addCriterion("District4 =", value, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4NotEqualTo(String value) {
            addCriterion("District4 <>", value, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4GreaterThan(String value) {
            addCriterion("District4 >", value, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4GreaterThanOrEqualTo(String value) {
            addCriterion("District4 >=", value, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4LessThan(String value) {
            addCriterion("District4 <", value, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4LessThanOrEqualTo(String value) {
            addCriterion("District4 <=", value, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4Like(String value) {
            addCriterion("District4 like", value, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4NotLike(String value) {
            addCriterion("District4 not like", value, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4In(List<String> values) {
            addCriterion("District4 in", values, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4NotIn(List<String> values) {
            addCriterion("District4 not in", values, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4Between(String value1, String value2) {
            addCriterion("District4 between", value1, value2, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict4NotBetween(String value1, String value2) {
            addCriterion("District4 not between", value1, value2, "district4");
            return (Criteria) this;
        }

        public Criteria andDistrict5IsNull() {
            addCriterion("District5 is null");
            return (Criteria) this;
        }

        public Criteria andDistrict5IsNotNull() {
            addCriterion("District5 is not null");
            return (Criteria) this;
        }

        public Criteria andDistrict5EqualTo(String value) {
            addCriterion("District5 =", value, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5NotEqualTo(String value) {
            addCriterion("District5 <>", value, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5GreaterThan(String value) {
            addCriterion("District5 >", value, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5GreaterThanOrEqualTo(String value) {
            addCriterion("District5 >=", value, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5LessThan(String value) {
            addCriterion("District5 <", value, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5LessThanOrEqualTo(String value) {
            addCriterion("District5 <=", value, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5Like(String value) {
            addCriterion("District5 like", value, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5NotLike(String value) {
            addCriterion("District5 not like", value, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5In(List<String> values) {
            addCriterion("District5 in", values, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5NotIn(List<String> values) {
            addCriterion("District5 not in", values, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5Between(String value1, String value2) {
            addCriterion("District5 between", value1, value2, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict5NotBetween(String value1, String value2) {
            addCriterion("District5 not between", value1, value2, "district5");
            return (Criteria) this;
        }

        public Criteria andDistrict6IsNull() {
            addCriterion("District6 is null");
            return (Criteria) this;
        }

        public Criteria andDistrict6IsNotNull() {
            addCriterion("District6 is not null");
            return (Criteria) this;
        }

        public Criteria andDistrict6EqualTo(String value) {
            addCriterion("District6 =", value, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6NotEqualTo(String value) {
            addCriterion("District6 <>", value, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6GreaterThan(String value) {
            addCriterion("District6 >", value, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6GreaterThanOrEqualTo(String value) {
            addCriterion("District6 >=", value, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6LessThan(String value) {
            addCriterion("District6 <", value, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6LessThanOrEqualTo(String value) {
            addCriterion("District6 <=", value, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6Like(String value) {
            addCriterion("District6 like", value, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6NotLike(String value) {
            addCriterion("District6 not like", value, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6In(List<String> values) {
            addCriterion("District6 in", values, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6NotIn(List<String> values) {
            addCriterion("District6 not in", values, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6Between(String value1, String value2) {
            addCriterion("District6 between", value1, value2, "district6");
            return (Criteria) this;
        }

        public Criteria andDistrict6NotBetween(String value1, String value2) {
            addCriterion("District6 not between", value1, value2, "district6");
            return (Criteria) this;
        }

        public Criteria andFirstNmIsNull() {
            addCriterion("FirstNm is null");
            return (Criteria) this;
        }

        public Criteria andFirstNmIsNotNull() {
            addCriterion("FirstNm is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNmEqualTo(String value) {
            addCriterion("FirstNm =", value, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmNotEqualTo(String value) {
            addCriterion("FirstNm <>", value, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmGreaterThan(String value) {
            addCriterion("FirstNm >", value, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmGreaterThanOrEqualTo(String value) {
            addCriterion("FirstNm >=", value, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmLessThan(String value) {
            addCriterion("FirstNm <", value, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmLessThanOrEqualTo(String value) {
            addCriterion("FirstNm <=", value, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmLike(String value) {
            addCriterion("FirstNm like", value, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmNotLike(String value) {
            addCriterion("FirstNm not like", value, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmIn(List<String> values) {
            addCriterion("FirstNm in", values, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmNotIn(List<String> values) {
            addCriterion("FirstNm not in", values, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmBetween(String value1, String value2) {
            addCriterion("FirstNm between", value1, value2, "firstNm");
            return (Criteria) this;
        }

        public Criteria andFirstNmNotBetween(String value1, String value2) {
            addCriterion("FirstNm not between", value1, value2, "firstNm");
            return (Criteria) this;
        }

        public Criteria andLastNmIsNull() {
            addCriterion("LastNm is null");
            return (Criteria) this;
        }

        public Criteria andLastNmIsNotNull() {
            addCriterion("LastNm is not null");
            return (Criteria) this;
        }

        public Criteria andLastNmEqualTo(String value) {
            addCriterion("LastNm =", value, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmNotEqualTo(String value) {
            addCriterion("LastNm <>", value, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmGreaterThan(String value) {
            addCriterion("LastNm >", value, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmGreaterThanOrEqualTo(String value) {
            addCriterion("LastNm >=", value, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmLessThan(String value) {
            addCriterion("LastNm <", value, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmLessThanOrEqualTo(String value) {
            addCriterion("LastNm <=", value, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmLike(String value) {
            addCriterion("LastNm like", value, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmNotLike(String value) {
            addCriterion("LastNm not like", value, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmIn(List<String> values) {
            addCriterion("LastNm in", values, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmNotIn(List<String> values) {
            addCriterion("LastNm not in", values, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmBetween(String value1, String value2) {
            addCriterion("LastNm between", value1, value2, "lastNm");
            return (Criteria) this;
        }

        public Criteria andLastNmNotBetween(String value1, String value2) {
            addCriterion("LastNm not between", value1, value2, "lastNm");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("Duty is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("Duty is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("Duty =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("Duty <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("Duty >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("Duty >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("Duty <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("Duty <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("Duty like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("Duty not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("Duty in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("Duty not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("Duty between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("Duty not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("Fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("Fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("Fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("Fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("Fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("Fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("Fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("Fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("Fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("Fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("Fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("Fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("Fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("Fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("EMail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("EMail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("EMail =", value, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("EMail <>", value, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("EMail >", value, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("EMail >=", value, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("EMail <", value, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("EMail <=", value, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("EMail like", value, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("EMail not like", value, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("EMail in", values, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("EMail not in", values, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("EMail between", value1, value2, "EMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("EMail not between", value1, value2, "EMail");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("Nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("Nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("Nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("Nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("Nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("Nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("Nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("Nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("Nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("Nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("Nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("Nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("Nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("Nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andTasteIsNull() {
            addCriterion("Taste is null");
            return (Criteria) this;
        }

        public Criteria andTasteIsNotNull() {
            addCriterion("Taste is not null");
            return (Criteria) this;
        }

        public Criteria andTasteEqualTo(String value) {
            addCriterion("Taste =", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotEqualTo(String value) {
            addCriterion("Taste <>", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThan(String value) {
            addCriterion("Taste >", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThanOrEqualTo(String value) {
            addCriterion("Taste >=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThan(String value) {
            addCriterion("Taste <", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThanOrEqualTo(String value) {
            addCriterion("Taste <=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLike(String value) {
            addCriterion("Taste like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotLike(String value) {
            addCriterion("Taste not like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteIn(List<String> values) {
            addCriterion("Taste in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotIn(List<String> values) {
            addCriterion("Taste not in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteBetween(String value1, String value2) {
            addCriterion("Taste between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotBetween(String value1, String value2) {
            addCriterion("Taste not between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("Education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("Education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("Education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("Education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("Education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("Education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("Education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("Education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("Education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("Education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("Education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("Education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("Education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("Education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCTelIsNull() {
            addCriterion("CTel is null");
            return (Criteria) this;
        }

        public Criteria andCTelIsNotNull() {
            addCriterion("CTel is not null");
            return (Criteria) this;
        }

        public Criteria andCTelEqualTo(String value) {
            addCriterion("CTel =", value, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotEqualTo(String value) {
            addCriterion("CTel <>", value, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelGreaterThan(String value) {
            addCriterion("CTel >", value, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelGreaterThanOrEqualTo(String value) {
            addCriterion("CTel >=", value, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelLessThan(String value) {
            addCriterion("CTel <", value, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelLessThanOrEqualTo(String value) {
            addCriterion("CTel <=", value, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelLike(String value) {
            addCriterion("CTel like", value, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotLike(String value) {
            addCriterion("CTel not like", value, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelIn(List<String> values) {
            addCriterion("CTel in", values, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotIn(List<String> values) {
            addCriterion("CTel not in", values, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelBetween(String value1, String value2) {
            addCriterion("CTel between", value1, value2, "CTel");
            return (Criteria) this;
        }

        public Criteria andCTelNotBetween(String value1, String value2) {
            addCriterion("CTel not between", value1, value2, "CTel");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNull() {
            addCriterion("CAddress is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIsNotNull() {
            addCriterion("CAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressEqualTo(String value) {
            addCriterion("CAddress =", value, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotEqualTo(String value) {
            addCriterion("CAddress <>", value, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThan(String value) {
            addCriterion("CAddress >", value, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CAddress >=", value, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThan(String value) {
            addCriterion("CAddress <", value, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLessThanOrEqualTo(String value) {
            addCriterion("CAddress <=", value, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressLike(String value) {
            addCriterion("CAddress like", value, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotLike(String value) {
            addCriterion("CAddress not like", value, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressIn(List<String> values) {
            addCriterion("CAddress in", values, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotIn(List<String> values) {
            addCriterion("CAddress not in", values, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressBetween(String value1, String value2) {
            addCriterion("CAddress between", value1, value2, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCAddressNotBetween(String value1, String value2) {
            addCriterion("CAddress not between", value1, value2, "CAddress");
            return (Criteria) this;
        }

        public Criteria andCZipIsNull() {
            addCriterion("CZip is null");
            return (Criteria) this;
        }

        public Criteria andCZipIsNotNull() {
            addCriterion("CZip is not null");
            return (Criteria) this;
        }

        public Criteria andCZipEqualTo(String value) {
            addCriterion("CZip =", value, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipNotEqualTo(String value) {
            addCriterion("CZip <>", value, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipGreaterThan(String value) {
            addCriterion("CZip >", value, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipGreaterThanOrEqualTo(String value) {
            addCriterion("CZip >=", value, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipLessThan(String value) {
            addCriterion("CZip <", value, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipLessThanOrEqualTo(String value) {
            addCriterion("CZip <=", value, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipLike(String value) {
            addCriterion("CZip like", value, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipNotLike(String value) {
            addCriterion("CZip not like", value, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipIn(List<String> values) {
            addCriterion("CZip in", values, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipNotIn(List<String> values) {
            addCriterion("CZip not in", values, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipBetween(String value1, String value2) {
            addCriterion("CZip between", value1, value2, "CZip");
            return (Criteria) this;
        }

        public Criteria andCZipNotBetween(String value1, String value2) {
            addCriterion("CZip not between", value1, value2, "CZip");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNull() {
            addCriterion("Family is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNotNull() {
            addCriterion("Family is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyEqualTo(String value) {
            addCriterion("Family =", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotEqualTo(String value) {
            addCriterion("Family <>", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThan(String value) {
            addCriterion("Family >", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("Family >=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThan(String value) {
            addCriterion("Family <", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThanOrEqualTo(String value) {
            addCriterion("Family <=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLike(String value) {
            addCriterion("Family like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotLike(String value) {
            addCriterion("Family not like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyIn(List<String> values) {
            addCriterion("Family in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotIn(List<String> values) {
            addCriterion("Family not in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyBetween(String value1, String value2) {
            addCriterion("Family between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotBetween(String value1, String value2) {
            addCriterion("Family not between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("Version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("Version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("Version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("Version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("Version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("Version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("Version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("Version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("Version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("Version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("Version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("Version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("Version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("Version not between", value1, value2, "version");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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