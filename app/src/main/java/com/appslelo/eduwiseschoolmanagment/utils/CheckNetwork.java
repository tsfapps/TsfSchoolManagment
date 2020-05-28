package com.appslelo.eduwiseschoolmanagment.utils;

import android.content.Context;
import android.net.ConnectivityManager;

public class CheckNetwork {
    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
