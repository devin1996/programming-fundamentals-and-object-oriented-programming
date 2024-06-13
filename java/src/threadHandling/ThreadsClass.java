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
public class ThreadsClass extends Thread {

    public static int amount = 0;

    public static void main(String[] args) {
        ThreadsClass thread = new ThreadsClass();
        thread.start();
        System.out.println("This code is outside of the thread");

        //Wait for the thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and prints it's value
        System.out.println("Main " + amount);
        amount++;
        System.out.println("Main " + amount);
    }

    @Override
    public void run() {
        System.out.println("This code is inside of the thread");
        amount++;
    }
}
