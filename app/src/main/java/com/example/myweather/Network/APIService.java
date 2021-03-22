package com.example.myweather.Network;

import com.example.myweather.Models.PollutionModels;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {


    @GET("lat=50&lon=50&"+
            "start=1606223802&end=1606482999&"+
            "appid=adec65d9c9f661e1020c21cacce55893")
    Call<List<PollutionModels>> getPollutionData();


}