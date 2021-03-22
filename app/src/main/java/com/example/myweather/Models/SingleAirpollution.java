package com.example.myweather.Models;

import java.util.List;

public class SingleAirpollution {

    public class Coord{
        public int lon;
        public int lat;
    }

    public class list{
        public Main main;
        public Components components;
        public int dt;
    }


    public class Main{
        public int aqi;
    }

    public class Components{
        public double co;
        public int no;
        public double no2;
        public double o3;
        public double so2;
        public double pm2_5;
        public double pm10;
        public double nh3;
    }



    public class Root{
        public Coord coord;
        public List<list> list;
    }

}
