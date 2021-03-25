package com.example.myweather.network;

import com.example.myweather.models.AllPollutionData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {

    @GET("data/2.5/air_pollution/history?")
    Call<AllPollutionData> getPollutionData(
            @Query("lat") double urlLat,
            @Query("lon") double urlLon,
            @Query("start") long urlStart,
            @Query("end") long urlEnd,
            @Query("appid") String urlApiKey
    );

}
