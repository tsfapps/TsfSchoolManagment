package com.appslelo.eduwiseschoolmanagment.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.appslelo.eduwiseschoolmanagment.R;
import com.appslelo.eduwiseschoolmanagment.adapter.AdapterFees;
import com.appslelo.eduwiseschoolmanagment.databinding.FragFeesBinding;
import com.appslelo.eduwiseschoolmanagment.model.ModelFees;
import com.appslelo.eduwiseschoolmanagment.storage.SharedPrefManager;
import com.appslelo.eduwiseschoolmanagment.utils.SetTitle;
import com.appslelo.eduwiseschoolmanagment.view_model.FeesViewModel;

import java.util.List;

import butterknife.ButterKnife;

public class FragFees extends Fragment {

    private Context tContext;
    private SharedPrefManager tSharedPrefManager;
    private FragmentManager tFragmentManager;
    private FeesViewModel tViewModel;
    private FragFeesBinding tBinding;
    private ProgressBar pbReportFees;

    private AdapterFees tAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tBinding = DataBindingUtil.inflate(inflater, R.layout.frag_fees, container, false);
        View view = tBinding.getRoot();
        ButterKnife.bind(this, view);
        initFrag();
        return view;
    }
    private void initFrag() {
        tContext = getContext();
        tFragmentManager = getParentFragmentManager();
        tSharedPrefManager = new SharedPrefManager(tContext);
        SetTitle.tbTitle("Fees", getActivity());
        tViewModel = new ViewModelProvider(this).get(FeesViewModel.class);
        pbReportFees = tBinding.pbReportFees;
        RecyclerView rvFees = tBinding.rvFees;
        rvFees.setLayoutManager(new LinearLayoutManager(tContext));
        rvFees.setNestedScrollingEnabled(false);
        rvFees.setItemAnimator(new DefaultItemAnimator());
        tAdapter = new AdapterFees();
        rvFees.setAdapter(tAdapter);
        getFees();

    }
    private void getFees(){
        String strRegNo = tSharedPrefManager.getUserId();
        tViewModel.getFees(strRegNo).observe(getViewLifecycleOwner(), new Observer<List<ModelFees>>() {
            @Override
            public void onChanged(List<ModelFees> modelFees) {
                pbReportFees.setVisibility(View.GONE);
                tAdapter.setFeesModels(modelFees);
            }
        });

    }

}
