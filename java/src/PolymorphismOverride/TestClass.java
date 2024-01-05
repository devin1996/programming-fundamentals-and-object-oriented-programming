/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismOverride;

/**
 *
 * @author Devin Chandula
 */
public class TestClass {
    
        public static void main(String[] args) {
       
    Teacher teacher1 = new Teacher();
    ScienceTeacher teacherS = new ScienceTeacher();
    Teacher teacherM = new MathsTeacher();
        
    teacher1.Teaching();
    teacherS.Teaching();
    teacherM.Teaching();
    }
}
