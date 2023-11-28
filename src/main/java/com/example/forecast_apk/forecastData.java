package com.example.forecast_apk;

public class forecastData {
    private  int Cloudcover;
    private int seeing;
    private int transparency;
    private int liftedIndex;
    private int rh2m;
    private String windDir;
    private int windSpeed;
    private int temp2m;
    private String prec;
    public forecastData(){}

    public int getSeeing() {
        return seeing;
    }

    public int getCloudcover() {
        return Cloudcover;
    }

    public int getTemp2m() {
        return temp2m;
    }

    public int getLiftedIndex() {
        return liftedIndex;
    }

    public int getRh2m() {
        return rh2m;
    }

    public int getTransparency() {
        return transparency;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public String getPrec() {
        return prec;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setCloudcover(int cloudcover) {
        Cloudcover = cloudcover;
    }

    public void setLiftedIndex(int liftedIndex) {
        this.liftedIndex = liftedIndex;
    }

    public void setPrec(String prec) {
        this.prec = prec;
    }

    public void setRh2m(int rh2m) {
        this.rh2m = rh2m;
    }

    public void setSeeing(int seeing) {
        this.seeing = seeing;
    }

    public void setTemp2m(int temp2m) {
        this.temp2m = temp2m;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

}
