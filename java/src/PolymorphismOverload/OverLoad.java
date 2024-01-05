/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismOverload;

/**
 *
 * @author Devin Chandula
 */
public class OverLoad {
    void message(int a)
    {
       System.out.println ("You have entered number "+a);
    }
    
    void message(int b, int c)
    {
       System.out.println ("You have entered number "+b+" and number "+c);
    }
    
    void message(double d) {
       System.out.println("You have entered number a double value "+d);
    }
    
    void message(String name){
        System.out.println("my Name is"+name);
    }
}
