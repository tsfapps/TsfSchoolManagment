package com.appslelo.eduwiseschoolmanagment.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.appslelo.eduwiseschoolmanagment.api.Api;
import com.appslelo.eduwiseschoolmanagment.api.ApiClients;
import com.appslelo.eduwiseschoolmanagment.model.result.ModelResult;
import com.appslelo.eduwiseschoolmanagment.utils.Constant;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoryResult {

    private List<ModelResult> tModels;
    private MutableLiveData<List<ModelResult>> tLiveData = new MutableLiveData<>();

    public RepositoryResult() {
    }

    public MutableLiveData<List<ModelResult>> getLiveData(JsonObject postParam){


        Api api = ApiClients.getApiClients().create(Api.class);
        Call<List<ModelResult>> call = api.getResult(postParam);
        call.enqueue(new Callback<List<ModelResult>>() {
            @Override
            public void onResponse(Call<List<ModelResult>> call, Response<List<ModelResult>> response) {
                tModels = response.body();
                tLiveData.setValue(tModels);
            }
            @Override
            public void onFailure(Call<List<ModelResult>> call, Throwable t) {
                Log.d(Constant.TAG, "Error: "+t);

            }
        });   return tLiveData;
    }
}
