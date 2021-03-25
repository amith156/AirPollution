package com.example.myweather;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Log;

import com.example.myweather.models.PollutionModels;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CompActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("PollutionModels")) {
            Log.d("xxxxx","****");
            ArrayList<PollutionModels> pollutionModelsArrayList = getIntent().getParcelableArrayListExtra("PollutionModels");
            pollutionModelsArrayList.size();
        }
    }

}
