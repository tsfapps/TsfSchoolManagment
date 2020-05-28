package com.appslelo.eduwiseschoolmanagment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelUser {
    @SerializedName("ApplicationRoleName")
    @Expose
    private String applicationRoleName;
    @SerializedName("AcademicYearId")
    @Expose
    private Integer academicYearId;
    @SerializedName("ClassId")
    @Expose
    private Integer classId;
    @SerializedName("SectionId")
    @Expose
    private Integer sectionId;
    @SerializedName("Gender")
    @Expose
    private Boolean gender;
    @SerializedName("UserId")
    @Expose
    private Integer userId;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("IsLocked")
    @Expose
    private Boolean isLocked;
    @SerializedName("Mobile")
    @Expose
    private String mobile;
    @SerializedName("LastLoginDate")
    @Expose
    private String lastLoginDate;
    @SerializedName("ApplicationRoleId")
    @Expose
    private Integer applicationRoleId;
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
    private Object modifiedDateTime;

    public String getApplicationRoleName() {
        return applicationRoleName;
    }

    public void setApplicationRoleName(String applicationRoleName) {
        this.applicationRoleName = applicationRoleName;
    }

    public Integer getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(Integer academicYearId) {
        this.academicYearId = academicYearId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getApplicationRoleId() {
        return applicationRoleId;
    }

    public void setApplicationRoleId(Integer applicationRoleId) {
        this.applicationRoleId = applicationRoleId;
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
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Object getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(Object modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }

}
