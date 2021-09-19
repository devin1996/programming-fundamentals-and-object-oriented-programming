/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherStation;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devin
 */
public class WeatherStation implements IObservable {

    //Creating a List  
    List<Iobserver> observers = new ArrayList<Iobserver>();
    int temp;
    //Adding elements in the List  

    @Override
    public void Notify() {
        for(Iobserver o: observers){
            o.update();
            //PUSH-PULL DATA INSTEAD OF PULLING DATA
        }
    }

    @Override
    public void add(Iobserver o) {
        this.observers = (List<Iobserver>) o;
    }

    @Override
    public void remove(Iobserver o) {
        this.observers = (List<Iobserver>) o;
    }
    
    public int getTemperature()
    {
        temp=10;
        return temp;
    }

}
