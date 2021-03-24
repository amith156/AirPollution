package com.example.myweather.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {

    public static String BaseUrl = "http://api.openweathermap.org/";
//                                    + "data/2.5/air_pollution/"
//                                    +"history?"
//                                    +"lat=50&lon=50&"
//                                    +"start=1606223802&end=1606482999&"
//                                    +"appid=adec65d9c9f661e1020c21cacce55893";

    public static Retrofit retrofit;

    public static Retrofit getRetrofitClient() {

        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;

    }



}
