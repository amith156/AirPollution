package com.example.myweather.models;

import com.google.gson.annotations.SerializedName;

public class Components {
    @SerializedName("nh3")
    private int mNh3;
    @SerializedName("pm10")
    private double mPm10;
    @SerializedName("pm2_5")
    private double mPm2_5;
    @SerializedName("so2")
    private double mSo2;
    @SerializedName("o3")
    private double mO3;
    @SerializedName("no2")
    private double mNo2;
    @SerializedName("no")
    private int mNo;
    @SerializedName("co")
    private double mCo;

    public int getNh3() {
        return mNh3;
    }

    public void setNh3(int mNh3) {
        this.mNh3 = mNh3;
    }

    public double getPm10() {
        return mPm10;
    }

    public void setPm10(double mPm10) {
        this.mPm10 = mPm10;
    }

    public double getPm2_5() {
        return mPm2_5;
    }

    public void setPm2_5(double mPm2_5) {
        this.mPm2_5 = mPm2_5;
    }

    public double getSo2() {
        return mSo2;
    }

    public void setSo2(double mSo2) {
        this.mSo2 = mSo2;
    }

    public double getO3() {
        return mO3;
    }

    public void setO3(double mO3) {
        this.mO3 = mO3;
    }

    public double getNo2() {
        return mNo2;
    }

    public void setNo2(double mNo2) {
        this.mNo2 = mNo2;
    }

    public int getNo() {
        return mNo;
    }

    public void setNo(int mNo) {
        this.mNo = mNo;
    }

    public double getCo() {
        return mCo;
    }

    public void setCo(double mCo) {
        this.mCo = mCo;
    }
}
