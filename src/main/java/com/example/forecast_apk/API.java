package com.example.forecast_apk;

import java.net.HttpURLConnection;
import java.net.URL;
import java.lang.String;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@SuppressWarnings("ALL")
public class API {
    double lon;
    double lat;
    String host ="https://www.7timer.info" ;
    URL url;
    int timepoint;
    //    String[ ] Dataseries;
    //    String[ ]  Timepoint={"a","b","c","d","e","f","g","h"};
    forecastData a = new forecastData();
    forecastData b = new forecastData();
    forecastData c = new forecastData();
    forecastData d = new forecastData();
    forecastData e = new forecastData();
    forecastData f = new forecastData();
    forecastData g = new forecastData();
    forecastData h = new forecastData();
    public API(double lat,double lon){
        this.lat = lat;
        this.lon = lon;

    }
    public void checkconnection(){
        try {
            URL test = new URL(host) ;

        }
        catch (Exception e){
            System.out.println("ERROR "+e);
        }
    }
    public void connection() {
        try {
            host = "https://www.7timer.info/bin/api.pl?lon="+lon+"&lat="+lat+"&product=astro&output=json";
            url = new URL(host);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.connect();
            System.out.println(conn.getContentType());
            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);
//            if (responseCode != 200) {
//                System.out.println("ERROR: " + responseCode);
//                return;
//            }
            StringBuilder builder = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
            }
            scanner.close();
//            System.out.println(builder+"");
            JSONSeperation(builder);
            return ;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            String[ ] a = {"a","b"};
            return ;
        }
    }
    private void JSONSeperation(StringBuilder builder){


        String str = builder+"";
        JsonObject obj = JsonParser.parseString(str).getAsJsonObject();
        JsonArray  dataseries = obj.get("dataseries").getAsJsonArray();
        for (JsonElement dataset: dataseries ) {
            JsonObject data = JsonParser.parseString(dataset + "").getAsJsonObject();
            String produc = data.get("timepoint").getAsString();
//            System.out.println("hieeee");
//            System.out.println("Product: " + produc);
            timepoint = data.get("timepoint").getAsInt();
//            String r = data.get("prec_type").getAsString();
//            System.out.println(timepoint);

            switch (timepoint){
                case 3:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
                    System.out.println("CLASS:: "+data.get("wind10m").getClass());
//                    System.out.println(timepoint);
                    a.setCloudcover(data.get("timepoint").getAsInt());
                    a.setSeeing(data.get("seeing").getAsInt());
                    a.setTransparency(data.get("transparency").getAsInt());
                    a.setLiftedIndex(data.get("lifted_index").getAsInt());
                    a.settemp2m(data.get("temp2m").getAsInt());
                    a.setRh2m(data.get("rh2m").getAsInt());
                    a.setWindDir(wind.get("direction").getAsString());
                    a.setWindSpeed(wind.get("speed").getAsInt());
                    a.setPrec(data.get("prec_type").getAsString());
                    a.Conversion();
                    break;
                }
                case 6:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                   System.out.println(timepoint);
                   b.setCloudcover(data.get("timepoint").getAsInt());
                   b.setSeeing(data.get("seeing").getAsInt());
                   b.setTransparency(data.get("transparency").getAsInt());
                   b.settemp2m(data.get("temp2m").getAsInt());
                   b.setLiftedIndex(data.get("lifted_index").getAsInt());
                   b.setRh2m(data.get("rh2m").getAsInt());
                   b.setWindDir(wind.get("direction").getAsString());
                   b.setWindSpeed(wind.get("speed").getAsInt());
                   b.setPrec(data.get("prec_type").getAsString());
                   b.Conversion();
                    break;
                }
                case 9:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    c.setCloudcover(data.get("timepoint").getAsInt());
                    c.setSeeing(data.get("seeing").getAsInt());
                    c.setTransparency(data.get("transparency").getAsInt());
                    c.settemp2m(data.get("temp2m").getAsInt());
                    c.setLiftedIndex(data.get("lifted_index").getAsInt());
                    c.setRh2m(data.get("rh2m").getAsInt());
                    c.setWindDir(wind.get("direction").getAsString());
                    c.setWindSpeed(wind.get("speed").getAsInt());
                    c.setPrec(data.get("prec_type").getAsString());
                    c.Conversion();
                    break;
                }
                case 12:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    d.setCloudcover(data.get("timepoint").getAsInt());
                    d.setSeeing(data.get("seeing").getAsInt());
                    d.setTransparency(data.get("transparency").getAsInt());
                    d.settemp2m(data.get("temp2m").getAsInt());;
                    d.setLiftedIndex(data.get("lifted_index").getAsInt());
                    d.setRh2m(data.get("rh2m").getAsInt());
                    d.setWindDir(wind.get("direction").getAsString());
                    d.setWindSpeed(wind.get("speed").getAsInt());
                    d.setPrec(data.get("prec_type").getAsString());
                    d.Conversion();
                    break;
                }
                case 15:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    e.setCloudcover(data.get("timepoint").getAsInt());
                    e.setSeeing(data.get("seeing").getAsInt());
                    e.setTransparency(data.get("transparency").getAsInt());
                    e.setLiftedIndex(data.get("lifted_index").getAsInt());
                    e.settemp2m(data.get("temp2m").getAsInt());
                    e.setRh2m(data.get("rh2m").getAsInt());
                    e.setWindDir(wind.get("direction").getAsString());
                    e.setWindSpeed(wind.get("speed").getAsInt());
                    e.setPrec(data.get("prec_type").getAsString());
                    e.Conversion();
                    break;
                }
                case 18:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    f.setCloudcover(data.get("timepoint").getAsInt());
                    f.setSeeing(data.get("seeing").getAsInt());
                    f.setTransparency(data.get("transparency").getAsInt());
                    f.setLiftedIndex(data.get("lifted_index").getAsInt());
                    f.settemp2m(data.get("temp2m").getAsInt());;
                    f.setRh2m(data.get("rh2m").getAsInt());
                    f.setWindDir(wind.get("direction").getAsString());
                    f.setWindSpeed(wind.get("speed").getAsInt());
                    f.setPrec(data.get("prec_type").getAsString());
                    f.Conversion();
                    break;
                }
                case 21:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    g.setCloudcover(data.get("timepoint").getAsInt());
                    g.setSeeing(data.get("seeing").getAsInt());
                    g.setTransparency(data.get("transparency").getAsInt());
                    g.setLiftedIndex(data.get("lifted_index").getAsInt());
                    g.settemp2m(data.get("temp2m").getAsInt());
                    g.setRh2m(data.get("rh2m").getAsInt());
                    g.setWindDir(wind.get("direction").getAsString());
                    g.setWindSpeed(wind.get("speed").getAsInt());
                    g.setPrec(data.get("prec_type").getAsString());
                    g.Conversion();
                    break;
                }
                case 24:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    h.setCloudcover(data.get("timepoint").getAsInt());
                    h.setSeeing(data.get("seeing").getAsInt());
                    h.setTransparency(data.get("transparency").getAsInt());
                    h.setLiftedIndex(data.get("lifted_index").getAsInt());
                    h.settemp2m(data.get("temp2m").getAsInt());
                    h.setRh2m(data.get("rh2m").getAsInt());
                    h.setWindDir(wind.get("direction").getAsString());
                    h.setWindSpeed(wind.get("speed").getAsInt());
                    h.setPrec(data.get("prec_type").getAsString());
                    h.Conversion();
                    break;
                }
            }

        }
        String[ ] temperature_list = {a.return_cloud_cover(),b.return_cloud_cover(), c.return_cloud_cover(), d.return_cloud_cover(), e.return_cloud_cover(), f.return_cloud_cover(),g.return_cloud_cover(),h.return_cloud_cover()};

        return  ;
    }
    public String[] get_cloud_cover(){
        String [ ] cc = {a.return_cloud_cover(),b.return_cloud_cover(), c.return_cloud_cover(), d.return_cloud_cover(), e.return_cloud_cover(), f.return_cloud_cover(),g.return_cloud_cover(),h.return_cloud_cover()};
        return cc;
    }
    public String[] get_seeing(){
        String [ ] cc = {a.return_seeing(),b.return_seeing(), c.return_seeing(), d.return_seeing(), e.return_seeing(), f.return_seeing(),g.return_seeing(),h.return_seeing()};
        return cc;
    }
    public String[ ] get_transparency(){
        String [ ] cc = {a.return_transparency(),b.return_transparency(), c.return_transparency(), d.return_transparency(), e.return_transparency(), f.return_transparency(),g.return_transparency(),h.return_transparency()};
        return cc;
    }
    public String[] get_lifted_index(){
        String [ ] cc = {a.return_lifted_index(),b.return_lifted_index(), c.return_lifted_index(), d.return_lifted_index(), e.return_lifted_index(), f.return_lifted_index(),g.return_lifted_index(),h.return_lifted_index()};
        return cc;
    }
    public String[] get_temperature(){
        String [ ] cc = {a.return_temperature(),b.return_temperature(), c.return_temperature(), d.return_temperature(), e.return_temperature(), f.return_temperature(),g.return_temperature(),h.return_temperature()};
        return cc;
    }
    public String[] get_humidity(){
        String [ ] cc = {a.return_humidity(),b.return_humidity(), c.return_humidity(), d.return_humidity(), e.return_humidity(), f.return_humidity(),g.return_humidity(),h.return_humidity()};
        return cc;
    }
    public String[] get_wind_direction(){
        String [ ] cc = {a.return_wind_direction(),b.return_wind_direction(), c.return_wind_direction(), d.return_wind_direction(), e.return_wind_direction(), f.return_wind_direction(),g.return_wind_direction(),h.return_wind_direction()};
        return cc;
    }
    public String[] get_wind_speed(){
        String [ ] cc = {a.return_wind_speed(),b.return_wind_speed(), c.return_wind_speed(), d.return_wind_speed(), e.return_wind_speed(), f.return_wind_speed(),g.return_wind_speed(),h.return_wind_speed()};
        return cc;
    }
    public String[ ] get_prec_type(){
        String [ ] cc = {a.return_prec_type(),b.return_prec_type(), c.return_prec_type(), d.return_prec_type(), e.return_prec_type(), f.return_prec_type(),g.return_prec_type(),h.return_prec_type()};
        return cc;
    }
}