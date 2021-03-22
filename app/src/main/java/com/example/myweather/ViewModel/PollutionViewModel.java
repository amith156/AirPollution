package com.example.myweather.ViewModel;

import com.example.myweather.Models.PollutionModels;
import com.example.myweather.Network.APIService;
import com.example.myweather.Network.RetroInstance;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PollutionViewModel extends ViewModel {


    private MutableLiveData<List<PollutionModels>> pollutionList = new MutableLiveData<>();

    public MutableLiveData<List<PollutionModels>> getPollutionListObserver() {
        return pollutionList;
    }

    public void makeAPICall() {
        APIService apiService = RetroInstance
                .getRetrofitClient()
                .create(APIService.class);

        Call<List<PollutionModels>> call = apiService.getPollutionData();
        call.enqueue(new Callback<List<PollutionModels>>() {
            @Override
            public void onResponse(Call<List<PollutionModels>> call, Response<List<PollutionModels>> response) {
                pollutionList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<PollutionModels>> call, Throwable t) {
                pollutionList.postValue(null);
            }
        });

    }


}
