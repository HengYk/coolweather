package com.edu.nuc.yk.coolweather.json;

/**
 * Created by heart_sunny on 2017/9/14.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}