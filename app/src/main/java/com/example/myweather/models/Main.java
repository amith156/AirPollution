package com.example.myweather.models;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("aqi")
    private int mAqi;

    public int getAqi() {
        return mAqi;
    }

    public void setAqi(int mAqi) {
        this.mAqi = mAqi;
    }
}
