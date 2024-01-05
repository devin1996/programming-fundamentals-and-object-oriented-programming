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
public class TestClass {
    public static void main (String args [])
    {
        OverLoad Obj = new OverLoad();
        Obj .message(25);
        Obj .message(10, 20);
        Obj .message(5.567676);
        Obj.message("Devin");
    }
}
