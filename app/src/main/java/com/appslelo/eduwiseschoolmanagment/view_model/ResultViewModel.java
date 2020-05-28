package com.appslelo.eduwiseschoolmanagment.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.appslelo.eduwiseschoolmanagment.model.result.ModelResult;
import com.appslelo.eduwiseschoolmanagment.repository.RepositoryResult;
import com.google.gson.JsonObject;

import java.util.List;


public class ResultViewModel extends AndroidViewModel {
    private RepositoryResult tRepositoryNewCustomer;
    public ResultViewModel(@NonNull Application application) {
        super(application);
        tRepositoryNewCustomer = new RepositoryResult();
    }
    public MutableLiveData<List<ModelResult>> getResult(String strRegNo){
        JsonObject postParam = new JsonObject();
        try {
            postParam.addProperty("RegistrationNo", strRegNo);
            postParam.addProperty("AcademicYearId", 1);
            postParam.addProperty("ClassId", 1);
            postParam.addProperty("SectionId", 1);
            postParam.addProperty("ExaminationDetailsId", 6);
            postParam.addProperty("Gender", false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tRepositoryNewCustomer.getLiveData(postParam);
    }

}
