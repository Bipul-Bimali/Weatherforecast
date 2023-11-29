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
    private String CLOUDCOVER = "ERRORA";
    private String SEEING = "ERRORA";
    private String HUMIDITY ="ERRORA";
    private String SPEED ="ERRORA";
    public forecastData(){

    }
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

    public void Conversion(){
        switch (Cloudcover){
            case (1):{
                CLOUDCOVER = "0-6";
                break;
            }
            case (2):{
                CLOUDCOVER = "6-19";
            }
            case (3):{
                CLOUDCOVER = "19-31";
                break;
            }
            case (4):{
                CLOUDCOVER = "31-44";
                break;
            }
            case (5):{
                CLOUDCOVER = "44_56";
                break;
            }
            case (6):{
                CLOUDCOVER = "56-69";
                break;
            }
            case (7):{
                CLOUDCOVER = "69-81";
                break;
            }
            case (8):{
                CLOUDCOVER = "81-94";
                break;
            }
            case (9):{
                CLOUDCOVER = "94-100";
                break;
            }
            default:{
                CLOUDCOVER="ERROR";
            }
        }
        switch (seeing){
            case (1):{
                SEEING= "<0.5";
                break;
            }
            case (2):{
                SEEING= "0.5-0.75";
            }
            case (3):{
                SEEING = "0.75-1";
                break;
            }
            case (4):{
                SEEING= "1-1.25";
                break;
            }
            case (5):{
                SEEING= "1.25-1.5";
                break;
            }
            case (6):{
                SEEING = "1.5-2";
                break;
            }
            case (7):{
                SEEING= "2-2.5";
                break;
            }
            case (8):{
                SEEING = ">2.5";
                break;
            }
            default:{
                SEEING="ERROR";
            }
//            case (9):{
//                CLOUDCOVER = "94-100";
//                break;
//            }
        }
        switch (rh2m){
            case (-4):{
                HUMIDITY = "0-5";
                break;
            }
            case (-3):{
                HUMIDITY = "5-10";
            }
            case (-2):{
                HUMIDITY = "10-15";
                break;
            }
            case (-1):{
                HUMIDITY = "15-20";
                break;
            }
            case (0):{
                HUMIDITY = "20-25";
                break;
            }
            case (1):{
                HUMIDITY = "25-30";
                break;
            }
            case (2):{
                HUMIDITY = "30-35";
                break;
            }
            case (3):{
                HUMIDITY = "35-40";
                break;
            }
            case (4):{
                HUMIDITY = "40-45";
                break;
            }
            case (5):{
                HUMIDITY = "45-50";
                break;
            }
            case (6):{
                HUMIDITY = "50-55";
            }
            case (7):{
                HUMIDITY = "55-60";
                break;
            }
            case (8):{
                HUMIDITY = "60-65";
                break;
            }
            case (9):{
                HUMIDITY = "65-70";
                break;
            }
            case (10):{
                HUMIDITY = "70-75";
                break;
            }
            case (11):{
                HUMIDITY = "75-80";
                break;
            }
            case (12):{
                HUMIDITY = "80-85";
                break;
            }
            case (13):{
                HUMIDITY = "85-90";
                break;
            }

            case (14):{
                HUMIDITY = "90-95";
                break;
            }
            case (15):{
                HUMIDITY = "95-99";
            }
            case (16):{
                HUMIDITY = "100";
                break;
            }
            default:{
                HUMIDITY="ERROR";
            }
        }
        switch (windSpeed){
            case (1):{
                SPEED= "calm";
                break;
            }
            case (2):{
                SPEED= "light";
            }
            case (3):{
                SPEED = "moderate";
                break;
            }
            case (4):{
                SPEED= "fresh";
                break;
            }
            case (5):{
                SPEED= "strong";
                break;
            }
            case (6):{
                SPEED = "gale";
                break;
            }
            case (7):{
                SPEED= "strom";
                break;
            }
            case (8):{
                SPEED = "hurricane";
                break;
            }
            default:{
                SPEED = "ERROR";
            }
//            case (9):{
//                CLOUDCOVER = "94-100";
//                break;
//            }
        }
    }
    public String returnTEMP(){
        return windSpeed+"";
    }
    public String[ ] returning(){
        Conversion();
        String [ ] rame = {CLOUDCOVER,SEEING,transparency+"",liftedIndex+"",temp2m+"",HUMIDITY,windDir,SPEED,prec};

        return rame;
    }
}
