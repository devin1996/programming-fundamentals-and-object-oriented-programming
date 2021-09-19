/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Devin Chandula
 */
public class TestClass {
    
    public static void main(String[] args){
        
        MathsTeacher obj = new MathsTeacher();
	//Both Super Class and Child Class methods and Attributes Can be called through the Child Class object 
        System.out.println("College "+obj.collegeName);
	System.out.println("Designation "+obj.designation);
	System.out.println("Main Subject "+obj.mainSubject);
	obj.does();
        
        
        Teacher obj1 = new Teacher();
	//Only Super Class methods and Attriutes Can be Called through the Super Class object 
        System.out.println("Head College "+obj1.collegeName);
	System.out.println("Head Designation "+obj1.designation);
        obj.does();
    }
    
}
