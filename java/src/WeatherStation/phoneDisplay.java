/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherStation;

/**
 *
 * @author User
 */
 public class phoneDisplay implements Iobserver{
     WeatherStation station;

    public phoneDisplay(WeatherStation station) {
        this.station = station;
    }
    
     
    @Override
    public void update() {
         this.station.getTemperature();
    }
    
}
