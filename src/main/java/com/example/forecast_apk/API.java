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
    String host = "https://www.7timer.info/bin/api.pl?lon=113.17&lat=23.09&product=astro&output=json";
    int timepoint;
    String[ ] Dataseries;
    String[ ]  Timepoint={"a","b","c","d","e","f","g","h"};
    forecastData a = new forecastData();
    forecastData b = new forecastData();
    forecastData c = new forecastData();
    forecastData d = new forecastData();
    forecastData e = new forecastData();
    forecastData f = new forecastData();
    forecastData g = new forecastData();
    forecastData h = new forecastData();
    //    String[ ]  a;
//    String[ ]  b;
//    String[ ]  c;
//    String[ ]  d;
//    String[ ]  e;
//    String[ ]  f;
//    String[ ]  g;
//    String[ ]  h;
    public String[ ] connection() {
        try {
            URL url = new URL(host);
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
            return JSONSeperation(builder);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            String[ ] a = {"a","b"};
            return a ;
        }
    }
    private String[ ] JSONSeperation(StringBuilder builder){


        String str = builder+"";
//        System.out.println(builder);
        JsonObject obj = JsonParser.parseString(str).getAsJsonObject();
        JsonArray  dataseries = obj.get("dataseries").getAsJsonArray();
        for (JsonElement dataset: dataseries ) {
            JsonObject data = JsonParser.parseString(dataset + "").getAsJsonObject();
            String produc = data.get("timepoint").getAsString();
//            System.out.println("hieeee");
//            System.out.println("Product: " + produc);
            timepoint = data.get("timepoint").getAsInt();
            String r = data.get("prec_type").getAsString();
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
                    a.setRh2m(data.get("rh2m").getAsInt());
                    a.setWindDir(wind.get("direction").getAsString());
                    a.setWindSpeed(wind.get("speed").getAsInt());
                    a.setPrec(data.get("prec_type").getAsString());
                    break;
                }
                case 6:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                   System.out.println(timepoint);
                   b.setCloudcover(data.get("timepoint").getAsInt());
                   b.setSeeing(data.get("seeing").getAsInt());
                   b.setTransparency(data.get("transparency").getAsInt());
                   b.setLiftedIndex(data.get("lifted_index").getAsInt());
                   b.setRh2m(data.get("rh2m").getAsInt());
                   b.setWindDir(wind.get("direction").getAsString());
                   b.setWindSpeed(wind.get("speed").getAsInt());
                   b.setPrec(data.get("prec_type").getAsString());
                    break;
                }
                case 9:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    c.setCloudcover(data.get("timepoint").getAsInt());
                    c.setSeeing(data.get("seeing").getAsInt());
                    c.setTransparency(data.get("transparency").getAsInt());
                    c.setLiftedIndex(data.get("lifted_index").getAsInt());
                    c.setRh2m(data.get("rh2m").getAsInt());
                    c.setWindDir(wind.get("direction").getAsString());
                    c.setWindSpeed(wind.get("speed").getAsInt());
                    c.setPrec(data.get("prec_type").getAsString());
                    break;
                }
                case 12:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    d.setCloudcover(data.get("timepoint").getAsInt());
                    d.setSeeing(data.get("seeing").getAsInt());
                    d.setTransparency(data.get("transparency").getAsInt());
                    d.setLiftedIndex(data.get("lifted_index").getAsInt());
                    d.setRh2m(data.get("rh2m").getAsInt());
                    d.setWindDir(wind.get("direction").getAsString());
                    d.setWindSpeed(wind.get("speed").getAsInt());
                    d.setPrec(data.get("prec_type").getAsString());
                    break;
                }
                case 15:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    e.setCloudcover(data.get("timepoint").getAsInt());
                    e.setSeeing(data.get("seeing").getAsInt());
                    e.setTransparency(data.get("transparency").getAsInt());
                    e.setLiftedIndex(data.get("lifted_index").getAsInt());
                    e.setRh2m(data.get("rh2m").getAsInt());
                    e.setWindDir(wind.get("direction").getAsString());
                    e.setWindSpeed(wind.get("speed").getAsInt());
                    e.setPrec(data.get("prec_type").getAsString());
                }
                case 18:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    f.setCloudcover(data.get("timepoint").getAsInt());
                    f.setSeeing(data.get("seeing").getAsInt());
                    f.setTransparency(data.get("transparency").getAsInt());
                    f.setLiftedIndex(data.get("lifted_index").getAsInt());
                    f.setRh2m(data.get("rh2m").getAsInt());
                    f.setWindDir(wind.get("direction").getAsString());
                    f.setWindSpeed(wind.get("speed").getAsInt());
                    f.setPrec(data.get("prec_type").getAsString());
                }
                case 21:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    g.setCloudcover(data.get("timepoint").getAsInt());
                    g.setSeeing(data.get("seeing").getAsInt());
                    g.setTransparency(data.get("transparency").getAsInt());
                    g.setLiftedIndex(data.get("lifted_index").getAsInt());
                    g.setRh2m(data.get("rh2m").getAsInt());
                    g.setWindDir(wind.get("direction").getAsString());
                    g.setWindSpeed(wind.get("speed").getAsInt());
                    g.setPrec(data.get("prec_type").getAsString());
                }
                case 24:{
                    JsonObject wind = data.get("wind10m").getAsJsonObject();
//                    System.out.println(timepoint);
                    h.setCloudcover(data.get("timepoint").getAsInt());
                    h.setSeeing(data.get("seeing").getAsInt());
                    h.setTransparency(data.get("transparency").getAsInt());
                    h.setLiftedIndex(data.get("lifted_index").getAsInt());
                    h.setRh2m(data.get("rh2m").getAsInt());
                    h.setWindDir(wind.get("direction").getAsString());
                    h.setWindSpeed(wind.get("speed").getAsInt());
                    h.setPrec(data.get("prec_type").getAsString());
                }
            }

        }
//        System.out.println("YHIS"+a.getWindDir()+b.getWindDir()+c.getWindDir());
        String[ ] temperature_list = {a.returnTEMP(),b.returnTEMP(), c.returnTEMP(), d.returnTEMP(), e.returnTEMP(), f.returnTEMP(),g.returnTEMP(),h.returnTEMP()};

        return temperature_list;
    }

}