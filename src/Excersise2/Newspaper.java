/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Excersise2;

/**
 *
 * @author Supun
 */
public class Newspaper implements Observer{

    public void update(float interest) {
       System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                           + interest);

    }

}
