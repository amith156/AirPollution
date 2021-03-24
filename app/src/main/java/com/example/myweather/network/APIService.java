package com.example.myweather.network;

import com.example.myweather.models.AllPollutionData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {


//    @GET(
//            "data/2.5/air_pollution/"+
//            "history?"+

//            "lat=50&lon=50&"+
//            "start=1606223802&end=1606482999&"+
//            "appid=adec65d9c9f661e1020c21cacce55893")
//    Call<AllPollutionData> getPollutionData();


    @GET("data/2.5/air_pollution/history?")
    Call<AllPollutionData> getPollutionData(
            @Query("lat") double urlLat,
            @Query("lon") double urlLon,
            @Query("start") long urlStart,
            @Query("end") long urlEnd,
            @Query("appid") String urlApiKey
    );


}
