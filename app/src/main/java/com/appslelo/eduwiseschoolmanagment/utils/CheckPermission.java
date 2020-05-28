package com.appslelo.eduwiseschoolmanagment.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class CheckPermission extends AppCompatActivity {



    public static boolean isCameraAllowed(Context tContext) {
        if (ContextCompat.checkSelfPermission(tContext, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_DENIED)
            return true;
        return false;
    }
    public static void requestCameraPermission(Activity tActivity){

        ActivityCompat.requestPermissions(tActivity,new String[]{Manifest.permission.CAMERA},Constant.STORAGE_PERMISSION_CODE);
    }
    public static boolean isReadStorageAllowed(Context tContext) {
        int result = ContextCompat.checkSelfPermission(tContext, Manifest.permission.READ_EXTERNAL_STORAGE);

        if (result == PackageManager.PERMISSION_GRANTED)
            return true;
        return false;
    }
    public static void requestStoragePermission(Activity tActivity){
        ActivityCompat.requestPermissions(tActivity,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},Constant.STORAGE_PERMISSION_CODE);
    }

    private static boolean checkWriteExternalPermission(Context tContext)
    {
        String permission = Manifest.permission.WRITE_EXTERNAL_STORAGE;
        int res = tContext.checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }






    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

    }

}
