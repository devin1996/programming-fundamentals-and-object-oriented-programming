/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excersise2;

/**
 *
 * @author Supun
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
