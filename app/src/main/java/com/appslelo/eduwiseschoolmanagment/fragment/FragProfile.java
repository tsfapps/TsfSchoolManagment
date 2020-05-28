package com.appslelo.eduwiseschoolmanagment.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import com.appslelo.eduwiseschoolmanagment.R;
import com.appslelo.eduwiseschoolmanagment.databinding.FragProfileBinding;
import com.appslelo.eduwiseschoolmanagment.model.ModelStudentDetails;
import com.appslelo.eduwiseschoolmanagment.storage.SharedPrefManager;
import com.appslelo.eduwiseschoolmanagment.utils.SetTitle;
import com.appslelo.eduwiseschoolmanagment.view_model.ProfileViewModel;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FragProfile extends Fragment {
    private SharedPrefManager tSharedPrefManager;
    private Context tContext;
    private ProfileViewModel tViewModel;
    private FragProfileBinding tBinding;
    private String strStdName;

    //my details
    private String strRegNum;
    private String strAcademicYear;
    private String strDob;
    private String strRollNo;
    private String strBloodGroup;

    //parents and scot
    private String strFatherName;
    private String strMotherName;
    private String strFatherMob;

    //address
    private String strVillage;
    private String strPost;
    private String strBlock;
    private String strPoliceStation;
    private String strDistrict;
    private String strState;
    private String strPinCode;
    private String strMobNo1;
    private String strMobNo2;

    //bank details
    private String strBankName;
    private String strBranchName;
    private String strAccountNumber;
    private String strIfsc;

    //Scholarship
    private String strBpl;
    private String strBicycle;
    private String strKanyaShree;
    private String strShikhaShree;
    private String strYuvaShree;

    //Other Details
    private String strAdmissionDate;
    private String strTransportation;
    private String strNationality;
    private String strReligion;
    private String strPreviousSchool;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         tBinding = DataBindingUtil.inflate(inflater, R.layout.frag_profile, container, false);
         View view = tBinding.getRoot();
        ButterKnife.bind(this, view);
        initFrag();
        return view;
    }
    private void initFrag() {
        tContext = getContext();
        tSharedPrefManager = new SharedPrefManager(tContext);
        SetTitle.tbTitle("Profile", getActivity());
        tViewModel = new ViewModelProvider(this).get(ProfileViewModel.class);
        getProfile();
    }
    private void getProfile(){
        String strRegNo = tSharedPrefManager.getUserId();
        tViewModel.getProfile(strRegNo).observe(getViewLifecycleOwner(), new Observer<List<ModelStudentDetails>>() {
            @Override
            public void onChanged(List<ModelStudentDetails> modelStudentDetails) {
                tBinding.setProfile(modelStudentDetails.get(0));
                //my details
                strRegNum = modelStudentDetails.get(0).getRegistrationNo();
                strAcademicYear = modelStudentDetails.get(0).getSessionName();
                strDob = modelStudentDetails.get(0).getDateOfBirth();
                strRollNo = modelStudentDetails.get(0).getRollNo();
                strBloodGroup = modelStudentDetails.get(0).getBloodGroup();

                //parents and scot
                strFatherName = modelStudentDetails.get(0).getFatherName();
                strMotherName = modelStudentDetails.get(0).getMotherName();
                strFatherMob = modelStudentDetails.get(0).getFatherMobileNumber1();

                //address
                strVillage = modelStudentDetails.get(0).getVillage();
                strPost = modelStudentDetails.get(0).getPost();
                strBlock = modelStudentDetails.get(0).getBlockMunicipality();
                strPoliceStation = modelStudentDetails.get(0).getPoliceStation();
                strDistrict = modelStudentDetails.get(0).getDistrict();
                strState = modelStudentDetails.get(0).getStateName();
                strPinCode = modelStudentDetails.get(0).getPin();
                strMobNo1 = modelStudentDetails.get(0).getMobileNo1();
                strMobNo2 = modelStudentDetails.get(0).getMobileNo2();

                //bank details
                strBankName = modelStudentDetails.get(0).getBankName();
                strBranchName = modelStudentDetails.get(0).getBranchName();
                strAccountNumber = modelStudentDetails.get(0).getAccountNo();
                strIfsc = modelStudentDetails.get(0).getIfscCode();

                //Scholarship
                strBpl = String.valueOf(modelStudentDetails.get(0).getBPL());
                strBicycle = String.valueOf(modelStudentDetails.get(0).getBicycle());
                strKanyaShree = String.valueOf(modelStudentDetails.get(0).getKanyaShree());
                strShikhaShree = String.valueOf(modelStudentDetails.get(0).getShikshaShree());
                strYuvaShree = String.valueOf(modelStudentDetails.get(0).getYuvaShree());

                //Other Details
                strAdmissionDate = modelStudentDetails.get(0).getAdmissionDate();
                strTransportation = String.valueOf(modelStudentDetails.get(0).getTransportation());
                strNationality = modelStudentDetails.get(0).getNationality();
                strReligion = modelStudentDetails.get(0).getReligion();
                strPreviousSchool = modelStudentDetails.get(0).getPreviousSchool();
            }
        });

    }

    @OnClick(R.id.cvProMyDetails)

    public void cvProMyDetailsClicked(){
        {
            new AlertDialog.Builder(tContext)
                    .setTitle("My Details")
                    .setMessage("Reg. Num: "+strRegNum+"\n\n"+ "Academic Year: "+strAcademicYear
                            +"\n\n"+ "DOB: "+strDob+"\n\n"+ "Blood Group: "+strBloodGroup+"\n\n"+ "Roll Number: "+strRollNo)
                    .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }
    @OnClick(R.id.cvProParents)
    public void cvProParentsClicked(){
        {
            new AlertDialog.Builder(tContext)
                    .setTitle("Parents and Scot")
                    .setMessage("Father Name: "+strFatherName+"\n\n"+ "Mother Name: "+strMotherName+"\n\n"+
                            "Father Mobile: "+strFatherMob)
                    .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }
    @OnClick(R.id.cvProAddress)
    public void cvProAddressClicked(){
        {
            new AlertDialog.Builder(tContext)
                    .setTitle("Address")
                    .setMessage("Village: "+strVillage+"\n\n"+ "Post: "+strPost+"\n\n"+ "Block: "+strBlock
                            +"\n\n"+ "Police Station: "+strPoliceStation+"\n\n"+ "District: "+strDistrict
                            +"\n\n"+ "State: "+strState+"\n\n"+ "Pin Code: "+strPinCode
                            +"\n\n"+ "Mob No 1: "+strMobNo1+"\n\n"+ "Mob No 2: "+strMobNo2)
                    .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }
    @OnClick(R.id.cvProBank)
    public void cvProBankClicked(){
        {
            new AlertDialog.Builder(tContext)
                    .setTitle("Bank Details")
                    .setMessage("Bank Name: "+strBankName+"\n\n"+ "Branch Name: "+strBranchName+"\n\n"+
                            "Account Number: "+strAccountNumber+"\n\n"+
                            "IFSC Code: "+strIfsc)
                    .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }
    @OnClick(R.id.cvProDocuments)
    public void cvProDocumentsClicked(){
        {
            new AlertDialog.Builder(tContext)
                    .setTitle("Documents")
                    .setMessage("Under screening ...")
                    .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }
    @OnClick(R.id.cvProOtherDetails)
    public void cvProOtherDetailsClicked(){
        {
            new AlertDialog.Builder(tContext)
                    .setTitle("Other Details")
                    .setMessage("Admission Date: "+strAdmissionDate+"\n\n"+ "Transportation: "+strTransportation
                            +"\n\n"+ "Nationality: "+strNationality +"\n\n"+ "Religion: "
                            +strReligion+"\n\n"+ "Previous School: "+strPreviousSchool)
                    .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    })
                    .setCancelable(false)
                    .create()
                    .show();
        }
    }
}
