/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 * @author DEVIN
 */
/**
 * Class Singleton is an implementation of a class that only allows one
 * instantiation.
 */
public class Singleton {

    // The private reference to the one and only instance.
    private static Singleton uniqueInstance = null;
    // An instance attribute.
    private int data = 0;

    /**
     * The Singleton Constructor. Note that it is private! No client can
     * instantiate a Singleton object!
     */
    private Singleton() {
    }
    
    
    /**
     * Returns a reference to the single instance. Creates the instance if it
     * does not yet exist. (This is called lazy instantiation.)
     */
    public static Singleton instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    
    
    // Accessors and mutators here!
    void setData(int x) {
        this.data = x;

    }

    public int getData() {
        return this.data;
    }
}
