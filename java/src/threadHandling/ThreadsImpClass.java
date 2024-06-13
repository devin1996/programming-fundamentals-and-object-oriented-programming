/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadHandling;

/**
 *
 * @author devin
 */
public class ThreadsImpClass implements Runnable {

    public static void main(String[] args) {
        ThreadsImpClass obj= new ThreadsImpClass();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    @Override
    public void run() {
        System.out.println("This code is inside of the thread");
    }
}
