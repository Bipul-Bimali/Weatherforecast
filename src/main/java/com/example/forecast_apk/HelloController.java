package com.example.forecast_apk;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    private String[ ] list = {"Amsterdam, Netherlands","Ankara, Turkey","Ã…storp, Sweden","Athens, Greece","Belfast, Northern Ireland","Barcelona, Spain","Berlin, Germany","Bern, Switzerland","Bilbao, Spain","Brussels, Belgium","Bucharest, Romania","Budapest, Hungary","Cardiff, Wales","Cologne, Germany","Copenhagen, Denmark","Cork, Ireland","Dublin, Ireland","Edinburgh, Scotland","Florence, Italy","Frankfurt, Germany","French Riviera, France","Funchal, Portugual","Gibraltar, ","Gothenburg, Sweden","Hamburg, Germany","Helsinki, Finland","Ibiza, Spain","Kyiv, Ukraine","Lillehammer, Norway","Lisbon, Portugual","London, England","Madrid, Spain","Mallorca, Spain","Manchester, England ","Marseille, France","Maspalomas, Spain","Milan, Italy","Munich, Germany","Naples, Italy","OÃ±ati, Spain","Oslo, Norway","Paris, France","Prague, Czech Republic","ReykjavÃ­k, Iceland","Riga, Latvia","Rome, Italy","Santa Cruz das Flores, Portugual","Santa Cruz de Tenerife, Spain","Skye, Scotland","Sofia, Bulgaria","Stockholm, Sweden","Tallinn, Estonia","Vienna, Austria","Warsaw, Poland","York, England","Zurich, Switzerland"};
    private double X;
    private double Y;
    @FXML
    private Label welcomeText;

    @FXML
    private ChoiceBox <String> location;
    @FXML
    void magic() {
        API a = new API();
        a.connection();

    }
    private void getCoordinate(String Location){
        switch (Location)
        {
            case("Amsterdam Netherlands"):{
                X=52.367;
                Y=4.904;
            }
            case("Ankara Turkey"):{
                X=39.933;
                Y=32.859;
            }
            case("Ã…storp Sweden"):{
                X=56.134;
                Y=12.945;
            }
            case("Athens Greece"):{
                X=37.983;
                Y=23.727;
            }
            case("Belfast Northern Ireland"):{
                X=54.597;
                Y=-5.93;
            }
            case("Barcelona Spain"):{
                X=41.387;
                Y=2.168;
            }
            case("Berlin Germany"):{
                X=52.52;
                Y=13.405;
            }
            case("Bern Switzerland"):{
                X=46.948;
                Y=7.447;
            }
            case("Bilbao Spain"):{
                X=43.263;
                Y=-2.935;
            }
            case("Brussels Belgium"):{
                X=50.847;
                Y=4.357;
            }
            case("Bucharest Romania"):{
                X=47.497;
                Y=19.04;
            }
            case("Budapest Hungary"):{
                X=59.329;
                Y=18.068;
            }
            case("Cardiff Wales"):{
                X=51.483;
                Y=-3.168;
            }
            case("Cologne Germany"):{
                X=50.937;
                Y=6.96;
            }
            case("Copenhagen Denmark"):{
                X=55.676;
                Y=12.568;
            }
            case("Cork Ireland"):{
                X=51.898;
                Y=-8.475;
            }
            case("Dublin Ireland"):{
                X=53.349;
                Y=-6.26;
            }
            case("Edinburgh Scotland"):{
                X=55.953;
                Y=-3.188;
            }
            case("Florence Italy"):{
                X=43.7696;
                Y=11.255;
            }
            case("Frankfurt Germany"):{
                X=50.11;
                Y=8.682;
            }
            case("French Riviera France"):{
                X=43.254;
                Y=6.637;
            }
            case("Funchal Portugual"):{
                X=32.65;
                Y=-16.908;
            }
            case("Gibraltar"):{
                X=36.14;
                Y=-5.353;
            }
            case("Gothenburg Sweden"):{
                X=57.708;
                Y=11.974;
            }
            case("Hamburg Germany"):{
                X=53.548;
                Y=9.987;
            }
            case("Helsinki Finland"):{
                X=60.169;
                Y=24.938;
            }
            case("Ibiza Spain"):{
                X=39.02;
                Y=1.482;
            }
            case("Kyiv Ukraine"):{
                X=50.45;
                Y=30.523;
            }
            case("Lillehammer Norway"):{
                X=61.115;
                Y=10.466;
            }
            case("Lisbon Portugual"):{
                X=38.722;
                Y=-9.139;
            }
            case("London England"):{
                X=51.507;
                Y=-0.127;
            }
            case("Madrid Spain"):{
                X=40.416;
                Y=-3.703;
            }
            case("Mallorca Spain"):{
                X=39.695;
                Y=3.017;
            }
            case("Manchester England"):{
                X=53.48;
                Y=-2.242;
            }
            case("Marseille France"):{
                X=43.296;
                Y=5.369;
            }
            case("Maspalomas Spain"):{
                X=27.76;
                Y=-15.586;
            }
            case("Milan Italy"):{
                X=45.464;
                Y=9.19;
            }
            case("Munich Germany"):{
                X=48.135;
                Y=11.582;
            }
            case("Naples Italy"):{
                X=40.851;
                Y=14.268;
            }
            case("OÃ±ati Spain"):{
                X=43.034;
                Y=-2.417;
            }
            case("Oslo Norway"):{
                X=59.913;
                Y=10.752;
            }
            case("Paris France"):{
                X=48.856;
                Y=2.352;
            }
            case("Prague Czech Republic"):{
                X=50.075;
                Y=14.437;
            }
            case("ReykjavÃ­k Iceland"):{
                X=64.146;
                Y=-21.942;
            }
            case("Riga Latvia"):{
                X=56.879;
                Y=24.603;
            }
            case("Rome Italy"):{
                X=41.902;
                Y=12.496;
            }
            case("Santa Cruz das Flores Portugual"):{
                X=39.453;
                Y=-31.127;
            }
            case("Santa Cruz de Tenerife Spain"):{
                X=28.463;
                Y=-16.251;
            }
            case("Skye Scotland"):{
                X=57.273;
                Y=-6.215;
            }
            case("Sofia Bulgaria"):{
                X=42.697;
                Y=23.321;
            }
            case("Stockholm Sweden"):{
                X=59.329;
                Y=18.068;
            }
            case("Tallinn Estonia"):{
                X=59.437;
                Y=24.753;
            }
            case("Vienna Austria"):{
                X=18.208;
                Y=16.373;
            }
            case("Warsaw Poland"):{
                X=52.229;
                Y=21.012;
            }
            case("York England"):{
                X=53.961;
                Y=-1.07;
            }
            case("Zurich Switzerland"):{
                X=47.376;
                Y=8.541;
            }
        }
    }
    @Override
    public void initialize(URL arg, ResourceBundle arg1){
        location.getItems().addAll(list);
    }
}