package com.appslelo.eduwiseschoolmanagment.model.result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubjectDetailsObj {
    @SerializedName("SubjectId")
    @Expose
    private Integer subjectId;
    @SerializedName("SubjectName")
    @Expose
    private String subjectName;
    @SerializedName("FullMarks")
    @Expose
    private Double fullMarks;
    @SerializedName("PassMarks")
    @Expose
    private Double passMarks;
    @SerializedName("HishestMarks")
    @Expose
    private Double hishestMarks;
    @SerializedName("Marks")
    @Expose
    private Double marks;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Double getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(Double fullMarks) {
        this.fullMarks = fullMarks;
    }

    public Double getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(Double passMarks) {
        this.passMarks = passMarks;
    }

    public Double getHishestMarks() {
        return hishestMarks;
    }

    public void setHishestMarks(Double hishestMarks) {
        this.hishestMarks = hishestMarks;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

}
