package com.example.myweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.example.myweather.adapter.PollutionListAdapter;
import com.example.myweather.databinding.ActivityMainBinding;
import com.example.myweather.models.MyList;
import com.example.myweather.models.PollutionModels;
import com.example.myweather.viewModel.PollutionViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<PollutionModels> pollutionModelsList;
    private PollutionListAdapter adapter;
    private PollutionViewModel pollutionViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.longLat.setLongLat(new LongLat("",""));
        LinearLayoutManager layoutManager = new GridLayoutManager(this,2);
        mainBinding.airComponents.recyclerViewComponents.setLayoutManager(layoutManager);
        adapter = new PollutionListAdapter(this, pollutionModelsList);
        mainBinding.airComponents.recyclerViewComponents.setAdapter(adapter);

        pollutionViewModel = ViewModelProviders.of(this).get(PollutionViewModel.class);

        pollutionViewModel.getPollutionListObserver().observe(this, new Observer<List<PollutionModels>>() {

            @Override
            public void onChanged(List<PollutionModels> pollutionModels) {
                if(pollutionModels != null) {
                    pollutionModelsList = pollutionModels;
                    adapter.setPollutionModelsList(pollutionModels);
                    mainBinding.airComponents.textViewNoTextFound.setVisibility(View.GONE);
                }
                else {
                    mainBinding.airComponents.textViewNoTextFound.setVisibility(View.VISIBLE);
                }
            }
        });
        pollutionViewModel.makeAPICall();

    }
}