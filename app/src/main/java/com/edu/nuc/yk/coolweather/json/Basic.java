package com.edu.nuc.yk.coolweather.json;

import com.google.gson.annotations.SerializedName;

/**
 * Created by heart_sunny on 2017/9/14.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
