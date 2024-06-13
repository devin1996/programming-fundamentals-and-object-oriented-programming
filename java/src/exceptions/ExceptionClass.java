/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author devin
 */
public class ExceptionClass {

    public static void main(String[] args) throws ArithmeticException {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("The try-catch block is ended");
        }
        checkAge(15);
    }

    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access Denied");
        } else {
            System.out.println("Access Granted");
        }
    }
}
