/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_controller;

import session_model.Admin;
import session_model.Employee;

/**
 *
 * @author User
 */
public class AdminManageUser extends ManageUser {

    // Abstraction (Body Implemented for addUser: Abstract method in ManageUser) 
    // Encapsulation Using Getter Methods in here
    public boolean addUser(Admin adminObj) {
        //Calculations
        //DB Query
        //Arithmetic Operations
        // Conditional Statements
        Admin newAdminObj = new Admin();
        newAdminObj = adminObj;

        // Getters
        int empId = newAdminObj.getEmpID();
        String email = newAdminObj.getEmail();
        String name = newAdminObj.getName();

        System.out.println("User Added to DB");
        System.out.println("Employee Id" + empId);
        System.out.println("Employee Name" + name);
        System.out.println("Employee Email" + email);

        return true;
    }

    //Polymorhism
    //Method Overloading
    public void manageUser(int empId) {
        //DB Query for Delete or Something
        System.out.println("User with Employee ID " + empId + " Deleted!");
    }

    //Method Overloading
    public void manageUser(int empId, String email) {
        //DB Query for Update or Something
        System.out.print("User with Employee ID " + empId + "'s email changed as " + email + "!");
    }
}
