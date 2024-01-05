/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpatterneagerinstantiation;

import SingletonPattern.*;

/**
 * @author DEVIN
 */
/**
 * Class Singleton is an implementation of a class that only allows one
 * instantiation.
 */
public class Singleton {

    /// The private reference to the one and only instance.
    // Let’s eagerly instantiate it here.
    private static Singleton uniqueInstance = new Singleton();
    // An instance attribute.
    private int data = 0;

    /**
     * Returns a reference to the single instance.
     */
    public static Singleton instance() {

        return uniqueInstance;
    }

    /**
     * The Singleton Constructor. Note that it is private! No client can
     * instantiate a Singleton object!
     */
    private Singleton() {
    }
    // Accessors and mutators here!

    void setData(int x) {
        this.data = x;

    }

    public int getData() {
        return this.data;
    }
}
