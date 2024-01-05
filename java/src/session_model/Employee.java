/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_model;

/**
 *
 * @author User OOP : Inheritance (Parent Class)
 */
public class Employee {

    //Encapsulation : Private Attributes
    private int empID;
    private String email;
    private String name;

    public Employee(int empID, String email, String name) {
        this.empID = empID;
        this.email = email;
        this.name = name;
    }

    public Employee() {
    }

    // Polymorphism : 1. Method Oveririding
    public void salary() {
        int salary = 10000;
        System.out.println("Your Salary is:" + salary);
    }

    public String employeeStatus() {
        String message = "He is a new Employye";
        return message;
    }

    //Encapsulation : Public Getter and Setter Methods
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
