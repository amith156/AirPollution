package com.example.myweather.viewModel;

import android.util.Log;

import com.example.myweather.models.AllPollutionData;
import com.example.myweather.models.MyList;
import com.example.myweather.models.PollutionModels;
import com.example.myweather.network.APIService;
import com.example.myweather.network.RetroInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.PooledConnection;

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

//        Call<List<PollutionModels>> call = apiService.getPollutionData();
        Call<AllPollutionData> call1 = apiService.getPollutionData();

        call1.enqueue(new Callback<AllPollutionData>() {
            @Override
            public void onResponse(Call<AllPollutionData> call, Response<AllPollutionData> response) {
                AllPollutionData allPollutionData = response.body();
//                pollutionList = new ArrayList<List<>>(Arrays.asList(allPollutionData.getList()));
                Log.d("xxx", "onResponse: "+ response.body());
                List<MyList> tempMyList = allPollutionData.getList();
                List<PollutionModels> tempPollutionModels = new ArrayList<PollutionModels>();

                for (MyList item : tempMyList) {
                    tempPollutionModels.add(item.getComponents());
                }

                pollutionList.postValue(tempPollutionModels);
            }

            @Override
            public void onFailure(Call<AllPollutionData> call, Throwable t) {
                pollutionList.postValue(null);
            }
        });

//        call.enqueue(new Callback<List<PollutionModels>>() {
//            @Override
//            public void onResponse(Call<List<PollutionModels>> call, Response<List<PollutionModels>> response) {
//                pollutionList.postValue(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<List<PollutionModels>> call, Throwable t) {
//                pollutionList.postValue(null);
//            }
//        });

    }


}
