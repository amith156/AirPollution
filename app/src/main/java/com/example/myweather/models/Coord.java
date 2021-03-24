package com.example.myweather.models;

import com.google.gson.annotations.SerializedName;

public class Coord {
    @SerializedName("lat")
    private int mLat;
    @SerializedName("lon")
    private int mLon;

    public int getLat() {
        return mLat;
    }

    public void setLat(int mLat) {
        this.mLat = mLat;
    }

    public int getLon() {
        return mLon;
    }

    public void setLon(int mLon) {
        this.mLon = mLon;
    }
}
