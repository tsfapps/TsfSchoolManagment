package com.appslelo.eduwiseschoolmanagment.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.appslelo.eduwiseschoolmanagment.api.Api;
import com.appslelo.eduwiseschoolmanagment.api.ApiClients;
import com.appslelo.eduwiseschoolmanagment.model.ModelStudentDetails;
import com.appslelo.eduwiseschoolmanagment.utils.Constant;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoryProfile {
    private List<ModelStudentDetails> tModels;
    private MutableLiveData<List<ModelStudentDetails>> tLiveData = new MutableLiveData<>();

    public RepositoryProfile() {
    }

    public MutableLiveData<List<ModelStudentDetails>> getLiveData(JsonObject postParam){


        Api api = ApiClients.getApiClients().create(Api.class);
        Call<List<ModelStudentDetails>> call = api.getStudentDetails(postParam);
        call.enqueue(new Callback<List<ModelStudentDetails>>() {
            @Override
            public void onResponse(Call<List<ModelStudentDetails>> call, Response<List<ModelStudentDetails>> response) {
                tModels = response.body();

                tLiveData.setValue(tModels);
                Log.d(Constant.TAG, "Response Profile: "+tModels.get(0).getStudentName());

            }
            @Override
            public void onFailure(Call<List<ModelStudentDetails>> call, Throwable t) {
                Log.d(Constant.TAG, "Error Profile: "+t);

            }
        });   return tLiveData;
    }
}
