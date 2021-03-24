package com.example.myweather.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myweather.BR;
import com.example.myweather.R;
import com.example.myweather.databinding.ActivityMainBinding;
import com.example.myweather.models.MyList;
import com.example.myweather.models.PollutionModels;
import com.example.myweather.viewModel.PollutionViewModel;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class PollutionListAdapter extends RecyclerView.Adapter<PollutionListAdapter.MyViewHolder> {

    private Context context;
    private List<PollutionModels> pollutionModelsList;

    public PollutionListAdapter(Context context, List<PollutionModels> pollutionModelsList) {
        this.context = context;
        this.pollutionModelsList = pollutionModelsList;
    }

    public void setPollutionModelsList(List<PollutionModels> pollutionModelsList) {
        this.pollutionModelsList = pollutionModelsList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PollutionListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.air_components_main, parent, false);
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.air_component_row, parent, false);

        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PollutionListAdapter.MyViewHolder holder, int position) {
        PollutionModels pollutionModels = pollutionModelsList.get(position);
        holder.bind(pollutionModels);
//        holder.binding
    }

    @Override
    public int getItemCount() {
        if(pollutionModelsList != null) {
            return pollutionModelsList.size();
        } else {
            return 0;
        }

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final ViewDataBinding binding;

        public MyViewHolder(@NonNull ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object obj) {
            binding.setVariable(BR.pollutionModels, obj);
            binding.executePendingBindings();
        }
    }
}
