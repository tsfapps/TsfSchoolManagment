package com.appslelo.eduwiseschoolmanagment.api;

import com.appslelo.eduwiseschoolmanagment.model.ModelFees;
import com.appslelo.eduwiseschoolmanagment.model.result.ModelResult;
import com.appslelo.eduwiseschoolmanagment.model.ModelStudentDetails;
import com.appslelo.eduwiseschoolmanagment.model.ModelUser;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Api{

    @POST("Api/Security/Login")
    Call<ModelUser> getLogin(@Body JsonObject jsonObject);
    @POST("Api/Student/StudentDetails")
    Call<List<ModelStudentDetails>> getStudentDetails(@Body JsonObject jsonObject);
    @POST("Api/ExamResult/MarkSheetDetails")
    Call<List<ModelResult>> getResult(@Body JsonObject jsonObject);
    @POST("Api/Account/StudentPaymentDetails")
    Call<List<ModelFees>> getFees(@Body JsonObject jsonObject);



}
