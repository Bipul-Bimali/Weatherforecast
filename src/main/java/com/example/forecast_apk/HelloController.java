package com.example.forecast_apk;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    private final String[ ] list = {"Amsterdam, Netherlands","Ankara, Turkey","Ã…storp, Sweden","Athens, Greece","Belfast, Northern Ireland","Barcelona, Spain","Berlin, Germany","Bern, Switzerland","Bilbao, Spain","Brussels, Belgium","Bucharest, Romania","Budapest, Hungary","Cardiff, Wales","Cologne, Germany","Copenhagen, Denmark","Cork, Ireland","Dublin, Ireland","Edinburgh, Scotland","Florence, Italy","Frankfurt, Germany","French Riviera, France","Funchal, Portugual","Gibraltar, ","Gothenburg, Sweden","Hamburg, Germany","Helsinki, Finland","Ibiza, Spain","Kyiv, Ukraine","Lillehammer, Norway","Lisbon, Portugual","London, England","Madrid, Spain","Mallorca, Spain","Manchester, England ","Marseille, France","Maspalomas, Spain","Milan, Italy","Munich, Germany","Naples, Italy","OÃ±ati, Spain","Oslo, Norway","Paris, France","Prague, Czech Republic","ReykjavÃ­k, Iceland","Riga, Latvia","Rome, Italy","Santa Cruz das Flores, Portugual","Santa Cruz de Tenerife, Spain","Skye, Scotland","Sofia, Bulgaria","Stockholm, Sweden","Tallinn, Estonia","Vienna, Austria","Warsaw, Poland","York, England","Zurich, Switzerland"};
    private String locationValue;
    API a;
    private double X;
    private double Y;

    @FXML
    private Label Current_date_time;
    @FXML
    private Label precipitation;

    @FXML
    private Label humidity;
    @FXML
    private Label time;
    @FXML
    private Label a1;
    @FXML
    private Label a2;
    @FXML
    private Label a3;
    @FXML
    private Label a4;
    @FXML
    private Label a5;
    @FXML
    private Label a6;
    @FXML
    private Label a7;
    @FXML
    private Label a8;
    @FXML
    private Label c1;
    @FXML
    private Label c2;
    @FXML
    private Label c3;
    @FXML
    private Label c4;
    @FXML
    private Label c5;
    @FXML
    private Label c6;
    @FXML
    private Label c7;
    @FXML
    private Label c8;
    @FXML
    private ChoiceBox <String> location;
    @FXML
    void details(){
try {
    Parent root = FXMLLoader.load(getClass().getResource("detailed_view.fxml"));
    Stage newStage = new Stage();
    newStage.setTitle("Detailed View");
    newStage.setScene(new Scene(root));
    newStage.show();
}
catch (IOException e){
    System.out.println(e);
}
    }
    @FXML
    void magic() {

        locationValue =location.getValue();
        System.out.println(locationValue);
        getCoordinate(locationValue);
        a = new API(X,Y);
        a.connection();
        String[ ] tem = a.get_temperature();
        String[ ] speed = a.get_wind_speed();

        a1.setText(tem[0]+"C");
        a2.setText(tem[1]+"C");
        a3.setText(tem[2]+"C");
        a4.setText(tem[3]+"C");
        a5.setText(tem[4]+"C");
        a6.setText(tem[5]+"C");
        a7.setText(tem[6]+"C");
        a8.setText(tem[7]+"C");
        c1.setText(speed[0]);
        c2.setText(speed[1]);
        c3.setText(speed[2]);
        c4.setText(speed[3]);
        c5.setText(speed[4]);
        c6.setText(speed[5]);
        c7.setText(speed[6]);
        c8.setText(speed[7]);
//        details();

    }
    private void getCoordinate(String Location){
        switch (Location)
        {
            case("Amsterdam, Netherlands"):{
                X=52.367;
                Y=4.904;
                break;
            }
            case("Ankara, Turkey"):{
                X=39.933;
                Y=32.859;
                break;
            }
            case("Ã…storp, Sweden"):{
                X=56.134;
                Y=12.945;
                break;
            }
            case("Athens, Greece"):{
                X=37.983;
                Y=23.727;
                break;
            }
            case("Belfast, Northern Ireland"):{
                X=54.597;
                Y=-5.93;
                break;
            }
            case("Barcelona, Spain"):{
                X=41.387;
                Y=2.168;
                break;
            }
            case("Berlin, Germany"):{
                X=52.52;
                Y=13.405;
                break;
            }
            case("Bern, Switzerland"):{
                X=46.948;
                Y=7.447;
                break;
            }
            case("Bilbao, Spain"):{
                X=43.263;
                Y=-2.935;
                break;
            }
            case("Brussels, Belgium"):{
                X=50.847;
                Y=4.357;
                break;
            }
            case("Bucharest, Romania"):{
                X=47.497;
                Y=19.04;
                break;
            }
            case("Budapest, Hungary"):{
                X=59.329;
                Y=18.068;
                break;
            }
            case("Cardiff, Wales"):{
                X=51.483;
                Y=-3.168;
                break;
            }
            case("Cologne, Germany"):{
                X=50.937;
                Y=6.96;
                break;
            }
            case("Copenhagen, Denmark"):{
                X=55.676;
                Y=12.568;
                break;
            }
            case("Cork, Ireland"):{
                X=51.898;
                Y=-8.475;
                break;
            }
            case("Dublin, Ireland"):{
                X=53.349;
                Y=-6.26;
                break;
            }
            case("Edinburgh, Scotland"):{
                X=55.953;
                Y=-3.188;
                break;
            }
            case("Florence, Italy"):{
                X=43.7696;
                Y=11.255;
                break;
            }
            case("Frankfurt, Germany"):{
                X=50.11;
                Y=8.682;
                break;
            }
            case("French Riviera, France"):{
                X=43.254;
                Y=6.637;
                break;
            }
            case("Funchal, Portugual"):{
                X=32.65;
                Y=-16.908;
                break;
            }
            case("Gibraltar"):{
                X=36.14;
                Y=-5.353;
                break;
            }
            case("Gothenburg, Sweden"):{
                X=57.708;
                Y=11.974;
                break;
            }
            case("Hamburg, Germany"):{
                X=53.548;
                Y=9.987;
                break;
            }
            case("Helsinki, Finland"):{
                X=60.169;
                Y=24.938;
                break;
            }
            case("Ibiza, Spain"):{
                X=39.02;
                Y=1.482;
                break;
            }
            case("Kyiv, Ukraine"):{
                X=50.45;
                Y=30.523;
                break;
            }
            case("Lillehammer, Norway"):{
                X=61.115;
                Y=10.466;
                break;
            }
            case("Lisbon, Portugual"):{
                X=38.722;
                Y=-9.139;
                break;
            }
            case("London, England"):{
                X=51.507;
                Y=-0.127;
                break;
            }
            case("Madrid, Spain"):{
                X=40.416;
                Y=-3.703;
                break;
            }
            case("Mallorca, Spain"):{
                X=39.695;
                Y=3.017;
                break;
            }
            case("Manchester, England"):{
                X=53.48;
                Y=-2.242;
                break;
            }
            case("Marseille, France"):{
                X=43.296;
                Y=5.369;
                break;
            }
            case("Maspalomas, Spain"):{
                X=27.76;
                Y=-15.586;
                break;
            }
            case("Milan, Italy"):{
                X=45.464;
                Y=9.19;
                break;
            }
            case("Munich, Germany"):{
                X=48.135;
                Y=11.582;
                break;
            }
            case("Naples, Italy"):{
                X=40.851;
                Y=14.268;
                break;
            }
            case("OÃ±ati, Spain"):{
                X=43.034;
                Y=-2.417;
                break;
            }
            case("Oslo, Norway"):{
                X=59.913;
                Y=10.752;
                break;
            }
            case("Paris, France"):{
                X=48.856;
                Y=2.352;
                break;
            }
            case("Prague, Czech Republic"):{
                X=50.075;
                Y=14.437;
                break;
            }
            case("ReykjavÃ­k, Iceland"):{
                X=64.146;
                Y=-21.942;
                break;
            }
            case("Riga, Latvia"):{
                X=56.879;
                Y=24.603;
                break;
            }
            case("Rome, Italy"):{
                X=41.902;
                Y=12.496;
                break;
            }
            case("Santa Cruz das Flores, Portugual"):{
                X=39.453;
                Y=-31.127;
                break;
            }
            case("Santa Cruz de Tenerife, Spain"):{
                X=28.463;
                Y=-16.251;
                break;
            }
            case("Skye, Scotland"):{
                X=57.273;
                Y=-6.215;
                break;
            }
            case("Sofia, Bulgaria"):{
                X=42.697;
                Y=23.321;
                break;
            }
            case("Stockholm, Sweden"):{
                X=59.329;
                Y=18.068;
                break;
            }
            case("Tallinn, Estonia"):{
                X=59.437;
                Y=24.753;
                break;
            }
            case("Vienna, Austria"):{
                X=18.208;
                Y=16.373;
                break;
            }
            case("Warsaw, Poland"):{
                X=52.229;
                Y=21.012;
                break;
            }
            case("York, England"):{
                X=53.961;
                Y=-1.07;
                break;
            }
            case("Zurich, Switzerland"):{
                X=47.376;
                Y=8.541;
                break;
            }
            default:{
                X= 0;
                Y = 0;
                System.out.println("ERROR in getcoordinate");
            }
        }
    }
    @Override
    public void initialize(URL arg, ResourceBundle arg1){
        location.getItems().addAll(list);

        API a = new API(X,Y);
        a.checkconnection();
//        getCoordinate(locationValue);
    }
}