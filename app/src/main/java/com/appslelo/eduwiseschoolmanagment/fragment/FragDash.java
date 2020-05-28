package com.appslelo.eduwiseschoolmanagment.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appslelo.eduwiseschoolmanagment.R;
import com.appslelo.eduwiseschoolmanagment.storage.SharedPrefManager;
import com.appslelo.eduwiseschoolmanagment.utils.SetTitle;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragDash extends Fragment {
    private Context tContext;
    private SharedPrefManager tSharedPrefManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_dash, container, false);
        ButterKnife.bind(this, view);
        initFrag();
        return view;
    }
    private void initFrag() {
        tContext = getContext();
        tSharedPrefManager = new SharedPrefManager(tContext);
        SetTitle.tbTitle("Dashboard", getActivity());

    }

    @OnClick(R.id.cvDashAttendance)
    public void cvDashAttendanceClicked(){
        new AlertDialog.Builder(tContext)
                .setTitle("Attendance")
                .setMessage("Under Development...")
                .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
    @OnClick(R.id.cvDashHomework)
    public void cvDashHomeworkClicked(){
        new AlertDialog.Builder(tContext)
                .setTitle("Homework")
                .setMessage("Under Development...")
                .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
    @OnClick(R.id.cvDashActivity)
    public void cvDashActivityClicked(){
        new AlertDialog.Builder(tContext)
                .setTitle("Daily Activity")
                .setMessage("Under Development...")
                .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
    @OnClick(R.id.cvDashParent)
    public void cvDashParentClicked(){
        new AlertDialog.Builder(tContext)
                .setTitle("Daily Activity")
                .setMessage("Under Development...")
                .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
    @OnClick(R.id.cvDashMeeting)
    public void cvDashMeetingClicked(){
        new AlertDialog.Builder(tContext)
                .setTitle("Meeting")
                .setMessage("Under Development...")
                .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
    @OnClick(R.id.cvDashContact)
    public void cvDashContactClicked(){
        new AlertDialog.Builder(tContext)
                .setTitle("Contact")
                .setMessage("Under Development...")
                .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
    @OnClick(R.id.cvDashFees)
    public void cvDashFeesClicked(){
        new AlertDialog.Builder(tContext)
                .setTitle("Fees Details")
                .setMessage("Under Development...")
                .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
    @OnClick(R.id.cvDashExpenses)
    public void cvDashExpensesClicked(){
        new AlertDialog.Builder(tContext)
                .setTitle("Expenses")
                .setMessage("Under Development...")
                .setPositiveButton("OK", new DialogInterface. OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setCancelable(false)
                .create()
                .show();
    }
}
