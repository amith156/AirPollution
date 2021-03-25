package com.example.myweather;

import android.os.Bundle;
import android.util.Log;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CompActivity extends AppCompatActivity {

    LineGraphSeries<DataPoint> series = new LineGraphSeries<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("co") && getIntent().hasExtra("o3")) {
            Log.d("co","****");
            getIntent().getDoubleArrayExtra("co");
            double[] x = getIntent().getDoubleArrayExtra("co");
            double[] y = getIntent().getDoubleArrayExtra("o3");
            graphMaker(x, y);
        }
        else if(getIntent().hasExtra("no") && getIntent().hasExtra("no2")) {
            Log.d("co","****");
            getIntent().getDoubleArrayExtra("no");
            double[] x = getIntent().getDoubleArrayExtra("no");
            double[] y = getIntent().getDoubleArrayExtra("no2");
            graphMaker(x, y);
        }
        else if(getIntent().hasExtra("so2") && getIntent().hasExtra("nh3")) {
            Log.d("co","****");
            getIntent().getDoubleArrayExtra("so2");
            double[] x = getIntent().getDoubleArrayExtra("so2");
            double[] y = getIntent().getDoubleArrayExtra("nh3");
            graphMaker(x, y);
        }
    }

    private void graphMaker(double[] x, double[] y) {
        GraphView graph = (GraphView) findViewById(R.id.view_graph);
        DataPoint[] dataPoints = new DataPoint[x.length];

        for(int i=0, j=0; i < x.length && j < y.length; i++, j++) {
            DataPoint d = new DataPoint(x[i],y[j]);
            dataPoints[i] = d;
        }

//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });

        series = new LineGraphSeries<>(dataPoints);
        graph.addSeries(series);
    }

}
