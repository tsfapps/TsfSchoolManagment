package com.appslelo.eduwiseschoolmanagment.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.appslelo.eduwiseschoolmanagment.R;
import com.appslelo.eduwiseschoolmanagment.databinding.FragResultItemBinding;
import com.appslelo.eduwiseschoolmanagment.model.result.ModelResult;
import com.appslelo.eduwiseschoolmanagment.storage.SharedPrefManager;
import com.appslelo.eduwiseschoolmanagment.utils.Constant;

import java.util.List;

public class AdapterResult extends RecyclerView.Adapter<AdapterResult.ResultViewHolder> {
    private Context tContext;
    private List<ModelResult> tModels;
    private SharedPrefManager tSharedPrefManager;

    @NonNull
    @Override
    public ResultViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        FragResultItemBinding tBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                R.layout.frag_result_item, viewGroup, false);

        tContext=viewGroup.getContext();
        return new ResultViewHolder(tBinding);
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final ResultViewHolder resultViewHolder, final int i) {
        ModelResult tModel = tModels.get(i);
        resultViewHolder.tBinding.setResult(tModel);
    }
    @Override
    public int getItemCount() {
        if (tModels != null) {
            Log.d(Constant.TAG,"Size: "+tModels.size());
            return tModels.size();

        }else {
            return 0;
        }
    }

    public void setModels(List<ModelResult> tModels){
        this.tModels = tModels;
        notifyDataSetChanged();
    }

    static class ResultViewHolder extends RecyclerView.ViewHolder{


        private Button btnResultDetail;

        private FragResultItemBinding tBinding;
         ResultViewHolder(FragResultItemBinding tBinding) {
            super(tBinding.getRoot());
            this.tBinding = tBinding;
            btnResultDetail = tBinding.btnResultDetail;
        }
    }

}
