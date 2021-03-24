package com.example.myweather.models;

import com.google.gson.annotations.SerializedName;

public class MyList {
    @SerializedName("dt")
    private int mDt;
    @SerializedName("components")
    private PollutionModels mComponents;
    @SerializedName("main")
    private Main mMain;

    public int getDt() {
        return mDt;
    }

    public void setDt(int mDt) {
        this.mDt = mDt;
    }

    public PollutionModels getComponents() {
        return mComponents;
    }

    public void setComponents(PollutionModels mComponents) {
        this.mComponents = mComponents;
    }

    public Main getMain() {
        return mMain;
    }

    public void setMain(Main mMain) {
        this.mMain = mMain;
    }
}
