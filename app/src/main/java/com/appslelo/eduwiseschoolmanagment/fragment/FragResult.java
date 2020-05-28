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
import com.appslelo.eduwiseschoolmanagment.adapter.AdapterResult;
import com.appslelo.eduwiseschoolmanagment.databinding.FragResultBinding;
import com.appslelo.eduwiseschoolmanagment.model.result.ModelResult;
import com.appslelo.eduwiseschoolmanagment.storage.SharedPrefManager;
import com.appslelo.eduwiseschoolmanagment.utils.SetTitle;
import com.appslelo.eduwiseschoolmanagment.view_model.ResultViewModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragResult extends Fragment {

    private Context tContext;
    private FragmentManager tFragmentManager;
    private ResultViewModel tViewModels;
    private FragResultBinding tBinding;
    private ProgressBar pbReportResult;

    private SharedPrefManager tSharedPrefManager;
    private AdapterResult tAdapter;
    @BindView(R.id.rvResult)
    protected RecyclerView rvResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tBinding = DataBindingUtil.inflate(inflater, R.layout.frag_result, container, false);
        View view = tBinding.getRoot();
        ButterKnife.bind(this, view);
        initFrag();
        return view;
    }
    private void initFrag() {
        tContext = getContext();
        tFragmentManager = getParentFragmentManager();
        tSharedPrefManager = new SharedPrefManager(tContext);
        SetTitle.tbTitle("Result", getActivity());
        tViewModels = new ViewModelProvider(this).get(ResultViewModel.class);
        RecyclerView rvResult = tBinding.rvResult;
        pbReportResult = tBinding.pbReportResult;
        rvResult.setLayoutManager(new LinearLayoutManager(tContext));
        rvResult.setNestedScrollingEnabled(false);
        rvResult.setItemAnimator(new DefaultItemAnimator());
        tAdapter = new AdapterResult();
        rvResult.setAdapter(tAdapter);
        getResult();
    }

    private void getResult(){
        String strRegNo = tSharedPrefManager.getUserId();

        tViewModels.getResult(strRegNo).observe(getViewLifecycleOwner(), new Observer<List<ModelResult>>() {
            @Override
            public void onChanged(List<ModelResult> modelResults) {
                pbReportResult.setVisibility(View.GONE);
                tAdapter.setModels(modelResults);

            }
        });
    }


}
