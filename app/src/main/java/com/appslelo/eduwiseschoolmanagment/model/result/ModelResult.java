package com.appslelo.eduwiseschoolmanagment.model.result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelResult {
    @SerializedName("StudentId")
    @Expose
    private Integer studentId;
    @SerializedName("RegNo")
    @Expose
    private String regNo;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("RollNo")
    @Expose
    private String rollNo;
    @SerializedName("Gender")
    @Expose
    private Boolean gender;
    @SerializedName("AcademicYearId")
    @Expose
    private Integer academicYearId;
    @SerializedName("SessionName")
    @Expose
    private String sessionName;
    @SerializedName("ClassId")
    @Expose
    private Integer classId;
    @SerializedName("ClassName")
    @Expose
    private String className;
    @SerializedName("SectionId")
    @Expose
    private Integer sectionId;
    @SerializedName("SectionName")
    @Expose
    private String sectionName;
    @SerializedName("ExaminationDetailsId")
    @Expose
    private Integer examinationDetailsId;
    @SerializedName("ExaminationName")
    @Expose
    private String examinationName;
    @SerializedName("SubjectDetailsObj")
    @Expose
    private List<SubjectDetailsObj> subjectDetailsObj = null;
    @SerializedName("TotalFM")
    @Expose
    private Double totalFM;
    @SerializedName("TotalHM")
    @Expose
    private Double totalHM;
    @SerializedName("TotalMO")
    @Expose
    private Double totalMO;
    @SerializedName("TotalPercentage")
    @Expose
    private Double totalPercentage;
    @SerializedName("TotalGrade")
    @Expose
    private String totalGrade;
    @SerializedName("TotalRank")
    @Expose
    private Double totalRank;
    @SerializedName("TotalRemarks")
    @Expose
    private String totalRemarks;
    @SerializedName("OverAllFM")
    @Expose
    private Double overAllFM;
    @SerializedName("OverAllMO")
    @Expose
    private Double overAllMO;
    @SerializedName("OverAllPercentage")
    @Expose
    private Double overAllPercentage;
    @SerializedName("OverAllRank")
    @Expose
    private Double overAllRank;
    @SerializedName("OverAllGrade")
    @Expose
    private String overAllGrade;
    @SerializedName("OverAllRemarks")
    @Expose
    private String overAllRemarks;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Integer getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(Integer academicYearId) {
        this.academicYearId = academicYearId;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Integer getExaminationDetailsId() {
        return examinationDetailsId;
    }

    public void setExaminationDetailsId(Integer examinationDetailsId) {
        this.examinationDetailsId = examinationDetailsId;
    }

    public String getExaminationName() {
        return examinationName;
    }

    public void setExaminationName(String examinationName) {
        this.examinationName = examinationName;
    }

    public List<SubjectDetailsObj> getSubjectDetailsObj() {
        return subjectDetailsObj;
    }

    public void setSubjectDetailsObj(List<SubjectDetailsObj> subjectDetailsObj) {
        this.subjectDetailsObj = subjectDetailsObj;
    }

    public Double getTotalFM() {
        return totalFM;
    }

    public void setTotalFM(Double totalFM) {
        this.totalFM = totalFM;
    }

    public Double getTotalHM() {
        return totalHM;
    }

    public void setTotalHM(Double totalHM) {
        this.totalHM = totalHM;
    }

    public Double getTotalMO() {
        return totalMO;
    }

    public void setTotalMO(Double totalMO) {
        this.totalMO = totalMO;
    }

    public Double getTotalPercentage() {
        return totalPercentage;
    }

    public void setTotalPercentage(Double totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

    public String getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(String totalGrade) {
        this.totalGrade = totalGrade;
    }

    public Double getTotalRank() {
        return totalRank;
    }

    public void setTotalRank(Double totalRank) {
        this.totalRank = totalRank;
    }

    public String getTotalRemarks() {
        return totalRemarks;
    }

    public void setTotalRemarks(String totalRemarks) {
        this.totalRemarks = totalRemarks;
    }

    public String getOverAllFM() {
        return String.valueOf(overAllFM);
    }

    public void setOverAllFM(Double overAllFM) {
        this.overAllFM = overAllFM;
    }

    public String  getOverAllMO() {
        return String.valueOf(overAllMO)+"/";
    }

    public void setOverAllMO(Double overAllMO) {
        this.overAllMO = overAllMO;
    }

    public Double getOverAllPercentage() {
        return overAllPercentage;
    }

    public void setOverAllPercentage(Double overAllPercentage) {
        this.overAllPercentage = overAllPercentage;
    }

    public Double getOverAllRank() {
        return overAllRank;
    }

    public void setOverAllRank(Double overAllRank) {
        this.overAllRank = overAllRank;
    }

    public String getOverAllGrade() {
        return overAllGrade;
    }

    public void setOverAllGrade(String overAllGrade) {
        this.overAllGrade = overAllGrade;
    }

    public String getOverAllRemarks() {
        return overAllRemarks;
    }

    public void setOverAllRemarks(String overAllRemarks) {
        this.overAllRemarks = overAllRemarks;
    }

}
