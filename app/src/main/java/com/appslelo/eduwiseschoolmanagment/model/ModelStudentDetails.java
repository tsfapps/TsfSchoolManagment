package com.appslelo.eduwiseschoolmanagment.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.appslelo.eduwiseschoolmanagment.R;
import com.appslelo.eduwiseschoolmanagment.utils.DateUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelStudentDetails {
    @SerializedName("StudentName")
    @Expose
    private String studentName;
    @SerializedName("ClassName")
    @Expose
    private String className;
    @SerializedName("SessionName")
    @Expose
    private String sessionName;
    @SerializedName("SectionName")
    @Expose
    private String sectionName;
    @SerializedName("StateName")
    @Expose
    private String stateName;
    @SerializedName("SessionStartDate")
    @Expose
    private String sessionStartDate;
    @SerializedName("MonthlyConcession")
    @Expose
    private Double monthlyConcession;
    @SerializedName("YearlyConcession")
    @Expose
    private Double yearlyConcession;
    @SerializedName("OneTimeConcession")
    @Expose
    private Double oneTimeConcession;
    @SerializedName("MonthName")
    @Expose
    private String monthName;
    @SerializedName("MPSchool")
    @Expose
    private String mPSchool;
    @SerializedName("MPBoard")
    @Expose
    private String mPBoard;
    @SerializedName("MPYear")
    @Expose
    private String mPYear;
    @SerializedName("MPMPRegNo")
    @Expose
    private String mPMPRegNo;
    @SerializedName("MPBeng")
    @Expose
    private String mPBeng;
    @SerializedName("MPEng")
    @Expose
    private String mPEng;
    @SerializedName("MPMath")
    @Expose
    private String mPMath;
    @SerializedName("MPPSc")
    @Expose
    private String mPPSc;
    @SerializedName("MPLSc")
    @Expose
    private String mPLSc;
    @SerializedName("MPHist")
    @Expose
    private String mPHist;
    @SerializedName("MPGeo")
    @Expose
    private String mPGeo;
    @SerializedName("MPArabic")
    @Expose
    private String mPArabic;
    @SerializedName("MPTot")
    @Expose
    private String mPTot;
    @SerializedName("MPPercentage")
    @Expose
    private String mPPercentage;
    @SerializedName("HSSchool")
    @Expose
    private String hSSchool;
    @SerializedName("HSRegNo")
    @Expose
    private String hSRegNo;
    @SerializedName("HSRollNo")
    @Expose
    private String hSRollNo;
    @SerializedName("HSBeng")
    @Expose
    private String hSBeng;
    @SerializedName("HSEng")
    @Expose
    private String hSEng;
    @SerializedName("HSMath")
    @Expose
    private String hSMath;
    @SerializedName("HSPhy")
    @Expose
    private String hSPhy;
    @SerializedName("HSChem")
    @Expose
    private String hSChem;
    @SerializedName("HSBoi")
    @Expose
    private String hSBoi;
    @SerializedName("HSTotal")
    @Expose
    private String hSTotal;
    @SerializedName("HSPercentage")
    @Expose
    private String hSPercentage;
    @SerializedName("HSYearofpassing")
    @Expose
    private String hSYearofpassing;
    @SerializedName("StudentId")
    @Expose
    private Integer studentId;
    @SerializedName("RegistrationNo")
    @Expose
    private String registrationNo;
    @SerializedName("StudentBillNo")
    @Expose
    private String studentBillNo;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("MiddleName")
    @Expose
    private String middleName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("RollNo")
    @Expose
    private String rollNo;
    @SerializedName("ClassId")
    @Expose
    private Integer classId;
    @SerializedName("SectionId")
    @Expose
    private Integer sectionId;
    @SerializedName("Gender")
    @Expose
    private Boolean gender;
    @SerializedName("AnyDisability")
    @Expose
    private String anyDisability;
    @SerializedName("DateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("BloodGroup")
    @Expose
    private String bloodGroup;
    @SerializedName("AcademicYearId")
    @Expose
    private Integer academicYearId;
    @SerializedName("StudentUploadPhoto")
    @Expose
    private String studentUploadPhoto;
    @SerializedName("OBC")
    @Expose
    private String oBC;
    @SerializedName("OBCNo")
    @Expose
    private String oBCNo;
    @SerializedName("AadharCard")
    @Expose
    private String aadharCard;
    @SerializedName("AadharCardNo")
    @Expose
    private String aadharCardNo;
    @SerializedName("RationCard")
    @Expose
    private String rationCard;
    @SerializedName("RationCardNo")
    @Expose
    private String rationCardNo;
    @SerializedName("BirthCertificat")
    @Expose
    private String birthCertificat;
    @SerializedName("BirthCertificatNo")
    @Expose
    private String birthCertificatNo;
    @SerializedName("MPMarksheet")
    @Expose
    private String mPMarksheet;
    @SerializedName("MPMarksheetNo")
    @Expose
    private String mPMarksheetNo;
    @SerializedName("HSMarksheet")
    @Expose
    private String hSMarksheet;
    @SerializedName("HSMarksheetNo")
    @Expose
    private String hSMarksheetNo;
    @SerializedName("MPAdmitCard")
    @Expose
    private String mPAdmitCard;
    @SerializedName("MPAdmitCardNo")
    @Expose
    private String mPAdmitCardNo;
    @SerializedName("PASSBOOK")
    @Expose
    private String pASSBOOK;
    @SerializedName("XIFees")
    @Expose
    private String xIFees;
    @SerializedName("XIIFees")
    @Expose
    private String xIIFees;
    @SerializedName("FatherName")
    @Expose
    private String fatherName;
    @SerializedName("FatherQualification")
    @Expose
    private String fatherQualification;
    @SerializedName("FatherNamePhoto")
    @Expose
    private String fatherNamePhoto;
    @SerializedName("FatherVoterCard")
    @Expose
    private String fatherVoterCard;
    @SerializedName("FatherAadharCard")
    @Expose
    private String fatherAadharCard;
    @SerializedName("FatherOcupation")
    @Expose
    private String fatherOcupation;
    @SerializedName("FatherMobileNumber1")
    @Expose
    private String fatherMobileNumber1;
    @SerializedName("FatherMobilenumber2")
    @Expose
    private String fatherMobilenumber2;
    @SerializedName("FatherIncome")
    @Expose
    private String fatherIncome;
    @SerializedName("MotherName")
    @Expose
    private String motherName;
    @SerializedName("MotherNamePhoto")
    @Expose
    private String motherNamePhoto;
    @SerializedName("MotherQualification")
    @Expose
    private String motherQualification;
    @SerializedName("MotherPhoto")
    @Expose
    private String motherPhoto;
    @SerializedName("MotherVoterCard")
    @Expose
    private String motherVoterCard;
    @SerializedName("MotherAadharCard")
    @Expose
    private String motherAadharCard;
    @SerializedName("MotherOcupation")
    @Expose
    private String motherOcupation;
    @SerializedName("MotherMobileNumber")
    @Expose
    private String motherMobileNumber;
    @SerializedName("MotherIncome")
    @Expose
    private String motherIncome;
    @SerializedName("GuardianName")
    @Expose
    private String guardianName;
    @SerializedName("GuardianPhoto")
    @Expose
    private String guardianPhoto;
    @SerializedName("GuardianAddress")
    @Expose
    private String guardianAddress;
    @SerializedName("RelationwithGuardian")
    @Expose
    private String relationwithGuardian;
    @SerializedName("Escort1")
    @Expose
    private String escort1;
    @SerializedName("Escort1Photo")
    @Expose
    private String escort1Photo;
    @SerializedName("Escort1Relation")
    @Expose
    private String escort1Relation;
    @SerializedName("Escort1Address")
    @Expose
    private String escort1Address;
    @SerializedName("Escort1Phone")
    @Expose
    private String escort1Phone;
    @SerializedName("Escort2")
    @Expose
    private String escort2;
    @SerializedName("Escort2Photo")
    @Expose
    private String escort2Photo;
    @SerializedName("Escort2Relation")
    @Expose
    private String escort2Relation;
    @SerializedName("Escort2Address")
    @Expose
    private String escort2Address;
    @SerializedName("Escort2Phone")
    @Expose
    private String escort2Phone;
    @SerializedName("Escort3")
    @Expose
    private String escort3;
    @SerializedName("Escort3Photo")
    @Expose
    private String escort3Photo;
    @SerializedName("Escort3Address")
    @Expose
    private String escort3Address;
    @SerializedName("Escort3Relation")
    @Expose
    private String escort3Relation;
    @SerializedName("Escort3Phone")
    @Expose
    private String escort3Phone;
    @SerializedName("Village")
    @Expose
    private String village;
    @SerializedName("Post")
    @Expose
    private String post;
    @SerializedName("BlockMunicipality")
    @Expose
    private String blockMunicipality;
    @SerializedName("PoliceStation")
    @Expose
    private String policeStation;
    @SerializedName("Pin")
    @Expose
    private String pin;
    @SerializedName("StateId")
    @Expose
    private Integer stateId;
    @SerializedName("District")
    @Expose
    private String district;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("MobileNo1")
    @Expose
    private String mobileNo1;
    @SerializedName("MobileNo2")
    @Expose
    private String mobileNo2;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("PresentVillage")
    @Expose
    private String presentVillage;
    @SerializedName("PresentPost")
    @Expose
    private String presentPost;
    @SerializedName("PresentBlockMunicipality")
    @Expose
    private String presentBlockMunicipality;
    @SerializedName("PresentPoliceStation")
    @Expose
    private String presentPoliceStation;
    @SerializedName("PresentPin")
    @Expose
    private String presentPin;
    @SerializedName("PresentState")
    @Expose
    private String presentState;
    @SerializedName("PresentDistrict")
    @Expose
    private String presentDistrict;
    @SerializedName("PresentCity")
    @Expose
    private String presentCity;
    @SerializedName("PresentMobileNo1")
    @Expose
    private String presentMobileNo1;
    @SerializedName("PresentMobileNo2")
    @Expose
    private String presentMobileNo2;
    @SerializedName("PresentEmail")
    @Expose
    private String presentEmail;
    @SerializedName("BankName")
    @Expose
    private String bankName;
    @SerializedName("BranchName")
    @Expose
    private String branchName;
    @SerializedName("AccountNo")
    @Expose
    private String accountNo;
    @SerializedName("IfscCode")
    @Expose
    private String ifscCode;
    @SerializedName("UploadPassBook")
    @Expose
    private String uploadPassBook;
    @SerializedName("BPL")
    @Expose
    private Boolean bPL;
    @SerializedName("Bicycle")
    @Expose
    private Boolean bicycle;
    @SerializedName("KanyaShree")
    @Expose
    private Boolean kanyaShree;
    @SerializedName("ShikshaShree")
    @Expose
    private Boolean shikshaShree;
    @SerializedName("YuvaShree")
    @Expose
    private Boolean yuvaShree;
    @SerializedName("AdmissionDate")
    @Expose
    private String admissionDate;
    @SerializedName("Nationality")
    @Expose
    private String nationality;
    @SerializedName("Religion")
    @Expose
    private String religion;
    @SerializedName("Transportation")
    @Expose
    private Boolean transportation;
    @SerializedName("Admission")
    @Expose
    private Boolean admission;
    @SerializedName("IsAlumni")
    @Expose
    private String isAlumni;
    @SerializedName("PreviousSchool")
    @Expose
    private String previousSchool;
    @SerializedName("IsCardIssue")
    @Expose
    private String isCardIssue;
    @SerializedName("Notes")
    @Expose
    private String notes;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return "Class: "+className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSectionName() {
        return "Section: "+sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getSessionStartDate() {
        return sessionStartDate;
    }

    public void setSessionStartDate(String sessionStartDate) {
        this.sessionStartDate = sessionStartDate;
    }

    public Double getMonthlyConcession() {
        return monthlyConcession;
    }

    public void setMonthlyConcession(Double monthlyConcession) {
        this.monthlyConcession = monthlyConcession;
    }

    public Double getYearlyConcession() {
        return yearlyConcession;
    }

    public void setYearlyConcession(Double yearlyConcession) {
        this.yearlyConcession = yearlyConcession;
    }

    public Double getOneTimeConcession() {
        return oneTimeConcession;
    }

    public void setOneTimeConcession(Double oneTimeConcession) {
        this.oneTimeConcession = oneTimeConcession;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getMPSchool() {
        return mPSchool;
    }

    public void setMPSchool(String mPSchool) {
        this.mPSchool = mPSchool;
    }

    public String getMPBoard() {
        return mPBoard;
    }

    public void setMPBoard(String mPBoard) {
        this.mPBoard = mPBoard;
    }

    public String getMPYear() {
        return mPYear;
    }

    public void setMPYear(String mPYear) {
        this.mPYear = mPYear;
    }

    public String getMPMPRegNo() {
        return mPMPRegNo;
    }

    public void setMPMPRegNo(String mPMPRegNo) {
        this.mPMPRegNo = mPMPRegNo;
    }

    public String getMPBeng() {
        return mPBeng;
    }

    public void setMPBeng(String mPBeng) {
        this.mPBeng = mPBeng;
    }

    public String getMPEng() {
        return mPEng;
    }

    public void setMPEng(String mPEng) {
        this.mPEng = mPEng;
    }

    public String getMPMath() {
        return mPMath;
    }

    public void setMPMath(String mPMath) {
        this.mPMath = mPMath;
    }

    public String getMPPSc() {
        return mPPSc;
    }

    public void setMPPSc(String mPPSc) {
        this.mPPSc = mPPSc;
    }

    public String getMPLSc() {
        return mPLSc;
    }

    public void setMPLSc(String mPLSc) {
        this.mPLSc = mPLSc;
    }

    public String getMPHist() {
        return mPHist;
    }

    public void setMPHist(String mPHist) {
        this.mPHist = mPHist;
    }

    public String getMPGeo() {
        return mPGeo;
    }

    public void setMPGeo(String mPGeo) {
        this.mPGeo = mPGeo;
    }

    public String getMPArabic() {
        return mPArabic;
    }

    public void setMPArabic(String mPArabic) {
        this.mPArabic = mPArabic;
    }

    public String getMPTot() {
        return mPTot;
    }

    public void setMPTot(String mPTot) {
        this.mPTot = mPTot;
    }

    public String getMPPercentage() {
        return mPPercentage;
    }

    public void setMPPercentage(String mPPercentage) {
        this.mPPercentage = mPPercentage;
    }

    public String getHSSchool() {
        return hSSchool;
    }

    public void setHSSchool(String hSSchool) {
        this.hSSchool = hSSchool;
    }

    public String getHSRegNo() {
        return hSRegNo;
    }

    public void setHSRegNo(String hSRegNo) {
        this.hSRegNo = hSRegNo;
    }

    public String getHSRollNo() {
        return hSRollNo;
    }

    public void setHSRollNo(String hSRollNo) {
        this.hSRollNo = hSRollNo;
    }

    public String getHSBeng() {
        return hSBeng;
    }

    public void setHSBeng(String hSBeng) {
        this.hSBeng = hSBeng;
    }

    public String getHSEng() {
        return hSEng;
    }

    public void setHSEng(String hSEng) {
        this.hSEng = hSEng;
    }

    public String getHSMath() {
        return hSMath;
    }

    public void setHSMath(String hSMath) {
        this.hSMath = hSMath;
    }

    public String getHSPhy() {
        return hSPhy;
    }

    public void setHSPhy(String hSPhy) {
        this.hSPhy = hSPhy;
    }

    public String getHSChem() {
        return hSChem;
    }

    public void setHSChem(String hSChem) {
        this.hSChem = hSChem;
    }

    public String getHSBoi() {
        return hSBoi;
    }

    public void setHSBoi(String hSBoi) {
        this.hSBoi = hSBoi;
    }

    public String getHSTotal() {
        return hSTotal;
    }

    public void setHSTotal(String hSTotal) {
        this.hSTotal = hSTotal;
    }

    public String getHSPercentage() {
        return hSPercentage;
    }

    public void setHSPercentage(String hSPercentage) {
        this.hSPercentage = hSPercentage;
    }

    public String getHSYearofpassing() {
        return hSYearofpassing;
    }

    public void setHSYearofpassing(String hSYearofpassing) {
        this.hSYearofpassing = hSYearofpassing;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getStudentBillNo() {
        return studentBillNo;
    }

    public void setStudentBillNo(String studentBillNo) {
        this.studentBillNo = studentBillNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
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

    public String getAnyDisability() {
        return anyDisability;
    }

    public void setAnyDisability(String anyDisability) {
        this.anyDisability = anyDisability;
    }

    public String getDateOfBirth() {
        return DateUtils.getFeesDate(dateOfBirth);
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Integer getAcademicYearId() {
        return academicYearId;
    }

    public void setAcademicYearId(Integer academicYearId) {
        this.academicYearId = academicYearId;
    }

    public String getStudentUploadPhoto() {
        return studentUploadPhoto;
    }

    public void setStudentUploadPhoto(String studentUploadPhoto) {
        this.studentUploadPhoto = studentUploadPhoto;
    }

    public String getOBC() {
        return oBC;
    }

    public void setOBC(String oBC) {
        this.oBC = oBC;
    }

    public String getOBCNo() {
        return oBCNo;
    }

    public void setOBCNo(String oBCNo) {
        this.oBCNo = oBCNo;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public String getAadharCardNo() {
        return aadharCardNo;
    }

    public void setAadharCardNo(String aadharCardNo) {
        this.aadharCardNo = aadharCardNo;
    }

    public String getRationCard() {
        return rationCard;
    }

    public void setRationCard(String rationCard) {
        this.rationCard = rationCard;
    }

    public String getRationCardNo() {
        return rationCardNo;
    }

    public void setRationCardNo(String rationCardNo) {
        this.rationCardNo = rationCardNo;
    }

    public String getBirthCertificat() {
        return birthCertificat;
    }

    public void setBirthCertificat(String birthCertificat) {
        this.birthCertificat = birthCertificat;
    }

    public String getBirthCertificatNo() {
        return birthCertificatNo;
    }

    public void setBirthCertificatNo(String birthCertificatNo) {
        this.birthCertificatNo = birthCertificatNo;
    }

    public String getMPMarksheet() {
        return mPMarksheet;
    }

    public void setMPMarksheet(String mPMarksheet) {
        this.mPMarksheet = mPMarksheet;
    }

    public String getMPMarksheetNo() {
        return mPMarksheetNo;
    }

    public void setMPMarksheetNo(String mPMarksheetNo) {
        this.mPMarksheetNo = mPMarksheetNo;
    }

    public String getHSMarksheet() {
        return hSMarksheet;
    }

    public void setHSMarksheet(String hSMarksheet) {
        this.hSMarksheet = hSMarksheet;
    }

    public String getHSMarksheetNo() {
        return hSMarksheetNo;
    }

    public void setHSMarksheetNo(String hSMarksheetNo) {
        this.hSMarksheetNo = hSMarksheetNo;
    }

    public String getMPAdmitCard() {
        return mPAdmitCard;
    }

    public void setMPAdmitCard(String mPAdmitCard) {
        this.mPAdmitCard = mPAdmitCard;
    }

    public String getMPAdmitCardNo() {
        return mPAdmitCardNo;
    }

    public void setMPAdmitCardNo(String mPAdmitCardNo) {
        this.mPAdmitCardNo = mPAdmitCardNo;
    }

    public String getPASSBOOK() {
        return pASSBOOK;
    }

    public void setPASSBOOK(String pASSBOOK) {
        this.pASSBOOK = pASSBOOK;
    }

    public String getXIFees() {
        return xIFees;
    }

    public void setXIFees(String xIFees) {
        this.xIFees = xIFees;
    }

    public String getXIIFees() {
        return xIIFees;
    }

    public void setXIIFees(String xIIFees) {
        this.xIIFees = xIIFees;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherQualification() {
        return fatherQualification;
    }

    public void setFatherQualification(String fatherQualification) {
        this.fatherQualification = fatherQualification;
    }

    public String getFatherNamePhoto() {
        return fatherNamePhoto;
    }

    public void setFatherNamePhoto(String fatherNamePhoto) {
        this.fatherNamePhoto = fatherNamePhoto;
    }

    public String getFatherVoterCard() {
        return fatherVoterCard;
    }

    public void setFatherVoterCard(String fatherVoterCard) {
        this.fatherVoterCard = fatherVoterCard;
    }

    public String getFatherAadharCard() {
        return fatherAadharCard;
    }

    public void setFatherAadharCard(String fatherAadharCard) {
        this.fatherAadharCard = fatherAadharCard;
    }

    public String getFatherOcupation() {
        return fatherOcupation;
    }

    public void setFatherOcupation(String fatherOcupation) {
        this.fatherOcupation = fatherOcupation;
    }

    public String getFatherMobileNumber1() {
        return fatherMobileNumber1;
    }

    public void setFatherMobileNumber1(String fatherMobileNumber1) {
        this.fatherMobileNumber1 = fatherMobileNumber1;
    }

    public String getFatherMobilenumber2() {
        return fatherMobilenumber2;
    }

    public void setFatherMobilenumber2(String fatherMobilenumber2) {
        this.fatherMobilenumber2 = fatherMobilenumber2;
    }

    public String getFatherIncome() {
        return fatherIncome;
    }

    public void setFatherIncome(String fatherIncome) {
        this.fatherIncome = fatherIncome;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherNamePhoto() {
        return motherNamePhoto;
    }

    public void setMotherNamePhoto(String motherNamePhoto) {
        this.motherNamePhoto = motherNamePhoto;
    }

    public String getMotherQualification() {
        return motherQualification;
    }

    public void setMotherQualification(String motherQualification) {
        this.motherQualification = motherQualification;
    }

    public String getMotherPhoto() {
        return motherPhoto;
    }

    public void setMotherPhoto(String motherPhoto) {
        this.motherPhoto = motherPhoto;
    }

    public String getMotherVoterCard() {
        return motherVoterCard;
    }

    public void setMotherVoterCard(String motherVoterCard) {
        this.motherVoterCard = motherVoterCard;
    }

    public String getMotherAadharCard() {
        return motherAadharCard;
    }

    public void setMotherAadharCard(String motherAadharCard) {
        this.motherAadharCard = motherAadharCard;
    }

    public String getMotherOcupation() {
        return motherOcupation;
    }

    public void setMotherOcupation(String motherOcupation) {
        this.motherOcupation = motherOcupation;
    }

    public String getMotherMobileNumber() {
        return motherMobileNumber;
    }

    public void setMotherMobileNumber(String motherMobileNumber) {
        this.motherMobileNumber = motherMobileNumber;
    }

    public String getMotherIncome() {
        return motherIncome;
    }

    public void setMotherIncome(String motherIncome) {
        this.motherIncome = motherIncome;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianPhoto() {
        return guardianPhoto;
    }

    public void setGuardianPhoto(String guardianPhoto) {
        this.guardianPhoto = guardianPhoto;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }

    public String getRelationwithGuardian() {
        return relationwithGuardian;
    }

    public void setRelationwithGuardian(String relationwithGuardian) {
        this.relationwithGuardian = relationwithGuardian;
    }

    public String getEscort1() {
        return escort1;
    }

    public void setEscort1(String escort1) {
        this.escort1 = escort1;
    }

    public String getEscort1Photo() {
        return escort1Photo;
    }

    public void setEscort1Photo(String escort1Photo) {
        this.escort1Photo = escort1Photo;
    }

    public String getEscort1Relation() {
        return escort1Relation;
    }

    public void setEscort1Relation(String escort1Relation) {
        this.escort1Relation = escort1Relation;
    }

    public String getEscort1Address() {
        return escort1Address;
    }

    public void setEscort1Address(String escort1Address) {
        this.escort1Address = escort1Address;
    }

    public String getEscort1Phone() {
        return escort1Phone;
    }

    public void setEscort1Phone(String escort1Phone) {
        this.escort1Phone = escort1Phone;
    }

    public String getEscort2() {
        return escort2;
    }

    public void setEscort2(String escort2) {
        this.escort2 = escort2;
    }

    public String getEscort2Photo() {
        return escort2Photo;
    }

    public void setEscort2Photo(String escort2Photo) {
        this.escort2Photo = escort2Photo;
    }

    public String getEscort2Relation() {
        return escort2Relation;
    }

    public void setEscort2Relation(String escort2Relation) {
        this.escort2Relation = escort2Relation;
    }

    public String getEscort2Address() {
        return escort2Address;
    }

    public void setEscort2Address(String escort2Address) {
        this.escort2Address = escort2Address;
    }

    public String getEscort2Phone() {
        return escort2Phone;
    }

    public void setEscort2Phone(String escort2Phone) {
        this.escort2Phone = escort2Phone;
    }

    public String getEscort3() {
        return escort3;
    }

    public void setEscort3(String escort3) {
        this.escort3 = escort3;
    }

    public String getEscort3Photo() {
        return escort3Photo;
    }

    public void setEscort3Photo(String escort3Photo) {
        this.escort3Photo = escort3Photo;
    }

    public String getEscort3Address() {
        return escort3Address;
    }

    public void setEscort3Address(String escort3Address) {
        this.escort3Address = escort3Address;
    }

    public String getEscort3Relation() {
        return escort3Relation;
    }

    public void setEscort3Relation(String escort3Relation) {
        this.escort3Relation = escort3Relation;
    }

    public String getEscort3Phone() {
        return escort3Phone;
    }

    public void setEscort3Phone(String escort3Phone) {
        this.escort3Phone = escort3Phone;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getBlockMunicipality() {
        return blockMunicipality;
    }

    public void setBlockMunicipality(String blockMunicipality) {
        this.blockMunicipality = blockMunicipality;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNo1() {
        return mobileNo1;
    }

    public void setMobileNo1(String mobileNo1) {
        this.mobileNo1 = mobileNo1;
    }

    public String getMobileNo2() {
        return mobileNo2;
    }

    public void setMobileNo2(String mobileNo2) {
        this.mobileNo2 = mobileNo2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPresentVillage() {
        return presentVillage;
    }

    public void setPresentVillage(String presentVillage) {
        this.presentVillage = presentVillage;
    }

    public String getPresentPost() {
        return presentPost;
    }

    public void setPresentPost(String presentPost) {
        this.presentPost = presentPost;
    }

    public String getPresentBlockMunicipality() {
        return presentBlockMunicipality;
    }

    public void setPresentBlockMunicipality(String presentBlockMunicipality) {
        this.presentBlockMunicipality = presentBlockMunicipality;
    }

    public String getPresentPoliceStation() {
        return presentPoliceStation;
    }

    public void setPresentPoliceStation(String presentPoliceStation) {
        this.presentPoliceStation = presentPoliceStation;
    }

    public String getPresentPin() {
        return presentPin;
    }

    public void setPresentPin(String presentPin) {
        this.presentPin = presentPin;
    }

    public String getPresentState() {
        return presentState;
    }

    public void setPresentState(String presentState) {
        this.presentState = presentState;
    }

    public String getPresentDistrict() {
        return presentDistrict;
    }

    public void setPresentDistrict(String presentDistrict) {
        this.presentDistrict = presentDistrict;
    }

    public String getPresentCity() {
        return presentCity;
    }

    public void setPresentCity(String presentCity) {
        this.presentCity = presentCity;
    }

    public String getPresentMobileNo1() {
        return presentMobileNo1;
    }

    public void setPresentMobileNo1(String presentMobileNo1) {
        this.presentMobileNo1 = presentMobileNo1;
    }

    public String getPresentMobileNo2() {
        return presentMobileNo2;
    }

    public void setPresentMobileNo2(String presentMobileNo2) {
        this.presentMobileNo2 = presentMobileNo2;
    }

    public String getPresentEmail() {
        return presentEmail;
    }

    public void setPresentEmail(String presentEmail) {
        this.presentEmail = presentEmail;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getUploadPassBook() {
        return uploadPassBook;
    }

    public void setUploadPassBook(String uploadPassBook) {
        this.uploadPassBook = uploadPassBook;
    }

    public Boolean getBPL() {
        return bPL;
    }

    public void setBPL(Boolean bPL) {
        this.bPL = bPL;
    }

    public Boolean getBicycle() {
        return bicycle;
    }

    public void setBicycle(Boolean bicycle) {
        this.bicycle = bicycle;
    }

    public Boolean getKanyaShree() {
        return kanyaShree;
    }

    public void setKanyaShree(Boolean kanyaShree) {
        this.kanyaShree = kanyaShree;
    }

    public Boolean getShikshaShree() {
        return shikshaShree;
    }

    public void setShikshaShree(Boolean shikshaShree) {
        this.shikshaShree = shikshaShree;
    }

    public Boolean getYuvaShree() {
        return yuvaShree;
    }

    public void setYuvaShree(Boolean yuvaShree) {
        this.yuvaShree = yuvaShree;
    }

    public String getAdmissionDate() {

        return DateUtils.getFeesDate(admissionDate);
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public Boolean getTransportation() {
        return transportation;
    }

    public void setTransportation(Boolean transportation) {
        this.transportation = transportation;
    }

    public Boolean getAdmission() {
        return admission;
    }

    public void setAdmission(Boolean admission) {
        this.admission = admission;
    }

    public String getIsAlumni() {
        return isAlumni;
    }

    public void setIsAlumni(String isAlumni) {
        this.isAlumni = isAlumni;
    }

    public String getPreviousSchool() {
        return previousSchool;
    }

    public void setPreviousSchool(String previousSchool) {
        this.previousSchool = previousSchool;
    }

    public String getIsCardIssue() {
        return isCardIssue;
    }

    public void setIsCardIssue(String isCardIssue) {
        this.isCardIssue = isCardIssue;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getModifiedDateTime() {
        return modifiedDateTime;
    }

    public void setModifiedDateTime(String modifiedDateTime) {
        this.modifiedDateTime = modifiedDateTime;
    }

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView tImageView, String tImgUrl){
        Glide.with(tImageView.getContext())
                .setDefaultRequestOptions(new RequestOptions()
                        .circleCrop())
                .load(tImgUrl)
                .placeholder(R.mipmap.ic_launcher)
                .into(tImageView);
    }
}
