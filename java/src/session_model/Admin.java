/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_model;

/**
 *
 * @author User OOP Inheritance : Child Class
 */
public class Admin extends Employee {

    private String adminStatus;

    public Admin(String adminStatus, int empID, String email, String name) {
        super(empID, email, name);
        this.adminStatus = adminStatus;
    }

    public Admin(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Polymorphism : 1. Method Oveririding (After Overriding)
    public void salary() {
        int basicSalary = 10000;
        int transportAllowance = 5000;
        int foodAllowance = 1000;
        int epf = 1000;
        int total = basicSalary + transportAllowance + foodAllowance + epf;
        System.out.println("Your Salary is:" + total);
    }

}
