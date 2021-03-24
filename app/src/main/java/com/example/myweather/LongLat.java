package com.example.myweather;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

public class LongLat extends BaseObservable {
    public String latitude;
    public String longitude;

    @Bindable
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
        notifyPropertyChanged(BR.latitude);
    }

    @Bindable
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
        notifyPropertyChanged(BR.longitude);
    }


//    public ObservableField<String> display =
//        new ObservableField<String>(latitude, longitude) {
//            @Override
//            public String get() {
//                return Context.getResources().getString("xxxxx", latitude.get(), longitude.get());
//            }
//        };

    LongLat(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }



}
