package com.appslelo.eduwiseschoolmanagment.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.appslelo.eduwiseschoolmanagment.api.Api;
import com.appslelo.eduwiseschoolmanagment.api.ApiClients;
import com.appslelo.eduwiseschoolmanagment.model.ModelFees;
import com.appslelo.eduwiseschoolmanagment.utils.Constant;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoryFees {
    private List<ModelFees> tModels;
    private MutableLiveData<List<ModelFees>> tLiveData = new MutableLiveData<>();

    public RepositoryFees() {
    }

    public MutableLiveData<List<ModelFees>> getLiveData(JsonObject postParam){


        Api api = ApiClients.getApiClients().create(Api.class);
        Call<List<ModelFees>> call = api.getFees(postParam);
        call.enqueue(new Callback<List<ModelFees>>() {
            @Override
            public void onResponse(Call<List<ModelFees>> call, Response<List<ModelFees>> response) {
                tModels = response.body();
                tLiveData.setValue(tModels);
            }
            @Override
            public void onFailure(Call<List<ModelFees>> call, Throwable t) {
                Log.d(Constant.TAG, "Error Fees: "+t);

            }
        });   return tLiveData;
    }
}
