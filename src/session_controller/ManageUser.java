/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session_controller;

import session_model.Admin;

/**
 *
 * @author User
 */
// OOP: Abstraction 
abstract class ManageUser {
   public abstract boolean addUser(Admin admin);
    
   public void userManagement() {
    System.out.println("Admin and HR Officers cane manage users uin differnt ways");
  }
}
