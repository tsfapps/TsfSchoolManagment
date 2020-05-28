package com.appslelo.eduwiseschoolmanagment.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.appslelo.eduwiseschoolmanagment.model.ModelFees;
import com.appslelo.eduwiseschoolmanagment.repository.RepositoryFees;
import com.google.gson.JsonObject;

import java.util.List;

public class FeesViewModel extends AndroidViewModel {
    private RepositoryFees repositoryFees;
    public FeesViewModel(@NonNull Application application) {
        super(application);
        repositoryFees = new RepositoryFees();
    }
    public MutableLiveData<List<ModelFees>> getFees(String strRegNo){
        JsonObject postParam = new JsonObject();
        try {
            postParam.addProperty("RegistrationNo", strRegNo);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return repositoryFees.getLiveData(postParam);
    }
}
