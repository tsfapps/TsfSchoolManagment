package com.appslelo.eduwiseschoolmanagment.utils;

import android.content.Context;
import android.widget.Button;

import androidx.core.content.ContextCompat;

import com.appslelo.eduwiseschoolmanagment.R;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class CustomDialog {
    public static void showEmptyDialog(final Context context) {
        final SweetAlertDialog alertDialog = new SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE);
        alertDialog.setTitleText("Empty Field Found");
        alertDialog.setConfirmText("Okay");
        alertDialog.setConfirmClickListener( new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
               alertDialog.dismissWithAnimation();
            }
        });

        alertDialog.show();
        Button btn = (Button) alertDialog.findViewById(R.id.confirm_button);
        btn.setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary));
        Button btn1 = (Button) alertDialog.findViewById(R.id.cancel_button);
        btn1.setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary));

    }
    public static void showEmptyTitle(final Context context, String strTitleMessage) {
        final SweetAlertDialog alertDialog = new SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE);
        alertDialog.setTitleText(strTitleMessage);
        alertDialog.setConfirmText("Okay");
        alertDialog.setConfirmClickListener( new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
               alertDialog.dismissWithAnimation();
            }
        });

        alertDialog.show();
        Button btn = (Button) alertDialog.findViewById(R.id.confirm_button);
        btn.setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary));
        Button btn1 = (Button) alertDialog.findViewById(R.id.cancel_button);
        btn1.setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary));

    }

}
