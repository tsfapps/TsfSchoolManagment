package com.appslelo.eduwiseschoolmanagment.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class GetImei {
    public static String getDeviceIMEI(Context tContext, Activity tActivity) {
        int permissionCheck = ContextCompat.checkSelfPermission(tContext, Manifest.permission.READ_PHONE_STATE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(tActivity, new String[]{Manifest.permission.READ_PHONE_STATE}, Constant.REQUEST_READ_PHONE_STATE);
            return "Permission not granted";
        }
        else {
            String deviceUniqueIdentifier = null;
            TelephonyManager tm = (TelephonyManager) tContext.getSystemService(Context.TELEPHONY_SERVICE);
            if (null != tm) {
                deviceUniqueIdentifier = tm.getDeviceId();
            }
            if (null == deviceUniqueIdentifier || 0 == deviceUniqueIdentifier.length()) {
                deviceUniqueIdentifier = Settings.Secure.getString(tContext.getContentResolver(), Settings.Secure.ANDROID_ID);
            }
            return deviceUniqueIdentifier;
        }

    }

}
