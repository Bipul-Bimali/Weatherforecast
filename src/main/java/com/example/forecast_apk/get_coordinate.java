package com.example.forecast_apk;


import java.sql.*;

public class get_coordinate {
    Double latitude;
    Double longitude;
    private String user = "YOUR_USERNAME";
    private String password = "YOUR_PASSWORD";
    private String url = "jdbc:postgresql://citiesincanada.c10osmeq4caq.ca-central-1.rds.amazonaws.com/initialcanadacity";

public  double[] SQL_connect( String state , String city) {
        try {
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("connection Successful");
            String query = "SELECT lat,lng FROM information_schema.canadacities WHERE province_id = ? AND city= ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, state);
            preparedStatement.setString(2, city);
            ResultSet result =  preparedStatement.executeQuery();
            while(result.next()) {
                latitude = result.getDouble("lat");
                longitude = result.getDouble("lng");
            }
            if (latitude == null || longitude == null){
                double[] errorcode = {999,999,1};
                return errorcode;
            }
            double[] coordinates = {latitude,longitude,0};
            return coordinates;
        }
        catch (SQLException sqle){
            System.out.println("errorsql "+sqle);
            double[] errorcode = {1000,1000,2};
            return errorcode;
        }
    }
}
