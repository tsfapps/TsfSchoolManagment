package com.appslelo.eduwiseschoolmanagment.model;

import com.appslelo.eduwiseschoolmanagment.utils.Constant;
import com.appslelo.eduwiseschoolmanagment.utils.DateUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelFees {
    @SerializedName("RegistrationNo")
    @Expose
    private String registrationNo;
    @SerializedName("RollNo")
    @Expose
    private String rollNo;
    @SerializedName("StudentName")
    @Expose
    private String studentName;
    @SerializedName("ClassName")
    @Expose
    private String className;
    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("AcademicSession")
    @Expose
    private String academicSession;
    @SerializedName("FeeId")
    @Expose
    private Integer feeId;
    @SerializedName("FeesName")
    @Expose
    private String feesName;
    @SerializedName("PaymentTypeName")
    @Expose
    private String paymentTypeName;
    @SerializedName("SectionName")
    @Expose
    private String sectionName;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("PaymentId")
    @Expose
    private Integer paymentId;
    @SerializedName("StudentId")
    @Expose
    private Integer studentId;
    @SerializedName("ClassId")
    @Expose
    private Integer classId;
    @SerializedName("AcademicYearId")
    @Expose
    private Integer academicYearId;
    @SerializedName("AmountPaid")
    @Expose
    private Double amountPaid;
    @SerializedName("AmountDue")
    @Expose
    private Double amountDue;
    @SerializedName("Concession")
    @Expose
    private Double concession;
    @SerializedName("LateFine")
    @Expose
    private Double lateFine;
    @SerializedName("PaymentForMonth")
    @Expose
    private String paymentForMonth;
    @SerializedName("PaymentTypeId")
    @Expose
    private Integer paymentTypeId;
    @SerializedName("PaymentDescription")
    @Expose
    private String paymentDescription;
    @SerializedName("Discount")
    @Expose
    private Double discount;
    @SerializedName("IsCleared")
    @Expose
    private Boolean isCleared;
    @SerializedName("BillNo")
    @Expose
    private Integer billNo;
    @SerializedName("Yearly")
    @Expose
    private Boolean yearly;
    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;
    @SerializedName("CreatedUserId")
    @Expose
    private Integer createdUserId;
    @SerializedName("ModifiedUserId")
    @Expose
    private Integer modifiedUserId;
    @SerializedName("CreatedDateTime")
    @Expose
    private String createdDateTime;
    @SerializedName("ModifiedDateTime")
    @Expose
    private String modifiedDateTime;

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAcademicSession() {
        return academicSession;
    }

    public void setAcademicSession(String academicSession) {
        this.academicSession = academicSession;
    }

    public Integer getFeeId() {
        return feeId;
    }

    public void setFeeId(Integer feeId) {
        this.feeId = feeId;
    }

    public String getFeesName() {
        return feesName;
    }

    public void setFeesName(String feesName) {
        this.feesName = feesName;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(Integer academicYearId) {
        this.academicYearId = academicYearId;
    }

    public String getAmountPaid() {
        return String.valueOf(amountPaid);
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getAmountDue() {
        return String.valueOf(amountDue);
    }

    public void setAmountDue(Double amountDue) {
        this.amountDue = amountDue;
    }

    public Double getConcession() {
        return concession;
    }

    public void setConcession(Double concession) {
        this.concession = concession;
    }

    public Double getLateFine() {
        return lateFine;
    }

    public void setLateFine(Double lateFine) {
        this.lateFine = lateFine;
    }

    public String getPaymentForMonth() {
        return DateUtils.getMonth(paymentForMonth);
    }

    public void setPaymentForMonth(String paymentForMonth) {
        this.paymentForMonth = paymentForMonth;
    }

    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Boolean getIsCleared() {
        return isCleared;
    }

    public void setIsCleared(Boolean isCleared) {
        this.isCleared = isCleared;
    }

    public String getBillNo() {
        return String.valueOf(billNo);
    }

    public void setBillNo(Integer billNo) {
        this.billNo = billNo;
    }

    public Boolean getYearly() {
        return yearly;
    }

    public void setYearly(Boolean yearly) {
        this.yearly = yearly;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Integer getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public String getCreatedDateTime() {
        return DateUtils.getFeesDate(createdDateTime);
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(String modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }
}
