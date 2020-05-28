package com.appslelo.eduwiseschoolmanagment.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.appslelo.eduwiseschoolmanagment.R;
import com.appslelo.eduwiseschoolmanagment.databinding.FragFeesItemBinding;
import com.appslelo.eduwiseschoolmanagment.model.ModelFees;
import com.appslelo.eduwiseschoolmanagment.storage.SharedPrefManager;
import com.appslelo.eduwiseschoolmanagment.utils.Constant;

import java.util.List;

public class AdapterFees extends RecyclerView.Adapter<AdapterFees.FeesViewHolder> {
    private Context tContext;
    private FragmentManager tFragmentManager;
    private List<ModelFees> tModels;
    SharedPrefManager tSharedPrefManager;

    @NonNull
    @Override
    public FeesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        FragFeesItemBinding tBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                R.layout.frag_fees_item, viewGroup, false);
        tContext = viewGroup.getContext();
        tSharedPrefManager = new SharedPrefManager(tContext);
        return new FeesViewHolder(tBinding);
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final FeesViewHolder feesViewHolder, final int i) {
        ModelFees tModel = tModels.get(i);
        feesViewHolder.tBinding.setFees(tModel);

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

    public void setFeesModels(List<ModelFees> tModels){
        this.tModels = tModels;
        notifyDataSetChanged();
    }
     class FeesViewHolder extends RecyclerView.ViewHolder{
        private FragFeesItemBinding tBinding;
        FeesViewHolder(FragFeesItemBinding tBinding) {
            super(tBinding.getRoot());
           this.tBinding = tBinding;
        }
    }

}
