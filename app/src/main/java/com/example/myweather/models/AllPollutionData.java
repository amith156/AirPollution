package com.example.myweather.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllPollutionData {

    @SerializedName("list")
    private java.util.List<MyList> mList;
    @SerializedName("coord")
    private Coord mCoord;

    public List<MyList> getList() {
        return mList;
    }

    public void setList(List<MyList> mList) {
        this.mList = mList;
    }

    public Coord getCoord() {
        return mCoord;
    }

    public void setCoord(Coord mCoord) {
        this.mCoord = mCoord;
    }
}
