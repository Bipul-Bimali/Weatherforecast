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
    String[ ] Dataseries;
    String[ ]  Timepoint={"a","b","c","d","e","f","g","h"};
//    String[ ]  a;
//    String[ ]  b;
//    String[ ]  c;
//    String[ ]  d;
//    String[ ]  e;
//    String[ ]  f;
//    String[ ]  g;
//    String[ ]  h;
    public void connection() {
        try {
            URL url = new URL(host);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.connect();
            System.out.println(conn.getContentType());
            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);
            if (responseCode != 200) {
                System.out.println("ERROR: " + responseCode);
                return;
            }
            StringBuilder builder = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
            }
            scanner.close();
            JSONSeperation(builder);
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
    }
    private void JSONSeperation(StringBuilder builder){

        String str = builder+"";
        System.out.println(builder);
        JsonObject obj = JsonParser.parseString(str).getAsJsonObject();
        JsonArray  dataseries = obj.get("dataseries").getAsJsonArray();
        for (JsonElement dataset: dataseries ) {
            JsonObject data = JsonParser.parseString(dataset+"").getAsJsonObject();
            String produc = data.get("timepoint").getAsString();
            System.out.println("hieeee");
            System.out.println("Product: " + produc);
            for (int  i = 0 ; i < 10 ; i++){
                switch (i){
                    case 1:{
                        forecastData a = new forecastData();
                    }
                    case 2:{
                        forecastData b = new forecastData();
                    }
                    case 3:{
                        forecastData c = new forecastData();
                    }
                    case 4:{
                        forecastData d = new forecastData();
                    }
                    case 5:{
                        forecastData e = new forecastData();
                    }
                    case 6:{
                        forecastData f = new forecastData();
                    }
                    case 7:{
                        forecastData g = new forecastData();
                    }
                    case 8:{
                        forecastData h = new forecastData();
                    }
                }
            }

        }
    }
}