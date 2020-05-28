package com.appslelo.eduwiseschoolmanagment.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.appslelo.eduwiseschoolmanagment.fragment.FragDash;
import com.appslelo.eduwiseschoolmanagment.fragment.FragFees;
import com.appslelo.eduwiseschoolmanagment.fragment.FragProfile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

import com.appslelo.eduwiseschoolmanagment.R;
import com.appslelo.eduwiseschoolmanagment.storage.SharedPrefManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private Context tContext;
    private SharedPrefManager tSharedPrefManager;
    @BindView(R.id.tvToolbar)
    protected TextView tTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        initActivity();

    }

    private void initActivity(){
        tContext = getApplicationContext();
        tSharedPrefManager = new SharedPrefManager(tContext);
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main,
                new FragDash()).commit();
    }

    public void setToolbarTitle(String strTitle){
        tTitle.setText(strTitle);
    }


    @OnClick(R.id.iv_bottom_dashboard)
    public void bottomDashClicked(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main,
                new FragDash()).addToBackStack(null).commit();
    }
    @OnClick(R.id.iv_bottom_result)
    public void bottomResultClicked(){
        {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Result")
                        .setMessage("Your result will appear here, once published...")
                        .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            }
                        })
                        .setCancelable(false)
                        .create()
                        .show();
            }
//        getSupportFragmentManager().beginTransaction().replace(R.id.container_main,
//                new FragResult()).addToBackStack(null).commit();
    }
    @OnClick(R.id.iv_bottom_fees)
    public void bottomFeesClicked(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main,
                new FragFees()).addToBackStack(null).commit();
    }
    @OnClick(R.id.iv_bottom_profile)
    public void bottomProfileClicked(){
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main,
                new FragProfile()).addToBackStack(null).commit();
    }


    @OnClick(R.id.iv_logout)
    public void onLogout(View view){
        tSharedPrefManager.clearUserData();
        startActivity(new Intent(tContext, LoginActivity.class));
        finishAffinity();
    }

}
