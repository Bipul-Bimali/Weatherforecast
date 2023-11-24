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
    public void connection() {
        try {
            URL url = new URL(host);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.connect();
            System.out.println(conn.getContentType());
            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);
            if (responseCode != 200){
                System.out.println("ERROR: "+responseCode);
                return;
            }
            StringBuilder builder = new StringBuilder();
            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()){
                builder.append(scanner.nextLine());
            }
                scanner.close();
                String str = builder+"";
                System.out.println(builder);
                JsonObject obj = JsonParser.parseString(str).getAsJsonObject();
                JsonArray  dataseries = obj.get("dataseries").getAsJsonArray();
            for (JsonElement dataset: dataseries ) {
                JsonObject data = JsonParser.parseString(dataset+"").getAsJsonObject();String produc = data.get("timepoint").getAsString();
                System.out.println("hieeee");
                System.out.println("Product: " + produc);
            }
        }
        catch (Exception e){
            System.out.println("Error: "+ e);

        }
    }
}