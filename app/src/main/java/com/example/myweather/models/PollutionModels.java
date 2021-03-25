package com.example.myweather.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PollutionModels implements Parcelable{

    @SerializedName("nh3")
    private double nh3;
    @SerializedName("pm10")
    private double pm10;
    @SerializedName("pm2_5")
    private double pm2_5;
    @SerializedName("so2")
    private double so2;
    @SerializedName("o3")
    private double o3;
    @SerializedName("no2")
    private double no2;
    @SerializedName("no")
    private double no;
    @SerializedName("co")
    private double co;

    public PollutionModels(double co, double no, double no2, double o3, double so2, double pm2_5, double pm10, double nh3) {
        this.co = co;
        this.no = no;
        this.no2 = no2;
        this.o3 = o3;
        this.so2 = so2;
        this.pm2_5 = pm2_5;
        this.pm10 = pm10;
        this.nh3 = nh3;
    }

    public double getCo() {
        return co;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public double getNo() {
        return no;
    }

    public void setNo(double no) {
        this.no = no;
    }

    public double getNo2() {
        return no2;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }

    public double getO3() {
        return o3;
    }

    public void setO3(double o3) {
        this.o3 = o3;
    }

    public double getSo2() {
        return so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public double getPm2_5() {
        return pm2_5;
    }

    public void setPm2_5(double pm2_5) {
        this.pm2_5 = pm2_5;
    }

    public double getPm10() {
        return pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public double getNh3() {
        return nh3;
    }

    public void setNh3(double nh3) {
        this.nh3 = nh3;
    }



    protected PollutionModels(Parcel in) {
        nh3 = in.readDouble();
        pm10 = in.readDouble();
        pm2_5 = in.readDouble();
        so2 = in.readDouble();
        o3 = in.readDouble();
        no2 = in.readDouble();
        no = in.readDouble();
        co = in.readDouble();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(nh3);
        dest.writeDouble(pm10);
        dest.writeDouble(pm2_5);
        dest.writeDouble(so2);
        dest.writeDouble(o3);
        dest.writeDouble(no2);
        dest.writeDouble(no);
        dest.writeDouble(co);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<PollutionModels> CREATOR = new Parcelable.Creator<PollutionModels>() {
        @Override
        public PollutionModels createFromParcel(Parcel in) {
            return new PollutionModels(in);
        }

        @Override
        public PollutionModels[] newArray(int size) {
            return new PollutionModels[size];
        }
    };

}
