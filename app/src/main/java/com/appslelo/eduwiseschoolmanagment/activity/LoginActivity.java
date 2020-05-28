package com.appslelo.eduwiseschoolmanagment.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.appslelo.eduwiseschoolmanagment.R;
import com.appslelo.eduwiseschoolmanagment.api.Api;
import com.appslelo.eduwiseschoolmanagment.api.ApiClients;
import com.appslelo.eduwiseschoolmanagment.model.ModelUser;
import com.appslelo.eduwiseschoolmanagment.storage.SharedPrefManager;
import com.google.gson.JsonObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private ModelUser tModels;
    private SharedPrefManager tSharedPrefManager;
    @BindView(R.id.et_phone_login)
    protected EditText et_phone;
    @BindView(R.id.et_password_login)
    protected EditText et_password;
    private ProgressDialog mDialog;

    String deviceUniqueIdentifier = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        tSharedPrefManager = new SharedPrefManager(this); }
    @OnClick(R.id.btn_login)
    public void onButtonClick(View view) {
        submitBtn();
    }
    private void submitBtn() {
        String tUserId = et_phone.getText().toString().trim();
        String tPass = et_password.getText().toString().trim();

        if (tUserId.isEmpty()) {
            et_phone.setError("Enter phone no");
        } else if (tPass.isEmpty()) {
            et_password.setError("Enter the password");
        } else {

            JsonObject postParam = new JsonObject();
            try {
                postParam.addProperty("Username", tUserId);
                postParam.addProperty("Password", tPass);
            } catch (Exception e) {
                e.printStackTrace();
            }

            Api api = ApiClients.getApiClients().create(Api.class);
            Call<ModelUser> call = api.getLogin(postParam);
            call.enqueue(new Callback<ModelUser>() {
                             @Override
                             public void onResponse(Call<ModelUser> call, Response<ModelUser> response) {
                                 ModelUser tModel = response.body();
                                 assert tModel != null;
                                 String strUserId = tModel.getUserName();
                                 String strAcademicYearId = String.valueOf(tModel.getAcademicYearId());
                                 String strClassId = String.valueOf(tModel.getClassId());
                                 String strSectionId = String.valueOf(tModel.getSectionId());
//                                 String strExaminationDetailsId = String.valueOf(tModel.());
                                 Boolean strGender = tModel.getGender();
                                 String strName = tModel.getUserName();
                                 String strFullName = tModel.getFullName();
                                 String strMobile = tModel.getMobile();
                                 tSharedPrefManager.setUserData(strUserId, strName, strFullName, strMobile);
                                 Toast.makeText(LoginActivity.this, tModel.getFullName(), Toast.LENGTH_SHORT).show();
                                 Log.d("response","Getting response from server : "+tModel.getFullName());
                             }

                             @Override
                             public void onFailure(Call<ModelUser> call, Throwable t) {
                                 Log.d("response","Getting response from server : "+t);
                             }
                         }
            );


//            Api api = ApiClients.getApiClients().create(Api.class);
//            Call<ModelUser> call = api.getUserDetail(tImei,tUserId, tPass);
//            call.enqueue(new Callback<ModelUser>() {
//                @Override
//                public void onResponse(Call<ModelUser> call, Response<ModelUser> response) {
//                    tModels = response.body();
//                    if (!tModels.getError()) {

                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
//                    }
//                    else {
//                        Toast.makeText(getApplicationContext(), tModels.getMessage(), Toast.LENGTH_LONG).show();
//                    }
//                }
//                @Override
//                public void onFailure(Call<ModelUser> call, Throwable t) {
//                CustomLog.e(Constant.TAG, "Not responding : " + t);
//                }
//            });
//        }
//    }
//
//    @SuppressWarnings("deprecation")
//    public String getDeviceIMEI() {
//        if (ActivityCompat.checkSelfPermission (LoginActivity.this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission (this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//            TelephonyManager tm = (TelephonyManager) this.getSystemService (Context.TELEPHONY_SERVICE);
//            if (null != tm) {
//                deviceUniqueIdentifier = tm.getImei ();
//            }
//            if (null == deviceUniqueIdentifier || 0 == deviceUniqueIdentifier.length ()) {
//                deviceUniqueIdentifier = Settings.Secure.getString (this.getContentResolver (), Settings.Secure.ANDROID_ID);
//            }
//
//        }
//        return deviceUniqueIdentifier;
//    }

        }
    }
}