package com.appslelo.eduwiseschoolmanagment.view_model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.appslelo.eduwiseschoolmanagment.model.ModelStudentDetails;
import com.appslelo.eduwiseschoolmanagment.repository.RepositoryProfile;
import com.google.gson.JsonObject;

import java.util.List;

public class ProfileViewModel extends AndroidViewModel {
    private RepositoryProfile repositoryProfile;
    public ProfileViewModel(@NonNull Application application) {
        super(application);
        repositoryProfile = new RepositoryProfile();
    }
    public MutableLiveData<List<ModelStudentDetails>> getProfile(String strRegNo){
        JsonObject postParam = new JsonObject();
        try {
            postParam.addProperty("RegistrationNo", strRegNo);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return repositoryProfile.getLiveData(postParam);
    }
}
